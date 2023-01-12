package typings.tablestore.mod

import typings.tablestore.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consumed extends StObject {
  
  var capacityUnit: Read
}
object Consumed {
  
  inline def apply(capacityUnit: Read): Consumed = {
    val __obj = js.Dynamic.literal(capacityUnit = capacityUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Consumed] (val x: Self) extends AnyVal {
    
    inline def setCapacityUnit(value: Read): Self = StObject.set(x, "capacityUnit", value.asInstanceOf[js.Any])
  }
}
