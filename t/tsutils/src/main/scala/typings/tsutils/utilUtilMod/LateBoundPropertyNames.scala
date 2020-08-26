package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LateBoundPropertyNames extends js.Object {
  var known: Boolean = js.native
  var names: js.Array[PropertyName] = js.native
}

object LateBoundPropertyNames {
  @scala.inline
  def apply(known: Boolean, names: js.Array[PropertyName]): LateBoundPropertyNames = {
    val __obj = js.Dynamic.literal(known = known.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateBoundPropertyNames]
  }
  @scala.inline
  implicit class LateBoundPropertyNamesOps[Self <: LateBoundPropertyNames] (val x: Self) extends AnyVal {
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
    def setKnown(value: Boolean): Self = this.set("known", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: PropertyName*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[PropertyName]): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}

