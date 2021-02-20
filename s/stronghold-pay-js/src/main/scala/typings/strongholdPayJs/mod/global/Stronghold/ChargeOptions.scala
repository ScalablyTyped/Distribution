package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChargeOptions extends Options {
  
  var authorizeOnly: js.UndefOr[Boolean] = js.native
  
  var charge: ChargeDropin = js.native
  
  def onSuccess(charge: Charge): Unit = js.native
  @JSName("onSuccess")
  var onSuccess_Original: ChargeOnSuccess = js.native
  
  var tip: js.UndefOr[TipDataDropin] = js.native
}
