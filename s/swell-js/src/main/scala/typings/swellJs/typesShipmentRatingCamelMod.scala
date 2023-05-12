package typings.swellJs

import typings.swellJs.anon.Code
import typings.swellJs.typesShipmentRatingSnakeMod.ShipmentServiceSnake
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesShipmentRatingCamelMod {
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/shipment_rating/snake.ShipmentRatingSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/shipment_rating/snake.ShipmentRatingSnake[K]} */
  trait ShipmentRatingCamel extends StObject {
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[Code] = js.undefined
    
    var fingerprint: js.UndefOr[String] = js.undefined
    
    var md5: js.UndefOr[String] = js.undefined
    
    var services: js.UndefOr[js.Array[ShipmentServiceSnake]] = js.undefined
  }
  object ShipmentRatingCamel {
    
    inline def apply(): ShipmentRatingCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShipmentRatingCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShipmentRatingCamel] (val x: Self) extends AnyVal {
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setErrors(value: Code): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setServices(value: js.Array[ShipmentServiceSnake]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: ShipmentServiceSnake*): Self = StObject.set(x, "services", js.Array(value*))
    }
  }
  
  /* Inlined {[ K in keyof swell-js.swell-js/types/shipment_rating/snake.ShipmentServiceSnake as swell-js.swell-js.SnakeToCamelCase<K> ]: swell-js.swell-js/types/shipment_rating/snake.ShipmentServiceSnake[K]} */
  trait ShipmentServiceCamel extends StObject {
    
    var carrier: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pickup: js.UndefOr[Boolean] = js.undefined
    
    var price: js.UndefOr[Double] = js.undefined
    
    var tax_code: js.UndefOr[String] = js.undefined
  }
  object ShipmentServiceCamel {
    
    inline def apply(): ShipmentServiceCamel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShipmentServiceCamel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShipmentServiceCamel] (val x: Self) extends AnyVal {
      
      inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPickup(value: Boolean): Self = StObject.set(x, "pickup", value.asInstanceOf[js.Any])
      
      inline def setPickupUndefined: Self = StObject.set(x, "pickup", js.undefined)
      
      inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setTax_code(value: String): Self = StObject.set(x, "tax_code", value.asInstanceOf[js.Any])
      
      inline def setTax_codeUndefined: Self = StObject.set(x, "tax_code", js.undefined)
    }
  }
}
