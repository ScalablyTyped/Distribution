package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexLayout extends js.Object {
  @JSName("$getSize")
  var $getSize: js.Array[_]
  def render(): scala.Unit
}

object FlexLayout {
  @scala.inline
  def apply($getSize: js.Array[_], render: () => scala.Unit): FlexLayout = {
    val __obj = js.Dynamic.literal($getSize = $getSize, render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[FlexLayout]
  }
}

