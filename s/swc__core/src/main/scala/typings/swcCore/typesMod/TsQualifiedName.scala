package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsQualifiedName
  extends StObject
     with Node
     with TsEntityName {
  
  var left: TsEntityName
  
  var right: Identifier
  
  @JSName("type")
  var type_TsQualifiedName: typings.swcCore.swcCoreStrings.TsQualifiedName
}
object TsQualifiedName {
  
  inline def apply(left: TsEntityName, right: Identifier): TsQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsQualifiedName")
    __obj.asInstanceOf[TsQualifiedName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsQualifiedName] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: TsEntityName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Identifier): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsQualifiedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
