package typings.xrm.Xrm

import typings.xrm.Xrm.Attributes.Attribute
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.ProcessFlow.ProcessStatus
import typings.xrm.Xrm.ProcessFlow.Stage
import typings.xrm.Xrm.ProcessFlow.StageChangeDirection
import typings.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Events {
  
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    */
  type ContextSensitiveHandler = js.Function1[/* context */ EventContext, Unit]
  
  /**
    * Interface for the event context.
    * In the API documentation, this is sometimes refferred to as the executionContext.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/clientapi-execution-context External Link: Client API execution context}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
    */
  trait EventContext extends StObject {
    
    /**
      * Gets the Xrm context.
      * @returns The Xrm context.
      */
    def getContext(): GlobalContext
    
    /**
      * Gets the handler's depth, which is the order in which the handler is executed.
      * @returns The depth, a 0-based index.
      */
    def getDepth(): Double
    
    /**
      * Gets a reference to the object for which event occurred.
      * @returns The event source.
      */
    def getEventSource(): Attribute[Any] | Control | Entity
    
    /**
      * Gets a reference to the currnet form context
      * @returns The {@link FormContext form context}
      */
    def getFormContext(): FormContext
    
    /**
      * @summary Gets the shared variable with the specified key.
      * @param T Generic type parameter.
      * @param key The key.
      * @returns The shared variable.
      * @desc Gets the shared variable with the specified key.
      * Used to pass values between handlers of an event.
      */
    def getSharedVariable[T](key: String): T
    
    /**
      * @summary Sets a shared variable.
      * @param T Generic type parameter.
      * @param key The key.
      * @param value The value.
      * @desc Sets the shared variable with the specified key.
      * Used to pass values between handlers of an event.
      */
    def setSharedVariable[T](key: String, value: T): Unit
  }
  object EventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): EventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[EventContext]
    }
    
    extension [Self <: EventContext](x: Self) {
      
      inline def setGetContext(value: () => GlobalContext): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      inline def setGetDepth(value: () => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction0(value))
      
      inline def setGetEventSource(value: () => Attribute[Any] | Control | Entity): Self = StObject.set(x, "getEventSource", js.Any.fromFunction0(value))
      
      inline def setGetFormContext(value: () => FormContext): Self = StObject.set(x, "getFormContext", js.Any.fromFunction0(value))
      
      inline def setGetSharedVariable(value: String => Any): Self = StObject.set(x, "getSharedVariable", js.Any.fromFunction1(value))
      
      inline def setSetSharedVariable(value: (String, Any) => Unit): Self = StObject.set(x, "setSharedVariable", js.Any.fromFunction2(value))
    }
  }
  
  trait LookupTagClickEventArguments extends StObject {
    
    /**
      * Gets the selected tag value
      * @returns The lookups TagValue object
      */
    def getTagValue(): TagValue
    
    /**
      * Returns a boolean value to indicate if the lookups onClick has been prevented.
      * @returns true if saving is prevented, otherwise false.
      */
    def isDefaultPrevented(): Boolean
    
    /**
      * Prevents the default onClick behaviour from executing.
      * All remaining "onLookupTagClick" handlers will continue execution.
      */
    def preventDefault(): Unit
  }
  object LookupTagClickEventArguments {
    
    inline def apply(getTagValue: () => TagValue, isDefaultPrevented: () => Boolean, preventDefault: () => Unit): LookupTagClickEventArguments = {
      val __obj = js.Dynamic.literal(getTagValue = js.Any.fromFunction0(getTagValue), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[LookupTagClickEventArguments]
    }
    
    extension [Self <: LookupTagClickEventArguments](x: Self) {
      
      inline def setGetTagValue(value: () => TagValue): Self = StObject.set(x, "getTagValue", js.Any.fromFunction0(value))
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait LookupTagClickEventContext
    extends StObject
       with EventContext {
    
    /**
      * Gets an object that contains details about the lookup tag clicked
      */
    def getEventArgs(): LookupTagClickEventArguments
  }
  object LookupTagClickEventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => LookupTagClickEventArguments,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): LookupTagClickEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[LookupTagClickEventContext]
    }
    
    extension [Self <: LookupTagClickEventContext](x: Self) {
      
      inline def setGetEventArgs(value: () => LookupTagClickEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  type LookupTagClickHandler = js.Function1[/* context */ LookupTagClickEventContext, Unit]
  
  type ProcessStatusChangeHandler = js.Function1[/* context */ ProcessStatusChangedEventContext, Unit]
  
  /**
    * Interface for process status changed event arguments.
    */
  trait ProcessStatusChangedEventArguments extends StObject {
    
    /**
      * Gets the selected stage object
      * @returns The stage object
      */
    def getStage(): Stage
    
    /**
      * Gets the destination process status
      * @returns The process status
      */
    def getStatus(): ProcessStatus
    
    /**
      * Prevents the stage or status change operation from being submitted to the server.
      */
    def preventDefault(): Unit
  }
  object ProcessStatusChangedEventArguments {
    
    inline def apply(getStage: () => Stage, getStatus: () => ProcessStatus, preventDefault: () => Unit): ProcessStatusChangedEventArguments = {
      val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage), getStatus = js.Any.fromFunction0(getStatus), preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[ProcessStatusChangedEventArguments]
    }
    
    extension [Self <: ProcessStatusChangedEventArguments](x: Self) {
      
      inline def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
      
      inline def setGetStatus(value: () => ProcessStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait ProcessStatusChangedEventContext
    extends StObject
       with EventContext {
    
    /**
      * Gets process status changed event arguments.
      * @returns The event arguments.
      */
    def getEventArgs(): ProcessStatusChangedEventArguments
  }
  object ProcessStatusChangedEventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => ProcessStatusChangedEventArguments,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): ProcessStatusChangedEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[ProcessStatusChangedEventContext]
    }
    
    extension [Self <: ProcessStatusChangedEventContext](x: Self) {
      
      inline def setGetEventArgs(value: () => ProcessStatusChangedEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for save event arguments.
    */
  trait SaveEventArguments extends StObject {
    
    /**
      * @summary Gets save mode, as an integer.
      * @returns The save mode.
      * @description Gets save mode, as an integer.<BR>
      * **Values returned are**:
      * * 1      Save
      * * 2      Save and Close
      * * 59     Save and New
      * * 70     AutoSave (Where enabled; can be used with an OnSave handler to conditionally disable auto-saving)
      * * 58     Save as Completed (Activities)
      * * 5      Deactivate
      * * 6      Reactivate
      * * 47     Assign (All user- or team-owned entities)
      * * 7      Send (Email)
      * * 16     Qualify (Lead)
      * * 15     Disqualify (Lead)
      */
    def getSaveMode(): SaveMode
    
    /**
      * Returns a boolean value to indicate if the record's save has been prevented.
      * @returns true if saving is prevented, otherwise false.
      */
    def isDefaultPrevented(): Boolean
    
    /**
      * Prevents the save operation from being submitted to the server.
      * All remaining "on save" handlers will continue execution.
      */
    def preventDefault(): Unit
    
    /**
      * Cancels the save operation if the event handler has a script error,
      * returns a rejected promise for an async event handler or the operation times out.
      */
    def preventDefaultOnError(): Unit
  }
  object SaveEventArguments {
    
    inline def apply(
      getSaveMode: () => SaveMode,
      isDefaultPrevented: () => Boolean,
      preventDefault: () => Unit,
      preventDefaultOnError: () => Unit
    ): SaveEventArguments = {
      val __obj = js.Dynamic.literal(getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault), preventDefaultOnError = js.Any.fromFunction0(preventDefaultOnError))
      __obj.asInstanceOf[SaveEventArguments]
    }
    
    extension [Self <: SaveEventArguments](x: Self) {
      
      inline def setGetSaveMode(value: () => SaveMode): Self = StObject.set(x, "getSaveMode", js.Any.fromFunction0(value))
      
      inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultOnError(value: () => Unit): Self = StObject.set(x, "preventDefaultOnError", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for a save event context
    */
  trait SaveEventContext
    extends StObject
       with EventContext {
    
    /**
      * Gets save-event arguments.
      * @returns The event arguments.  Returns null for all but the "save" event.
      */
    def getEventArgs(): SaveEventArguments
  }
  object SaveEventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => SaveEventArguments,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): SaveEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[SaveEventContext]
    }
    
    extension [Self <: SaveEventContext](x: Self) {
      
      inline def setGetEventArgs(value: () => SaveEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for process stage change event arguments.
    */
  trait StageChangeEventArguments extends StObject {
    
    /**
      * Gets the direction of the stage change.
      * @returns The direction: "next" or "previous"
      */
    def getDirection(): StageChangeDirection
    
    /**
      * Gets the destination stage object
      * @returns The stage object. For switching between entities, returns the previous stage object
      */
    def getStage(): Stage
    
    /**
      * Prevents the stage or status change operation from being submitted to the server.
      */
    def preventDefault(): Unit
  }
  object StageChangeEventArguments {
    
    inline def apply(getDirection: () => StageChangeDirection, getStage: () => Stage, preventDefault: () => Unit): StageChangeEventArguments = {
      val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction0(getDirection), getStage = js.Any.fromFunction0(getStage), preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[StageChangeEventArguments]
    }
    
    extension [Self <: StageChangeEventArguments](x: Self) {
      
      inline def setGetDirection(value: () => StageChangeDirection): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      inline def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for a process stage change event context
    */
  trait StageChangeEventContext
    extends StObject
       with EventContext {
    
    /**
      * Gets process stage change event arguments.
      * @returns The event arguments.
      */
    def getEventArgs(): StageChangeEventArguments
  }
  object StageChangeEventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => StageChangeEventArguments,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): StageChangeEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[StageChangeEventContext]
    }
    
    extension [Self <: StageChangeEventContext](x: Self) {
      
      inline def setGetEventArgs(value: () => StageChangeEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for process stage selected event arguments.
    */
  trait StageSelectedEventArguments extends StObject {
    
    /**
      * Gets the selected stage object
      * @returns The stage object
      */
    def getStage(): Stage
  }
  object StageSelectedEventArguments {
    
    inline def apply(getStage: () => Stage): StageSelectedEventArguments = {
      val __obj = js.Dynamic.literal(getStage = js.Any.fromFunction0(getStage))
      __obj.asInstanceOf[StageSelectedEventArguments]
    }
    
    extension [Self <: StageSelectedEventArguments](x: Self) {
      
      inline def setGetStage(value: () => Stage): Self = StObject.set(x, "getStage", js.Any.fromFunction0(value))
    }
  }
  
  trait StageSelectedEventContext
    extends StObject
       with EventContext {
    
    /**
      * Gets process stage selected event arguments.
      * @returns The event arguments.
      */
    def getEventArgs(): StageSelectedEventArguments
  }
  object StageSelectedEventContext {
    
    inline def apply(
      getContext: () => GlobalContext,
      getDepth: () => Double,
      getEventArgs: () => StageSelectedEventArguments,
      getEventSource: () => Attribute[Any] | Control | Entity,
      getFormContext: () => FormContext,
      getSharedVariable: String => Any,
      setSharedVariable: (String, Any) => Unit
    ): StageSelectedEventContext = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
      __obj.asInstanceOf[StageSelectedEventContext]
    }
    
    extension [Self <: StageSelectedEventContext](x: Self) {
      
      inline def setGetEventArgs(value: () => StageSelectedEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
    }
  }
}
