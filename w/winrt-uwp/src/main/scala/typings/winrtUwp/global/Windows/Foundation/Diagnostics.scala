package typings.winrtUwp.global.Windows.Foundation

import typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation
import typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource
import typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork
import typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel
import typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions
import typings.winrtUwp.Windows.Foundation.Diagnostics.ILoggingChannel
import typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel
import typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.winrtUwpStrings.tracingstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes for logging messages and tracing events. */
object Diagnostics {
  
  /** Enables tracing control flow across asynchronous operations. */
  /* note: abstract class */ @JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
  @js.native
  open class AsyncCausalityTracer ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.AsyncCausalityTracer
  object AsyncCausalityTracer {
    
    @JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_tracingstatuschanged(`type`: tracingstatuschanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Raised when a client starts listening to the causality trace. */
    /* static member */
    @JSGlobal("Windows.Foundation.Diagnostics.AsyncCausalityTracer.ontracingstatuschanged")
    @js.native
    def ontracingstatuschanged: EventHandler[Any] = js.native
    inline def ontracingstatuschanged_=(x: EventHandler[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ontracingstatuschanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_tracingstatuschanged(`type`: tracingstatuschanged, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Indicates that a previously created asynchronous operation has completed all of its asynchronous work.
      * @param traceLevel The trace level.
      * @param source The trace source.
      * @param platformId Identifier for the operation type.
      * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
      * @param status The completion status of the asynchronous operation.
      */
    /* static member */
    inline def traceOperationCompletion(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: String,
      operationId: Double,
      status: typings.winrtUwp.Windows.Foundation.AsyncStatus
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceOperationCompletion")(traceLevel.asInstanceOf[js.Any], source.asInstanceOf[js.Any], platformId.asInstanceOf[js.Any], operationId.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Logs the creation of an asynchronous operation.
      * @param traceLevel The trace level.
      * @param source The trace source.
      * @param platformId Identifier for the operation type.
      * @param operationId An identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
      * @param operationName A human-readable description of the asynchronous work.
      * @param relatedContext Additional information related to this operation.
      */
    /* static member */
    inline def traceOperationCreation(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: String,
      operationId: Double,
      operationName: String,
      relatedContext: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceOperationCreation")(traceLevel.asInstanceOf[js.Any], source.asInstanceOf[js.Any], platformId.asInstanceOf[js.Any], operationId.asInstanceOf[js.Any], operationName.asInstanceOf[js.Any], relatedContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Logs the relation between the currently running synchronous work item and a specific asynchronous operation that it's related to.
      * @param traceLevel The trace level.
      * @param source The trace source.
      * @param platformId Identifier for the operation type.
      * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
      * @param relation The relationship between the synchronous work item and asynchronous operation identified by operationId.
      */
    /* static member */
    inline def traceOperationRelation(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: String,
      operationId: Double,
      relation: CausalityRelation
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceOperationRelation")(traceLevel.asInstanceOf[js.Any], source.asInstanceOf[js.Any], platformId.asInstanceOf[js.Any], operationId.asInstanceOf[js.Any], relation.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Indicates that the most recently created synchronous work item running on the thread that the TraceSynchronousWorkCompletion method is called on has completed.
      * @param traceLevel The trace level.
      * @param source The trace source.
      * @param work Indicates the type of completion.
      */
    /* static member */
    inline def traceSynchronousWorkCompletion(traceLevel: CausalityTraceLevel, source: CausalitySource, work: CausalitySynchronousWork): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceSynchronousWorkCompletion")(traceLevel.asInstanceOf[js.Any], source.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Indicates that the specified asynchronous operation is scheduling synchronous work on the thread that the TraceSynchronousWorkStart method is called on.
      * @param traceLevel The trace level.
      * @param source The trace source.
      * @param platformId Identifier for the operation type.
      * @param operationId The identifier for the asynchronous operation that's unique within the platform for the operation's lifetime.
      * @param work The relationship between the work item and the asynchronous operation.
      */
    /* static member */
    inline def traceSynchronousWorkStart(
      traceLevel: CausalityTraceLevel,
      source: CausalitySource,
      platformId: String,
      operationId: Double,
      work: CausalitySynchronousWork
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceSynchronousWorkStart")(traceLevel.asInstanceOf[js.Any], source.asInstanceOf[js.Any], platformId.asInstanceOf[js.Any], operationId.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Tracks ways that synchronous work items may interact with asynchronous operations. */
  @JSGlobal("Windows.Foundation.Diagnostics.CausalityRelation")
  @js.native
  object CausalityRelation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation & Double] = js.native
    
    /* 0 */ val assignDelegate: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation.assignDelegate & Double = js.native
    
    /* 3 */ val cancel: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation.cancel & Double = js.native
    
    /* 2 */ val choice: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation.choice & Double = js.native
    
    /* 4 */ val error: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation.error & Double = js.native
    
    /* 1 */ val join: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityRelation.join & Double = js.native
  }
  
  /** Provides flags that listeners use to filter tracing events. */
  @JSGlobal("Windows.Foundation.Diagnostics.CausalitySource")
  @js.native
  object CausalitySource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource & Double] = js.native
    
    /* 0 */ val application: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.application & Double = js.native
    
    /* 1 */ val library: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.library & Double = js.native
    
    /* 2 */ val system: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySource.system & Double = js.native
  }
  
  /** Indicates the relationship between a work item and an asynchronous operation. */
  @JSGlobal("Windows.Foundation.Diagnostics.CausalitySynchronousWork")
  @js.native
  object CausalitySynchronousWork extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork & Double
      ] = js.native
    
    /* 0 */ val completionNotification: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.completionNotification & Double = js.native
    
    /* 2 */ val execution: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.execution & Double = js.native
    
    /* 1 */ val progressNotification: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.progressNotification & Double = js.native
  }
  
  /** Specifies a logging level that listeners can use for trace filtering. */
  @JSGlobal("Windows.Foundation.Diagnostics.CausalityTraceLevel")
  @js.native
  object CausalityTraceLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel & Double] = js.native
    
    /* 1 */ val important: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.important & Double = js.native
    
    /* 0 */ val required: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.required & Double = js.native
    
    /* 2 */ val verbose: typings.winrtUwp.Windows.Foundation.Diagnostics.CausalityTraceLevel.verbose & Double = js.native
  }
  
  /** Provides information about an error that occurred. */
  /* note: abstract class */ @JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
  @js.native
  open class ErrorDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorDetails {
    
    /** Gets a short description of the error. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets the address to a help page about the error. */
    /* CompleteClass */
    var helpUri: typings.winrtUwp.Windows.Foundation.Uri = js.native
    
    /** Gets a detailed description of the error. */
    /* CompleteClass */
    var longDescription: String = js.native
  }
  object ErrorDetails {
    
    @JSGlobal("Windows.Foundation.Diagnostics.ErrorDetails")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously creates an ErrorDetails object based on an HRESULT error code.
      * @param errorCode The unique code representing the error.
      * @return The newly created ErrorDetails object representing the error.
      */
    /* static member */
    inline def createFromHResultAsync(errorCode: Double): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHResultAsync")(errorCode.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorDetails]]
  }
  
  /** Specifies the type of diagnostic error reporting for a thread. */
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions & Double] = js.native
    
    /* 2 */ val forceExceptions: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions.none & Double = js.native
    
    /* 1 */ val suppressExceptions: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions & Double = js.native
    
    /* 4 */ val suppressSetErrorInfo: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo & Double = js.native
    
    /* 3 */ val useSetErrorInfo: typings.winrtUwp.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo & Double = js.native
  }
  
  /** Represents the destination of logged messages from LoggingChannel instances. */
  @JSGlobal("Windows.Foundation.Diagnostics.FileLoggingSession")
  @js.native
  open class FileLoggingSession protected ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.FileLoggingSession {
    /**
      * Initializes a new instance of the FileLoggingSession class.
      * @param name The name of the logging session.
      */
    def this(name: String) = this()
  }
  
  /** Provides data for the LogFileGenerated event. */
  /* note: abstract class */ @JSGlobal("Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs")
  @js.native
  open class LogFileGeneratedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs {
    
    /** Gets the log file. */
    /* CompleteClass */
    var file: StorageFile = js.native
  }
  
  /** Creates Event Tracing for Windows (ETW) events that mark the start and end of a group of related events. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingActivity")
  @js.native
  open class LoggingActivity protected ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingActivity {
    /**
      * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel in Windows 8.1 compatibility mode.
      * @param activityName The name of the logging activity.
      * @param loggingChannel The logging channel.
      */
    def this(activityName: String, loggingChannel: ILoggingChannel) = this()
    /**
      * Initializes a new instance of the LoggingActivity class for the specified LoggingChannel and LoggingLevel in Windows 8.1 compatibility mode.
      * @param activityName The name of the logging activity.
      * @param loggingChannel The logging channel.
      * @param level The logging level.
      */
    def this(activityName: String, loggingChannel: ILoggingChannel, level: LoggingLevel) = this()
  }
  
  /** Represents a source of log messages. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingChannel")
  @js.native
  open class LoggingChannel protected ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannel {
    /**
      * This constructor creates a LoggingChannel in Windows 8.1 compatibility mode.
      * @param name The name of the logging channel.
      */
    def this(name: String) = this()
    /**
      * Initializes a new instance of the LoggingChannel class with the specified options.
      * @param name The name of the logging channel.
      * @param options The channel options. Pass null to specify the default options.
      */
    def this(name: String, options: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannelOptions) = this()
    /**
      * Initializes a new instance of the LoggingChannel class with the specified options and channel ID.
      * @param name The name of the logging channel.
      * @param options The channel options. Pass null to specify the default options.
      * @param id The channel identifier to use instead of the automatically generated identifier.
      */
    def this(
      name: String,
      options: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannelOptions,
      id: String
    ) = this()
  }
  
  /** Represents advanced settings that you can use to configure a LoggingChannel object. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingChannelOptions")
  @js.native
  /** Creates a LoggingChannelOptions object with all options set to default values. */
  open class LoggingChannelOptions ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingChannelOptions {
    /**
      * Creates a LoggingChannelOptions object with all properties set to default values except for the specified group.
      * @param group The group identifier.
      */
    def this(group: String) = this()
    
    /** Gets or sets the channel group identifier. */
    /* CompleteClass */
    var group: String = js.native
  }
  
  /** Specifies the format of an event field. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingFieldFormat")
  @js.native
  object LoggingFieldFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.default & Double = js.native
    
    /* 3 */ val boolean: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.boolean & Double = js.native
    
    /* 16 */ val fileTime: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.fileTime & Double = js.native
    
    /* 4 */ val hexadecimal: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hexadecimal & Double = js.native
    
    /* 1 */ val hidden: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hidden & Double = js.native
    
    /* 15 */ val hresult: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hresult & Double = js.native
    
    /* 8 */ val ipv4Address: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv4Address & Double = js.native
    
    /* 9 */ val ipv6Address: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv6Address & Double = js.native
    
    /* 12 */ val json: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.json & Double = js.native
    
    /* 14 */ val ntStatus: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ntStatus & Double = js.native
    
    /* 7 */ val port: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.port & Double = js.native
    
    /* 5 */ val processId: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.processId & Double = js.native
    
    /* 17 */ val signed: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.signed & Double = js.native
    
    /* 10 */ val socketAddress: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.socketAddress & Double = js.native
    
    /* 2 */ val string: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.string & Double = js.native
    
    /* 6 */ val threadId: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.threadId & Double = js.native
    
    /* 18 */ val unsigned: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.unsigned & Double = js.native
    
    /* 13 */ val win32Error: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.win32Error & Double = js.native
    
    /* 11 */ val xml: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.xml & Double = js.native
  }
  
  /** Represents a sequence of event fields and provides methods for adding fields to the sequence. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingFields")
  @js.native
  /** Initializes a new LoggingFields instance. */
  open class LoggingFields ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingFields
  
  /** Specifies the severity level of an event. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingLevel")
  @js.native
  object LoggingLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel & Double] = js.native
    
    /* 4 */ val critical: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel.critical & Double = js.native
    
    /* 3 */ val error: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel.error & Double = js.native
    
    /* 1 */ val information: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel.information & Double = js.native
    
    /* 0 */ val verbose: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel.verbose & Double = js.native
    
    /* 2 */ val warning: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingLevel.warning & Double = js.native
  }
  
  /** Specifies an event opcode. Opcodes represent an operation within a component of an application and are used to logically group events. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingOpcode")
  @js.native
  object LoggingOpcode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode & Double] = js.native
    
    /* 0 */ val info: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.info & Double = js.native
    
    /* 3 */ val reply: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.reply & Double = js.native
    
    /* 4 */ val resume: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.resume & Double = js.native
    
    /* 6 */ val send: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.send & Double = js.native
    
    /* 1 */ val start: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.start & Double = js.native
    
    /* 2 */ val stop: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.stop & Double = js.native
    
    /* 5 */ val suspend: typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOpcode.suspend & Double = js.native
  }
  
  /** Represents advanced event settings. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingOptions")
  @js.native
  /** Initializes a new LoggingOptions instance with default option values. */
  open class LoggingOptions ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingOptions {
    /**
      * Initializes a new LoggingOptions instance with the specified keyword value.
      * @param keywords The keyword value.
      */
    def this(keywords: Double) = this()
    
    /** Gets or sets the unique identifier associated with an activity. */
    /* CompleteClass */
    var activityId: String = js.native
    
    /** Gets or sets the keyword value that represents the different categories that an event belongs to. */
    /* CompleteClass */
    var keywords: Double = js.native
    
    /** Gets or sets the operation code value for an event. */
    /* CompleteClass */
    var opcode: LoggingOpcode = js.native
    
    /** Gets or sets a value that uniquely identifies the parent activity to which this activity is related. */
    /* CompleteClass */
    var relatedActivityId: String = js.native
    
    /** Gets or sets the user-defined metadata value attached to an event. */
    /* CompleteClass */
    var tags: Double = js.native
    
    /** Gets or sets the user-defined value that identifies a larger unit of work within an application or component. */
    /* CompleteClass */
    var task: Double = js.native
  }
  
  /** Represents the destination of logged messages from LoggingChannel instances. */
  @JSGlobal("Windows.Foundation.Diagnostics.LoggingSession")
  @js.native
  open class LoggingSession protected ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.LoggingSession {
    /**
      * Initializes a new instance of the LoggingSession class.
      * @param name The name of the logging session.
      */
    def this(name: String) = this()
  }
  
  /** Represents diagnostic error reporting settings. */
  @JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
  @js.native
  /** Creates and initializes a new instance of the RuntimeBrokerErrorSettings . */
  open class RuntimeBrokerErrorSettings ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings {
    
    /**
      * Gets the type of error reporting for the error object.
      * @return One of the enumeration values.
      */
    /* CompleteClass */
    override def getErrorOptions(): ErrorOptions = js.native
    
    /**
      * Sets the type of error reporting for the error object.
      * @param value One of the enumeration values.
      */
    /* CompleteClass */
    override def setErrorOptions(value: ErrorOptions): Unit = js.native
  }
  
  /** Provides data for the TracingStatusChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs")
  @js.native
  open class TracingStatusChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs {
    
    /** Gets a value that indicates whether tracing is active. */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /** Gets the trace level for the current tracing session. */
    /* CompleteClass */
    var traceLevel: CausalityTraceLevel = js.native
  }
}
