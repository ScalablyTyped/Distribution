package typings.subleveldown.subleveldownMod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import typings.levelDashCodec.levelDashCodecMod.CodecEncoder
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any other options are passed along to the underlying `levelup` and `encoding-down` constructors.
  * {@link https://github.com/Level/subleveldown#api See their documentation for further details}.
  */
trait SubDownOptions
  extends CodecOptions
     with // TODO: Remove and inherit from constructor options from levelup package
/* key */ StringDictionary[js.Any] {
  /**
    * Optional open hook called when the underlying `levelup` instance has been opened.
    * The hook receives a callback which must be called to finish opening.
    */
  var open: js.UndefOr[SubDownOpenHook] = js.undefined
  /**
    * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
    * @default '!'
    */
  var separator: js.UndefOr[String] = js.undefined
}

object SubDownOptions {
  @scala.inline
  def apply(
    StringDictionary: // TODO: Remove and inherit from constructor options from levelup package
  /* key */ StringDictionary[js.Any] = null,
    keyEncoding: String | CodecEncoder = null,
    open: /* callback */ ErrorCallback => Unit = null,
    separator: String = null,
    valueEncoding: String | CodecEncoder = null
  ): SubDownOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDownOptions]
  }
}

