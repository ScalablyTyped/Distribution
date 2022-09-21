package typings.webextensionPolyfill.webRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface which allows an extension to intercept, and optionally modify, response data from an HTTP request.
  */
@js.native
trait StreamFilter extends StObject {
  
  /**
    * Closes the request. After this is called, no more data may be written to the stream,
    * and no further data will be delivered. This *must* be called after the consumer is finished writing data,
    * unless disconnect() has already been called.
    */
  def close(): Unit = js.native
  
  /**
    * Creates a stream filter for the given add-on and the given extension ID.
    *
    * @param requestId
    * @param addonId
    */
  def create(requestId: Double, addonId: String): Unit = js.native
  
  /**
    * Disconnects the stream filter from the request. After this is called, no further data will be delivered to the filter,
    * and any unprocessed data will be written directly to the output stream.
    */
  def disconnect(): Unit = js.native
  
  /**
    * After an "error" event has been dispatched, this contains a message describing the error.
    */
  var error: String = js.native
  
  /**
    * Dispatched with a StreamFilterDataEvent whenever incoming data is available on the stream.
    * This data will not be delivered to the output stream unless it is explicitly written via a write() call.
    *
    * @param data
    */
  var ondata: js.UndefOr[js.Function1[/* data */ StreamFilterEventData, Unit]] = js.native
  
  /**
    * Dispatched when an error has occurred. No further data may be read or written after this point.
    *
    * @param data
    */
  var onerror: js.UndefOr[js.Function1[/* data */ StreamFilterEventData, Unit]] = js.native
  
  /**
    * Dispatched when the stream is opened, and is about to begin delivering data.
    *
    * @param data
    */
  var onstart: js.UndefOr[js.Function1[/* data */ StreamFilterEventData, Unit]] = js.native
  
  /**
    * Dispatched when the stream has closed, and has no more data to deliver. The output stream remains open and writable
    * until close() is called.
    *
    * @param data
    */
  var onstop: js.UndefOr[js.Function1[/* data */ StreamFilterEventData, Unit]] = js.native
  
  /**
    * Resumes delivery of data for a suspended request.
    */
  def resume(): Unit = js.native
  
  /**
    * Returns the current status of the stream.
    */
  var status: StreamFilterStatus = js.native
  
  /**
    * Suspends processing of the request. After this is called, no further data will be delivered until the request is resumed.
    */
  def suspend(): Unit = js.native
  
  /**
    * Writes a chunk of data to the output stream. This may not be called before the "start" event has been received.
    *
    * @param data
    */
  def write(data: js.typedarray.ArrayBuffer): Unit = js.native
  def write(data: js.typedarray.Uint8Array): Unit = js.native
}
