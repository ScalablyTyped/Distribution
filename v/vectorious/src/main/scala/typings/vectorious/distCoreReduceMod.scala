package typings.vectorious

import typings.vectorious.distCoreMod.NDArray
import typings.vectorious.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreReduceMod {
  
  @JSImport("vectorious/dist/core/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double],
    initialValue: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reduce(
    x: NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def reduce(
    x: NDArray,
    f: js.Function4[/* acc */ Double, /* value */ Double, /* i */ Double, /* src */ TypedArray, Double],
    initialValue: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Double]
}
