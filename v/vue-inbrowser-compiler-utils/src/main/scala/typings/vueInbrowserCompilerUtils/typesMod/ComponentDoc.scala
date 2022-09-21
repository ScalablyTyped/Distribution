package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDoc
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var description: js.UndefOr[String] = js.undefined
  
  var displayName: String
  
  var docsBlocks: js.UndefOr[js.Array[String]] = js.undefined
  
  var events: js.UndefOr[js.Array[EventDescriptor]] = js.undefined
  
  var exportName: String
  
  var methods: js.UndefOr[js.Array[MethodDescriptor]] = js.undefined
  
  var props: js.UndefOr[js.Array[PropDescriptor]] = js.undefined
  
  var slots: js.UndefOr[js.Array[SlotDescriptor]] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.undefined
}
object ComponentDoc {
  
  inline def apply(displayName: String, exportName: String): ComponentDoc = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDoc]
  }
  
  extension [Self <: ComponentDoc](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDocsBlocks(value: js.Array[String]): Self = StObject.set(x, "docsBlocks", value.asInstanceOf[js.Any])
    
    inline def setDocsBlocksUndefined: Self = StObject.set(x, "docsBlocks", js.undefined)
    
    inline def setDocsBlocksVarargs(value: String*): Self = StObject.set(x, "docsBlocks", js.Array(value*))
    
    inline def setEvents(value: js.Array[EventDescriptor]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: EventDescriptor*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: js.Array[MethodDescriptor]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: MethodDescriptor*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setProps(value: js.Array[PropDescriptor]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setPropsVarargs(value: PropDescriptor*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setSlots(value: js.Array[SlotDescriptor]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSlotsVarargs(value: SlotDescriptor*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
