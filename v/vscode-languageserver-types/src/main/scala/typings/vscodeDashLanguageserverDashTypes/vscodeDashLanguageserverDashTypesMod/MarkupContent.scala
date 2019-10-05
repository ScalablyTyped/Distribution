package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkupContent extends js.Object {
  /**
    * The type of the Markup
    */
  var kind: MarkupKind
  /**
    * The content itself
    */
  var value: String
}

@JSImport("vscode-languageserver-types", "MarkupContent")
@js.native
object MarkupContent extends js.Object {
  /**
    * Checks whether the given value conforms to the [MarkupContent](#MarkupContent) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupContent */ Boolean = js.native
}

