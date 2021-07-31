package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the source device for a photo import session. */
trait PhotoImportSource extends StObject {
  
  /** The battery level of the source device. */
  var batteryLevelPercent: Double
  
  /** Gets the connection protocol that is being used to communicate with the source device. */
  var connectionProtocol: String
  
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  var connectionTransport: PhotoImportConnectionTransport
  
  /**
    * Creates a new photo import session.
    * @return The new PhotoImportSession object.
    */
  def createImportSession(): PhotoImportSession
  
  /** Gets the current date and time on the device. */
  var dateTime: Date
  
  /** Gets a human-readable description of the source device. */
  var description: String
  
  /** Gets the human-readable display name for the source device. */
  var displayName: String
  
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  var id: String
  
  /** Gets a value indicating if the source device is locked. */
  var isLocked: Boolean
  
  /** Gets a value indicating if the source device is a mass storage device. */
  var isMassStorage: Boolean
  
  /** Gets the source device's human-readable manufacturer name. */
  var manufacturer: String
  
  /** Gets the device model name. */
  var model: String
  
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  var powerSource: PhotoImportPowerSource
  
  /** Gets the serial number of the device. */
  var serialNumber: String
  
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  var storageMedia: IVectorView[PhotoImportStorageMedium]
  
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  var thumbnail: IRandomAccessStreamReference
  
  /** Gets a value indicating the type of the source device. */
  var `type`: PhotoImportSourceType
}
object PhotoImportSource {
  
  @scala.inline
  def apply(
    batteryLevelPercent: Double,
    connectionProtocol: String,
    connectionTransport: PhotoImportConnectionTransport,
    createImportSession: () => PhotoImportSession,
    dateTime: Date,
    description: String,
    displayName: String,
    id: String,
    isLocked: Boolean,
    isMassStorage: Boolean,
    manufacturer: String,
    model: String,
    powerSource: PhotoImportPowerSource,
    serialNumber: String,
    storageMedia: IVectorView[PhotoImportStorageMedium],
    thumbnail: IRandomAccessStreamReference,
    `type`: PhotoImportSourceType
  ): PhotoImportSource = {
    val __obj = js.Dynamic.literal(batteryLevelPercent = batteryLevelPercent.asInstanceOf[js.Any], connectionProtocol = connectionProtocol.asInstanceOf[js.Any], connectionTransport = connectionTransport.asInstanceOf[js.Any], createImportSession = js.Any.fromFunction0(createImportSession), dateTime = dateTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isMassStorage = isMassStorage.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], powerSource = powerSource.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], storageMedia = storageMedia.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSource]
  }
  
  @scala.inline
  implicit class PhotoImportSourceMutableBuilder[Self <: PhotoImportSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatteryLevelPercent(value: Double): Self = StObject.set(x, "batteryLevelPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionProtocol(value: String): Self = StObject.set(x, "connectionProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTransport(value: PhotoImportConnectionTransport): Self = StObject.set(x, "connectionTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateImportSession(value: () => PhotoImportSession): Self = StObject.set(x, "createImportSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDateTime(value: Date): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMassStorage(value: Boolean): Self = StObject.set(x, "isMassStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSource(value: PhotoImportPowerSource): Self = StObject.set(x, "powerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMedia(value: IVectorView[PhotoImportStorageMedium]): Self = StObject.set(x, "storageMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PhotoImportSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
