package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorTakeWhileMod {
  
  @JSImport("wonka/src/operators/wonka_operator_takeWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def takeWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
