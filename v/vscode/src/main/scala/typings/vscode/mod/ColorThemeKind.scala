package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorThemeKind extends StObject
@JSImport("vscode", "ColorThemeKind")
@js.native
object ColorThemeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorThemeKind with Double] = js.native
  
  @js.native
  sealed trait Dark extends ColorThemeKind
  /* 2 */ val Dark: typings.vscode.mod.ColorThemeKind.Dark with Double = js.native
  
  @js.native
  sealed trait HighContrast extends ColorThemeKind
  /* 3 */ val HighContrast: typings.vscode.mod.ColorThemeKind.HighContrast with Double = js.native
  
  @js.native
  sealed trait Light extends ColorThemeKind
  /* 1 */ val Light: typings.vscode.mod.ColorThemeKind.Light with Double = js.native
}
