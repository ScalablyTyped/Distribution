package typings.uirouterCore.commonMod

import typings.uirouterCore.commonCommonMod.Predicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/common", "assertPredicate")
@js.native
object assertPredicate extends js.Object {
  
  def apply[T](predicate: Predicate[T], errMsg: String): Predicate[T] = js.native
  def apply[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
}
