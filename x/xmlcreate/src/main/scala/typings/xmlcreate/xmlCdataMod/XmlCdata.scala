package typings.xmlcreate.xmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlCdata[Parent] extends js.Object {
  
  var _charData: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _replaceInvalidCharsInCharData: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets the character data of this CDATA section.
    */
  def charData: String = js.native
  /**
    * Sets the character data of this CDATA section.
    */
  def charData_=(charData: String): Unit = js.native
  
  /**
    * Returns the parent of this CDATA section.
    */
  def up(): Parent = js.native
}
