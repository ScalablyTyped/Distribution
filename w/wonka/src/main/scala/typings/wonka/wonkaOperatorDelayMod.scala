package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorDelayMod {
  
  @JSImport("wonka/src/web/wonka_operator_delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def delay[A](duration: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(duration.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
