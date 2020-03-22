package typings.xmlcreate.xmlProcInstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlProcInst[Parent] extends js.Object {
  var _content: js.Any = js.native
  val _parent: js.Any = js.native
  var _target: js.Any = js.native
  val _validation: js.Any = js.native
  def content(): js.Any = js.native
  /**
    * Sets the content of this processing instruction.
    */
  def content(content: String): js.Any = js.native
  /**
    * Gets the content of this processing instruction.
    */
  @JSName("content")
  def content_Union(): js.UndefOr[String] = js.native
  /**
    * Gets the target of this processing instruction.
    */
  def target(): String = js.native
  /**
    * Sets the content of this processing instruction.
    */
  def target(target: String): js.Any = js.native
  /**
    * Returns the parent of this processing instruction.
    */
  def up(): Parent = js.native
}

