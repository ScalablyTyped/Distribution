package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleHelpersMod {
  
  @JSImport("@testing-library/dom/types/role-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeHeadingLevel(element: Element): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeadingLevel")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getRoles(container: HTMLElement): StringDictionary[js.Array[HTMLElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoles")(container.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[HTMLElement]]]
  
  @scala.inline
  def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def logRoles(container: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logRoles")(container.asInstanceOf[js.Any]).asInstanceOf[String]
}
