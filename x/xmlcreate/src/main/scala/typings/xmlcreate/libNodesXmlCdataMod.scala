package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Namespace)
@js.native
object libNodesXmlCdataMod extends js.Object {
  @js.native
  trait XmlCdata
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _data: js.Any = js.native
    /**
      * Gets the character data of the CDATA section.
      *
      * @returns The character data of the CDATA section.
      */
    /**
      * Sets the character data of the CDATA section.
      *
      * @param data The character data of the CDATA section.
      */
    var data: String = js.native
    /**
      * Throws an exception since {@link XmlCdata} nodes cannot have any
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
      * Throws an exception since {@link XmlCdata} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlCdata {
    /**
      * Initializes a new instance of the {@link XmlCdata} class.
      *
      * @param data The character data of the CDATA section.
      */
    def this(data: String) = this()
  }
  
}

