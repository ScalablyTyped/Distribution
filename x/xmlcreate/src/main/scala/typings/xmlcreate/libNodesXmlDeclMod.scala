package typings.xmlcreate

import typings.xmlcreate.libOptionsMod.IDeclarationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDecl", JSImport.Namespace)
@js.native
object libNodesXmlDeclMod extends js.Object {
  @js.native
  trait XmlDecl
    extends typings.xmlcreate.libNodesXmlNodeMod.default {
    var _encoding: js.UndefOr[js.Any] = js.native
    var _standalone: js.UndefOr[js.Any] = js.native
    var _version: js.Any = js.native
    /**
      * Gets the XML encoding to be included in the declaration.
      *
      * @returns The XML encoding to be included in the declaration. This value
      *          may be undefined.
      */
    /**
      * Sets the XML encoding to be included in the declaration.
      *
      * @param encoding The XML encoding to be included in the declaration. This
      *                 value must be a valid encoding. If left undefined, no
      *                 encoding is included.
      */
    var encoding: js.UndefOr[String] = js.native
    /**
      * Gets the XML standalone attribute to be included in the declaration.
      *
      * @returns The XML standalone attribute to be included in the declaration.
      *          This value may be undefined.
      */
    /**
      * Sets the XML standalone attribute to be included in the declaration.
      *
      * @param standalone The XML standalone attribute to be included. This
      *                   value must be "yes" or "no". If left undefined, no
      *                   standalone attribute is included.
      */
    var standalone: js.UndefOr[String] = js.native
    /**
      * Gets the XML version to be included in the declaration.
      *
      * @returns The XML version to tbe included in the declaration.
      */
    /**
      * Sets the XML version to be included in the declaration.
      *
      * @param version The XML version to be included in the declaration. This
      *                value must be a valid XML version number. If left
      *                undefined, the default version is "1.0".
      */
    var version: String = js.native
    /**
      * Throws an exception since {@link XmlDecl} nodes cannot have any
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
      * Throws an exception since {@link XmlDecl} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typings.xmlcreate.libNodesXmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  /**
    * Initializes a new instance of the {@link XmlDecl} class.
    *
    * @param options The options associated with the XML declaration.
    */
  class default () extends XmlDecl {
    def this(options: IDeclarationOptions) = this()
  }
  
}

