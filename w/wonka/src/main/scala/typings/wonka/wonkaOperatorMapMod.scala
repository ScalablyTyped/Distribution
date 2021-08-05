package typings.wonka

import typings.wonka.wonkaTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorMapMod {
  
  @JSImport("wonka/src/operators/wonka_operator_map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[Operator[A, B]]
}
