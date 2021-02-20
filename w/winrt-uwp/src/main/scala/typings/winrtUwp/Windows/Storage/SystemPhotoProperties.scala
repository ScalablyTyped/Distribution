package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows photo file properties. */
@js.native
trait SystemPhotoProperties extends StObject {
  
  /** Gets the name of the System.Photo.CameraManufacturer property (one of the Windows photo file properties). */
  var cameraManufacturer: String = js.native
  
  /** Gets the name of the System.Photo.CameraModel property (one of the Windows photo file properties). */
  var cameraModel: String = js.native
  
  /** Gets the name of the System.Photo.DateTaken property (one of the Windows photo file properties). */
  var dateTaken: String = js.native
  
  /** Gets the name of the System.Photo.Orientation property (one of the Windows photo file properties). */
  var orientation: String = js.native
  
  /** Gets the name of the System.Photo.PeopleNames property (one of the Windows photo file properties). */
  var peopleNames: String = js.native
}
object SystemPhotoProperties {
  
  @scala.inline
  def apply(
    cameraManufacturer: String,
    cameraModel: String,
    dateTaken: String,
    orientation: String,
    peopleNames: String
  ): SystemPhotoProperties = {
    val __obj = js.Dynamic.literal(cameraManufacturer = cameraManufacturer.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], dateTaken = dateTaken.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], peopleNames = peopleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemPhotoProperties]
  }
  
  @scala.inline
  implicit class SystemPhotoPropertiesMutableBuilder[Self <: SystemPhotoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCameraManufacturer(value: String): Self = StObject.set(x, "cameraManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTaken(value: String): Self = StObject.set(x, "dateTaken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleNames(value: String): Self = StObject.set(x, "peopleNames", value.asInstanceOf[js.Any])
  }
}
