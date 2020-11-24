package typings.x2js.mod

import typings.std.RegExp
import typings.x2js.x2jsStrings.`object`
import typings.x2js.x2jsStrings.none
import typings.x2js.x2jsStrings.property
import typings.x2js.x2jsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * If set to "property" then <element>_asArray will be created to allow you to access any element as an array (even if there is only one of it).
    * 
    * @type {('property' | 'none')}
    * @memberOf X2JS.Options
    */
  var arrayAccessForm: js.UndefOr[property | none] = js.native
  
  /**
    * Any elements that match the paths listed here will be stored in JavaScript objects as arrays even if there is only one of them. The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementName, elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementName: string, elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var arrayAccessFormPaths: js.UndefOr[
    js.Array[
      String | RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean])
    ]
  ] = js.native
  
  /**
    * Allows attribute values to be converted on the fly during parsing to objects.
    * 
    * @type {Array<X2JS.AttributeConverter>}
    * @memberOf X2JS.Options
    */
  var attributeConverters: js.UndefOr[js.Array[AttributeConverter]] = js.native
  
  /**
    * Prefix to use for properties that are created to represent XML attributes. 
    * 
    * @type {string}
    * @memberOf X2JS.Options
    */
  var attributePrefix: js.UndefOr[String] = js.native
  
  /**
    * Any elements that match the paths here will have their text parsed as an XML datetime value (2011-11-12T13:00:00-07:00 style). The path can be a plain string (parent.child1.child2), a regex (/.*\.child2/) or function(elementPath).
    * 
    * @type {(Array<string | RegExp | ((elementPath: string) => boolean)>)}
    * @memberOf X2JS.Options
    */
  var datetimeAccessFormPaths: js.UndefOr[js.Array[String | RegExp | (js.Function1[/* elementPath */ String, Boolean])]] = js.native
  
  /**
    * If "text" then <empty></empty> will be transformed to "". If "object" then <empty></empty> will be transformed to {}.
    * 
    * @type {('object' | 'text')}
    * @memberOf X2JS.Options
    */
  var emptyNodeForm: js.UndefOr[`object` | text] = js.native
  
  /**
    * If true, a toString function is generated to print nodes containing text or cdata. Useful if you want to accept both plain text and CData as equivalent inputs.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var enableToStringFunc: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether XML characters in text are escaped when reading/writing XML.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var escapeMode: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the root element of the XML document is ignored when converting to objects. The result will directly have the root element's children as its own properties.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var ignoreRoot: js.UndefOr[Boolean] = js.native
  
  /**
    * If this property defined as false and an XML element has CData node ONLY, it will be converted to text without additional property "__cdata".
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var keepCData: js.UndefOr[Boolean] = js.native
  
  /**
    * If this property defined as true, use { __text: 'abc' } over 'abc'
    *
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var keepText: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, empty elements will created as self closing elements (<element />). If false, empty elements will be created with start and end tags (<element></element>).
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var selfClosingElements: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, empty text tags are ignored for elements with child nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var skipEmptyTextNodesForObj: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, whitespace is trimmed from text nodes.
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var stripWhitespaces: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, double quotes are used in generated XML. 
    * 
    * @type {boolean}
    * @memberOf X2JS.Options
    */
  var useDoubleQuotes: js.UndefOr[Boolean] = js.native
  
  /**
    * If "object" then <empty></empty> will be transformed to {}.
    *
    * @type {'object'}
    * @memberOf X2JS.Options
    */
  var xmldomOptions: js.UndefOr[`object`] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setArrayAccessForm(value: property | none): Self = this.set("arrayAccessForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayAccessForm: Self = this.set("arrayAccessForm", js.undefined)
    
    @scala.inline
    def setArrayAccessFormPathsVarargs(
      value: (String | RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean]))*
    ): Self = this.set("arrayAccessFormPaths", js.Array(value :_*))
    
    @scala.inline
    def setArrayAccessFormPaths(
      value: js.Array[
          String | RegExp | (js.Function2[/* elementName */ String, /* elementPath */ String, Boolean])
        ]
    ): Self = this.set("arrayAccessFormPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayAccessFormPaths: Self = this.set("arrayAccessFormPaths", js.undefined)
    
    @scala.inline
    def setAttributeConvertersVarargs(value: AttributeConverter*): Self = this.set("attributeConverters", js.Array(value :_*))
    
    @scala.inline
    def setAttributeConverters(value: js.Array[AttributeConverter]): Self = this.set("attributeConverters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeConverters: Self = this.set("attributeConverters", js.undefined)
    
    @scala.inline
    def setAttributePrefix(value: String): Self = this.set("attributePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributePrefix: Self = this.set("attributePrefix", js.undefined)
    
    @scala.inline
    def setDatetimeAccessFormPathsVarargs(value: (String | RegExp | (js.Function1[/* elementPath */ String, Boolean]))*): Self = this.set("datetimeAccessFormPaths", js.Array(value :_*))
    
    @scala.inline
    def setDatetimeAccessFormPaths(value: js.Array[String | RegExp | (js.Function1[/* elementPath */ String, Boolean])]): Self = this.set("datetimeAccessFormPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetimeAccessFormPaths: Self = this.set("datetimeAccessFormPaths", js.undefined)
    
    @scala.inline
    def setEmptyNodeForm(value: `object` | text): Self = this.set("emptyNodeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyNodeForm: Self = this.set("emptyNodeForm", js.undefined)
    
    @scala.inline
    def setEnableToStringFunc(value: Boolean): Self = this.set("enableToStringFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableToStringFunc: Self = this.set("enableToStringFunc", js.undefined)
    
    @scala.inline
    def setEscapeMode(value: Boolean): Self = this.set("escapeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeMode: Self = this.set("escapeMode", js.undefined)
    
    @scala.inline
    def setIgnoreRoot(value: Boolean): Self = this.set("ignoreRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRoot: Self = this.set("ignoreRoot", js.undefined)
    
    @scala.inline
    def setKeepCData(value: Boolean): Self = this.set("keepCData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepCData: Self = this.set("keepCData", js.undefined)
    
    @scala.inline
    def setKeepText(value: Boolean): Self = this.set("keepText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepText: Self = this.set("keepText", js.undefined)
    
    @scala.inline
    def setSelfClosingElements(value: Boolean): Self = this.set("selfClosingElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfClosingElements: Self = this.set("selfClosingElements", js.undefined)
    
    @scala.inline
    def setSkipEmptyTextNodesForObj(value: Boolean): Self = this.set("skipEmptyTextNodesForObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyTextNodesForObj: Self = this.set("skipEmptyTextNodesForObj", js.undefined)
    
    @scala.inline
    def setStripWhitespaces(value: Boolean): Self = this.set("stripWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripWhitespaces: Self = this.set("stripWhitespaces", js.undefined)
    
    @scala.inline
    def setUseDoubleQuotes(value: Boolean): Self = this.set("useDoubleQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDoubleQuotes: Self = this.set("useDoubleQuotes", js.undefined)
    
    @scala.inline
    def setXmldomOptions(value: `object`): Self = this.set("xmldomOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmldomOptions: Self = this.set("xmldomOptions", js.undefined)
  }
}
