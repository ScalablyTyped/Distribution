package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Different Stronghold Pay environments
  */
@JSImport("stronghold-pay-js", "ENVIRONMENT")
@js.native
object ENVIRONMENT extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT & String] = js.native
  
  /* "live" */ val live: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.live & String = js.native
  
  /* "sandbox" */ val sandbox: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.sandbox & String = js.native
}
