package typings.xmlcreate.xmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlProcInst[Parent] extends js.Object {
  
  var _content: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  var _target: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets the content of this processing instruction.
    */
  def content: js.UndefOr[String] = js.native
  /**
    * Sets the content of this processing instruction.
    */
  def content_=(content: js.UndefOr[String]): Unit = js.native
  
  /**
    * Gets the target of this processing instruction.
    */
  def target: String = js.native
  /**
    * Sets the content of this processing instruction.
    */
  def target_=(target: String): Unit = js.native
  
  /**
    * Returns the parent of this processing instruction.
    */
  def up(): Parent = js.native
}
