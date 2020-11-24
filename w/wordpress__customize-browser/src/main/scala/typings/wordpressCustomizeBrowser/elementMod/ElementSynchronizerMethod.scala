package typings.wordpressCustomizeBrowser.elementMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementSynchronizerMethod[T] extends js.Object {
  
  def refresh(): T = js.native
  
  def update(to: T): Unit = js.native
  def update(to: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* value */ T, T]): Unit = js.native
}
