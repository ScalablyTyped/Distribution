package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncActionWithProgress[TProgress]
  extends IAsyncInfo
     with IPromise[Unit] {
  
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress] = js.native
  
  def getResults(): Unit = js.native
  
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): Unit = js.native
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress] = js.native
}
