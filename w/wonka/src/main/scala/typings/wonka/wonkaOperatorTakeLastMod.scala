package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorTakeLastMod {
  
  @JSImport("wonka/src/operators/wonka_operator_takeLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeLast[A](max: Double): Operator[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(max.asInstanceOf[js.Any]).asInstanceOf[Operator[A, A]]
}
