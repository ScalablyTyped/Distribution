package typings.winrt.Windows.ApplicationModel.Background

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundExecutionManagerStatics extends StObject {
  
  def getAccessStatus(): BackgroundAccessStatus = js.native
  def getAccessStatus(applicationId: String): BackgroundAccessStatus = js.native
  
  def removeAccess(): Unit = js.native
  def removeAccess(applicationId: String): Unit = js.native
  
  def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = js.native
  def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = js.native
}
