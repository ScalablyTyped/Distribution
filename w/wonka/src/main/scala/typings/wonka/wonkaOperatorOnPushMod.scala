package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorOnPushMod {
  
  @JSImport("wonka/src/operators/wonka_operator_onPush", "onPush")
  @js.native
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka/src/operators/wonka_operator_onPush", "tap")
  @js.native
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
}
