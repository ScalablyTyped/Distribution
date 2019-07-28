package typings.xmlcreate.libNodesXmlAttributeMod

import typings.xmlcreate.libNodesXmlAttributeTextMod.IXmlAttributeTextOptions
import typings.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAttribute[Parent] extends js.Object {
  val _children: js.Any = js.native
  var _name: js.Any = js.native
  val _parent: js.Any = js.native
  val _replaceInvalidCharsInName: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Gets the name of this attribute.
    */
  /**
    * Sets the name of this attribute.
    */
  var name: String = js.native
  /**
    * Adds a character reference to this attribute and returns the new
    * character reference.
    */
  def charRef(options: IXmlCharRefOptions): typings.xmlcreate.libNodesXmlCharRefMod.default[this.type] = js.native
  /**
    * Adds an entity reference to this attribute and returns the new entity
    * reference.
    */
  def entityRef(options: IXmlEntityRefOptions): typings.xmlcreate.libNodesXmlEntityRefMod.default[this.type] = js.native
  /**
    * Adds attribute text to this attribute and returns the new text.
    */
  def text(options: IXmlAttributeTextOptions): typings.xmlcreate.libNodesXmlAttributeTextMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

