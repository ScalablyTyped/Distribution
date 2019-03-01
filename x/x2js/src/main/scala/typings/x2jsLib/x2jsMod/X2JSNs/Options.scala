package typings
package x2jsLib.x2jsMod.X2JSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If set to "property" then <element>_asArray will be created to allow you to access any element as an array (even if there is only one of it).
    * 
    * @type {('property' | 'none')}
    * @memberOf X2JS.Options
    */
  var arrayAccessForm: js.UndefOr[x2jsLib.x2jsLibStrings.property | x2jsLib.x2jsLibStrings.none] = js.undefined
  /**
    * Any elements that match the paths listed here will be stored in JavaScript objects as arrays even if there is only one of them. The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementName, elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementName: string, elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var arrayAccessFormPaths: js.UndefOr[
    js.Array[
      java.lang.String | stdLib.RegExp | (js.Function2[
        /* elementName */ java.lang.String, 
        /* elementPath */ java.lang.String, 
        scala.Boolean
      ])
    ]
  ] = js.undefined
  /**
    * Allows attribute values to be converted on the fly during parsing to objects.
    * 
    * @type {Array<X2JS.AttributeConverter>}
    * @memberOf X2JS.Options
    */
  var attributeConverters: js.UndefOr[js.Array[AttributeConverter]] = js.undefined
  /**
    * Prefix to use for properties that are created to represent XML attributes. 
    * 
    * @type {string}
    * @memberOf X2JS.Options
    */
  var attributePrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any elements that match the paths here will have their text parsed as an XML datetime value (2011-11-12T13:00:00-07:00 style). The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var datetimeAccessFormPaths: js.UndefOr[
    js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* elementPath */ java.lang.String, scala.Boolean])
    ]
  ] = js.undefined
  /**
    * If "text" then <empty></empty> will be transformed to "". If "object" then <empty></empty> will be transformed to {}.
    * 
    * @type {('object' | 'text')}
    * @memberOf X2JS.Options
    */
  var emptyNodeForm: js.UndefOr[x2jsLib.x2jsLibStrings.`object` | x2jsLib.x2jsLibStrings.text] = js.undefined
  /**
    * If true, a toString function is generated to print nodes containing text or cdata. Useful if you want to accept both plain text and CData as equivalent inputs.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var enableToStringFunc: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether XML characters in text are escaped when reading/writing XML.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var escapeMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the root element of the XML document is ignored when converting to objects. The result will directly have the root element's children as its own properties.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var ignoreRoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this property defined as false and an XML element has CData node ONLY, it will be converted to text without additional property "__cdata".
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var keepCData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, empty elements will created as self closing elements (<element />). If false, empty elements will be created with start and end tags (<element></element>).
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var selfClosingElements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, empty text tags are ignored for elements with child nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var skipEmptyTextNodesForObj: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, whitespace is trimmed from text nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var stripWhitespaces: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, double quotes are used in generated XML. 
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var useDoubleQuotes: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrayAccessForm: x2jsLib.x2jsLibStrings.property | x2jsLib.x2jsLibStrings.none = null,
    arrayAccessFormPaths: js.Array[
      java.lang.String | stdLib.RegExp | (js.Function2[
        /* elementName */ java.lang.String, 
        /* elementPath */ java.lang.String, 
        scala.Boolean
      ])
    ] = null,
    attributeConverters: js.Array[AttributeConverter] = null,
    attributePrefix: java.lang.String = null,
    datetimeAccessFormPaths: js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* elementPath */ java.lang.String, scala.Boolean])
    ] = null,
    emptyNodeForm: x2jsLib.x2jsLibStrings.`object` | x2jsLib.x2jsLibStrings.text = null,
    enableToStringFunc: js.UndefOr[scala.Boolean] = js.undefined,
    escapeMode: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreRoot: js.UndefOr[scala.Boolean] = js.undefined,
    keepCData: js.UndefOr[scala.Boolean] = js.undefined,
    selfClosingElements: js.UndefOr[scala.Boolean] = js.undefined,
    skipEmptyTextNodesForObj: js.UndefOr[scala.Boolean] = js.undefined,
    stripWhitespaces: js.UndefOr[scala.Boolean] = js.undefined,
    useDoubleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrayAccessForm != null) __obj.updateDynamic("arrayAccessForm")(arrayAccessForm.asInstanceOf[js.Any])
    if (arrayAccessFormPaths != null) __obj.updateDynamic("arrayAccessFormPaths")(arrayAccessFormPaths)
    if (attributeConverters != null) __obj.updateDynamic("attributeConverters")(attributeConverters)
    if (attributePrefix != null) __obj.updateDynamic("attributePrefix")(attributePrefix)
    if (datetimeAccessFormPaths != null) __obj.updateDynamic("datetimeAccessFormPaths")(datetimeAccessFormPaths)
    if (emptyNodeForm != null) __obj.updateDynamic("emptyNodeForm")(emptyNodeForm.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToStringFunc)) __obj.updateDynamic("enableToStringFunc")(enableToStringFunc)
    if (!js.isUndefined(escapeMode)) __obj.updateDynamic("escapeMode")(escapeMode)
    if (!js.isUndefined(ignoreRoot)) __obj.updateDynamic("ignoreRoot")(ignoreRoot)
    if (!js.isUndefined(keepCData)) __obj.updateDynamic("keepCData")(keepCData)
    if (!js.isUndefined(selfClosingElements)) __obj.updateDynamic("selfClosingElements")(selfClosingElements)
    if (!js.isUndefined(skipEmptyTextNodesForObj)) __obj.updateDynamic("skipEmptyTextNodesForObj")(skipEmptyTextNodesForObj)
    if (!js.isUndefined(stripWhitespaces)) __obj.updateDynamic("stripWhitespaces")(stripWhitespaces)
    if (!js.isUndefined(useDoubleQuotes)) __obj.updateDynamic("useDoubleQuotes")(useDoubleQuotes)
    __obj.asInstanceOf[Options]
  }
}

