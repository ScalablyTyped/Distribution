package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when the application completed user info transfer to the watch app.
	 */
trait WatchSessionFinishuserinfotransferEvent extends WatchSessionBaseEvent {
  /**
  		 * Error code if transfer failed.
  		 */
  var errorCode: Double
  /**
  		 * Error message if any.
  		 */
  var message: String
  /**
  		 * If the transfer was successful.
  		 */
  var success: Boolean
  /**
  		 * The downloaded data as a Titanium.Blob object.
  		 */
  var userInfo: js.Any
}

object WatchSessionFinishuserinfotransferEvent {
  @scala.inline
  def apply(errorCode: Double, message: String, source: WatchSession, success: Boolean, userInfo: js.Any): WatchSessionFinishuserinfotransferEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionFinishuserinfotransferEvent]
  }
}

