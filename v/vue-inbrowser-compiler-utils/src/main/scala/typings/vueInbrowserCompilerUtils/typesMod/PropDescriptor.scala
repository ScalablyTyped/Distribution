package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueInbrowserCompilerUtils.anon.Func
import typings.vueInbrowserCompilerUtils.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropDescriptor extends Descriptor {
  
  var defaultValue: js.UndefOr[Value] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.native
  
  var `type`: js.UndefOr[Func] = js.native
  
  var values: js.UndefOr[js.Array[String]] = js.native
}
object PropDescriptor {
  
  @scala.inline
  def apply(name: String): PropDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropDescriptor]
  }
  
  @scala.inline
  implicit class PropDescriptorMutableBuilder[Self <: PropDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: Func): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
