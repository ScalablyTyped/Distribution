package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexLayout extends js.Object {
  @JSName("$getSize")
  var $getSize: js.Array[_]
}

object FlexLayout {
  @scala.inline
  def apply($getSize: js.Array[_]): FlexLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$getSize")($getSize)
    __obj.asInstanceOf[FlexLayout]
  }
}

