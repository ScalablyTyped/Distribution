package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: String): js.UndefOr[ENVIRONMENT & String] = js.native
  
  @js.native
  sealed trait live
    extends StObject
       with ENVIRONMENT
  /* "live" */ val live: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.live & String = js.native
  
  @js.native
  sealed trait sandbox
    extends StObject
       with ENVIRONMENT
  /* "sandbox" */ val sandbox: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.sandbox & String = js.native
}
