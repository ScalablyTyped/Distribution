package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a storage medium exposed by a photo import source device. */
@js.native
trait PhotoImportStorageMedium extends StObject {
  
  /** Gets the available space on the storage medium, in bytes. */
  var availableSpaceInBytes: Double = js.native
  
  /** Gets the capacity of the storage media, in bytes. */
  var capacityInBytes: Double = js.native
  
  /** Gets a description of the storage medium. */
  var description: String = js.native
  
  /** Gets the name of the storage medium. */
  var name: String = js.native
  
  /** Refreshes the information about the storage medium. */
  def refresh(): Unit = js.native
  
  /** Gets the serial number of the storage medium. */
  var serialNumber: String = js.native
  
  /** Gets the type of the storage medium. */
  var storageMediumType: PhotoImportStorageMediumType = js.native
  
  /** Gets a value indicating the access modes supported by the storage medium. */
  var supportedAccessMode: PhotoImportAccessMode = js.native
}
object PhotoImportStorageMedium {
  
  @scala.inline
  def apply(
    availableSpaceInBytes: Double,
    capacityInBytes: Double,
    description: String,
    name: String,
    refresh: () => Unit,
    serialNumber: String,
    storageMediumType: PhotoImportStorageMediumType,
    supportedAccessMode: PhotoImportAccessMode
  ): PhotoImportStorageMedium = {
    val __obj = js.Dynamic.literal(availableSpaceInBytes = availableSpaceInBytes.asInstanceOf[js.Any], capacityInBytes = capacityInBytes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), serialNumber = serialNumber.asInstanceOf[js.Any], storageMediumType = storageMediumType.asInstanceOf[js.Any], supportedAccessMode = supportedAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportStorageMedium]
  }
  
  @scala.inline
  implicit class PhotoImportStorageMediumMutableBuilder[Self <: PhotoImportStorageMedium] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableSpaceInBytes(value: Double): Self = StObject.set(x, "availableSpaceInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityInBytes(value: Double): Self = StObject.set(x, "capacityInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMediumType(value: PhotoImportStorageMediumType): Self = StObject.set(x, "storageMediumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedAccessMode(value: PhotoImportAccessMode): Self = StObject.set(x, "supportedAccessMode", value.asInstanceOf[js.Any])
  }
}
