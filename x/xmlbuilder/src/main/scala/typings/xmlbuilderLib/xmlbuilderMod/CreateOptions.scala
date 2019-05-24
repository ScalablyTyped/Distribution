package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `create`
  * function.
  */
trait CreateOptions extends js.Object {
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether XML declaration and doctype will be included
    */
  var headless: js.UndefOr[scala.Boolean] = js.undefined
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether attributes with `null` values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether nodes with `null` values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Public identifier of the DTD
    */
  var pubID: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.undefined
  /**
    * System identifier of the DTD
    */
  var sysID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A version number string, e.g. `1.0`
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    headless: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDecorators: js.UndefOr[scala.Boolean] = js.undefined,
    keepNullAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    keepNullNodes: js.UndefOr[scala.Boolean] = js.undefined,
    noDoubleEncoding: js.UndefOr[scala.Boolean] = js.undefined,
    noValidation: js.UndefOr[scala.Boolean] = js.undefined,
    pubID: java.lang.String = null,
    separateArrayItems: js.UndefOr[scala.Boolean] = js.undefined,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    stringify: XMLStringifier = null,
    sysID: java.lang.String = null,
    version: java.lang.String = null,
    writer: XMLWriter = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless)
    if (!js.isUndefined(ignoreDecorators)) __obj.updateDynamic("ignoreDecorators")(ignoreDecorators)
    if (!js.isUndefined(keepNullAttributes)) __obj.updateDynamic("keepNullAttributes")(keepNullAttributes)
    if (!js.isUndefined(keepNullNodes)) __obj.updateDynamic("keepNullNodes")(keepNullNodes)
    if (!js.isUndefined(noDoubleEncoding)) __obj.updateDynamic("noDoubleEncoding")(noDoubleEncoding)
    if (!js.isUndefined(noValidation)) __obj.updateDynamic("noValidation")(noValidation)
    if (pubID != null) __obj.updateDynamic("pubID")(pubID)
    if (!js.isUndefined(separateArrayItems)) __obj.updateDynamic("separateArrayItems")(separateArrayItems)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (sysID != null) __obj.updateDynamic("sysID")(sysID)
    if (version != null) __obj.updateDynamic("version")(version)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[CreateOptions]
  }
}

