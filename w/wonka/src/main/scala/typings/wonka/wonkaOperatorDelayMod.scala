package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonka_operator_delay", JSImport.Namespace)
@js.native
object wonkaOperatorDelayMod extends js.Object {
  
  def delay[A](duration: Double): Operator[A, A] = js.native
}
