package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingsPerObject extends js.Object {
  var bindingsPerObject: Double = js.native
  var objects: InUse = js.native
}

object BindingsPerObject {
  @scala.inline
  def apply(bindingsPerObject: Double, objects: InUse): BindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingsPerObject]
  }
  @scala.inline
  implicit class BindingsPerObjectOps[Self <: BindingsPerObject] (val x: Self) extends AnyVal {
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
    def setBindingsPerObject(value: Double): Self = this.set("bindingsPerObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjects(value: InUse): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}

