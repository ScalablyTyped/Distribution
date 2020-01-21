package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LanguageVersion extends js.Object

@JSGlobal("TypeScript.LanguageVersion")
@js.native
object LanguageVersion extends js.Object {
  @js.native
  sealed trait EcmaScript3 extends LanguageVersion
  
  @js.native
  sealed trait EcmaScript5 extends LanguageVersion
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVersion with Double] = js.native
  /* 0 */ @js.native
  object EcmaScript3 extends TopLevel[EcmaScript3 with Double]
  
  /* 1 */ @js.native
  object EcmaScript5 extends TopLevel[EcmaScript5 with Double]
  
}

