package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Target {
  @scala.inline
  def apply(target: js.Any, `type`: java.lang.String): Anon_Target = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Target]
  }
}

