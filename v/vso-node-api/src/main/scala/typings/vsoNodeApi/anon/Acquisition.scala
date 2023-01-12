package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acquisition extends StObject {
  
  var acquisition: scala.Double
  
  var install: scala.Double
  
  var other: scala.Double
  
  var review: scala.Double
  
  var sales: scala.Double
  
  var uninstall: scala.Double
}
object Acquisition {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Acquisition] (val x: Self) extends AnyVal {
    
    inline def setAcquisition(value: scala.Double): Self = StObject.set(x, "acquisition", value.asInstanceOf[js.Any])
    
    inline def setInstall(value: scala.Double): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setOther(value: scala.Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setReview(value: scala.Double): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    inline def setSales(value: scala.Double): Self = StObject.set(x, "sales", value.asInstanceOf[js.Any])
    
    inline def setUninstall(value: scala.Double): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
  }
}
