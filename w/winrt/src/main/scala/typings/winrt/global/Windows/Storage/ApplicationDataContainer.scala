package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
open class ApplicationDataContainer ()
  extends StObject
     with typings.winrt.Windows.Storage.ApplicationDataContainer {
  
  /* CompleteClass */
  var containers: IMapView[String, typings.winrt.Windows.Storage.ApplicationDataContainer] = js.native
  
  /* CompleteClass */
  override def createContainer(name: String, disposition: typings.winrt.Windows.Storage.ApplicationDataCreateDisposition): typings.winrt.Windows.Storage.ApplicationDataContainer = js.native
  
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
  
  /* CompleteClass */
  var locality: typings.winrt.Windows.Storage.ApplicationDataLocality = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var values: IPropertySet = js.native
}
