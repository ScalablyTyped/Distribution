package typings.wouter.mod

import typings.wouter.matcherMod.DefaultParams
import typings.wouter.matcherMod.Match
import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wouter", "useRoute")
@js.native
object useRoute extends js.Object {
  
  def apply[T /* <: DefaultParams */](pattern: Path): Match[T] = js.native
}
