package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueSet extends js.Object {
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[DiagnosticTag]
}

object AnonValueSet {
  @scala.inline
  def apply(valueSet: js.Array[DiagnosticTag]): AnonValueSet = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueSet]
  }
}

