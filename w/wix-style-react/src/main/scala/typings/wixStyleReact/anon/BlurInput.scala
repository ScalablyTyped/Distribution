package typings.wixStyleReact.anon

import typings.std.HTMLInputElement
import typings.wixStyleReact.distTypesPaginationPaginationCorePaginationCoreDotdriverMod.NavButtonName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurInput extends StObject {
  
  /** Simulates blur in the input field in "input" mode */
  def blurInput(): Unit = js.native
  
  /** Simulates changing the value of the input field in "input" mode */
  def changeInput(newValue: String): Unit = js.native
  
  def click(): js.UndefOr[Unit] = js.native
  
  /** Simulates clicking a nav button */
  def clickNavButton(name: NavButtonName): Unit = js.native
  
  /** Simulates clicking a page in "pages" mode */
  def clickPage(page: Double): Unit = js.native
  
  /** Simulates committing the input field value in "input" mode */
  def commitInput(): Unit = js.native
  
  /** Returns whether the element exists */
  def exists(): Boolean = js.native
  
  def focusInput(): Unit = js.native
  
  /** Returns the page element currently selected */
  def getCurrentPage(): js.UndefOr[typings.std.Element | Null] = js.native
  
  def getElement(dataHook: String): js.UndefOr[typings.std.Element | Null] = js.native
  
  def getElementAttribute(dataHook: String, attributeName: String): js.UndefOr[String | Null] = js.native
  
  /** Returns the element for the navigation button - acceptable values are 'first', 'last', 'previous' or 'next' */
  def getNavButton(name: NavButtonName): js.UndefOr[typings.std.Element | Null] = js.native
  
  def getPage(pageNumber: Double): js.UndefOr[typings.std.Element | Null] = js.native
  
  /** Returns the page element given its index in the page strip */
  def getPageByIndex(): typings.std.Element | Null = js.native
  def getPageByIndex(idx: Double): typings.std.Element | Null = js.native
  
  /** Returns the page element given page number */
  def getPageByNumber(n: Double): js.UndefOr[typings.std.Element | Null] = js.native
  
  /** Returns the page input element in "input" mode */
  var getPageInput: HTMLInputElement = js.native
  
  /** Returns the text content of the displayed pages in "pages" mode */
  def getPageLabels(): js.Array[String | Null] = js.native
  
  /** Returns the container of page elements */
  def getPageStrip(): js.UndefOr[typings.std.Element | Null] = js.native
  
  /** Returns displayed page elements */
  def getPages(): js.Array[typings.std.Element] = js.native
  
  /** Returns the total amount of pages displayed in "input" mode */
  def getTotalPagesField(): js.UndefOr[typings.std.Element | Null] = js.native
  
  /** Checks if the input has an error */
  def inputHasError(): Boolean = js.native
  
  /** Returns the root element*/
  var root: js.UndefOr[typings.std.Element] = js.native
  
  /** Simulates events */
  var simulate: TypeofSimulate = js.native
}
