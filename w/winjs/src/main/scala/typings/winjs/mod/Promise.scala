package typings.winjs.mod

import typings.std.CustomEvent
import typings.winjs.WinJS.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a mechanism to schedule work to be done on a value that has not yet been computed. It is an abstraction for managing interactions with asynchronous APIs. For more information about asynchronous programming, see Asynchronous programming. For more information about promises in JavaScript, see Asynchronous programming in JavaScript. For more information about using promises, see the WinJS Promise sample.
  **/
@JSImport("winjs", "Promise")
@js.native
//#region Constructors
/**
  * A promise provides a mechanism to schedule work to be done on a value that has not yet been computed. It is a convenient abstraction for managing interactions with asynchronous APIs. For more information about asynchronous programming, see Asynchronous programming. For more information about promises in JavaScript, see Asynchronous programming in JavaScript. For more information about using promises, see the WinJS Promise sample.
  * @constructor
  * @param init The function that is called during construction of the Promise that contains the implementation of the operation that the Promise will represent. This can be synchronous or asynchronous, depending on the nature of the operation. Note that placing code within this function does not automatically run it asynchronously; that must be done explicitly with other asynchronous APIs such as setImmediate, setTimeout, requestAnimationFrame, and the Windows Runtime asynchronous APIs. The init function is given three arguments: completeDispatch, errorDispatch, progressDispatch. This parameter is optional.
  * @param onCancel The function to call if a consumer of this promise wants to cancel its undone work. Promises are not required to support cancellation.
  **/
class Promise[T] ()
  extends typings.winjs.WinJS.Promise[T] {
  def this(init: js.Function3[
        /* completeDispatch */ js.Any, 
        /* errorDispatch */ js.Any, 
        /* progressDispatch */ js.Any, 
        Unit
      ]) = this()
  def this(init: js.UndefOr[scala.Nothing], onCancel: js.Function) = this()
  def this(
    init: js.Function3[
        /* completeDispatch */ js.Any, 
        /* errorDispatch */ js.Any, 
        /* progressDispatch */ js.Any, 
        Unit
      ],
    onCancel: js.Function
  ) = this()
}
object Promise {
  
  @JSImport("winjs", "Promise")
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
  @JSImport("winjs", "Promise.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Promise.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function, capture: Boolean): Unit = js.native
  
  /* static member */
  @JSImport("winjs", "Promise.any")
  @js.native
  def any(value: js.Any): IPromise[_] = js.native
  /**
    * Returns a promise that is fulfilled when one of the input promises has been fulfilled.
    * @param value An array that contains Promise objects or objects whose property values include Promise objects.
    * @returns A promise that on fulfillment yields the value of the input (complete or error).
    **/
  /* static member */
  @JSImport("winjs", "Promise.any")
  @js.native
  def any(value: js.Array[IPromise[_]]): IPromise[_] = js.native
  
  /**
    * Returns a promise. If the object is already a Promise it is returned; otherwise the object is wrapped in a Promise. You can use this function when you need to treat a non-Promise object like a Promise, for example when you are calling a function that expects a promise, but already have the value needed rather than needing to get it asynchronously.
    * @param value The value to be treated as a Promise.
    * @returns The promise.
    **/
  /* static member */
  @JSImport("winjs", "Promise.as")
  @js.native
  def as[U](): IPromise[U] = js.native
  @JSImport("winjs", "Promise.as")
  @js.native
  def as[U](value: U): IPromise[U] = js.native
  
  /**
    * Canceled promise value, can be returned from a promise completion handler to indicate cancelation of the promise chain.
    */
  /* static member */
  @JSImport("winjs", "Promise.cancel")
  @js.native
  def cancel: IPromise[js.Any] = js.native
  @scala.inline
  def cancel_=(x: IPromise[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
  
  /**
    * Raises an event of the specified type and properties.
    * @param type The type (name) of the event.
    * @param details The set of additional properties to be attached to the event object.
    * @returns true if preventDefault was called on the event; otherwise, false.
    **/
  /* static member */
  @JSImport("winjs", "Promise.dispatchEvent")
  @js.native
  def dispatchEvent(`type`: String, details: js.Any): Boolean = js.native
  
  /**
    * Determines whether a value fulfills the promise contract.
    * @param value A value that may be a promise.
    * @returns true if the object conforms to the promise contract (has a then function), otherwise false.
    **/
  /* static member */
  @JSImport("winjs", "Promise.is")
  @js.native
  def is(value: js.Any): Boolean = js.native
  
  /**
    * Creates a Promise that is fulfilled when all the values are fulfilled.
    * @param values An object whose members contain values, some of which may be promises.
    * @returns A Promise whose value is an object with the same field names as those of the object in the values parameter, where each field value is the fulfilled value of a promise.
    **/
  /* static member */
  @JSImport("winjs", "Promise.join")
  @js.native
  def join(values: js.Any): IPromise[_] = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when there is an error in processing a promise.
    * @param eventInfo An object that contains information about the event.
    **/
  /* static member */
  @JSImport("winjs", "Promise.onerror")
  @js.native
  def onerror(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Removes an event listener from the control.
    * @param eventType The type (name) of the event.
    * @param listener The listener to remove.
    * @param capture Specifies whether or not to initiate capture.
    **/
  /* static member */
  @JSImport("winjs", "Promise.removeEventListener")
  @js.native
  def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Promise.removeEventListener")
  @js.native
  def removeEventListener(eventType: String, listener: js.Function, capture: Boolean): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "Promise.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
  
  /**
    * Performs an operation on all the input promises and returns a promise that has the shape of the input and contains the result of the operation that has been performed on each input.
    * @param values A set of values (which could be either an array or an object) of which some or all are promises..
    * @param complete The function to be called if the promise is fulfilled with a value. This function takes a single argument, which is the fulfilled value of the promise.
    * @param error The function to be called if the promise is fulfilled with an error. This function takes a single argument, which is the error value of the promise.
    * @param progress The function to be called if the promise reports progress. This function takes a single argument, which is the data about the progress of the promise. Promises are not required to support progress.
    * @returns A Promise that is the result of calling join on the values parameter.
    **/
  /* static member */
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(values: js.Any): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(
    values: js.Any,
    complete: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(values: js.Any, complete: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(
    values: js.Any,
    complete: js.UndefOr[scala.Nothing],
    error: js.Function1[/* error */ js.Any, Unit],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(values: js.Any, complete: js.Function1[/* value */ js.Any, Unit]): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(
    values: js.Any,
    complete: js.Function1[/* value */ js.Any, Unit],
    error: js.UndefOr[scala.Nothing],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(
    values: js.Any,
    complete: js.Function1[/* value */ js.Any, Unit],
    error: js.Function1[/* error */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.thenEach")
  @js.native
  def thenEach(
    values: js.Any,
    complete: js.Function1[/* value */ js.Any, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  
  /**
    * This method has two forms: WinJS.Promise.timeout(timeout) and WinJS.Promise.timeout(timeout, promise). WinJS.Promise.timeout(timeout) creates a promise that is completed asynchronously after the specified timeout, essentially wrapping a call to setTimeout within a promise. WinJS.Promise.timeout(timeout, promise) sets a timeout period for completion of the specified promise, automatically canceling the promise if it is not completed within the timeout period.
    * @param timeout The timeout period in milliseconds. If this value is zero or not specified, msSetImmediate is called, otherwise setTimeout is called.
    * @param promise Optional. A promise that will be canceled if it doesn't complete within the timeout period.
    * @returns If the promise parameter is omitted, returns a promise that will be fulfilled after the timeout period. If the promise paramater is provided, the same promise is returned.
    **/
  /* static member */
  @JSImport("winjs", "Promise.timeout")
  @js.native
  def timeout(): IPromise[_] = js.native
  @JSImport("winjs", "Promise.timeout")
  @js.native
  def timeout(timeout: js.UndefOr[scala.Nothing], promise: IPromise[_]): IPromise[_] = js.native
  @JSImport("winjs", "Promise.timeout")
  @js.native
  def timeout(timeout: Double): IPromise[_] = js.native
  @JSImport("winjs", "Promise.timeout")
  @js.native
  def timeout(timeout: Double, promise: IPromise[_]): IPromise[_] = js.native
  
  /**
    * Wraps a non-promise value in a promise. This method is like wrapError, which allows you to produce a Promise in error conditions, in that it allows you to return a Promise in success conditions.
    * @param value Some non-promise value to be wrapped in a promise.
    * @returns A promise that is successfully fulfilled with the specified value.
    **/
  /* static member */
  @JSImport("winjs", "Promise.wrap")
  @js.native
  def wrap[U](): IPromise[U] = js.native
  @JSImport("winjs", "Promise.wrap")
  @js.native
  def wrap[U](value: U): IPromise[U] = js.native
  
  /**
    * Wraps a non-promise error value in a promise. You can use this function if you need to pass an error to a function that requires a promise.
    * @param error A non-promise error value to be wrapped in a promise.
    * @returns A promise that is in an error state with the specified value.
    **/
  /* static member */
  @JSImport("winjs", "Promise.wrapError")
  @js.native
  def wrapError[U](error: U): IPromise[U] = js.native
  
  /**
    * A static helper that functions identically to then() off a promise instance.
    * @param promise The promise to chain from.
    * @param onComplete The function to be called if the promise is fulfilled successfully with a value. The value is passed as the single argument. If the value is null, the value is returned. The value returned from the function becomes the fulfilled value of the promise returned by then. If an exception is thrown while this function is being executed, the promise returned by then moves into the error state.
    * @param onError The function to be called if the promise is fulfilled with an error. The error is passed as the single argument. In different cases this object may be of different types, so it is necessary to test the object for the properties you expect. If the error is null, it is forwarded. The value returned from the function becomes the value of the promise returned by the then function.
    * @param onProgress The function to be called if the promise reports progress. Data about the progress is passed as the single argument. Promises are not required to support progress.
    * @returns The promise whose value is the result of executing the onComplete function.
    **/
  /* static member */
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(promise: IPromise[_]): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, _]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(promise: IPromise[_], onComplete: js.Function1[/* value */ js.Any, _]): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.Function1[/* value */ js.Any, _],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.Function1[/* value */ js.Any, _],
    onError: js.Function1[/* error */ js.Any, _]
  ): IPromise[_] = js.native
  @JSImport("winjs", "Promise.then")
  @js.native
  def `then`(
    promise: IPromise[_],
    onComplete: js.Function1[/* value */ js.Any, _],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[_] = js.native
}
