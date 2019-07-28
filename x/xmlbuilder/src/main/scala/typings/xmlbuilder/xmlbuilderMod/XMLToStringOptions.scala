package typings.xmlbuilder.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the settings used when converting the XML document to string.
  */
trait XMLToStringOptions extends js.Object {
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[String] = js.undefined
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[Boolean] = js.undefined
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.undefined
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}

object XMLToStringOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    dontPrettyTextNodes: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    newline: String = null,
    offset: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    spaceBeforeSlash: String | Boolean = null,
    width: Int | Double = null,
    writer: XMLWriter = null
  ): XMLToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(dontPrettyTextNodes)) __obj.updateDynamic("dontPrettyTextNodes")(dontPrettyTextNodes)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (spaceBeforeSlash != null) __obj.updateDynamic("spaceBeforeSlash")(spaceBeforeSlash.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[XMLToStringOptions]
  }
}

