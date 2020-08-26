package typings.uifabricMergeStyles.anon

import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var classes: js.Array[String] = js.native
  var objects: IStyleBaseArray = js.native
}

object Classes {
  @scala.inline
  def apply(classes: js.Array[String], objects: IStyleBaseArray): Classes = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
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
    def setClassesVarargs(value: String*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjects(value: IStyleBaseArray): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}

