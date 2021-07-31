package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageItemContentProperties
  extends StObject
     with IStorageItemExtraProperties {
  
  def getDocumentPropertiesAsync(): IAsyncOperation[DocumentProperties] = js.native
  
  def getImagePropertiesAsync(): IAsyncOperation[ImageProperties] = js.native
  
  def getMusicPropertiesAsync(): IAsyncOperation[MusicProperties] = js.native
  
  def getVideoPropertiesAsync(): IAsyncOperation[VideoProperties] = js.native
}
