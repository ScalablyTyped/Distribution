package typings
package sumoDashLoggerLib.sumoDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * You must have an HTTP source created in your Sumo Logic account to use this SDK.
 * To create one, log into Sumo Logic, go to the Collectors page and either create
 * a new Hosted Collector or add a new HTTP source to an existing Hosted Collector.
 */
@js.native
trait SumoLogger extends js.Object {
  /**
       * **(Vanilla JS lib only)**
       * Set the configuration for sending logs. Options are listed in the next section.
       * In the Node.js module, configuration options are sent when instantiating the object.
       */
  var config: js.UndefOr[
    js.Function1[
      /* options */ sumoDashLoggerLib.sumoDashLoggerMod.SumoLoggerNs.SumoLoggerOptions, 
      scala.Unit
    ]
  ] = js.native
  /**
       * Empty the current queue of logs
       */
  def emptyLogQueue(): scala.Unit = js.native
  /**
       * Force any pending logs to be sent immediately. This is mainly for use in a
       * logOut/`window.onBeforeUnload` flow to ensure that any remaining queued
       * messages are sent to Sumo Logic.
       */
  def flushLogs(): scala.Unit = js.native
  /**
       * Set a log message to be sent.
       * All logs are sent as JSON objects.
       * If you call `log()` with just a string, the string is included as a field called msg.
       * If you call the function with a JSON object, each field in the object is included as a separate field.
       * Fields called `sessionId`, `url`, and `timestamp` are sent in both cases.
       */
  def log(message: java.lang.String): scala.Unit = js.native
  /**
       * Set a log message to be sent.
       * All logs are sent as JSON objects.
       * If you call `log()` with just a string, the string is included as a field called msg.
       * If you call the function with a JSON object, each field in the object is included as a separate field.
       * Fields called `sessionId`, `url`, and `timestamp` are sent in both cases.
       */
  def log(
    message: java.lang.String,
    options: sumoDashLoggerLib.sumoDashLoggerMod.SumoLoggerNs.PerMessageOptions
  ): scala.Unit = js.native
  /**
       * Set a log message to be sent.
       * All logs are sent as JSON objects.
       * If you call `log()` with just a string, the string is included as a field called msg.
       * If you call the function with a JSON object, each field in the object is included as a separate field.
       * Fields called `sessionId`, `url`, and `timestamp` are sent in both cases.
       */
  def log[T /* <: js.Object */](event: stdLib.Partial[sumoDashLoggerLib.sumoDashLoggerMod.SumoLoggerNs.PerMessageOptions] with T): scala.Unit = js.native
  /**
       * Start sending batched logs at the preconfigured interval
       */
  def startLogSending(): scala.Unit = js.native
  /**
       * Stop sending batched logs
       */
  def stopLogSending(): scala.Unit = js.native
}

