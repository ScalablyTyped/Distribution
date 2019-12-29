package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdNotation", JSImport.Namespace)
@js.native
object libNodesXmlDtdNotationMod extends js.Object {
  @js.native
  trait XmlDtdNotation
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with the XML notation declaration.
      *
      * @return The text associated with the XML notation declaration.
      */
    /**
      * Sets the text associated with the XML notation declaration.
      *
      * @param text The text associated with the XML notation declaration.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
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
      * Throws an exception since {@link XmlDtdNotation} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlDtdNotation {
    /**
      * Initializes a new instance of the {@link XmlDtdNotation} class.
      *
      * @param text The text associated with the XML notation declaration.
      */
    def this(text: String) = this()
  }
  
}

