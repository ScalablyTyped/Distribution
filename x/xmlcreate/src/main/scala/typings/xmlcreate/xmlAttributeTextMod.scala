package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlAttributeText", JSImport.Namespace)
@js.native
object xmlAttributeTextMod extends js.Object {
  @js.native
  trait XmlAttributeText
    extends typings.xmlcreate.xmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with this node.
      *
      * @returns The text associated with this node.
      */
    /**
      * Sets the text associated with this node.
      *
      * @param text Text.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlAttributeText} nodes cannot have any
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
      * Throws an exception since {@link XmlAttributeText} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlAttributeText {
    /**
      * Initializes a new instance of the {@link XmlAttributeText} class.
      *
      * @param text Text.
      */
    def this(text: String) = this()
  }
  
}

