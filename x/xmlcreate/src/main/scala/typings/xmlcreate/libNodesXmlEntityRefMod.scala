package typings.xmlcreate

import typings.xmlcreate.libNodesXmlEntityRefMod.XmlEntityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlEntityRef", JSImport.Namespace)
@js.native
object libNodesXmlEntityRefMod extends js.Object {
  @js.native
  trait XmlEntityRef
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _entity: js.Any = js.native
    /**
      * Gets the entity to be referenced.
      *
      * @returns The entity to be referenced.
      */
    /**
      * Sets the entity to be referenced.
      *
      * @param entity The entity to be referenced.
      */
    var entity: String = js.native
    /**
      * Throws an exception since {@link XmlEntityRef} nodes cannot have any
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
      * Throws an exception since {@link XmlEntityRef} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlEntityRef {
    /**
      * Initializes a new instance of the {@link XmlEntityRef} class.
      *
      * @param entity The entity to be referenced.
      */
    def this(entity: String) = this()
  }
  
}

