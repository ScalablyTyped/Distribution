package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorCombineMod {
  
  @JSImport("wonka/src/operators/wonka_operator_combine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine[A, B](a: Source[A]): js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]]]
}
