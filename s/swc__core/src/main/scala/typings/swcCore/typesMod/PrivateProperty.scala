package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateProperty
  extends StObject
     with ClassPropertyBase
     with ClassMember {
  
  var key: PrivateName
  
  @JSName("type")
  var type_PrivateProperty: typings.swcCore.swcCoreStrings.PrivateProperty
}
object PrivateProperty {
  
  inline def apply(
    definite: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    readonly: Boolean,
    span: Span
  ): PrivateProperty = {
    val __obj = js.Dynamic.literal(definite = definite.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateProperty")
    __obj.asInstanceOf[PrivateProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateProperty] (val x: Self) extends AnyVal {
    
    inline def setKey(value: PrivateName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.PrivateProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
