package typings.victoryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryAnimationUtilMod {
  
  @JSImport("victory-core/lib/victory-animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolateFunction(a: Any, b: Any): js.Function1[/* t */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateFunction")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Any, Any]]
  
  inline def interpolateImmediate(a: Any, b: Any): js.Function1[/* t */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateImmediate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Any, Any]]
  inline def interpolateImmediate(a: Any, b: Any, when: Double): js.Function1[/* t */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateImmediate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Any, Any]]
  
  inline def interpolateObject(a: Any, b: Any): js.Function1[/* t */ Any, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateObject")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Any, js.Object]]
  
  inline def interpolateString(a: Any, b: Any): js.Function1[/* t */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Any]]
  
  inline def isInterpolatable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterpolatable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def victoryInterpolator[T](a: T, b: T): js.Function1[/* t */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("victoryInterpolator")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, T]]
}
