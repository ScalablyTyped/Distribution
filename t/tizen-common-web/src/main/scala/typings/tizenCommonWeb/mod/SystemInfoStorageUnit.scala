package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoStorageUnit
  extends StObject
     with SystemInfoProperty {
  
  /**
    * The amount of space currently available on the user's storage, in bytes.
    */
  val availableCapacity: Double
  
  /**
    * The total amount of space available on the user's storage (excluding system-reserved), in bytes.
    */
  val capacity: Double
  
  /**
    * An attribute to indicate whether a device can be removed or not.
    *
    * The following values are supported:
    * *   true - If this storage unit can be removed from the system (such as an sdcard unplugged)
    * *   false - If this storage unit cannot be removed from the system
    * @since 2.1
    */
  val isRemovable: Boolean
  
  /**
    * True if this unit can be removed from the system (such as an sdcard unplugged), false otherwise.
    *
    * @note _deprecated_ 2.1 Deprecated since 2.1. Instead, use _isRemovable_.
    */
  val isRemoveable: Boolean
  
  /**
    * The type of a storage device. The value is one of the constants defined for this type.
    *
    * The supported storage unit types are:
    *
    * *   UNKNOWN
    * *   INTERNAL
    * *   USB\_DEVICE
    * *   USB\_HOST
    * *   MMC
    *
    */
  val `type`: String
}
object SystemInfoStorageUnit {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SystemInfoStorageUnit] (val x: Self) extends AnyVal {
    
    inline def setAvailableCapacity(value: Double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
    
    inline def setIsRemoveable(value: Boolean): Self = StObject.set(x, "isRemoveable", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
