package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUniform extends js.Object {
  var value: js.Any
}

object IUniform {
  @scala.inline
  def apply(value: js.Any): IUniform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IUniform]
  }
}

