package typings.tinycopy.tinycopyMod

import typings.std.Element
import typings.std.Error
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinycopy", JSImport.Default)
@js.native
class default protected () extends TinyCopy {
  def this(trigger: Element, target: String) = this()
  def this(trigger: Element, target: Element) = this()
  def this(trigger: Element, target: NodeListOf[Element]) = this()
}

/* static members */
@JSImport("tinycopy", JSImport.Default)
@js.native
object default extends js.Object {
  def exec(
    value: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

