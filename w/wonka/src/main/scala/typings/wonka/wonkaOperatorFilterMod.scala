package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_filter", JSImport.Namespace)
@js.native
object wonkaOperatorFilterMod extends js.Object {
  
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = js.native
}
