package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CardRemoved event. */
trait CardRemovedEventArgs extends StObject {
  
  /** Gets info about the smart card that was taken out of the smart card reader. */
  var smartCard: SmartCard
}
object CardRemovedEventArgs {
  
  inline def apply(smartCard: SmartCard): CardRemovedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardRemovedEventArgs]
  }
  
  extension [Self <: CardRemovedEventArgs](x: Self) {
    
    inline def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
