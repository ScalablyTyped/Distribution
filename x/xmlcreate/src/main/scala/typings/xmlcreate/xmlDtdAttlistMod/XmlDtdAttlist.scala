package typings.xmlcreate.xmlDtdAttlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlDtdAttlist[Parent] extends js.Object {
  
  var _charData: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets the text of this entity declaration.
    */
  def charData: String = js.native
  /**
    * Sets the text of this entity declaration.
    */
  def charData_=(charData: String): Unit = js.native
  
  /**
    * Returns the parent of this entity declaration.
    */
  def up(): Parent = js.native
}
