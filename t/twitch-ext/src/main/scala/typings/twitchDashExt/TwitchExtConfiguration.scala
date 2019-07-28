package typings.twitchDashExt

import typings.twitchDashExt.twitchDashExtStrings.broadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.configuration
  */
trait TwitchExtConfiguration extends js.Object {
  /**
  	 * This property returns the record for the broadcaster segment if one is found; otherwise, undefined.
  	 */
  var broadcaster: js.UndefOr[Anon_Content] = js.undefined
  /**
  	 * This property returns the record for the developer segment if one is found; otherwise, undefined.
  	 */
  var developer: js.UndefOr[Anon_Content] = js.undefined
  /**
  	 * This property returns the record for the global segment if one is found; otherwise, undefined.
  	 */
  var global: js.UndefOr[Anon_Content] = js.undefined
  /**
  	 * This function registers a callback that is called whenever an extension configuration is received.
  	 * The callback function takes no input and returns nothing. After this is called for the first time,
  	 * the records for the global, developer and broadcaster segments will be set if the data is available.
  	 * @param callback The callback that is fired.
  	 */
  def onChanged(callback: js.Function0[Unit]): Unit
  /**
  	 * This function can be called by the front end to set an extension configuration.
  	 * @param segment The configuration segment to set. Valid value. "broadcaster".
  	 * @param version The version of configuration with which the segment is stored.
  	 * @param content The string-encoded configuration.
  	 */
  @JSName("set")
  def set_broadcaster(segment: broadcaster, version: String, content: String): Unit
}

object TwitchExtConfiguration {
  @scala.inline
  def apply(
    onChanged: js.Function0[Unit] => Unit,
    set_broadcaster: (broadcaster, String, String) => Unit,
    broadcaster: Anon_Content = null,
    developer: Anon_Content = null,
    global: Anon_Content = null
  ): TwitchExtConfiguration = {
    val __obj = js.Dynamic.literal(onChanged = js.Any.fromFunction1(onChanged))
    __obj.updateDynamic("set")(js.Any.fromFunction3(set_broadcaster))
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (global != null) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[TwitchExtConfiguration]
  }
}

