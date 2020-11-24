package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENVIRONMENT extends js.Object
/**
  * Different Stronghold Pay environments
  */
@JSGlobal("Stronghold.ENVIRONMENT")
@js.native
object ENVIRONMENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ENVIRONMENT with String] = js.native
  
  @js.native
  sealed trait live extends ENVIRONMENT
  /* "live" */ @js.native
  object live extends TopLevel[live with String]
  
  @js.native
  sealed trait sandbox extends ENVIRONMENT
  /* "sandbox" */ @js.native
  object sandbox extends TopLevel[sandbox with String]
}
