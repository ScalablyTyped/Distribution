package typings.vscode.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorThemeKind extends js.Object

@JSImport("vscode", "ColorThemeKind")
@js.native
object ColorThemeKind extends js.Object {
  @js.native
  sealed trait Dark extends ColorThemeKind
  
  @js.native
  sealed trait HighContrast extends ColorThemeKind
  
  @js.native
  sealed trait Light extends ColorThemeKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorThemeKind with Double] = js.native
  /* 2 */ @js.native
  object Dark extends TopLevel[Dark with Double]
  
  /* 3 */ @js.native
  object HighContrast extends TopLevel[HighContrast with Double]
  
  /* 1 */ @js.native
  object Light extends TopLevel[Light with Double]
  
}

