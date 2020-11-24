package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorThemeKind extends js.Object
@JSImport("vscode", "ColorThemeKind")
@js.native
object ColorThemeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorThemeKind with Double] = js.native
  
  @js.native
  sealed trait Dark extends ColorThemeKind
  /* 2 */ @js.native
  object Dark extends TopLevel[Dark with Double]
  
  @js.native
  sealed trait HighContrast extends ColorThemeKind
  /* 3 */ @js.native
  object HighContrast extends TopLevel[HighContrast with Double]
  
  @js.native
  sealed trait Light extends ColorThemeKind
  /* 1 */ @js.native
  object Light extends TopLevel[Light with Double]
}
