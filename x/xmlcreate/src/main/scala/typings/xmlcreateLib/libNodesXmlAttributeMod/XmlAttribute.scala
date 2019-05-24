package typings
package xmlcreateLib.libNodesXmlAttributeMod

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
  var name: java.lang.String = js.native
  /**
    * Adds a character reference to this attribute and returns the new
    * character reference.
    */
  def charRef(options: xmlcreateLib.libNodesXmlCharRefMod.IXmlCharRefOptions): xmlcreateLib.libNodesXmlCharRefMod.default[this.type] = js.native
  /**
    * Adds an entity reference to this attribute and returns the new entity
    * reference.
    */
  def entityRef(options: xmlcreateLib.libNodesXmlEntityRefMod.IXmlEntityRefOptions): xmlcreateLib.libNodesXmlEntityRefMod.default[this.type] = js.native
  /**
    * Adds attribute text to this attribute and returns the new text.
    */
  def text(options: xmlcreateLib.libNodesXmlAttributeTextMod.IXmlAttributeTextOptions): xmlcreateLib.libNodesXmlAttributeTextMod.default[this.type] = js.native
  def toString(options: xmlcreateLib.libOptionsMod.IStringOptions): java.lang.String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

