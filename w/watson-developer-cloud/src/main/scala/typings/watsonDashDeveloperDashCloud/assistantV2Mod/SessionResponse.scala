package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SessionResponse. */
trait SessionResponse extends js.Object {
  /** The session ID. */
  var session_id: String
}

object SessionResponse {
  @scala.inline
  def apply(session_id: String): SessionResponse = {
    val __obj = js.Dynamic.literal(session_id = session_id)
  
    __obj.asInstanceOf[SessionResponse]
  }
}

