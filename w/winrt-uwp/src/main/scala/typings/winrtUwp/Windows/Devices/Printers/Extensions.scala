package typings.winrtUwp.Windows.Devices.Printers

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.printrequested
import typings.winrtUwp.winrtUwpStrings.saverequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes and interfaces that provide access to the Windows Runtime Components for print task configuration and print notifications. */
object Extensions {
  
  @js.native
  sealed trait Print3DWorkflowDetail extends StObject
  /** Specifies the types of errors that may be encountered by the Print3DWorkflow class. */
  @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowDetail")
  @js.native
  object Print3DWorkflowDetail extends StObject {
    
    /** An invalid printing material has been selected. */
    @js.native
    sealed trait invalidMaterialSelection extends Print3DWorkflowDetail
    
    /** The 3D model is not valid. */
    @js.native
    sealed trait invalidModel extends Print3DWorkflowDetail
    
    /** The print ticket is not valid. */
    @js.native
    sealed trait invalidPrintTicket extends Print3DWorkflowDetail
    
    /** The 3D model exceeds the print bed. */
    @js.native
    sealed trait modelExceedsPrintBed extends Print3DWorkflowDetail
    
    /** The 3D model does not have manifold edges. */
    @js.native
    sealed trait modelNotManifold extends Print3DWorkflowDetail
    
    /** No known error has been encountered. */
    @js.native
    sealed trait unknown extends Print3DWorkflowDetail
    
    /** The upload failed. */
    @js.native
    sealed trait uploadFailed extends Print3DWorkflowDetail
  }
  
  @js.native
  sealed trait Print3DWorkflowStatus extends StObject
  /** Specifies the status of the Print3DWorkflow class. */
  @JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowStatus")
  @js.native
  object Print3DWorkflowStatus extends StObject {
    
    /** The printing experience has been abandoned. */
    @js.native
    sealed trait abandoned extends Print3DWorkflowStatus
    
    /** The printing experience has been canceled. */
    @js.native
    sealed trait canceled extends Print3DWorkflowStatus
    
    /** The print request failed. */
    @js.native
    sealed trait failed extends Print3DWorkflowStatus
    
    /** The object is undergoing slicing in preparation for printing. */
    @js.native
    sealed trait slicing extends Print3DWorkflowStatus
    
    /** The print request has been submitted. */
    @js.native
    sealed trait submitted extends Print3DWorkflowStatus
  }
  
  /** Represents a customized printing experience for a 3D printer. */
  @js.native
  trait Print3DWorkflow extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_printrequested(
      `type`: printrequested,
      listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
    ): Unit = js.native
    
    /** Gets the device identifier of the 3D printer. */
    var deviceID: String = js.native
    
    /**
      * Gets the model of the 3D object to be printed.
      * @return The model of the 3D object to be printed.
      */
    def getPrintModelPackage(): js.Any = js.native
    
    /** Gets or sets a value that indicates the 3D object is ready for printing and no further user interaction is required. */
    var isPrintReady: Boolean = js.native
    
    /** Occurs when the user initiates printing. */
    def onprintrequested(ev: Print3DWorkflowPrintRequestedEventArgs with WinRTEvent[Print3DWorkflow]): Unit = js.native
    /** Occurs when the user initiates printing. */
    @JSName("onprintrequested")
    var onprintrequested_Original: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_printrequested(
      `type`: printrequested,
      listener: TypedEventHandler[Print3DWorkflow, Print3DWorkflowPrintRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Provides data about the print request to the app that initiated the request. */
  @js.native
  trait Print3DWorkflowPrintRequestedEventArgs extends StObject {
    
    /**
      * Sets the extended status of the print request.
      * @param value The extended status of the print request.
      */
    def setExtendedStatus(value: Print3DWorkflowDetail): Unit = js.native
    
    /**
      * Sets the latest model data, including any updates made by the Print3DWorkflow .
      * @param source The latest model data, including any updates made by the Print3DWorkflow .
      */
    def setSource(source: js.Any): Unit = js.native
    
    /**
      * Indicates if the data model has been updated by the Print3DWorkflow .
      * @param value Returns true if the data model has been updated; otherwise, false.
      */
    def setSourceChanged(value: Boolean): Unit = js.native
    
    /** Gets the status of the print request. */
    var status: Print3DWorkflowStatus = js.native
  }
  object Print3DWorkflowPrintRequestedEventArgs {
    
    @scala.inline
    def apply(
      setExtendedStatus: Print3DWorkflowDetail => Unit,
      setSource: js.Any => Unit,
      setSourceChanged: Boolean => Unit,
      status: Print3DWorkflowStatus
    ): Print3DWorkflowPrintRequestedEventArgs = {
      val __obj = js.Dynamic.literal(setExtendedStatus = js.Any.fromFunction1(setExtendedStatus), setSource = js.Any.fromFunction1(setSource), setSourceChanged = js.Any.fromFunction1(setSourceChanged), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Print3DWorkflowPrintRequestedEventArgs]
    }
    
    @scala.inline
    implicit class Print3DWorkflowPrintRequestedEventArgsMutableBuilder[Self <: Print3DWorkflowPrintRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetExtendedStatus(value: Print3DWorkflowDetail => Unit): Self = StObject.set(x, "setExtendedStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSource(value: js.Any => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSourceChanged(value: Boolean => Unit): Self = StObject.set(x, "setSourceChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatus(value: Print3DWorkflowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides the context for the printer extension object. */
  @js.native
  trait PrintExtensionContext extends StObject
  
  /** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
  @js.native
  trait PrintNotificationEventDetails extends StObject {
    
    /** Gets or sets the event data for a print notification event. */
    var eventData: String = js.native
    
    /** Gets the name of the print device associated with the print notification. */
    var printerName: String = js.native
  }
  object PrintNotificationEventDetails {
    
    @scala.inline
    def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
      val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintNotificationEventDetails]
    }
    
    @scala.inline
    implicit class PrintNotificationEventDetailsMutableBuilder[Self <: PrintNotificationEventDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventData(value: String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
  @js.native
  trait PrintTaskConfiguration extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_saverequested(
      `type`: saverequested,
      listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
    ): Unit = js.native
    
    /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
    def onsaverequested(ev: PrintTaskConfigurationSaveRequestedEventArgs with WinRTEvent[PrintTaskConfiguration]): Unit = js.native
    /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
    @JSName("onsaverequested")
    var onsaverequested_Original: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs] = js.native
    
    /** Gets the context for the print task extension. */
    var printerExtensionContext: js.Any = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_saverequested(
      `type`: saverequested,
      listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
    ): Unit = js.native
  }
  
  /** Called when the print dialog for your app raises a SaveRequested event. */
  @js.native
  trait PrintTaskConfigurationSaveRequest extends StObject {
    
    /** Called by the device app to cancel the client's request to save the print task configuration. */
    def cancel(): Unit = js.native
    
    /** Gets the date-time object that provides the deadline information for the print task. */
    var deadline: Date = js.native
    
    /**
      * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
      * @return The object that represents the deferral for the print task configuration save request.
      */
    def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
    
    /**
      * Called by the device app to save the print task configuration.
      * @param printerExtensionContext The object that represents the print task extension context.
      */
    def save(printerExtensionContext: js.Any): Unit = js.native
  }
  object PrintTaskConfigurationSaveRequest {
    
    @scala.inline
    def apply(
      cancel: () => Unit,
      deadline: Date,
      getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
      save: js.Any => Unit
    ): PrintTaskConfigurationSaveRequest = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
    }
    
    @scala.inline
    implicit class PrintTaskConfigurationSaveRequestMutableBuilder[Self <: PrintTaskConfigurationSaveRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: js.Any => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
  
  /** Called by the device app to provide an update of the status of the deferral. */
  @js.native
  trait PrintTaskConfigurationSaveRequestedDeferral extends StObject {
    
    /** Called by the device app when the deferral is completed. */
    def complete(): Unit = js.native
  }
  object PrintTaskConfigurationSaveRequestedDeferral {
    
    @scala.inline
    def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
      val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
    }
    
    @scala.inline
    implicit class PrintTaskConfigurationSaveRequestedDeferralMutableBuilder[Self <: PrintTaskConfigurationSaveRequestedDeferral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    }
  }
  
  /** Called to notify the device app that the print task configuration must be saved. */
  @js.native
  trait PrintTaskConfigurationSaveRequestedEventArgs extends StObject {
    
    /** Gets the information that is required for updating the print task configuration. */
    var request: PrintTaskConfigurationSaveRequest = js.native
  }
  object PrintTaskConfigurationSaveRequestedEventArgs {
    
    @scala.inline
    def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
    }
    
    @scala.inline
    implicit class PrintTaskConfigurationSaveRequestedEventArgsMutableBuilder[Self <: PrintTaskConfigurationSaveRequestedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: PrintTaskConfigurationSaveRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
