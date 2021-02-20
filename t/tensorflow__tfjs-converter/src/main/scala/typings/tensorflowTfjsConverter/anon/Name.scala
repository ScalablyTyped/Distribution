package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var defaultValue: AnyOf = js.native
  
  var name: Type = js.native
  
  var notSupported: Type = js.native
  
  var tfDeprecatedName: Type = js.native
  
  var tfName: Type = js.native
  
  var `type`: Ref = js.native
}
object Name {
  
  @scala.inline
  def apply(
    defaultValue: AnyOf,
    name: Type,
    notSupported: Type,
    tfDeprecatedName: Type,
    tfName: Type,
    `type`: Ref
  ): Name = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notSupported = notSupported.asInstanceOf[js.Any], tfDeprecatedName = tfDeprecatedName.asInstanceOf[js.Any], tfName = tfName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: AnyOf): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Type): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSupported(value: Type): Self = StObject.set(x, "notSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfDeprecatedName(value: Type): Self = StObject.set(x, "tfDeprecatedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfName(value: Type): Self = StObject.set(x, "tfName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
