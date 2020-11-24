package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_operator_debounce", JSImport.Namespace)
@js.native
object wonkaOperatorDebounceMod extends js.Object {
  
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
}
