package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENVIRONMENT extends StObject
/**
  * Different Stronghold Pay environments
  */
@JSGlobal("Stronghold.ENVIRONMENT")
@js.native
object ENVIRONMENT extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ENVIRONMENT with String] = js.native
  
  @js.native
  sealed trait live extends ENVIRONMENT
  /* "live" */ val live: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.live with String = js.native
  
  @js.native
  sealed trait sandbox extends ENVIRONMENT
  /* "sandbox" */ val sandbox: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.sandbox with String = js.native
}
