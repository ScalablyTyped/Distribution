package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages PlayReady-ND storage files. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStorageFileHelper")
@js.native
/** Creates a new instance of the NDStorageFileHelper class. */
open class NDStorageFileHelper ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.NDStorageFileHelper {
  
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  /* CompleteClass */
  override def getFileURLs(file: IStorageFile): IVector[String] = js.native
}
