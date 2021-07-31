package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalLinkProvider[T /* <: TerminalLink */] extends StObject {
  
  /**
    * Handle an activated terminal link.
    * @param link The link to handle.
    */
  def handleTerminalLink(link: T): ProviderResult[Unit]
  
  /**
    * Provide terminal links for the given context. Note that this can be called multiple times
    * even before previous calls resolve, make sure to not share global objects (eg. `RegExp`)
    * that could have problems when asynchronous usage may overlap.
    * @param context Information about what links are being provided for.
    * @param token A cancellation token.
    * @return A list of terminal links for the given line.
    */
  def provideTerminalLinks(context: TerminalLinkContext, token: CancellationToken): ProviderResult[js.Array[T]]
}
object TerminalLinkProvider {
  
  @scala.inline
  def apply[T /* <: TerminalLink */](
    handleTerminalLink: T => ProviderResult[Unit],
    provideTerminalLinks: (TerminalLinkContext, CancellationToken) => ProviderResult[js.Array[T]]
  ): TerminalLinkProvider[T] = {
    val __obj = js.Dynamic.literal(handleTerminalLink = js.Any.fromFunction1(handleTerminalLink), provideTerminalLinks = js.Any.fromFunction2(provideTerminalLinks))
    __obj.asInstanceOf[TerminalLinkProvider[T]]
  }
  
  @scala.inline
  implicit class TerminalLinkProviderMutableBuilder[Self <: TerminalLinkProvider[?], T /* <: TerminalLink */] (val x: Self & TerminalLinkProvider[T]) extends AnyVal {
    
    @scala.inline
    def setHandleTerminalLink(value: T => ProviderResult[Unit]): Self = StObject.set(x, "handleTerminalLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProvideTerminalLinks(value: (TerminalLinkContext, CancellationToken) => ProviderResult[js.Array[T]]): Self = StObject.set(x, "provideTerminalLinks", js.Any.fromFunction2(value))
  }
}
