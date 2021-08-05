package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail
import typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for working with 3D printers. */
object Printers {
  
  /** Contains classes and interfaces that provide access to the Windows Runtime Components for print task configuration and print notifications. */
  object Extensions {
    
    /** Represents a customized printing experience for a 3D printer. */
    @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflow")
    @js.native
    abstract class Print3DWorkflow ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
    
    /** Specifies the types of errors that may be encountered by the Print3DWorkflow class. */
    @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowDetail")
    @js.native
    object Print3DWorkflowDetail extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail & Double
          ] = js.native
      
      /* 3 */ val invalidMaterialSelection: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidMaterialSelection & Double = js.native
      
      /* 4 */ val invalidModel: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidModel & Double = js.native
      
      /* 6 */ val invalidPrintTicket: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidPrintTicket & Double = js.native
      
      /* 1 */ val modelExceedsPrintBed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.modelExceedsPrintBed & Double = js.native
      
      /* 5 */ val modelNotManifold: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.modelNotManifold & Double = js.native
      
      /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.unknown & Double = js.native
      
      /* 2 */ val uploadFailed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.uploadFailed & Double = js.native
    }
    
    /** Provides data about the print request to the app that initiated the request. */
    @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowPrintRequestedEventArgs")
    @js.native
    abstract class Print3DWorkflowPrintRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowPrintRequestedEventArgs {
      
      /**
        * Sets the extended status of the print request.
        * @param value The extended status of the print request.
        */
      /* CompleteClass */
      override def setExtendedStatus(value: Print3DWorkflowDetail): Unit = js.native
      
      /**
        * Sets the latest model data, including any updates made by the Print3DWorkflow .
        * @param source The latest model data, including any updates made by the Print3DWorkflow .
        */
      /* CompleteClass */
      override def setSource(source: js.Any): Unit = js.native
      
      /**
        * Indicates if the data model has been updated by the Print3DWorkflow .
        * @param value Returns true if the data model has been updated; otherwise, false.
        */
      /* CompleteClass */
      override def setSourceChanged(value: Boolean): Unit = js.native
      
      /** Gets the status of the print request. */
      /* CompleteClass */
      var status: Print3DWorkflowStatus = js.native
    }
    
    /** Specifies the status of the Print3DWorkflow class. */
    @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowStatus")
    @js.native
    object Print3DWorkflowStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus & Double
          ] = js.native
      
      /* 0 */ val abandoned: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.abandoned & Double = js.native
      
      /* 1 */ val canceled: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.canceled & Double = js.native
      
      /* 2 */ val failed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.failed & Double = js.native
      
      /* 3 */ val slicing: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.slicing & Double = js.native
      
      /* 4 */ val submitted: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.submitted & Double = js.native
    }
    
    /** Provides the context for the printer extension object. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
    @js.native
    abstract class PrintExtensionContext ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintExtensionContext
    object PrintExtensionContext {
      
      @JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Gets the context for the printer extension object based on the DeviceInformation ID.
        * @param deviceId The device information ID for the print device.
        * @return Pointer to the context.
        */
      /* static member */
      inline def fromDeviceId(deviceId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDeviceId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    }
    
    /** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintNotificationEventDetails")
    @js.native
    abstract class PrintNotificationEventDetails ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails {
      
      /** Gets or sets the event data for a print notification event. */
      /* CompleteClass */
      var eventData: String = js.native
      
      /** Gets the name of the print device associated with the print notification. */
      /* CompleteClass */
      var printerName: String = js.native
    }
    
    /** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfiguration")
    @js.native
    abstract class PrintTaskConfiguration ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
    
    /** Called when the print dialog for your app raises a SaveRequested event. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest")
    @js.native
    abstract class PrintTaskConfigurationSaveRequest ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest {
      
      /** Called by the device app to cancel the client's request to save the print task configuration. */
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /** Gets the date-time object that provides the deadline information for the print task. */
      /* CompleteClass */
      var deadline: Date = js.native
      
      /**
        * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
        * @return The object that represents the deferral for the print task configuration save request.
        */
      /* CompleteClass */
      override def getDeferral(): typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral = js.native
      
      /**
        * Called by the device app to save the print task configuration.
        * @param printerExtensionContext The object that represents the print task extension context.
        */
      /* CompleteClass */
      override def save(printerExtensionContext: js.Any): Unit = js.native
    }
    
    /** Called by the device app to provide an update of the status of the deferral. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral")
    @js.native
    abstract class PrintTaskConfigurationSaveRequestedDeferral ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral {
      
      /** Called by the device app when the deferral is completed. */
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    /** Called to notify the device app that the print task configuration must be saved. */
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs")
    @js.native
    abstract class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs {
      
      /** Gets the information that is required for updating the print task configuration. */
      /* CompleteClass */
      var request: typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest = js.native
    }
  }
  
  /** Represents a 3D printer. */
  @JSGlobal("Windows.Devices.Printers.Print3DDevice")
  @js.native
  abstract class Print3DDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Printers.Print3DDevice {
    
    /** Gets the PrintSchema object for obtaining capabilities and print ticket information. */
    /* CompleteClass */
    var printSchema: typings.winrtUwp.Windows.Devices.Printers.PrintSchema = js.native
  }
  object Print3DDevice {
    
    @JSGlobal("Windows.Devices.Printers.Print3DDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Print3DDevice object that represents a 3D printer connected to the device.
      * @param deviceId The device ID of the 3D printer.
      * @return A Print3DDevice object that corresponds to the specified 3D printer.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Printers.Print3DDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Printers.Print3DDevice]]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all 3D printers that are connected to the device.
      * @return An AQS string that can be used to find all 3D printers connected to the device.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Provides APIs to access a 3D printer's capabilities and print tickets. */
  @JSGlobal("Windows.Devices.Printers.PrintSchema")
  @js.native
  abstract class PrintSchema ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Printers.PrintSchema {
    
    /**
      * Gets the 3D printer capabilities.
      * @param constrainTicket The print ticket.
      * @return An XML PrintCapabilities document containing 3D printer capabilities.
      */
    /* CompleteClass */
    override def getCapabilitiesAsync(constrainTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    
    /**
      * Gets the 3D printer's default print ticket.
      * @return An XML PrintTicket document containing the 3D printer's default print ticket.
      */
    /* CompleteClass */
    override def getDefaultPrintTicketAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
    
    /**
      * Creates a new print ticket by merging the user’s selection with the default print ticket and validating that it will work for the device.
      * @param deltaTicket The delta print ticket, specifies the differences between the default print ticket and the user's selections.
      * @return An XML PrintTicket document containing the suggested print ticket.
      */
    /* CompleteClass */
    override def mergeAndValidateWithDefaultPrintTicketAsync(deltaTicket: IRandomAccessStreamWithContentType): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  }
}
