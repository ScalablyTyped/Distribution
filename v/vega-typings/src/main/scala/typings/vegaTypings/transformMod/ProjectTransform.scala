package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.native
  var fields: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var `type`: project = js.native
}

object ProjectTransform {
  @scala.inline
  def apply(`type`: project): ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTransform]
  }
  @scala.inline
  implicit class ProjectTransformOps[Self <: ProjectTransform] (val x: Self) extends AnyVal {
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
    def setType(value: project): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = this.set("as", js.Array(value :_*))
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldRef*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

