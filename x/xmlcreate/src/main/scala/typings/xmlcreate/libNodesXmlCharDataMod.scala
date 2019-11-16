package typings.xmlcreate

import typings.xmlcreate.libNodesXmlCharDataMod.XmlCharData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCharData", JSImport.Namespace)
@js.native
object libNodesXmlCharDataMod extends js.Object {
  @js.native
  trait XmlCharData
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _charData: js.Any = js.native
    /**
      * Gets the character data associated with this node.
      *
      * @returns The character data associated with this node.
      */
    /**
      * Sets the character data associated with this node.
      *
      * @param charData Character data.
      */
    var charData: String = js.native
    /**
      * Throws an exception since {@link XmlCharData} nodes cannot have any
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
      * Throws an exception since {@link XmlCharData} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlCharData {
    /**
      * Initializes a new instance of the {@link XmlCharData} class.
      *
      * @param charData Character data.
      */
    def this(charData: String) = this()
  }
  
}

