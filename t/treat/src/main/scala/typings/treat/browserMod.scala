package typings.treat

import typings.treat.typesMod.TreatModuleObject
import typings.treat.typesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("treat/lib/types/browser", "createTheme")
  @js.native
  def createTheme(): Unit = js.native
  
  @JSImport("treat/lib/types/browser", "globalStyle")
  @js.native
  def globalStyle(): Unit = js.native
  
  @JSImport("treat/lib/types/browser", "resolveClassName")
  @js.native
  def resolveClassName(themeRef: String, classRef: String): String = js.native
  
  @JSImport("treat/lib/types/browser", "resolveStyles")
  @js.native
  def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = js.native
  @JSImport("treat/lib/types/browser", "resolveStyles")
  @js.native
  def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = js.native
  
  @JSImport("treat/lib/types/browser", "style")
  @js.native
  def style(): Unit = js.native
  
  @JSImport("treat/lib/types/browser", "styleMap")
  @js.native
  def styleMap(): Unit = js.native
  
  @JSImport("treat/lib/types/browser", "styleTree")
  @js.native
  def styleTree(): Unit = js.native
}
