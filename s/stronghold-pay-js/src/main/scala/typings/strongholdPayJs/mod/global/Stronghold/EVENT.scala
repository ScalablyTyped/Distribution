package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVENT extends StObject
@JSGlobal("Stronghold.EVENT")
@js.native
object EVENT extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EVENT with String] = js.native
  
  @js.native
  sealed trait ERROR extends EVENT
  /* "error" */ val ERROR: typings.strongholdPayJs.mod.global.Stronghold.EVENT.ERROR with String = js.native
  
  @js.native
  sealed trait EXIT extends EVENT
  /* "exit" */ val EXIT: typings.strongholdPayJs.mod.global.Stronghold.EVENT.EXIT with String = js.native
  
  @js.native
  sealed trait READY extends EVENT
  /* "ready" */ val READY: typings.strongholdPayJs.mod.global.Stronghold.EVENT.READY with String = js.native
  
  @js.native
  sealed trait SUCCESS extends EVENT
  /* "success" */ val SUCCESS: typings.strongholdPayJs.mod.global.Stronghold.EVENT.SUCCESS with String = js.native
}
