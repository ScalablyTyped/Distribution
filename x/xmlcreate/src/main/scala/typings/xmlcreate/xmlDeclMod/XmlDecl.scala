package typings.xmlcreate.xmlDeclMod

import typings.xmlcreate.optionsMod.IStringOptions
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
  def encoding(): js.Any = js.native
  /**
    * Sets the encoding associated with this declaration.
    */
  def encoding(encoding: String): js.Any = js.native
  /**
    * Gets the encoding associated with this declaration.
    */
  @JSName("encoding")
  def encoding_Union: js.UndefOr[String] = js.native
  def standalone(): js.Any = js.native
  /**
    * Sets the value of the standalone attribute associated with this
    * declaration.
    */
  def standalone(standalone: String): js.Any = js.native
  /**
    * Gets the value of the standalone attribute associated with this
    * declaration.
    */
  @JSName("standalone")
  def standalone_Union: js.UndefOr[String] = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this declaration.
    */
  def up(): Parent = js.native
  /**
    * Gets the XML version associated with this declaration.
    */
  def version: String = js.native
  /**
    * Sets the XML version associated with this declaration.
    */
  def version(version: String): js.Any = js.native
}

