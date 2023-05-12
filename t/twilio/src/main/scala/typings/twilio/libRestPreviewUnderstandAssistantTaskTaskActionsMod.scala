package typings.twilio

import typings.twilio.anon.TaskSid
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskTaskActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsContextImpl")
  @js.native
  open class TaskActionsContextImpl protected ()
    extends StObject
       with TaskActionsContext {
    def this(_version: default, assistantSid: String, taskSid: String) = this()
    
    /* protected */ var _solution: TaskActionsContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
    
    def update(
      params: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any],
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any]
    ): js.Promise[TaskActionsInstance] = js.native
    def update(
      params: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any]
    ): js.Promise[TaskActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsInstance")
  @js.native
  open class TaskActionsInstance protected () extends StObject {
    def this(_version: default, payload: TaskActionsResource, assistantSid: String, taskSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[TaskActionsContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: TaskActionsContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the parent Assistant.
      */
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * Fetch a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def fetch(): js.Promise[TaskActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[TaskActionsInstance] = js.native
    
    /**
      * The unique ID of the Task.
      */
    var taskSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): TaskSid = js.native
    
    /**
      * Update a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def update(): js.Promise[TaskActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[TaskActionsInstance] = js.native
    /**
      * Update a TaskActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def update(params: TaskActionsContextUpdateOptions): js.Promise[TaskActionsInstance] = js.native
    def update(
      params: TaskActionsContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]
    ): js.Promise[TaskActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait TaskActionsListInstance extends StObject {
    
    def apply(): TaskActionsContext = js.native
    
    var _solution: TaskActionsSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): TaskActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object TaskActionsListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsListInstance")
    @js.native
    def apply(version: default, assistantSid: String, taskSid: String): TaskActionsListInstance = js.native
  }
  
  @js.native
  trait TaskActionsContext extends StObject {
    
    /**
      * Fetch a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def fetch(): js.Promise[TaskActionsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any]
    ): js.Promise[TaskActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * Update a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def update(): js.Promise[TaskActionsInstance] = js.native
    def update(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any]
    ): js.Promise[TaskActionsInstance] = js.native
    /**
      * Update a TaskActionsInstance
      *
      * @param params - Parameter for request
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskActionsInstance
      */
    def update(params: TaskActionsContextUpdateOptions): js.Promise[TaskActionsInstance] = js.native
    def update(
      params: TaskActionsContextUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskActionsInstance], Any]
    ): js.Promise[TaskActionsInstance] = js.native
  }
  
  trait TaskActionsContextSolution extends StObject {
    
    var assistantSid: String
    
    var taskSid: String
  }
  object TaskActionsContextSolution {
    
    inline def apply(assistantSid: String, taskSid: String): TaskActionsContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskActionsContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskActionsContextUpdateOptions extends StObject {
    
    /** The JSON actions that instruct the Assistant how to perform this task. */
    var actions: js.UndefOr[Any] = js.undefined
  }
  object TaskActionsContextUpdateOptions {
    
    inline def apply(): TaskActionsContextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskActionsContextUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsContextUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    }
  }
  
  trait TaskActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: Any
    
    var task_sid: String
    
    var url: String
  }
  object TaskActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: Any, task_sid: String, url: String): TaskActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskActionsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskActionsSolution extends StObject {
    
    var assistantSid: String
    
    var taskSid: String
  }
  object TaskActionsSolution {
    
    inline def apply(assistantSid: String, taskSid: String): TaskActionsSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskActionsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
}
