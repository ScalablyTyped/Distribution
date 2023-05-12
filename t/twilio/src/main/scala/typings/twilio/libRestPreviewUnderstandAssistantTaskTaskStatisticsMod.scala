package typings.twilio

import typings.twilio.anon.FieldsCount
import typings.twilio.libRestPreviewUnderstandMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewUnderstandAssistantTaskTaskStatisticsMod {
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsContextImpl")
  @js.native
  open class TaskStatisticsContextImpl protected ()
    extends StObject
       with TaskStatisticsContext {
    def this(_version: default, assistantSid: String, taskSid: String) = this()
    
    /* protected */ var _solution: TaskStatisticsContextSolution = js.native
    
    /* protected */ var _uri: String = js.native
    
    /* protected */ var _version: default = js.native
  }
  
  @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsInstance")
  @js.native
  open class TaskStatisticsInstance protected () extends StObject {
    def this(_version: default, payload: TaskStatisticsResource, assistantSid: String, taskSid: String) = this()
    
    /* protected */ var _context: js.UndefOr[TaskStatisticsContext] = js.native
    
    /* private */ def _proxy: Any = js.native
    
    /* protected */ var _solution: TaskStatisticsContextSolution = js.native
    
    /* protected */ var _version: default = js.native
    
    /**
      * The unique ID of the Account that created this Field.
      */
    var accountSid: String = js.native
    
    /**
      * The unique ID of the parent Assistant.
      */
    var assistantSid: String = js.native
    
    /**
      * Fetch a TaskStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskStatisticsInstance
      */
    def fetch(): js.Promise[TaskStatisticsInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[this.type], Any]): js.Promise[TaskStatisticsInstance] = js.native
    
    /**
      * The total number of Fields associated with this Task.
      */
    var fieldsCount: Double = js.native
    
    /**
      * The total number of Samples associated with this Task.
      */
    var samplesCount: Double = js.native
    
    /**
      * The unique ID of the Task associated with this Field.
      */
    var taskSid: String = js.native
    
    /**
      * Provide a user-friendly representation
      *
      * @returns Object
      */
    def toJSON(): FieldsCount = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait TaskStatisticsListInstance extends StObject {
    
    def apply(): TaskStatisticsContext = js.native
    
    var _solution: TaskStatisticsSolution = js.native
    
    var _uri: String = js.native
    
    var _version: default = js.native
    
    def get(): TaskStatisticsContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  object TaskStatisticsListInstance {
    
    @JSImport("twilio/lib/rest/preview/understand/assistant/task/taskStatistics", "TaskStatisticsListInstance")
    @js.native
    def apply(version: default, assistantSid: String, taskSid: String): TaskStatisticsListInstance = js.native
  }
  
  @js.native
  trait TaskStatisticsContext extends StObject {
    
    /**
      * Fetch a TaskStatisticsInstance
      *
      * @param callback - Callback to handle processed record
      *
      * @returns Resolves to processed TaskStatisticsInstance
      */
    def fetch(): js.Promise[TaskStatisticsInstance] = js.native
    def fetch(
      callback: js.Function2[/* error */ js.Error | Null, /* item */ js.UndefOr[TaskStatisticsInstance], Any]
    ): js.Promise[TaskStatisticsInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait TaskStatisticsContextSolution extends StObject {
    
    var assistantSid: String
    
    var taskSid: String
  }
  object TaskStatisticsContextSolution {
    
    inline def apply(assistantSid: String, taskSid: String): TaskStatisticsContextSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskStatisticsContextSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskStatisticsContextSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
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
    
    var assistantSid: String
    
    var taskSid: String
  }
  object TaskStatisticsSolution {
    
    inline def apply(assistantSid: String, taskSid: String): TaskStatisticsSolution = {
      val __obj = js.Dynamic.literal(assistantSid = assistantSid.asInstanceOf[js.Any], taskSid = taskSid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskStatisticsSolution]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskStatisticsSolution] (val x: Self) extends AnyVal {
      
      inline def setAssistantSid(value: String): Self = StObject.set(x, "assistantSid", value.asInstanceOf[js.Any])
      
      inline def setTaskSid(value: String): Self = StObject.set(x, "taskSid", value.asInstanceOf[js.Any])
    }
  }
}
