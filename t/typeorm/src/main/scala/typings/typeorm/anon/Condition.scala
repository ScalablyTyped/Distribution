package typings.typeorm.anon

import typings.typeorm.typeormStrings.and
import typings.typeorm.typeormStrings.or
import typings.typeorm.typeormStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  var condition: String
  
  var `type`: simple | and | or
}
object Condition {
  
  inline def apply(condition: String, `type`: simple | and | or): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setType(value: simple | and | or): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
