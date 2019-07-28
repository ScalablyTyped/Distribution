package typings.atUifabricUtilities

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom/elementContains", JSImport.Namespace)
@js.native
object libDomElementContainsMod extends js.Object {
  def elementContains(): Boolean = js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
}

