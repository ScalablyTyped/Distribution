package typings.swellJs

import typings.swellJs.typesShipmentRatingCamelMod.ShipmentRatingCamel
import typings.swellJs.typesShipmentRatingCamelMod.ShipmentServiceCamel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesShipmentRatingMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesShipmentRatingSnakeMod.ShipmentRatingSnake because var conflicts: date_created, errors, fingerprint, md5, services. Inlined  */ trait ShipmentRating
    extends StObject
       with ShipmentRatingCamel
  object ShipmentRating {
    
    inline def apply(): ShipmentRating = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShipmentRating]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesShipmentRatingSnakeMod.ShipmentServiceSnake because var conflicts: carrier, description, id, name, pickup, price, tax_code. Inlined  */ trait ShipmentService
    extends StObject
       with ShipmentServiceCamel
  object ShipmentService {
    
    inline def apply(): ShipmentService = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShipmentService]
    }
  }
}
