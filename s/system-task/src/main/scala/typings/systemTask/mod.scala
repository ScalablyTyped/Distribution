package typings.systemTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-task", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SystemTask {
    def this(taskType: String) = this()
    def this(taskType: String, isAsyncProcess: Boolean) = this()
    def this(taskType: String, isAsyncProcess: Boolean, logMethod: js.Any) = this()
    def this(taskType: String, isAsyncProcess: Unit, logMethod: js.Any) = this()
  }
  @JSImport("system-task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asyncProcess(items: js.Array[js.Any], executeAsyncCall: js.Any, task: SystemTask, errors: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncProcess")(items.asInstanceOf[js.Any], executeAsyncCall.asInstanceOf[js.Any], task.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def syncProcess(items: js.Array[js.Any], executeSyncCall: js.Any, task: SystemTask, errors: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("syncProcess")(items.asInstanceOf[js.Any], executeSyncCall.asInstanceOf[js.Any], task.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @js.native
  trait SystemTask extends StObject {
    
    def cleanupHandler(task: SystemTask, cleanupItems: js.Array[js.Any]): js.Promise[js.Any] = js.native
    
    def insertPreprocessItemsHandler(task: SystemTask): js.Promise[js.Any] = js.native
    
    def isValidProcess(): Unit = js.native
    
    def log(`type`: String, message: String): Unit = js.native
    def log(`type`: String, message: String, detail: js.Any): Unit = js.native
    
    def preprocessHandler(task: SystemTask, preProcessItem: js.Any): js.Promise[js.Any] = js.native
    
    def processHandler(task: SystemTask, processItem: js.Any): js.Promise[js.Any] = js.native
    
    def start(): Unit = js.native
    
    var `type`: String = js.native
  }
}
