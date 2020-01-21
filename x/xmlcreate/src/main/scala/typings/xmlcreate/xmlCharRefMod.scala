package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCharRef", JSImport.Namespace)
@js.native
object xmlCharRefMod extends js.Object {
  @js.native
  trait XmlCharRef
    extends typings.xmlcreate.xmlNodeMod.default {
    var _char: js.Any = js.native
    var _hex: js.Any = js.native
    /**
      * Gets the character to represent using the reference.
      *
      * @returns The character to represent using the reference.
      */
    /**
      * Sets the character to represent using the reference.
      *
      * @param char The character to represent using the reference.
      */
    var char: String = js.native
    /**
      * Gets whether or not to use the hexadecimal or decimal representation for
      * the reference.
      *
      * @returns Whether or not to use the hexadecimal or decimal representation
      *          for the reference.
      */
    /**
      * Sets whether or not to use the hexadecimal or decimal representation for
      * the reference.
      *
      * @param hex Whether or not to use the hexadecimal or decimal
      *            representation for the reference.
      */
    var hex: Boolean = js.native
    /**
      * Throws an exception since {@link XmlCharRef} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      * @param index This parameter is unused.
      *
      * @returns This method does not return.
      */
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.xmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.xmlNodeMod.default] = js.native
    /**
      * Throws an exception since {@link XmlCharRef} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlCharRef {
    /**
      * Initializes a new instance of the {@link XmlCharRef} class.
      *
      * @param char The character to represent using the reference.
      * @param hex Whether to use the hexadecimal or decimal representation for
      *            the reference. If left undefined, decimal is the default.
      */
    def this(char: String) = this()
    def this(char: String, hex: Boolean) = this()
  }
  
}

