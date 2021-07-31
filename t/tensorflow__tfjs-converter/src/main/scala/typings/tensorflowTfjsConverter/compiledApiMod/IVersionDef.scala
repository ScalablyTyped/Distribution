package typings.tensorflowTfjsConverter.compiledApiMod

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
  
  @scala.inline
  def apply(): IVersionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersionDef]
  }
  
  @scala.inline
  implicit class IVersionDefMutableBuilder[Self <: IVersionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadConsumers(value: js.Array[Double]): Self = StObject.set(x, "badConsumers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadConsumersNull: Self = StObject.set(x, "badConsumers", null)
    
    @scala.inline
    def setBadConsumersUndefined: Self = StObject.set(x, "badConsumers", js.undefined)
    
    @scala.inline
    def setBadConsumersVarargs(value: Double*): Self = StObject.set(x, "badConsumers", js.Array(value :_*))
    
    @scala.inline
    def setMinConsumer(value: Double): Self = StObject.set(x, "minConsumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConsumerNull: Self = StObject.set(x, "minConsumer", null)
    
    @scala.inline
    def setMinConsumerUndefined: Self = StObject.set(x, "minConsumer", js.undefined)
    
    @scala.inline
    def setProducer(value: Double): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerNull: Self = StObject.set(x, "producer", null)
    
    @scala.inline
    def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
  }
}
