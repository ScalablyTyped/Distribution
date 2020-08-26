package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildType extends js.Object {
  /**
    * The id of the loaded new child type
    */
  var id: String = js.native
  /**
    * the maximum allowed children of this type
    */
  var max: Double = js.native
  /**
    * the minimum necessary amount of this type of child
    */
  var min: Double = js.native
}

object ChildType {
  @scala.inline
  def apply(id: String, max: Double, min: Double): ChildType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildType]
  }
  @scala.inline
  implicit class ChildTypeOps[Self <: ChildType] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

