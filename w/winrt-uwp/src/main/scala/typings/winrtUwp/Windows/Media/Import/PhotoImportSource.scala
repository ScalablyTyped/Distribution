package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the source device for a photo import session. */
@js.native
trait PhotoImportSource extends js.Object {
  
  /** The battery level of the source device. */
  var batteryLevelPercent: Double = js.native
  
  /** Gets the connection protocol that is being used to communicate with the source device. */
  var connectionProtocol: String = js.native
  
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  var connectionTransport: PhotoImportConnectionTransport = js.native
  
  /**
    * Creates a new photo import session.
    * @return The new PhotoImportSession object.
    */
  def createImportSession(): PhotoImportSession = js.native
  
  /** Gets the current date and time on the device. */
  var dateTime: Date = js.native
  
  /** Gets a human-readable description of the source device. */
  var description: String = js.native
  
  /** Gets the human-readable display name for the source device. */
  var displayName: String = js.native
  
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  var id: String = js.native
  
  /** Gets a value indicating if the source device is locked. */
  var isLocked: Boolean = js.native
  
  /** Gets a value indicating if the source device is a mass storage device. */
  var isMassStorage: Boolean = js.native
  
  /** Gets the source device's human-readable manufacturer name. */
  var manufacturer: String = js.native
  
  /** Gets the device model name. */
  var model: String = js.native
  
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  var powerSource: PhotoImportPowerSource = js.native
  
  /** Gets the serial number of the device. */
  var serialNumber: String = js.native
  
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  var storageMedia: IVectorView[PhotoImportStorageMedium] = js.native
  
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  var thumbnail: IRandomAccessStreamReference = js.native
  
  /** Gets a value indicating the type of the source device. */
  var `type`: PhotoImportSourceType = js.native
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
  implicit class PhotoImportSourceOps[Self <: PhotoImportSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatteryLevelPercent(value: Double): Self = this.set("batteryLevelPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionProtocol(value: String): Self = this.set("connectionProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTransport(value: PhotoImportConnectionTransport): Self = this.set("connectionTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateImportSession(value: () => PhotoImportSession): Self = this.set("createImportSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDateTime(value: Date): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMassStorage(value: Boolean): Self = this.set("isMassStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerSource(value: PhotoImportPowerSource): Self = this.set("powerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMedia(value: IVectorView[PhotoImportStorageMedium]): Self = this.set("storageMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PhotoImportSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
