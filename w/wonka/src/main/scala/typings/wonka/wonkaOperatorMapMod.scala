package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_map", JSImport.Namespace)
@js.native
object wonkaOperatorMapMod extends js.Object {
  
  def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = js.native
}
