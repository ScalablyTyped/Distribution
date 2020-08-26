package typings.webcola.anon

import typings.webcola.geomMod.VisibilityEdge
import typings.webcola.geomMod.VisibilityVertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var E: js.Array[VisibilityEdge] = js.native
  var V: js.Array[VisibilityVertex] = js.native
}

object E {
  @scala.inline
  def apply(E: js.Array[VisibilityEdge], V: js.Array[VisibilityVertex]): E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
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
    def setEVarargs(value: VisibilityEdge*): Self = this.set("E", js.Array(value :_*))
    @scala.inline
    def setE(value: js.Array[VisibilityEdge]): Self = this.set("E", value.asInstanceOf[js.Any])
    @scala.inline
    def setVVarargs(value: VisibilityVertex*): Self = this.set("V", js.Array(value :_*))
    @scala.inline
    def setV(value: js.Array[VisibilityVertex]): Self = this.set("V", value.asInstanceOf[js.Any])
  }
  
}

