package typings.wordpressBlocks.anon

import typings.std.RegExp
import typings.wordpressBlocks.mod.TransformRawSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.native
  var children: js.UndefOr[TransformRawSchema] = js.native
  var classes: js.UndefOr[js.Array[String | RegExp]] = js.native
  var require: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.native
}

object Classes {
  @scala.inline
  def apply(): Classes = {
    val __obj = js.Dynamic.literal()
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setChildren(value: TransformRawSchema): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassesVarargs(value: (String | RegExp)*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[String | RegExp]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setRequireVarargs(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any)*
    ): Self = this.set("require", js.Array(value :_*))
    @scala.inline
    def setRequire(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
        ]
    ): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
  }
  
}

