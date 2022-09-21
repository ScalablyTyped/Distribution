package typings.winjs.global.WinJS

import typings.std.CustomEvent
import typings.winjs.WinJS.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a mechanism to schedule work to be done on a value that has not yet been computed. It is an abstraction for managing interactions with asynchronous APIs. For more information about asynchronous programming, see Asynchronous programming. For more information about promises in JavaScript, see Asynchronous programming in JavaScript. For more information about using promises, see the WinJS Promise sample.
  **/
@JSGlobal("WinJS.Promise")
@js.native
//#region Constructors
/**
  * A promise provides a mechanism to schedule work to be done on a value that has not yet been computed. It is a convenient abstraction for managing interactions with asynchronous APIs. For more information about asynchronous programming, see Asynchronous programming. For more information about promises in JavaScript, see Asynchronous programming in JavaScript. For more information about using promises, see the WinJS Promise sample.
  * @constructor
  * @param init The function that is called during construction of the Promise that contains the implementation of the operation that the Promise will represent. This can be synchronous or asynchronous, depending on the nature of the operation. Note that placing code within this function does not automatically run it asynchronously; that must be done explicitly with other asynchronous APIs such as setImmediate, setTimeout, requestAnimationFrame, and the Windows Runtime asynchronous APIs. The init function is given three arguments: completeDispatch, errorDispatch, progressDispatch. This parameter is optional.
  * @param onCancel The function to call if a consumer of this promise wants to cancel its undone work. Promises are not required to support cancellation.
  **/
open class Promise[T] ()
  extends StObject
     with typings.winjs.WinJS.Promise[T] {
  def this(init: js.Function3[/* completeDispatch */ Any, /* errorDispatch */ Any, /* progressDispatch */ Any, Unit]) = this()
  def this(
    init: js.Function3[/* completeDispatch */ Any, /* errorDispatch */ Any, /* progressDispatch */ Any, Unit],
    onCancel: js.Function
  ) = this()
  def this(init: Unit, onCancel: js.Function) = this()
}
object Promise {
  
  @JSGlobal("WinJS.Promise")
  @js.native
  val ^ : js.Any = js.native
  
  //#endregion Events
  //#region Methods
  /**
    * Adds an event listener for the promise.
    * @param type The type (name) of the event.
    * @param listener The listener to invoke when the event is raised.
    * @param capture true to initiate capture, otherwise false.
    **/
  /* static member */
  inline def addEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a promise that is fulfilled when one of the input promises has been fulfilled.
    * @param value An array that contains Promise objects or objects whose property values include Promise objects.
    * @returns A promise that on fulfillment yields the value of the input (complete or error).
    **/
  /* static member */
  inline def any(value: js.Array[IPromise[Any]]): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(value.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  /* static member */
  inline def any(value: Any): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(value.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  
  /**
    * Returns a promise. If the object is already a Promise it is returned; otherwise the object is wrapped in a Promise. You can use this function when you need to treat a non-Promise object like a Promise, for example when you are calling a function that expects a promise, but already have the value needed rather than needing to get it asynchronously.
    * @param value The value to be treated as a Promise.
    * @returns The promise.
    **/
  /* static member */
  inline def as[U](): IPromise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("as")().asInstanceOf[IPromise[U]]
  inline def as[U](value: U): IPromise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("as")(value.asInstanceOf[js.Any]).asInstanceOf[IPromise[U]]
  
  /**
    * Canceled promise value, can be returned from a promise completion handler to indicate cancelation of the promise chain.
    */
  /* static member */
  @JSGlobal("WinJS.Promise.cancel")
  @js.native
  def cancel: IPromise[Any] = js.native
  inline def cancel_=(x: IPromise[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
  
  /**
    * Raises an event of the specified type and properties.
    * @param type The type (name) of the event.
    * @param details The set of additional properties to be attached to the event object.
    * @returns true if preventDefault was called on the event; otherwise, false.
    **/
  /* static member */
  inline def dispatchEvent(`type`: String, details: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(`type`.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Determines whether a value fulfills the promise contract.
    * @param value A value that may be a promise.
    * @returns true if the object conforms to the promise contract (has a then function), otherwise false.
    **/
  /* static member */
  inline def is(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Creates a Promise that is fulfilled when all the values are fulfilled.
    * @param values An object whose members contain values, some of which may be promises.
    * @returns A Promise whose value is an object with the same field names as those of the object in the values parameter, where each field value is the fulfilled value of a promise.
    **/
  /* static member */
  inline def join(values: Any): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(values.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when there is an error in processing a promise.
    * @param eventInfo An object that contains information about the event.
    **/
  /* static member */
  inline def onerror(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onerror")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes an event listener from the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to remove.
    * @param capture Specifies whether or not to initiate capture.
    **/
  /* static member */
  inline def removeEventListener(eventType: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener(eventType: String, listener: js.Function, capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  //#endregion Methods
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.Promise.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  
  /**
    * A static helper that functions identically to then() off a promise instance.
    * @param promise The promise to chain from.
    * @param onComplete The function to be called if the promise is fulfilled successfully with a value. The value is passed as the single argument. If the value is null, the value is returned. The value returned from the function becomes the fulfilled value of the promise returned by then. If an exception is thrown while this function is being executed, the promise returned by then moves into the error state.
    * @param onError The function to be called if the promise is fulfilled with an error. The error is passed as the single argument. In different cases this object may be of different types, so it is necessary to test the object for the properties you expect. If the error is null, it is forwarded. The value returned from the function becomes the value of the promise returned by the then function.
    * @param onProgress The function to be called if the promise reports progress. Data about the progress is passed as the single argument. Promises are not required to support progress.
    * @returns The promise whose value is the result of executing the onComplete function.
    **/
  /* static member */
  inline def `then`(promise: IPromise[Any]): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  inline def `then`(promise: IPromise[Any], onComplete: js.Function1[/* value */ Any, Any]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(
    promise: IPromise[Any],
    onComplete: js.Function1[/* value */ Any, Any],
    onError: js.Function1[/* error */ Any, Any]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(
    promise: IPromise[Any],
    onComplete: js.Function1[/* value */ Any, Any],
    onError: js.Function1[/* error */ Any, Any],
    onProgress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(
    promise: IPromise[Any],
    onComplete: js.Function1[/* value */ Any, Any],
    onError: Unit,
    onProgress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(promise: IPromise[Any], onComplete: Unit, onError: js.Function1[/* error */ Any, Any]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(
    promise: IPromise[Any],
    onComplete: Unit,
    onError: js.Function1[/* error */ Any, Any],
    onProgress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def `then`(
    promise: IPromise[Any],
    onComplete: Unit,
    onError: Unit,
    onProgress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(promise.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  
  /**
    * Performs an operation on all the input promises and returns a promise that has the shape of the input and contains the result of the operation that has been performed on each input.
    * @param values A set of values (which could be either an array or an object) of which some or all are promises..
    * @param complete The function to be called if the promise is fulfilled with a value. This function takes a single argument, which is the fulfilled value of the promise.
    * @param error The function to be called if the promise is fulfilled with an error. This function takes a single argument, which is the error value of the promise.
    * @param progress The function to be called if the promise reports progress. This function takes a single argument, which is the data about the progress of the promise. Promises are not required to support progress.
    * @returns A Promise that is the result of calling join on the values parameter.
    **/
  /* static member */
  inline def thenEach(values: Any): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  inline def thenEach(values: Any, complete: js.Function1[/* value */ Any, Unit]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(
    values: Any,
    complete: js.Function1[/* value */ Any, Unit],
    error: js.Function1[/* error */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(
    values: Any,
    complete: js.Function1[/* value */ Any, Unit],
    error: js.Function1[/* error */ Any, Unit],
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(
    values: Any,
    complete: js.Function1[/* value */ Any, Unit],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(values: Any, complete: Unit, error: js.Function1[/* error */ Any, Unit]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(
    values: Any,
    complete: Unit,
    error: js.Function1[/* error */ Any, Unit],
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def thenEach(values: Any, complete: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("thenEach")(values.asInstanceOf[js.Any], complete.asInstanceOf[js.Any], error.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  
  /**
    * This method has two forms: WinJS.Promise.timeout(timeout) and WinJS.Promise.timeout(timeout, promise). WinJS.Promise.timeout(timeout) creates a promise that is completed asynchronously after the specified timeout, essentially wrapping a call to setTimeout within a promise. WinJS.Promise.timeout(timeout, promise) sets a timeout period for completion of the specified promise, automatically canceling the promise if it is not completed within the timeout period.
    * @param timeout The timeout period in milliseconds. If this value is zero or not specified, msSetImmediate is called, otherwise setTimeout is called.
    * @param promise Optional. A promise that will be canceled if it doesn't complete within the timeout period.
    * @returns If the promise parameter is omitted, returns a promise that will be fulfilled after the timeout period. If the promise paramater is provided, the same promise is returned.
    **/
  /* static member */
  inline def timeout(): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")().asInstanceOf[IPromise[Any]]
  inline def timeout(timeout: Double): IPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[IPromise[Any]]
  inline def timeout(timeout: Double, promise: IPromise[Any]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(timeout.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  inline def timeout(timeout: Unit, promise: IPromise[Any]): IPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(timeout.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[IPromise[Any]]
  
  /**
    * Wraps a non-promise value in a promise. This method is like wrapError, which allows you to produce a Promise in error conditions, in that it allows you to return a Promise in success conditions.
    * @param value Some non-promise value to be wrapped in a promise.
    * @returns A promise that is successfully fulfilled with the specified value.
    **/
  /* static member */
  inline def wrap[U](): IPromise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")().asInstanceOf[IPromise[U]]
  inline def wrap[U](value: U): IPromise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IPromise[U]]
  
  /**
    * Wraps a non-promise error value in a promise. You can use this function if you need to pass an error to a function that requires a promise.
    * @param error A non-promise error value to be wrapped in a promise.
    * @returns A promise that is in an error state with the specified value.
    **/
  /* static member */
  inline def wrapError[U](error: U): IPromise[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapError")(error.asInstanceOf[js.Any]).asInstanceOf[IPromise[U]]
}
