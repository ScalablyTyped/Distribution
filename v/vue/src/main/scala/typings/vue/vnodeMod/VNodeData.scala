package typings.vue.vnodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.anon.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNodeData extends js.Object {
  
  var attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var `class`: js.UndefOr[js.Any] = js.native
  
  var directives: js.UndefOr[js.Array[VNodeDirective]] = js.native
  
  var domProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var hook: js.UndefOr[StringDictionary[js.Function]] = js.native
  
  var inlineTemplate: js.UndefOr[Render] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var nativeOn: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.native
  
  var on: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.native
  
  var props: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var ref: js.UndefOr[String] = js.native
  
  var refInFor: js.UndefOr[Boolean] = js.native
  
  var scopedSlots: js.UndefOr[StringDictionary[js.UndefOr[ScopedSlot]]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var slot: js.UndefOr[String] = js.native
  
  var staticClass: js.UndefOr[String] = js.native
  
  var staticStyle: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var style: js.UndefOr[String | js.Array[js.Object] | js.Object] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[js.Object] = js.native
}
object VNodeData {
  
  @scala.inline
  def apply(): VNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeData]
  }
  
  @scala.inline
  implicit class VNodeDataOps[Self <: VNodeData] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: StringDictionary[js.Any]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    
    @scala.inline
    def setClass(value: js.Any): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: VNodeDirective*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[VNodeDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setDomProps(value: StringDictionary[js.Any]): Self = this.set("domProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomProps: Self = this.set("domProps", js.undefined)
    
    @scala.inline
    def setHook(value: StringDictionary[js.Function]): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    
    @scala.inline
    def setInlineTemplate(value: Render): Self = this.set("inlineTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineTemplate: Self = this.set("inlineTemplate", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNativeOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = this.set("nativeOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeOn: Self = this.set("nativeOn", js.undefined)
    
    @scala.inline
    def setOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setProps(value: StringDictionary[js.Any]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefInFor(value: Boolean): Self = this.set("refInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefInFor: Self = this.set("refInFor", js.undefined)
    
    @scala.inline
    def setScopedSlots(value: StringDictionary[js.UndefOr[ScopedSlot]]): Self = this.set("scopedSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedSlots: Self = this.set("scopedSlots", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setStaticClass(value: String): Self = this.set("staticClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticClass: Self = this.set("staticClass", js.undefined)
    
    @scala.inline
    def setStaticStyle(value: StringDictionary[js.Any]): Self = this.set("staticStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticStyle: Self = this.set("staticStyle", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: js.Object*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: String | js.Array[js.Object] | js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTransition(value: js.Object): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
