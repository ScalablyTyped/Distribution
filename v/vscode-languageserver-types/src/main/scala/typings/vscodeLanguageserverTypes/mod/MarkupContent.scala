package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkupContent extends js.Object {
  
  /**
    * The type of the Markup
    */
  var kind: MarkupKind = js.native
  
  /**
    * The content itself
    */
  var value: String = js.native
}
@JSImport("vscode-languageserver-types", "MarkupContent")
@js.native
object MarkupContent extends js.Object {
  
  /**
    * Checks whether the given value conforms to the [MarkupContent](#MarkupContent) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupContent */ Boolean = js.native
}
