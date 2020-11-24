package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for working with 3D printers. */
@JSGlobal("Windows.Devices.Printers")
@js.native
object Printers extends js.Object {
  
  /** Contains classes and interfaces that provide access to the Windows Runtime Components for print task configuration and print notifications. */
  @js.native
  object Extensions extends js.Object {
    
    /** Represents a customized printing experience for a 3D printer. */
    @js.native
    abstract class Print3DWorkflow ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflow
    
    /** Specifies the types of errors that may be encountered by the Print3DWorkflow class. */
    @js.native
    object Print3DWorkflowDetail extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail with Double
          ] = js.native
      
      /* 3 */ val invalidMaterialSelection: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidMaterialSelection with Double = js.native
      
      /* 4 */ val invalidModel: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidModel with Double = js.native
      
      /* 6 */ val invalidPrintTicket: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.invalidPrintTicket with Double = js.native
      
      /* 1 */ val modelExceedsPrintBed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.modelExceedsPrintBed with Double = js.native
      
      /* 5 */ val modelNotManifold: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.modelNotManifold with Double = js.native
      
      /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.unknown with Double = js.native
      
      /* 2 */ val uploadFailed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowDetail.uploadFailed with Double = js.native
    }
    
    /** Provides data about the print request to the app that initiated the request. */
    @js.native
    abstract class Print3DWorkflowPrintRequestedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowPrintRequestedEventArgs
    
    /** Specifies the status of the Print3DWorkflow class. */
    @js.native
    object Print3DWorkflowStatus extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus with Double
          ] = js.native
      
      /* 0 */ val abandoned: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.abandoned with Double = js.native
      
      /* 1 */ val canceled: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.canceled with Double = js.native
      
      /* 2 */ val failed: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.failed with Double = js.native
      
      /* 3 */ val slicing: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.slicing with Double = js.native
      
      /* 4 */ val submitted: typings.winrtUwp.Windows.Devices.Printers.Extensions.Print3DWorkflowStatus.submitted with Double = js.native
    }
    
    /** Provides the context for the printer extension object. */
    @js.native
    abstract class PrintExtensionContext ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintExtensionContext
    /* static members */
    @js.native
    object PrintExtensionContext extends js.Object {
      
      /**
        * Gets the context for the printer extension object based on the DeviceInformation ID.
        * @param deviceId The device information ID for the print device.
        * @return Pointer to the context.
        */
      def fromDeviceId(deviceId: String): js.Any = js.native
    }
    
    /** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
    @js.native
    abstract class PrintNotificationEventDetails ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails
    
    /** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
    @js.native
    abstract class PrintTaskConfiguration ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
    
    /** Called when the print dialog for your app raises a SaveRequested event. */
    @js.native
    abstract class PrintTaskConfigurationSaveRequest ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest
    
    /** Called by the device app to provide an update of the status of the deferral. */
    @js.native
    abstract class PrintTaskConfigurationSaveRequestedDeferral ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral
    
    /** Called to notify the device app that the print task configuration must be saved. */
    @js.native
    abstract class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends typings.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs
  }
  
  /** Represents a 3D printer. */
  @js.native
  abstract class Print3DDevice ()
    extends typings.winrtUwp.Windows.Devices.Printers.Print3DDevice
  /* static members */
  @js.native
  object Print3DDevice extends js.Object {
    
    /**
      * Creates a Print3DDevice object that represents a 3D printer connected to the device.
      * @param deviceId The device ID of the 3D printer.
      * @return A Print3DDevice object that corresponds to the specified 3D printer.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Printers.Print3DDevice] = js.native
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that can be used to find all 3D printers that are connected to the device.
      * @return An AQS string that can be used to find all 3D printers connected to the device.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides APIs to access a 3D printer's capabilities and print tickets. */
  @js.native
  abstract class PrintSchema ()
    extends typings.winrtUwp.Windows.Devices.Printers.PrintSchema
}
