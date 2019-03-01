package typings
package wicgDashMediasessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val mediaSession: js.UndefOr[MediaSession] = js.undefined
}

object Navigator {
  @scala.inline
  def apply(mediaSession: MediaSession = null): Navigator = {
    val __obj = js.Dynamic.literal()
    if (mediaSession != null) __obj.updateDynamic("mediaSession")(mediaSession)
    __obj.asInstanceOf[Navigator]
  }
}

