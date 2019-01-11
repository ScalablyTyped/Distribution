package typings
package tabbableLib.tabbableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabbable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(el: stdLib.Element | stdLib.Document): js.Array[stdLib.HTMLElement] = js.native
  def apply(el: stdLib.Element | stdLib.Document, options: tabbableLib.tabbableMod.TNs.Options): js.Array[stdLib.HTMLElement] = js.native
  def isFocusable(el: stdLib.HTMLElement): scala.Boolean = js.native
  def isTabbable(el: stdLib.HTMLElement): scala.Boolean = js.native
}

