package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdAttlist", JSImport.Namespace)
@js.native
object libNodesXmlDtdAttlistMod extends js.Object {
  @js.native
  trait XmlDtdAttlist
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with the XML attribute-list declaration.
      *
      * @return The text associated with the XML attribute-list declaration.
      */
    /**
      * Sets the text associated with the XML attribute-list declaration.
      *
      * @param text The text associated with the XML attribute-list declaration.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlDtdAttlist} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      * @param index This parameter is unused.
      *
      * @returns This method does not return.
      */
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
    def insertChild(node: typings.xmlcreate.libNodesXmlNodeMod.default, index: Double): js.UndefOr[typings.xmlcreate.libNodesXmlNodeMod.default] = js.native
    /**
      * Throws an exception since {@link XmlDtdAttlist} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlDtdAttlist {
    /**
      * Initializes a new instance of the {@link XmlDtdAttlist} class.
      *
      * @param text The text associated with the XML attribute-list declaration.
      */
    def this(text: String) = this()
  }
  
}

