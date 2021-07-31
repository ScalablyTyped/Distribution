package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorSkipMod {
  
  @JSImport("wonka/src/operators/wonka_operator_skip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def skip[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
