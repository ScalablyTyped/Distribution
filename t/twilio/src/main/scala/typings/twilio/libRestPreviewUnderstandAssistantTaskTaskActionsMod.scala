package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskTaskActionsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsContext")
  @js.native
  open class TaskActionsContext protected () extends StObject {
    /**
      * Initialize the TaskActionsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param taskSid - The unique ID of the Task.
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String) = this()
    
    /**
      * fetch a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskActionsInstance, Any]): js.Promise[TaskActionsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
    
    /**
      * update a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskActionsInstance, Any]): js.Promise[TaskActionsInstance] = js.native
    def update(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskActionsInstance, Any]
    ): js.Promise[TaskActionsInstance] = js.native
    def update(opts: TaskActionsInstanceUpdateOptions): js.Promise[TaskActionsInstance] = js.native
    def update(
      opts: TaskActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskActionsInstance, Any]
    ): js.Promise[TaskActionsInstance] = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsInstance")
  @js.native
  open class TaskActionsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskActionsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param taskSid - The unique ID of the Task.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: TaskActionsPayload,
      assistantSid: String,
      taskSid: String
    ) = this()
    
    /* private */ var _proxy: TaskActionsContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    var data: Any = js.native
    
    /**
      * fetch a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskActionsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskActionsInstance] = js.native
    
    var taskSid: String = js.native
    
    /**
      * update a TaskActionsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def update(): js.Promise[TaskActionsInstance] = js.native
    def update(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskActionsInstance] = js.native
    def update(opts: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskActionsInstance] = js.native
    def update(opts: TaskActionsInstanceUpdateOptions): js.Promise[TaskActionsInstance] = js.native
    def update(
      opts: TaskActionsInstanceUpdateOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]
    ): js.Promise[TaskActionsInstance] = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TaskActionsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the parent Assistant.
    * @param taskSid - The unique ID of the Task.
    */
  inline def TaskActionsList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String): TaskActionsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskActionsList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[TaskActionsListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskActions", "TaskActionsPage")
  @js.native
  open class TaskActionsPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          TaskActionsPayload, 
          TaskActionsResource, 
          TaskActionsInstance
        ] {
    /**
      * Initialize the TaskActionsPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      response: typings.twilio.libHttpResponseMod.^[String],
      solution: TaskActionsSolution
    ) = this()
    
    /**
      * Build an instance of TaskActionsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskActionsPayload): TaskActionsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to update
    *
    * @property actions - The JSON actions that instruct the Assistant how to perform this task.
    */
  trait TaskActionsInstanceUpdateOptions extends StObject {
    
    var actions: js.UndefOr[js.Object] = js.undefined
  }
  object TaskActionsInstanceUpdateOptions {
    
    inline def apply(): TaskActionsInstanceUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskActionsInstanceUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsInstanceUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Object): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    }
  }
  
  @js.native
  trait TaskActionsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskActionsContext = js.native
    
    /**
      * Constructs a task_actions
      */
    def get(): TaskActionsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskActionsPayload
    extends StObject
       with TaskActionsResource
       with TwilioResponsePayload
  object TaskActionsPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      data: js.Object,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      task_sid: String,
      uri: String,
      url: String
    ): TaskActionsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskActionsPayload]
    }
  }
  
  trait TaskActionsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var data: js.Object
    
    var task_sid: String
    
    var url: String
  }
  object TaskActionsResource {
    
    inline def apply(account_sid: String, assistant_sid: String, data: js.Object, task_sid: String, url: String): TaskActionsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskActionsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskActionsSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
    
    var taskSid: js.UndefOr[String] = js.undefined
  }
  object TaskActionsSolution {
    
    inline def apply(): TaskActionsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskActionsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskActionsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSidUndefined: Self = StObject.set(x, "taskSid", js.undefined)
    }
  }
}
