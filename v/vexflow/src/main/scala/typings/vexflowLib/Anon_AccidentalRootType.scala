package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccidentalRootType extends js.Object {
  var accidental: java.lang.String
  var root: java.lang.String
  var `type`: java.lang.String
}

object Anon_AccidentalRootType {
  @scala.inline
  def apply(accidental: java.lang.String, root: java.lang.String, `type`: java.lang.String): Anon_AccidentalRootType = {
    val __obj = js.Dynamic.literal(accidental = accidental, root = root)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AccidentalRootType]
  }
}

