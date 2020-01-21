package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an attribute list in the DTD.
  */
@JSImport("xmlbuilder", "XMLDTDAttList")
@js.native
class XMLDTDAttList () extends js.Object {
  /**
    * Attribute name
    */
  var attributeName: String = js.native
  /**
    * Type of the attribute
    */
  var attributeType: String = js.native
  /** 
    * Default value of the attribute (only used for `#FIXED` or 
    * `#DEFAULT`)
    */
  var defaultValue: String = js.native
  /** 
    * Default value type (either `#REQUIRED`, `#IMPLIED`, `#FIXED` 
    * or `#DEFAULT`)
    */
  var defaultValueType: String = js.native
  /**
    * The name of the element containing this attribute
    */
  var elementName: String = js.native
  def toString(options: XMLToStringOptions): String = js.native
}

