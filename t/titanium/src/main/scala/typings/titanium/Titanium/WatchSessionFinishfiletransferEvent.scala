package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App completed file transfer to watch app.
  */
trait WatchSessionFinishfiletransferEvent extends WatchSessionBaseEvent {
  /**
    * Error code if transfer failed.
    */
  var errorCode: Double
  /**
    * URL of the file transferred.
    */
  var fileURL: String
  /**
    * Error message if any.
    */
  var message: String
  /**
    * meta data of the file transferred.
    */
  var metaData: js.Any
  /**
    * If the transfer was successful.
    */
  var success: Boolean
}

object WatchSessionFinishfiletransferEvent {
  @scala.inline
  def apply(
    errorCode: Double,
    fileURL: String,
    message: String,
    metaData: js.Any,
    source: WatchSession,
    success: Boolean
  ): WatchSessionFinishfiletransferEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], fileURL = fileURL.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSessionFinishfiletransferEvent]
  }
}

