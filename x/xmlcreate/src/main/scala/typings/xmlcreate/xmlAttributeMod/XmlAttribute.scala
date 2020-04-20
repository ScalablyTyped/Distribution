package typings.xmlcreate.xmlAttributeMod

import typings.xmlcreate.optionsMod.IStringOptions
import typings.xmlcreate.xmlAttributeTextMod.IXmlAttributeTextOptions
import typings.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
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
    * Adds a character reference to this attribute and returns the new
    * character reference.
    */
  def charRef(options: IXmlCharRefOptions): typings.xmlcreate.xmlCharRefMod.default[this.type] = js.native
  /**
    * Adds an entity reference to this attribute and returns the new entity
    * reference.
    */
  def entityRef(options: IXmlEntityRefOptions): typings.xmlcreate.xmlEntityRefMod.default[this.type] = js.native
  /**
    * Gets the name of this attribute.
    */
  def name: String = js.native
  /**
    * Sets the name of this attribute.
    */
  def name(name: String): js.Any = js.native
  /**
    * Adds attribute text to this attribute and returns the new text.
    */
  def text(options: IXmlAttributeTextOptions): typings.xmlcreate.xmlAttributeTextMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

