package typings.treat

import typings.treat.typesMod.TreatModuleObject
import typings.treat.typesMod.TreatModuleValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("treat/lib/types/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  def createTheme(): Unit = js.native
  
  def globalStyle(): Unit = js.native
  
  def resolveClassName(themeRef: String, classRef: String): String = js.native
  
  def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = js.native
  def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = js.native
  
  def style(): Unit = js.native
  
  def styleMap(): Unit = js.native
  
  def styleTree(): Unit = js.native
}
