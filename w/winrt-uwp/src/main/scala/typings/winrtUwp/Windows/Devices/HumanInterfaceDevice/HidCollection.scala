package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves the collection information for a group of related controls. */
@js.native
trait HidCollection extends StObject {
  
  /** Retrieves the identifier for a collection of HID controls. */
  var id: Double = js.native
  
  /** Retrieves the collection type. */
  var `type`: HidCollectionType = js.native
  
  /** Retrieves the usage identifier for the given control collection. */
  var usageId: Double = js.native
  
  /** Retrieves the usage page for the given control collection. */
  var usagePage: Double = js.native
}
object HidCollection {
  
  @scala.inline
  def apply(id: Double, `type`: HidCollectionType, usageId: Double, usagePage: Double): HidCollection = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidCollection]
  }
  
  @scala.inline
  implicit class HidCollectionMutableBuilder[Self <: HidCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HidCollectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageId(value: Double): Self = StObject.set(x, "usageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
  }
}
