package typings.unsplashJs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersFpMod {
  
  @JSImport("unsplash-js/dist/helpers/fp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compactDefined[A](obj: Record[String, js.UndefOr[A | Null]]): Record[String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compactDefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Record[String, A]]
  
  inline def flow[A /* <: js.Array[Any] */, B](ab: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, B]]
  inline def flow[A /* <: js.Array[Any] */, B, C](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C]): js.Function1[/* a */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, C]]
  inline def flow[A /* <: js.Array[Any] */, B, C, D](ab: js.Function1[/* a */ A, B], bc: js.Function1[/* b */ B, C], cd: js.Function1[/* b */ C, D]): js.Function1[/* a */ A, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("flow")(ab.asInstanceOf[js.Any], bc.asInstanceOf[js.Any], cd.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, D]]
}
