package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTask extends StObject {
  
  def run(taskInstance: IBackgroundTaskInstance): Unit
}
object IBackgroundTask {
  
  inline def apply(run: IBackgroundTaskInstance => Unit): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[IBackgroundTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBackgroundTask] (val x: Self) extends AnyVal {
    
    inline def setRun(value: IBackgroundTaskInstance => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
