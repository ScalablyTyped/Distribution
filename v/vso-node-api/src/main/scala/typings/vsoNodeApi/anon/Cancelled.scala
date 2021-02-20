package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelled extends StObject {
  
  var cancelled: scala.Double = js.native
  
  var error: scala.Double = js.native
  
  var published: scala.Double = js.native
  
  var unpublished: scala.Double = js.native
}
object Cancelled {
  
  @scala.inline
  def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
  
  @scala.inline
  implicit class CancelledMutableBuilder[Self <: Cancelled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: scala.Double): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished(value: scala.Double): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpublished(value: scala.Double): Self = StObject.set(x, "unpublished", value.asInstanceOf[js.Any])
  }
}
