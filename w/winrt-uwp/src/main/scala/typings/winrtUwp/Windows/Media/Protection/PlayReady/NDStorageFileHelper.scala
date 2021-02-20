package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages PlayReady-ND storage files. */
@js.native
trait NDStorageFileHelper extends StObject {
  
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  def getFileURLs(file: IStorageFile): IVector[String] = js.native
}
object NDStorageFileHelper {
  
  @scala.inline
  def apply(getFileURLs: IStorageFile => IVector[String]): NDStorageFileHelper = {
    val __obj = js.Dynamic.literal(getFileURLs = js.Any.fromFunction1(getFileURLs))
    __obj.asInstanceOf[NDStorageFileHelper]
  }
  
  @scala.inline
  implicit class NDStorageFileHelperMutableBuilder[Self <: NDStorageFileHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFileURLs(value: IStorageFile => IVector[String]): Self = StObject.set(x, "getFileURLs", js.Any.fromFunction1(value))
  }
}
