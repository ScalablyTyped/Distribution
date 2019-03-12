package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The developer rig object as available under window.Twitch.ext.rig.
  *
  * @see TwitchExt.rig
  */
trait TwitchExtRig extends js.Object {
  /**
  	 * Print a message to the developer rig console.
  	 *
  	 * @param message The message to print.
  	 * @see https://github.com/twitchdev/developer-rig#rig-console
  	 */
  def log(message: java.lang.String): scala.Unit
}

object TwitchExtRig {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit): TwitchExtRig = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[TwitchExtRig]
  }
}

