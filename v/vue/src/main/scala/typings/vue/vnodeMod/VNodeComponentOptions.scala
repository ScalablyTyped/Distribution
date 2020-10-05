package typings.vue.vnodeMod

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNodeComponentOptions extends js.Object {
  var Ctor: VueConstructor[Vue] = js.native
  var children: js.UndefOr[js.Array[VNode]] = js.native
  var listeners: js.UndefOr[js.Object] = js.native
  var propsData: js.UndefOr[js.Object] = js.native
  var tag: js.UndefOr[String] = js.native
}

object VNodeComponentOptions {
  @scala.inline
  def apply(Ctor: VueConstructor[Vue]): VNodeComponentOptions = {
    val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeComponentOptions]
  }
  @scala.inline
  implicit class VNodeComponentOptionsOps[Self <: VNodeComponentOptions] (val x: Self) extends AnyVal {
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
    def setCtor(value: VueConstructor[Vue]): Self = this.set("Ctor", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setListeners(value: js.Object): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    @scala.inline
    def setPropsData(value: js.Object): Self = this.set("propsData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropsData: Self = this.set("propsData", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

