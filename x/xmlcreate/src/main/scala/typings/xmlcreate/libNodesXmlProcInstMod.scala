package typings.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlProcInst", JSImport.Namespace)
@js.native
object libNodesXmlProcInstMod extends js.Object {
  @js.native
  trait XmlProcInst
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _content: js.UndefOr[js.Any] = js.native
    var _target: js.Any = js.native
    /**
      * Gets the data of the processing instruction.
      *
      * @returns The data of the processing instruction. This value may be
      *          undefined.
      */
    /**
      * Sets the data of the processing instruction.
      *
      * @param content The data of the processing instruction. This value may be
      *                undefined.
      */
    var content: js.UndefOr[String] = js.native
    /**
      * Gets the target of the processing instruction.
      *
      * @returns The target of the processing instruction.
      */
    /**
      * Sets the target of the processing instruction.
      *
      * @param target The target of the processing instruction.
      */
    var target: String = js.native
    /**
      * Throws an exception since {@link XmlProcInst} nodes cannot have any
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
      * Throws an exception since {@link XmlProcInst} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlProcInst {
    /**
      * Initializes a new instance of the {@link XmlProcInst} class.
      *
      * @param target The target of the processing instruction.
      * @param content The data of the processing instruction, or undefined if
      *                there is no target.
      */
    def this(target: String) = this()
    def this(target: String, content: String) = this()
  }
  
}

