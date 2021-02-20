package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoStorageUnit extends SystemInfoProperty {
  
  /**
    * The amount of space currently available on the user's storage, in bytes.
    */
  val availableCapacity: Double = js.native
  
  /**
    * The total amount of space available on the user's storage (excluding system-reserved), in bytes.
    */
  val capacity: Double = js.native
  
  /**
    * An attribute to indicate whether a device can be removed or not.
    *
    * The following values are supported:
    * - ***true*** - If this storage unit can be removed from the system (such as an sdcard unplugged)
    * - ***false*** - If this storage unit cannot be removed from the system
    * @since 2.1
    */
  val isRemovable: Boolean = js.native
  
  /**
    * True if this unit can be removed from the system (such as an sdcard unplugged), false otherwise.
    *
    * @note `deprecated` 2.1 Deprecated since 2.1. Instead, use `isRemovable`.
    */
  val isRemoveable: Boolean = js.native
  
  /**
    * The type of a storage device. The value is one of the constants defined for this type.
    *
    * The supported storage unit types are:
    * - UNKNOWN
    * - INTERNAL
    * - USB_DEVICE
    * - USB_HOST
    * - MMC
    */
  val `type`: String = js.native
}
object SystemInfoStorageUnit {
  
  @scala.inline
  def apply(
    availableCapacity: Double,
    capacity: Double,
    isRemovable: Boolean,
    isRemoveable: Boolean,
    `type`: String
  ): SystemInfoStorageUnit = {
    val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], isRemoveable = isRemoveable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoStorageUnit]
  }
  
  @scala.inline
  implicit class SystemInfoStorageUnitMutableBuilder[Self <: SystemInfoStorageUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableCapacity(value: Double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemoveable(value: Boolean): Self = StObject.set(x, "isRemoveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
