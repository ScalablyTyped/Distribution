package typings.wxDashServerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrMsg extends js.Object {
  var errMsg: String
  var fileID: String
  var status: Double
  var tempFileURL: String
}

object Anon_ErrMsg {
  @scala.inline
  def apply(errMsg: String, fileID: String, status: Double, tempFileURL: String): Anon_ErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg, fileID = fileID, status = status, tempFileURL = tempFileURL)
  
    __obj.asInstanceOf[Anon_ErrMsg]
  }
}

