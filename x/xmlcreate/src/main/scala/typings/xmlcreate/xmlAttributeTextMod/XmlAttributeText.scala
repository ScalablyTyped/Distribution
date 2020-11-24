package typings.xmlcreate.xmlAttributeTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlAttributeText[Parent] extends js.Object {
  
  var _charData: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _replaceInvalidCharsInCharData: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets this attribute text.
    */
  def charData: String = js.native
  /**
    * Sets this attribute text.
    */
  def charData_=(charData: String): Unit = js.native
  
  /**
    * Returns the parent of this attribute text.
    */
  def up(): Parent = js.native
}
