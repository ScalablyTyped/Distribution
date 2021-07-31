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
  
  @scala.inline
  def apply($type: date | timestamp): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$type(value: date | timestamp): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
