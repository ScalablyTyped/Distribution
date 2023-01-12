package typings.tablestore.mod

import typings.tablestore.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedThroughput extends StObject {
  
  var capacityUnit: Read
}
object ReservedThroughput {
  
  inline def apply(capacityUnit: Read): ReservedThroughput = {
    val __obj = js.Dynamic.literal(capacityUnit = capacityUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedThroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedThroughput] (val x: Self) extends AnyVal {
    
    inline def setCapacityUnit(value: Read): Self = StObject.set(x, "capacityUnit", value.asInstanceOf[js.Any])
  }
}
