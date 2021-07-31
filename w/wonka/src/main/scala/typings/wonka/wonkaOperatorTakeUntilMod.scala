package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorTakeUntilMod {
  
  @JSImport("wonka/src/operators/wonka_operator_takeUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def takeUntil[A](signal: Source[js.Any]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(signal.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
