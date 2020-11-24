package typings.strongholdPayJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Different Stronghold Pay environments
  */
@JSImport("stronghold-pay-js", "ENVIRONMENT")
@js.native
object ENVIRONMENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT with String] = js.native
  
  /* "live" */ val live: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.live with String = js.native
  
  /* "sandbox" */ val sandbox: typings.strongholdPayJs.mod.global.Stronghold.ENVIRONMENT.sandbox with String = js.native
}
