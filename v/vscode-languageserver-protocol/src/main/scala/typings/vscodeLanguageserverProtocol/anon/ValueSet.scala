package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueSet extends js.Object {
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[DiagnosticTag]
}

object ValueSet {
  @scala.inline
  def apply(valueSet: js.Array[DiagnosticTag]): ValueSet = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
}

