package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options passed to the XML writer.
  */
trait WriterOptions extends js.Object {
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * The current state of the writer
    */
  var state: js.UndefOr[WriterState] = js.undefined
  /**
    * User state object that is saved between writer functions
    */
  var user: js.UndefOr[js.Any] = js.undefined
  /**
    * Maximum column width
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Writer function overrides
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}

object WriterOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    dontPrettyTextNodes: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    newline: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    spaceBeforeSlash: java.lang.String | scala.Boolean = null,
    state: WriterState = null,
    user: js.Any = null,
    width: scala.Int | scala.Double = null,
    writer: XMLWriter = null
  ): WriterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(dontPrettyTextNodes)) __obj.updateDynamic("dontPrettyTextNodes")(dontPrettyTextNodes)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (spaceBeforeSlash != null) __obj.updateDynamic("spaceBeforeSlash")(spaceBeforeSlash.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (user != null) __obj.updateDynamic("user")(user)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[WriterOptions]
  }
}

