package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalLinkProvider[T /* <: TerminalLink */] extends js.Object {
  
  /**
    * Handle an activated terminal link.
    * @param link The link to handle.
    */
  def handleTerminalLink(link: T): ProviderResult[Unit] = js.native
  
  /**
    * Provide terminal links for the given context. Note that this can be called multiple times
    * even before previous calls resolve, make sure to not share global objects (eg. `RegExp`)
    * that could have problems when asynchronous usage may overlap.
    * @param context Information about what links are being provided for.
    * @param token A cancellation token.
    * @return A list of terminal links for the given line.
    */
  def provideTerminalLinks(context: TerminalLinkContext, token: CancellationToken): ProviderResult[js.Array[T]] = js.native
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
  implicit class TerminalLinkProviderOps[Self <: TerminalLinkProvider[_], T /* <: TerminalLink */] (val x: Self with TerminalLinkProvider[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandleTerminalLink(value: T => ProviderResult[Unit]): Self = this.set("handleTerminalLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProvideTerminalLinks(value: (TerminalLinkContext, CancellationToken) => ProviderResult[js.Array[T]]): Self = this.set("provideTerminalLinks", js.Any.fromFunction2(value))
  }
}
