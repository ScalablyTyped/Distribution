package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  A definition module for asynchronous interface declarations.
  */
object Async {
  
  /**
    * Object passed to ErrorCallbackDelegate.
    */
  @js.native
  trait ErrorCallbackObject extends StObject {
    
    /**
      * The error code.
      */
    var errorCode: Double = js.native
    
    /**
      * An error message describing the issue.
      */
    var message: String = js.native
  }
  object ErrorCallbackObject {
    
    @scala.inline
    def apply(errorCode: Double, message: String): ErrorCallbackObject = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCallbackObject]
    }
    
    @scala.inline
    implicit class ErrorCallbackObjectMutableBuilder[Self <: ErrorCallbackObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object passed to OfflineErrorCallbackDelegate.
    */
  @js.native
  trait OfflineErrorCallbackObject extends ErrorCallbackObject {
    
    /**
      * An internal error message that might contain additional details about the issue.
      */
    var debugMessage: String = js.native
  }
  object OfflineErrorCallbackObject {
    
    @scala.inline
    def apply(debugMessage: String, errorCode: Double, message: String): OfflineErrorCallbackObject = {
      val __obj = js.Dynamic.literal(debugMessage = debugMessage.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[OfflineErrorCallbackObject]
    }
    
    @scala.inline
    implicit class OfflineErrorCallbackObjectMutableBuilder[Self <: OfflineErrorCallbackObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebugMessage(value: String): Self = StObject.set(x, "debugMessage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object passed to OfflineOperationSuccessCallbackDelegate;
    */
  @js.native
  trait OfflineOperationSuccessCallbackObject extends StObject {
    
    /**
      * GUID of the record;
      */
    var id: String = js.native
    
    /**
      * Logical name of the entity.
      */
    var logicalName: String = js.native
  }
  object OfflineOperationSuccessCallbackObject {
    
    @scala.inline
    def apply(id: String, logicalName: String): OfflineOperationSuccessCallbackObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any])
      __obj.asInstanceOf[OfflineOperationSuccessCallbackObject]
    }
    
    @scala.inline
    implicit class OfflineOperationSuccessCallbackObjectMutableBuilder[Self <: OfflineOperationSuccessCallbackObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogicalName(value: String): Self = StObject.set(x, "logicalName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Object passed to QuickCreateSuccessCallbackDelegate.
    */
  @js.native
  trait OpenQuickCreateSuccessCallbackObject extends StObject {
    
    /**
      * A lookup value which identifies the record which has been created.
      */
    var savedEntityReference: LookupValue = js.native
  }
  object OpenQuickCreateSuccessCallbackObject {
    
    @scala.inline
    def apply(savedEntityReference: LookupValue): OpenQuickCreateSuccessCallbackObject = {
      val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenQuickCreateSuccessCallbackObject]
    }
    
    @scala.inline
    implicit class OpenQuickCreateSuccessCallbackObjectMutableBuilder[Self <: OpenQuickCreateSuccessCallbackObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSavedEntityReference(value: LookupValue): Self = StObject.set(x, "savedEntityReference", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for asynchronous promises. Based on JQuery Promise
    */
  @js.native
  trait PromiseLike[T] extends StObject {
    
    /**
      * UNDOCUMENTED (Web Client only): Add handlers to be called when the Deferred object is either resolved or rejected.
      */
    def always[U](alwaysCallback: js.Function0[U | PromiseLike[U]]): PromiseLike[U] = js.native
    
    /**
      * UNDOCUMENTED (Unified Client only): Add handlers to be called when the Deferred object is rejected.
      */
    def `catch`[U](): PromiseLike[U] = js.native
    def `catch`[U](onRejected: js.Function1[/* reason */ ErrorResponse, U | PromiseLike[U]]): PromiseLike[U] = js.native
    
    /**
      * UNDOCUMENTED (Web Client only) Add handlers to be called when the Deferred object is rejected.
      */
    def fail[U](): PromiseLike[U] = js.native
    def fail[U](onRejected: js.Function1[/* reason */ ErrorResponse, U | PromiseLike[U]]): PromiseLike[U] = js.native
    
    /**
      * UNDOCUMENTED (Unified Client only): Add handlers to be called when the Deferred object is either resolved or rejected.
      */
    def `finally`[U](finallyCallback: js.Function0[U | PromiseLike[U]]): PromiseLike[U] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[U](): PromiseLike[U] = js.native
    def `then`[U](
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* error */ js.Any, PromiseLike[U] | U | Unit]
    ): PromiseLike[U] = js.native
    def `then`[U](onFulfilled: js.Function1[/* value */ T, U | PromiseLike[U]]): PromiseLike[U] = js.native
    def `then`[U](
      onFulfilled: js.Function1[/* value */ T, PromiseLike[U] | U],
      onRejected: js.Function1[/* error */ js.Any, PromiseLike[U] | U | Unit]
    ): PromiseLike[U] = js.native
  }
}
