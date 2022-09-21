package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueContext {
  
  @JSImport("vscode-languageserver", "InlineValueContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueContext literal.
    */
  inline def create(
    frameId: typings.vscodeLanguageserverTypes.mod.integer,
    stoppedLocation: typings.vscodeLanguageserverTypes.mod.Range
  ): typings.vscodeLanguageserverTypes.mod.InlineValueContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(frameId.asInstanceOf[js.Any], stoppedLocation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueContext]
  
  /**
    * Checks whether the given literal conforms to the [InlineValueContext](#InlineValueContext) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueContext */ Boolean]
}
