package typings.strongholdPayJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "EVENT")
@js.native
object EVENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.strongholdPayJs.mod.global.Stronghold.EVENT with String] = js.native
  
  /* "error" */ val ERROR: typings.strongholdPayJs.mod.global.Stronghold.EVENT.ERROR with String = js.native
  
  /* "exit" */ val EXIT: typings.strongholdPayJs.mod.global.Stronghold.EVENT.EXIT with String = js.native
  
  /* "ready" */ val READY: typings.strongholdPayJs.mod.global.Stronghold.EVENT.READY with String = js.native
  
  /* "success" */ val SUCCESS: typings.strongholdPayJs.mod.global.Stronghold.EVENT.SUCCESS with String = js.native
}
