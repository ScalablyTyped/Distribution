package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `begin`
  * function.
  */
trait BeginOptions extends js.Object {
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether attributes with null values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether nodes with null values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[Boolean] = js.undefined
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.undefined
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.undefined
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in XMLStringWriter 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter | WriterOptions] = js.undefined
}

object BeginOptions {
  @scala.inline
  def apply(
    ignoreDecorators: js.UndefOr[Boolean] = js.undefined,
    keepNullAttributes: js.UndefOr[Boolean] = js.undefined,
    keepNullNodes: js.UndefOr[Boolean] = js.undefined,
    noDoubleEncoding: js.UndefOr[Boolean] = js.undefined,
    noValidation: js.UndefOr[Boolean] = js.undefined,
    separateArrayItems: js.UndefOr[Boolean] = js.undefined,
    stringify: XMLStringifier = null,
    writer: XMLWriter | WriterOptions = null
  ): BeginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreDecorators)) __obj.updateDynamic("ignoreDecorators")(ignoreDecorators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepNullAttributes)) __obj.updateDynamic("keepNullAttributes")(keepNullAttributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepNullNodes)) __obj.updateDynamic("keepNullNodes")(keepNullNodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDoubleEncoding)) __obj.updateDynamic("noDoubleEncoding")(noDoubleEncoding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidation)) __obj.updateDynamic("noValidation")(noValidation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(separateArrayItems)) __obj.updateDynamic("separateArrayItems")(separateArrayItems.get.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(stringify.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginOptions]
  }
}

