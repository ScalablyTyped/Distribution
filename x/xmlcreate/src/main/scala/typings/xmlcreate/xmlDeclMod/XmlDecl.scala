package typings.xmlcreate.xmlDeclMod

import typings.xmlcreate.optionsMod.IStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def encoding: js.UndefOr[String] = js.native
  /**
    * Sets the encoding associated with this declaration.
    */
  def encoding_=(encoding: js.UndefOr[String]): Unit = js.native
  
  /**
    * Gets the value of the standalone attribute associated with this
    * declaration.
    */
  def standalone: js.UndefOr[String] = js.native
  /**
    * Sets the value of the standalone attribute associated with this
    * declaration.
    */
  def standalone_=(standalone: js.UndefOr[String]): Unit = js.native
  
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
  def version_=(version: String): Unit = js.native
}
