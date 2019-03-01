package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFog extends js.Object {
  var color: Color
  var name: java.lang.String
  def toJSON(): js.Any
}

object IFog {
  @scala.inline
  def apply(clone: js.Function0[IFog], color: Color, name: java.lang.String, toJSON: js.Function0[js.Any]): IFog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[IFog]
  }
}

