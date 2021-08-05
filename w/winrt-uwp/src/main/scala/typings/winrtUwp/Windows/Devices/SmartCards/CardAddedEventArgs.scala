package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CardAdded event. */
trait CardAddedEventArgs extends StObject {
  
  /** Gets info about the smart card that was inserted into the smart card reader. */
  var smartCard: SmartCard
}
object CardAddedEventArgs {
  
  inline def apply(smartCard: SmartCard): CardAddedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardAddedEventArgs]
  }
  
  extension [Self <: CardAddedEventArgs](x: Self) {
    
    inline def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
