package typings.twemoji.twemojiMod

import typings.twemoji.twemojiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseObject extends js.Object {
  /**
    * default: MaxCDN
    */
  var base: String = js.native
  /**
    * the callback to invoke per each found emoji.
    *
    * default: the common replacer
    */
  @JSName("callback")
  var callback_Original: ParseCallback = js.native
  /**
    * default: "emoji"
    */
  var className: String = js.native
  /**
    * default: ".png"
    */
  var ext: String = js.native
  /**
    * in case it's specified it replaces .size info, if any
    */
  var folder: String = js.native
  /**
    * default: "72x72"
    */
  var size: String | Double = js.native
  /**
    * The function to invoke in order to generate additional, custom attributes for the image tag.
    *
    * @param the lower case HEX code point i.e. "1f4a9"
    * @param variant the optional \\uFE0F ("as image") variant, in case this info is anyhow meaningful. By default this is ignored.
    */
  def attributes(icon: String, variant: String): js.Object = js.native
  /**
    * the callback to invoke per each found emoji.
    *
    * default: the common replacer
    */
  def callback(icon: String, options: js.Object, variant: String): String | `false` = js.native
}

