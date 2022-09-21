package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApplicationData extends StObject {
  
  def clearAsync(): IAsyncAction = js.native
  def clearAsync(locality: ApplicationDataLocality): IAsyncAction = js.native
  
  var localFolder: StorageFolder = js.native
  
  var localSettings: ApplicationDataContainer = js.native
  
  var ondatachanged: Any = js.native
  
  var roamingFolder: StorageFolder = js.native
  
  var roamingSettings: ApplicationDataContainer = js.native
  
  var roamingStorageQuota: Double = js.native
  
  def setVersionAsync(desiredVersion: Double, handler: ApplicationDataSetVersionHandler): IAsyncAction = js.native
  
  def signalDataChanged(): Unit = js.native
  
  var temporaryFolder: StorageFolder = js.native
  
  var version: Double = js.native
}
