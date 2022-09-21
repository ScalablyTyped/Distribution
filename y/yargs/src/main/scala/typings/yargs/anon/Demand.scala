package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Demand extends StObject {
  
  var demand: java.lang.String | `true`
}
object Demand {
  
  inline def apply(demand: java.lang.String | `true`): Demand = {
    val __obj = js.Dynamic.literal(demand = demand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Demand]
  }
  
  extension [Self <: Demand](x: Self) {
    
    inline def setDemand(value: java.lang.String | `true`): Self = StObject.set(x, "demand", value.asInstanceOf[js.Any])
  }
}
