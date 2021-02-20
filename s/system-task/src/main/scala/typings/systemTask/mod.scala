package typings.systemTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-task", JSImport.Namespace)
  @js.native
  class ^ protected () extends SystemTask {
    def this(taskType: String) = this()
    def this(taskType: String, isAsyncProcess: Boolean) = this()
    def this(taskType: String, isAsyncProcess: js.UndefOr[scala.Nothing], logMethod: js.Any) = this()
    def this(taskType: String, isAsyncProcess: Boolean, logMethod: js.Any) = this()
  }
  
  @JSImport("system-task", "asyncProcess")
  @js.native
  def asyncProcess(items: js.Array[_], executeAsyncCall: js.Any, task: SystemTask, errors: js.Array[_]): js.Promise[_] = js.native
  
  @JSImport("system-task", "syncProcess")
  @js.native
  def syncProcess(items: js.Array[_], executeSyncCall: js.Any, task: SystemTask, errors: js.Array[_]): js.Promise[_] = js.native
  
  @js.native
  trait SystemTask extends StObject {
    
    def cleanupHandler(task: SystemTask, cleanupItems: js.Array[_]): js.Promise[_] = js.native
    
    def insertPreprocessItemsHandler(task: SystemTask): js.Promise[_] = js.native
    
    def isValidProcess(): Unit = js.native
    
    def log(`type`: String, message: String): Unit = js.native
    def log(`type`: String, message: String, detail: js.Any): Unit = js.native
    
    def preprocessHandler(task: SystemTask, preProcessItem: js.Any): js.Promise[_] = js.native
    
    def processHandler(task: SystemTask, processItem: js.Any): js.Promise[_] = js.native
    
    def start(): Unit = js.native
    
    var `type`: String = js.native
  }
}
