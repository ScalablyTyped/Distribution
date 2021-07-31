package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.ApplicationDataContainerSettings")
@js.native
class ApplicationDataContainerSettings ()
  extends StObject
     with typings.winrt.Windows.Storage.ApplicationDataContainerSettings {
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
  
  /* CompleteClass */
  override def getView(): IMapView[String, js.Any] = js.native
  
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  
  /* CompleteClass */
  var onmapchanged: js.Any = js.native
  
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  
  /* CompleteClass */
  var size: Double = js.native
}
