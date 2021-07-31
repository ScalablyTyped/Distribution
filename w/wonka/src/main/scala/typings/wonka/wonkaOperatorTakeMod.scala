package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorTakeMod {
  
  @JSImport("wonka/src/operators/wonka_operator_take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def take[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
