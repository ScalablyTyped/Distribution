package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of background transfer operations ( DownloadOperation or UploadOperation objects) that trigger a background task once all the operations are done (if the operations completed successfully) or fail with an error. */
trait BackgroundTransferCompletionGroup extends StObject {
  
  /** Indicates that the BackgroundTransferCompletionGroup is complete and no more background transfer operations ( DownloadOperation or UploadOperation objects) will be added t the completion group. */
  def enable(): Unit
  
  /** Gets a value that indicates if Enable method on a BackgroundTransferCompletionGroup has already been called. */
  var isEnabled: Boolean
  
  /** Gets the IBackgroundTrigger used to set up the background task associated with the BackgroundTransferCompletionGroup . */
  var trigger: IBackgroundTrigger
}
object BackgroundTransferCompletionGroup {
  
  inline def apply(enable: () => Unit, isEnabled: Boolean, trigger: IBackgroundTrigger): BackgroundTransferCompletionGroup = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferCompletionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundTransferCompletionGroup] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: IBackgroundTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
