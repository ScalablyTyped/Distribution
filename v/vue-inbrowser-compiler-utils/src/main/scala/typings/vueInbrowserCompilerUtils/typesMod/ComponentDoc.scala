package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDoc
  extends /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.native
  
  var displayName: String = js.native
  
  var docsBlocks: js.UndefOr[js.Array[String]] = js.native
  
  var events: js.UndefOr[js.Array[EventDescriptor]] = js.native
  
  var exportName: String = js.native
  
  var methods: js.UndefOr[js.Array[MethodDescriptor]] = js.native
  
  var props: js.UndefOr[js.Array[PropDescriptor]] = js.native
  
  var slots: js.UndefOr[js.Array[SlotDescriptor]] = js.native
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.native
}
object ComponentDoc {
  
  @scala.inline
  def apply(displayName: String, exportName: String): ComponentDoc = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDoc]
  }
  
  @scala.inline
  implicit class ComponentDocOps[Self <: ComponentDoc] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocsBlocksVarargs(value: String*): Self = this.set("docsBlocks", js.Array(value :_*))
    
    @scala.inline
    def setDocsBlocks(value: js.Array[String]): Self = this.set("docsBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocsBlocks: Self = this.set("docsBlocks", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: EventDescriptor*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[EventDescriptor]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: MethodDescriptor*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[MethodDescriptor]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: PropDescriptor*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[PropDescriptor]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: SlotDescriptor*): Self = this.set("slots", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: js.Array[SlotDescriptor]): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
