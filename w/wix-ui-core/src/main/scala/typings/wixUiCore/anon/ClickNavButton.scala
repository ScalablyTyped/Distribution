package typings.wixUiCore.anon

import typings.std.HTMLInputElement
import typings.wixUiCore.paginationPaginationDriverMod.NavButtonName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickNavButton extends StObject {
  
  def blurInput(): Unit = js.native
  
  def changeInput(newValue: String): Unit = js.native
  
  def click(): js.Any = js.native
  
  def clickNavButton(name: NavButtonName): Unit = js.native
  
  def clickPage(page: Double): Unit = js.native
  
  def commitInput(): Unit = js.native
  
  def exists(): Boolean = js.native
  
  def getCurrentPage(): typings.std.Element = js.native
  
  def getNavButton(name: NavButtonName): typings.std.Element = js.native
  
  def getPageByIndex(): typings.std.Element = js.native
  def getPageByIndex(idx: Double): typings.std.Element = js.native
  
  def getPageByNumber(n: Double): typings.std.Element = js.native
  
  def getPageInput(): HTMLInputElement = js.native
  
  def getPageLabels(): js.Array[String] = js.native
  
  def getPageStrip(): js.Any = js.native
  
  def getPages(): js.Array[typings.std.Element] = js.native
  
  def getTotalPagesField(): typings.std.Element = js.native
  
  def inputHasError(): Boolean = js.native
  
  var root: js.Any = js.native
  
  var simulate: js.Any = js.native
}
