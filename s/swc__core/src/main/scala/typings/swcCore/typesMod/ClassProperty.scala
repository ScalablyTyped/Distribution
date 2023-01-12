package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassProperty
  extends StObject
     with ClassPropertyBase
     with ClassMember {
  
  var declare: Boolean
  
  var isAbstract: Boolean
  
  var key: PropertyName
  
  @JSName("type")
  var type_ClassProperty: typings.swcCore.swcCoreStrings.ClassProperty
}
object ClassProperty {
  
  inline def apply(
    declare: Boolean,
    definite: Boolean,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    readonly: Boolean,
    span: Span
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], definite = definite.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[ClassProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassProperty] (val x: Self) extends AnyVal {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setKey(value: PropertyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
