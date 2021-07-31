package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDescriptor
  extends StObject
     with Descriptor {
  
  var bindings: js.UndefOr[js.Array[ParamTag]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.undefined
}
object SlotDescriptor {
  
  @scala.inline
  def apply(name: String): SlotDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDescriptor]
  }
  
  @scala.inline
  implicit class SlotDescriptorMutableBuilder[Self <: SlotDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[ParamTag]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: ParamTag*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
