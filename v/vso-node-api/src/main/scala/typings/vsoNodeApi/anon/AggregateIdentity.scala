package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateIdentity extends js.Object {
  
  var aggregateIdentity: scala.Double = js.native
  
  var importedIdentity: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var serviceIdentity: scala.Double = js.native
}
object AggregateIdentity {
  
  @scala.inline
  def apply(
    aggregateIdentity: scala.Double,
    importedIdentity: scala.Double,
    none: scala.Double,
    serviceIdentity: scala.Double
  ): AggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity.asInstanceOf[js.Any], importedIdentity = importedIdentity.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceIdentity = serviceIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateIdentity]
  }
  
  @scala.inline
  implicit class AggregateIdentityOps[Self <: AggregateIdentity] (val x: Self) extends AnyVal {
    
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
    def setAggregateIdentity(value: scala.Double): Self = this.set("aggregateIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedIdentity(value: scala.Double): Self = this.set("importedIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdentity(value: scala.Double): Self = this.set("serviceIdentity", value.asInstanceOf[js.Any])
  }
}
