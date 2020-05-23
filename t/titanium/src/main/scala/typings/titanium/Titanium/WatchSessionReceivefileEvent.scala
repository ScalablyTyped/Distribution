package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App received file from apple watch in background.
  */
trait WatchSessionReceivefileEvent extends WatchSessionBaseEvent {
  /**
    * The downloaded data as a Titanium.Blob object.
    */
  var data: Blob
  /**
    * Error code if transfer failed.
    */
  var errorCode: Double
  /**
    * Error message if any.
    */
  var message: String
  /**
    * Information about the file.
    */
  var metaData: js.Any
  /**
    * If the transfer was successful.
    */
  var success: Boolean
}

object WatchSessionReceivefileEvent {
  @scala.inline
  def apply(
    data: Blob,
    errorCode: Double,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionReceivefileEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionReceivefileEvent]
  }
}

