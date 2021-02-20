package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acquisition extends StObject {
  
  var acquisition: scala.Double = js.native
  
  var install: scala.Double = js.native
  
  var other: scala.Double = js.native
  
  var review: scala.Double = js.native
  
  var sales: scala.Double = js.native
  
  var uninstall: scala.Double = js.native
}
object Acquisition {
  
  @scala.inline
  def apply(
    acquisition: scala.Double,
    install: scala.Double,
    other: scala.Double,
    review: scala.Double,
    sales: scala.Double,
    uninstall: scala.Double
  ): Acquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acquisition]
  }
  
  @scala.inline
  implicit class AcquisitionMutableBuilder[Self <: Acquisition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquisition(value: scala.Double): Self = StObject.set(x, "acquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstall(value: scala.Double): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: scala.Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview(value: scala.Double): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSales(value: scala.Double): Self = StObject.set(x, "sales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstall(value: scala.Double): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
  }
}
