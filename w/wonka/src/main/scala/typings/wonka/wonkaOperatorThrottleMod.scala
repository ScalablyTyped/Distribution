package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_operator_throttle", JSImport.Namespace)
@js.native
object wonkaOperatorThrottleMod extends js.Object {
  
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
}
