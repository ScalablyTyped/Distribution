package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/types/role-helpers", JSImport.Namespace)
@js.native
object roleHelpersMod extends js.Object {
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  def isInaccessible(element: Element): Boolean = js.native
  def logRoles(container: HTMLElement): String = js.native
}

