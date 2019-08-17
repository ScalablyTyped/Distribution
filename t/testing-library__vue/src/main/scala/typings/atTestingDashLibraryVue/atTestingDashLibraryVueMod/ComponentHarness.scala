package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLBodyElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @testing-library/vue.Typeofqueries ]: @testing-library/dom.@testing-library/dom/get-queries-for-element.BoundFunction<@testing-library/vue.Typeofqueries[P]>} */ @js.native
trait ComponentHarness extends js.Object {
  var baseElement: HTMLBodyElement = js.native
  var container: HTMLElement = js.native
  def debug(): Unit = js.native
  def debug(el: HTMLElement): Unit = js.native
  def emitted(): StringDictionary[js.Array[js.Array[_]]] = js.native
  def html(): String = js.native
  def isUnmounted(): Boolean = js.native
  def unmount(): Unit = js.native
  def updateProps(props: js.Object): js.Promise[Unit] = js.native
}

