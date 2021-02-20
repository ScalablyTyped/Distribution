package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTask extends StObject {
  
  def run(taskInstance: IBackgroundTaskInstance): Unit = js.native
}
object IBackgroundTask {
  
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Unit): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[IBackgroundTask]
  }
  
  @scala.inline
  implicit class IBackgroundTaskMutableBuilder[Self <: IBackgroundTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: IBackgroundTaskInstance => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
