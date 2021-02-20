package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object describing a location provider.
  */
@js.native
trait LocationProviderDict extends StObject {
  
  /**
    * Accuracy of the location provider, either fine (1) or coarse (2).
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * Name of the location provider.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Power consumption for this provider, either low (1), medium (2), or high (3).
    */
  var power: js.UndefOr[Double] = js.native
}
object LocationProviderDict {
  
  @scala.inline
  def apply(): LocationProviderDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationProviderDict]
  }
  
  @scala.inline
  implicit class LocationProviderDictMutableBuilder[Self <: LocationProviderDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
  }
}
