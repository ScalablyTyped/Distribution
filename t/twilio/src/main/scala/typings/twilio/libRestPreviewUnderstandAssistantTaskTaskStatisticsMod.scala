package typings.twilio

import typings.twilio.libBasePageMod.TwilioResponsePayload
import typings.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskTaskStatisticsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsContext")
  @js.native
  open class TaskStatisticsContext protected () extends StObject {
    /**
      * Initialize the TaskStatisticsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param taskSid - The unique ID of the Task associated with this Field.
      */
    def this(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String) = this()
    
    /**
      * fetch a TaskStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ TaskStatisticsInstance, Any]): js.Promise[TaskStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsInstance")
  @js.native
  open class TaskStatisticsInstance protected () extends SerializableClass {
    /**
      * Initialize the TaskStatisticsContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param assistantSid - The unique ID of the parent Assistant.
      * @param taskSid - The unique ID of the Task associated with this Field.
      */
    def this(
      version: typings.twilio.libRestPreviewUnderstandMod.^,
      payload: TaskStatisticsPayload,
      assistantSid: String,
      taskSid: String
    ) = this()
    
    /* private */ var _proxy: TaskStatisticsContext = js.native
    
    var accountSid: String = js.native
    
    var assistantSid: String = js.native
    
    /**
      * fetch a TaskStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[TaskStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[TaskStatisticsInstance] = js.native
    
    var fieldsCount: Double = js.native
    
    var samplesCount: Double = js.native
    
    var taskSid: String = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the TaskStatisticsList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param assistantSid - The unique ID of the parent Assistant.
    * @param taskSid - The unique ID of the Task associated with this Field.
    */
  inline def TaskStatisticsList(version: typings.twilio.libRestPreviewUnderstandMod.^, assistantSid: String, taskSid: String): TaskStatisticsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("TaskStatisticsList")(version.asInstanceOf[js.Any], assistantSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[TaskStatisticsListInstance]
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsPage")
  @js.native
  open class TaskStatisticsPage protected ()
    extends typings.twilio.libBasePageMod.^[
          typings.twilio.libRestPreviewUnderstandMod.^, 
          TaskStatisticsPayload, 
          TaskStatisticsResource, 
          TaskStatisticsInstance
        ] {
    /**
      * Initialize the TaskStatisticsPage
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
      solution: TaskStatisticsSolution
    ) = this()
    
    /**
      * Build an instance of TaskStatisticsInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: TaskStatisticsPayload): TaskStatisticsInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait TaskStatisticsListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): TaskStatisticsContext = js.native
    
    /**
      * Constructs a task_statistics
      */
    def get(): TaskStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskStatisticsPayload
    extends StObject
       with TaskStatisticsResource
       with TwilioResponsePayload
  object TaskStatisticsPayload {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      fields_count: Double,
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      samples_count: Double,
      task_sid: String,
      uri: String,
      url: String
    ): TaskStatisticsPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], fields_count = fields_count.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], samples_count = samples_count.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskStatisticsPayload]
    }
  }
  
  trait TaskStatisticsResource extends StObject {
    
    var account_sid: String
    
    var assistant_sid: String
    
    var fields_count: Double
    
    var samples_count: Double
    
    var task_sid: String
    
    var url: String
  }
  object TaskStatisticsResource {
    
    inline def apply(
      account_sid: String,
      assistant_sid: String,
      fields_count: Double,
      samples_count: Double,
      task_sid: String,
      url: String
    ): TaskStatisticsResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], assistant_sid = assistant_sid.asInstanceOf[js.Any], fields_count = fields_count.asInstanceOf[js.Any], samples_count = samples_count.asInstanceOf[js.Any], task_sid = task_sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskStatisticsResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskStatisticsResource] (val x: Self) extends AnyVal {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAssistant_sid(value: String): Self = StObject.set(x, "assistant_sid", value.asInstanceOf[js.Any])
      
      inline def setFields_count(value: Double): Self = StObject.set(x, "fields_count", value.asInstanceOf[js.Any])
      
      inline def setSamples_count(value: Double): Self = StObject.set(x, "samples_count", value.asInstanceOf[js.Any])
      
      inline def setTask_sid(value: String): Self = StObject.set(x, "task_sid", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskStatisticsSolution extends StObject {
    
    var assistantSid: js.UndefOr[String] = js.undefined
    
    var taskSid: js.UndefOr[String] = js.undefined
  }
  object TaskStatisticsSolution {
    
    inline def apply(): TaskStatisticsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskStatisticsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskStatisticsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setAssistantSidUndefined: Self = StObject.set(x, "assistantSid", js.undefined)
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSidUndefined: Self = StObject.set(x, "taskSid", js.undefined)
    }
  }
}
