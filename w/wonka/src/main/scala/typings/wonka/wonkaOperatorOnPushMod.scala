package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/operators/wonka_operator_onPush", JSImport.Namespace)
@js.native
object wonkaOperatorOnPushMod extends js.Object {
  
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
}
