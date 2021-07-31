package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorOnStartMod {
  
  @JSImport("wonka/src/operators/wonka_operator_onStart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def onStart[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
