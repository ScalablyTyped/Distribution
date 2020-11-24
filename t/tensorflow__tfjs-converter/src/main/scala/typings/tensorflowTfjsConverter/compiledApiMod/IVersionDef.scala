package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVersionDef extends js.Object {
  
  /** VersionDef badConsumers */
  var badConsumers: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** VersionDef minConsumer */
  var minConsumer: js.UndefOr[Double | Null] = js.native
  
  /** VersionDef producer */
  var producer: js.UndefOr[Double | Null] = js.native
}
object IVersionDef {
  
  @scala.inline
  def apply(): IVersionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersionDef]
  }
  
  @scala.inline
  implicit class IVersionDefOps[Self <: IVersionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBadConsumersVarargs(value: Double*): Self = this.set("badConsumers", js.Array(value :_*))
    
    @scala.inline
    def setBadConsumers(value: js.Array[Double]): Self = this.set("badConsumers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadConsumers: Self = this.set("badConsumers", js.undefined)
    
    @scala.inline
    def setBadConsumersNull: Self = this.set("badConsumers", null)
    
    @scala.inline
    def setMinConsumer(value: Double): Self = this.set("minConsumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinConsumer: Self = this.set("minConsumer", js.undefined)
    
    @scala.inline
    def setMinConsumerNull: Self = this.set("minConsumer", null)
    
    @scala.inline
    def setProducer(value: Double): Self = this.set("producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducer: Self = this.set("producer", js.undefined)
    
    @scala.inline
    def setProducerNull: Self = this.set("producer", null)
  }
}
