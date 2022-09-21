package typings.systemTask

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-task", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SystemTask {
    def this(taskType: String) = this()
    def this(taskType: String, isAsyncProcess: Boolean) = this()
    def this(taskType: Unit, isAsyncProcess: Boolean) = this()
    def this(taskType: String, isAsyncProcess: Boolean, logMethod: Any) = this()
    def this(taskType: String, isAsyncProcess: Unit, logMethod: Any) = this()
    def this(taskType: Unit, isAsyncProcess: Boolean, logMethod: Any) = this()
    def this(taskType: Unit, isAsyncProcess: Unit, logMethod: Any) = this()
  }
  
  /**
    * @async
    */
  @JSImport("system-task", "AsyncProcess")
  @js.native
  val AsyncProcess: js.Function4[
    /* items */ js.Array[Any], 
    /* executeAsyncCall */ Any, 
    /* task */ SystemTask, 
    /* errors */ js.Array[Any], 
    js.Promise[Any]
  ] = js.native
  
  /**
    * @async
    */
  @JSImport("system-task", "SyncProcess")
  @js.native
  val SyncProcess: js.Function4[
    /* items */ js.Array[Any], 
    /* executeSyncCall */ Any, 
    /* task */ SystemTask, 
    /* errors */ js.Array[Any], 
    js.Promise[Any]
  ] = js.native
  
  @js.native
  trait SystemTask extends StObject {
    
    /**
      * @async
      */
    def cleanupHandler(task: SystemTask, cleanupItems: js.Array[Any]): js.Promise[Any] = js.native
    
    /**
      * @async
      */
    def insertPreprocessItemsHandler(task: SystemTask): js.Promise[Any] = js.native
    
    def isValidProcess(): Unit = js.native
    
    /**
      * @async
      */
    def log(`type`: String, message: String): Unit = js.native
    def log(`type`: String, message: String, detail: Any): Unit = js.native
    
    /**
      * @async
      */
    def preprocessHandler(task: SystemTask, preProcessItem: Any): js.Promise[Any] = js.native
    
    /**
      * @async
      */
    def processHandler(task: SystemTask, processItem: Any): js.Promise[Any] = js.native
    
    /**
      * @async
      */
    def start(): Unit = js.native
    
    var `type`: String = js.native
  }
}
