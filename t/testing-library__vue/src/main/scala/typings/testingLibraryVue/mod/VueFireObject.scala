package typings.testingLibraryVue.mod

import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLOptionElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueFireObject extends AsyncFireObject {
  def apply(element: Document_, event: Event_): js.Promise[Unit] = js.native
  def apply(element: Element, event: Event_): js.Promise[Unit] = js.native
  def apply(element: Window_, event: Event_): js.Promise[Unit] = js.native
  def touch(element: Document_): js.Promise[Unit] = js.native
  def touch(element: Element): js.Promise[Unit] = js.native
  def touch(element: Window_): js.Promise[Unit] = js.native
  def update(element: HTMLElement): js.Promise[Unit] = js.native
  def update(element: HTMLElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLInputElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLOptionElement): js.Promise[Unit] = js.native
  def update(element: HTMLSelectElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLTextAreaElement, value: String): js.Promise[Unit] = js.native
}

