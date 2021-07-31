package typings.wixUiCore.anon

import typings.wixUiCore.optionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDivider extends StObject {
  
  def create(): Option = js.native
  def create(option: PartialOption): Option = js.native
  
  def createDivider(): Option = js.native
  def createDivider(hasClassNameValue: PartialDividerArgs): Option = js.native
  
  def createHighlighted(option: Option, highlightValue: String): Option = js.native
}
