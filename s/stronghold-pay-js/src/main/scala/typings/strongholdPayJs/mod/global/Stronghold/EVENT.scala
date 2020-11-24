package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVENT extends js.Object
@JSGlobal("Stronghold.EVENT")
@js.native
object EVENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EVENT with String] = js.native
  
  @js.native
  sealed trait ERROR extends EVENT
  /* "error" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  @js.native
  sealed trait EXIT extends EVENT
  /* "exit" */ @js.native
  object EXIT extends TopLevel[EXIT with String]
  
  @js.native
  sealed trait READY extends EVENT
  /* "ready" */ @js.native
  object READY extends TopLevel[READY with String]
  
  @js.native
  sealed trait SUCCESS extends EVENT
  /* "success" */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with String]
}
