package typings.tabbable.tabbableMod

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabbable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(el: Element | Document): js.Array[HTMLElement] = js.native
  def apply(el: Element | Document, options: Options): js.Array[HTMLElement] = js.native
  def isFocusable(el: HTMLElement): Boolean = js.native
  def isTabbable(el: HTMLElement): Boolean = js.native
}

