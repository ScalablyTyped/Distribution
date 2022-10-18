package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVersionDef extends StObject {
  
  /** VersionDef badConsumers */
  var badConsumers: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /** VersionDef minConsumer */
  var minConsumer: js.UndefOr[Double | Null] = js.undefined
  
  /** VersionDef producer */
  var producer: js.UndefOr[Double | Null] = js.undefined
}
object IVersionDef {
  
  inline def apply(): IVersionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersionDef]
  }
  
  extension [Self <: IVersionDef](x: Self) {
    
    inline def setBadConsumers(value: js.Array[Double]): Self = StObject.set(x, "badConsumers", value.asInstanceOf[js.Any])
    
    inline def setBadConsumersNull: Self = StObject.set(x, "badConsumers", null)
    
    inline def setBadConsumersUndefined: Self = StObject.set(x, "badConsumers", js.undefined)
    
    inline def setBadConsumersVarargs(value: Double*): Self = StObject.set(x, "badConsumers", js.Array(value*))
    
    inline def setMinConsumer(value: Double): Self = StObject.set(x, "minConsumer", value.asInstanceOf[js.Any])
    
    inline def setMinConsumerNull: Self = StObject.set(x, "minConsumer", null)
    
    inline def setMinConsumerUndefined: Self = StObject.set(x, "minConsumer", js.undefined)
    
    inline def setProducer(value: Double): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerNull: Self = StObject.set(x, "producer", null)
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
