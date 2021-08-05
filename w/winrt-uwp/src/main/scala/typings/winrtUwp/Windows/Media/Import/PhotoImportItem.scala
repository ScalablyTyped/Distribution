package typings.winrtUwp.Windows.Media.Import

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an media item that has been imported from a source. */
trait PhotoImportItem extends StObject {
  
  /** Gets the content type of the imported item. */
  var contentType: PhotoImportContentType
  
  /** Gets the creation date of the imported item. */
  var date: Date
  
  /** Gets a list of the names of files associated with this item that were deleted. */
  var deletedFileNames: IVectorView[String]
  
  /** Gets a list of the names of files associated with this item that were imported. */
  var importedFileNames: IVectorView[String]
  
  /** Gets a value indicating whether the item is currently selected for import. */
  var isSelected: Boolean
  
  /** Gets the key used to identify the item. */
  var itemKey: Double
  
  /** Gets the name of the item. */
  var name: String
  
  /** Gets the sibling file associated with the item, if one exists. */
  var sibling: PhotoImportSidecar
  
  /** Gets the list of sidecar files associated with the item, if any exists. */
  var sidecars: IVectorView[PhotoImportSidecar]
  
  /** Gets the size of the item, in bytes. */
  var sizeInBytes: Double
  
  /** Gets a random access stream containing the thumbnail image associated with the item. */
  var thumbnail: IRandomAccessStreamReference
  
  /** Gets the list of video segments associated with the item. */
  var videoSegments: IVectorView[PhotoImportVideoSegment]
}
object PhotoImportItem {
  
  inline def apply(
    contentType: PhotoImportContentType,
    date: Date,
    deletedFileNames: IVectorView[String],
    importedFileNames: IVectorView[String],
    isSelected: Boolean,
    itemKey: Double,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double,
    thumbnail: IRandomAccessStreamReference,
    videoSegments: IVectorView[PhotoImportVideoSegment]
  ): PhotoImportItem = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deletedFileNames = deletedFileNames.asInstanceOf[js.Any], importedFileNames = importedFileNames.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoSegments = videoSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItem]
  }
  
  extension [Self <: PhotoImportItem](x: Self) {
    
    inline def setContentType(value: PhotoImportContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDeletedFileNames(value: IVectorView[String]): Self = StObject.set(x, "deletedFileNames", value.asInstanceOf[js.Any])
    
    inline def setImportedFileNames(value: IVectorView[String]): Self = StObject.set(x, "importedFileNames", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setItemKey(value: Double): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSibling(value: PhotoImportSidecar): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    inline def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = StObject.set(x, "sidecars", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setVideoSegments(value: IVectorView[PhotoImportVideoSegment]): Self = StObject.set(x, "videoSegments", value.asInstanceOf[js.Any])
  }
}
