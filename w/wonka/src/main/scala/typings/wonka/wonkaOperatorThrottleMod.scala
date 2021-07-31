package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorThrottleMod {
  
  @JSImport("wonka/src/web/wonka_operator_throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
