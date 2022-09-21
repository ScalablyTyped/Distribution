package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageStatusSeverity extends StObject
@JSImport("vscode", "LanguageStatusSeverity")
@js.native
object LanguageStatusSeverity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageStatusSeverity & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with LanguageStatusSeverity
  /* 2 */ val Error: typings.vscode.mod.LanguageStatusSeverity.Error & Double = js.native
  
  @js.native
  sealed trait Information
    extends StObject
       with LanguageStatusSeverity
  /* 0 */ val Information: typings.vscode.mod.LanguageStatusSeverity.Information & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with LanguageStatusSeverity
  /* 1 */ val Warning: typings.vscode.mod.LanguageStatusSeverity.Warning & Double = js.native
}
