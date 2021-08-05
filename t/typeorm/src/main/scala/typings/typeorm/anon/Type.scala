package typings.typeorm.anon

import typings.typeorm.typeormStrings.date
import typings.typeorm.typeormStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  @JSName("$type")
  var $type: date | timestamp
}
object Type {
  
  inline def apply($type: date | timestamp): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def set$type(value: date | timestamp): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
