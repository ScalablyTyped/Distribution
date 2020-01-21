package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdElement", JSImport.Namespace)
@js.native
object xmlDtdElementMod extends js.Object {
  @js.native
  trait XmlDtdElement
    extends typings.xmlcreate.xmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with the XML element declaration.
      *
      * @return The text associated with the XML element declaration.
      */
    /**
      * Sets the text associated with the XML element declaration.
      *
      * @param text The text associated with the XML element declaration.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlDtdElement} nodes cannot have any
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
      * Throws an exception since {@link XmlDtdElement} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlDtdElement {
    /**
      * Initializes a new instance of the {@link XmlDtdElement} class.
      *
      * @param text The text associated with the XML element declaration.
      */
    def this(text: String) = this()
  }
  
}

