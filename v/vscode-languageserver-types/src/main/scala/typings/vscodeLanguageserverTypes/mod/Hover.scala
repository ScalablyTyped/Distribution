package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hover extends js.Object {
  /**
    * The hover's content
    */
  var contents: MarkupContent | MarkedString | js.Array[MarkedString] = js.native
  /**
    * An optional range
    */
  var range: js.UndefOr[Range] = js.native
}

@JSImport("vscode-languageserver-types", "Hover")
@js.native
object Hover extends js.Object {
  /**
    * Checks whether the given value conforms to the [Hover](#Hover) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Hover */ Boolean = js.native
}

