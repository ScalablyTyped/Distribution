package typings.xmlbuilder.xmlbuilderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", "create")
@js.native
object create extends js.Object {
  /**
    * Creates a new XML document and returns the root element node.
    * 
    * @param nameOrObject - name of the root element or a JS object to be 
    * converted to an XML tree
    * @param xmldecOrOptions - XML declaration or create options
    * @param doctypeOrOptions - Doctype declaration or create options
    * @param options - create options
    */
  def apply(nameOrObject: String): XMLElement = js.native
  def apply(nameOrObject: String, xmldecOrOptions: CreateOptions): XMLElement = js.native
  def apply(nameOrObject: String, xmldecOrOptions: CreateOptions, doctypeOrOptions: CreateOptions): XMLElement = js.native
  def apply(
    nameOrObject: String,
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions,
    options: CreateOptions
  ): XMLElement = js.native
  def apply(nameOrObject: StringDictionary[js.Object]): XMLElement = js.native
  def apply(nameOrObject: StringDictionary[js.Object], xmldecOrOptions: CreateOptions): XMLElement = js.native
  def apply(
    nameOrObject: StringDictionary[js.Object],
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions
  ): XMLElement = js.native
  def apply(
    nameOrObject: StringDictionary[js.Object],
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions,
    options: CreateOptions
  ): XMLElement = js.native
}

