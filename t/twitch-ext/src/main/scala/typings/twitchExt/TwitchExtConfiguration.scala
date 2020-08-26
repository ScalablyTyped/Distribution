package typings.twitchExt

import typings.twitchExt.anon.Content
import typings.twitchExt.twitchExtStrings.broadcaster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see TwitchExt.configuration
  */
@js.native
trait TwitchExtConfiguration extends js.Object {
  /**
    * This property returns the record for the broadcaster segment if one is found; otherwise, undefined.
    */
  var broadcaster: js.UndefOr[Content] = js.native
  /**
    * This property returns the record for the developer segment if one is found; otherwise, undefined.
    */
  var developer: js.UndefOr[Content] = js.native
  /**
    * This property returns the record for the global segment if one is found; otherwise, undefined.
    */
  var global: js.UndefOr[Content] = js.native
  /**
    * This function registers a callback that is called whenever an extension configuration is received.
    * The callback function takes no input and returns nothing. After this is called for the first time,
    * the records for the global, developer and broadcaster segments will be set if the data is available.
    * @param callback The callback that is fired.
    */
  def onChanged(callback: js.Function0[Unit]): Unit = js.native
  /**
    * This function can be called by the front end to set an extension configuration.
    * @param segment The configuration segment to set. Valid value. "broadcaster".
    * @param version The version of configuration with which the segment is stored.
    * @param content The string-encoded configuration.
    */
  @JSName("set")
  def set_broadcaster(segment: broadcaster, version: String, content: String): Unit = js.native
}

object TwitchExtConfiguration {
  @scala.inline
  def apply(onChanged: js.Function0[Unit] => Unit, set: (broadcaster, String, String) => Unit): TwitchExtConfiguration = {
    val __obj = js.Dynamic.literal(onChanged = js.Any.fromFunction1(onChanged), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[TwitchExtConfiguration]
  }
  @scala.inline
  implicit class TwitchExtConfigurationOps[Self <: TwitchExtConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnChanged(value: js.Function0[Unit] => Unit): Self = this.set("onChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (broadcaster, String, String) => Unit): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def setBroadcaster(value: Content): Self = this.set("broadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcaster: Self = this.set("broadcaster", js.undefined)
    @scala.inline
    def setDeveloper(value: Content): Self = this.set("developer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    @scala.inline
    def setGlobal(value: Content): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
  }
  
}

