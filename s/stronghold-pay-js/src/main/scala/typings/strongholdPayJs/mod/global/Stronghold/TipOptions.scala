package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TipOptions extends Options {
  
  var authorizeOnly: js.UndefOr[Boolean] = js.native
  
  def onSuccess(tip: Tip): Unit = js.native
  @JSName("onSuccess")
  var onSuccess_Original: TipOnSuccess = js.native
  
  var tip: TipDropin = js.native
}
