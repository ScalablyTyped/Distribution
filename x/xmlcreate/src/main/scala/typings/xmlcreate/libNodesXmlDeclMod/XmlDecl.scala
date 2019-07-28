package typings.xmlcreate.libNodesXmlDeclMod

import typings.xmlcreate.libOptionsMod.IStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDecl[Parent] extends js.Object {
  var _encoding: js.Any = js.native
  val _parent: js.Any = js.native
  var _standalone: js.Any = js.native
  val _validation: js.Any = js.native
  var _version: js.Any = js.native
  /**
    * Gets the encoding associated with this declaration.
    */
  /**
    * Sets the encoding associated with this declaration.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Gets the value of the standalone attribute associated with this
    * declaration.
    */
  /**
    * Sets the value of the standalone attribute associated with this
    * declaration.
    */
  var standalone: js.UndefOr[String] = js.native
  /**
    * Gets the XML version associated with this declaration.
    */
  /**
    * Sets the XML version associated with this declaration.
    */
  var version: String = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this declaration.
    */
  def up(): Parent = js.native
}

