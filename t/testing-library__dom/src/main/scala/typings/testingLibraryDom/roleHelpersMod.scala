package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleHelpersMod {
  
  @JSImport("@testing-library/dom/types/role-helpers", "computeHeadingLevel")
  @js.native
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = js.native
  
  @JSImport("@testing-library/dom/types/role-helpers", "getRoles")
  @js.native
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = js.native
  
  @JSImport("@testing-library/dom/types/role-helpers", "isInaccessible")
  @js.native
  def isInaccessible(element: Element): Boolean = js.native
  
  @JSImport("@testing-library/dom/types/role-helpers", "logRoles")
  @js.native
  def logRoles(container: HTMLElement): String = js.native
}
