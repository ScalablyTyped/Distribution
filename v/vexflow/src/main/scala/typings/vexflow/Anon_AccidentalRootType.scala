package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalRootType extends js.Object {
  var accidental: String
  var root: String
  var `type`: String
}

object Anon_AccidentalRootType {
  @scala.inline
  def apply(accidental: String, root: String, `type`: String): Anon_AccidentalRootType = {
    val __obj = js.Dynamic.literal(accidental = accidental, root = root)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AccidentalRootType]
  }
}

