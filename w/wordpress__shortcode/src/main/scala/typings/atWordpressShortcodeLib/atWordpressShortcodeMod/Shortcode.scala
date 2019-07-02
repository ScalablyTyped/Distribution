package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shortcode extends js.Object {
  var attrs: ShortcodeAttrs
  var content: js.UndefOr[java.lang.String] = js.undefined
  var tag: java.lang.String
  var `type`: js.UndefOr[
    atWordpressShortcodeLib.atWordpressShortcodeLibStrings.closed | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.`self-closing` | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.single
  ] = js.undefined
}

@js.native
trait shortcode extends js.Object {
  var attrs: ShortcodeAttrs = js.native
  var content: js.UndefOr[java.lang.String] = js.native
  var tag: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[
    atWordpressShortcodeLib.atWordpressShortcodeLibStrings.closed | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.`self-closing` | atWordpressShortcodeLib.atWordpressShortcodeLibStrings.single
  ] = js.native
  /**
    * Get a shortcode attribute.
    *
    * Automatically detects whether `attr` is named or numeric and routes it accordingly.
    *
    * @param attr - Attribute key.
    *
    * @returns Attribute value.
    */
  def get(attr: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def get(attr: scala.Double): js.UndefOr[java.lang.String] = js.native
  /**
    * Set a shortcode attribute.
    *
    * Automatically detects whether `attr` is named or numeric and routes it
    * accordingly.
    *
    * @param attr - Attribute key.
    * @param value - Attribute value.
    *
    * @returns Shortcode instance.
    */
  def set(attr: java.lang.String, value: java.lang.String): this.type = js.native
  def set(attr: scala.Double, value: java.lang.String): this.type = js.native
  /**
    * Transform the shortcode into a string.
    *
    * @returns String representation of the shortcode.
    */
  def string(): java.lang.String = js.native
}

object Shortcode {
  @scala.inline
  def apply(
    attrs: ShortcodeAttrs,
    tag: java.lang.String,
    content: java.lang.String = null,
    `type`: atWordpressShortcodeLib.atWordpressShortcodeLibStrings.closed = null
  ): Shortcode = {
    val __obj = js.Dynamic.literal(attrs = attrs, tag = tag)
    if (content != null) __obj.updateDynamic("content")(content)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Shortcode]
  }
}

