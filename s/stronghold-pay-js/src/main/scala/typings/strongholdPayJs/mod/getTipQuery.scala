package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.strongholdPayJs.mod.global.Stronghold.TipDataDropin
import typings.strongholdPayJs.mod.global.Stronghold.TipDropin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stronghold-pay-js", "getTipQuery")
@js.native
object getTipQuery extends js.Object {
  
  def apply(): StringDictionary[js.UndefOr[String | Double | Boolean]] = js.native
  def apply(tip: TipDataDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = js.native
  def apply(tip: TipDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = js.native
}
