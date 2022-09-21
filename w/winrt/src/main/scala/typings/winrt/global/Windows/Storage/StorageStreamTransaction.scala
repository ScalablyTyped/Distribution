package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
open class StorageStreamTransaction ()
  extends StObject
     with typings.winrt.Windows.Storage.StorageStreamTransaction {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def commitAsync(): IAsyncAction = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  var stream: IRandomAccessStream = js.native
}
