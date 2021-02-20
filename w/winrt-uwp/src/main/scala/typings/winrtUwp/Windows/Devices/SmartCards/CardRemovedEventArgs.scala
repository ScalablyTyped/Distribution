package typings.winrtUwp.Windows.Devices.SmartCards

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CardRemoved event. */
@js.native
trait CardRemovedEventArgs extends StObject {
  
  /** Gets info about the smart card that was taken out of the smart card reader. */
  var smartCard: SmartCard = js.native
}
object CardRemovedEventArgs {
  
  @scala.inline
  def apply(smartCard: SmartCard): CardRemovedEventArgs = {
    val __obj = js.Dynamic.literal(smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardRemovedEventArgs]
  }
  
  @scala.inline
  implicit class CardRemovedEventArgsMutableBuilder[Self <: CardRemovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
