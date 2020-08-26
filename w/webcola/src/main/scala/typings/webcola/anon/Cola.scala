package typings.webcola.anon

import typings.webcola.layoutMod.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cola extends js.Object {
  var cola: Layout = js.native
  var powerGraph: js.Any = js.native
}

object Cola {
  @scala.inline
  def apply(cola: Layout, powerGraph: js.Any): Cola = {
    val __obj = js.Dynamic.literal(cola = cola.asInstanceOf[js.Any], powerGraph = powerGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cola]
  }
  @scala.inline
  implicit class ColaOps[Self <: Cola] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCola(value: Layout): Self = this.set("cola", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerGraph(value: js.Any): Self = this.set("powerGraph", value.asInstanceOf[js.Any])
  }
  
}

