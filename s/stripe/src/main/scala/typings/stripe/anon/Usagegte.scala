package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Usagegte extends StObject {
  
  /**
    * Usage threshold that triggers the subscription to create an invoice
    */
  var usage_gte: Double = js.native
}
object Usagegte {
  
  @scala.inline
  def apply(usage_gte: Double): Usagegte = {
    val __obj = js.Dynamic.literal(usage_gte = usage_gte.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usagegte]
  }
  
  @scala.inline
  implicit class UsagegteMutableBuilder[Self <: Usagegte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsage_gte(value: Double): Self = StObject.set(x, "usage_gte", value.asInstanceOf[js.Any])
  }
}
