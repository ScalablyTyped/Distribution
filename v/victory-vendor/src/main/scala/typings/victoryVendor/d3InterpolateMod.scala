package typings.victoryVendor

import typings.d3Color.mod.ColorCommonInstance
import typings.d3Interpolate.anon.ToString
import typings.d3Interpolate.anon.ValueOf
import typings.d3Interpolate.mod.ArrayInterpolator
import typings.d3Interpolate.mod.ColorGammaInterpolationFactory
import typings.d3Interpolate.mod.NumberArray
import typings.d3Interpolate.mod.ZoomInterpolator
import typings.d3Interpolate.mod.ZoomView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3InterpolateMod {
  
  @JSImport("victory-vendor/d3-interpolate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolate(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolate(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolate(a: js.Array[Double], b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  inline def interpolate(a: js.Date, b: js.Date): js.Function1[/* t */ Double, js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Date]]
  inline def interpolate(a: Any, b: Boolean): js.Function1[/* t */ Double, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Boolean]]
  inline def interpolate(a: Any, b: Null): js.Function1[/* t */ Double, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Null]]
  inline def interpolate(a: Double, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolate(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolate(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolate(a: ToString, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolate(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolate(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolate(a: NumberArray, b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolate(a: NumberArray, b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  inline def interpolate[U /* <: js.Array[Any] */](a: js.Array[Any], b: U): js.Function1[/* t */ Double, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, U]]
  inline def interpolate[U /* <: js.Object */](a: Any, b: U): js.Function1[/* t */ Double, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, U]]
  
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolateArray(a: js.Array[Double], b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolateArray(a: NumberArray, b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  inline def interpolateArray[A /* <: js.Array[Any] */](a: js.Array[Any], b: A): ArrayInterpolator[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ArrayInterpolator[A]]
  
  inline def interpolateBasis(splineNodes: js.Array[Double]): js.Function1[/* t */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateBasis")(splineNodes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def interpolateBasisClosed(splineNodes: js.Array[Double]): js.Function1[/* t */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateBasisClosed")(splineNodes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  @JSImport("victory-vendor/d3-interpolate", "interpolateCubehelix")
  @js.native
  val interpolateCubehelix: ColorGammaInterpolationFactory = js.native
  
  @JSImport("victory-vendor/d3-interpolate", "interpolateCubehelixLong")
  @js.native
  val interpolateCubehelixLong: ColorGammaInterpolationFactory = js.native
  
  inline def interpolateDate(a: js.Date, b: js.Date): js.Function1[/* t */ Double, js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateDate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Date]]
  
  inline def interpolateDiscrete[T](values: js.Array[T]): js.Function1[/* t */ Double, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateDiscrete")(values.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, T]]
  
  inline def interpolateHcl(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHcl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHcl(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHcl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHcl(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHcl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHcl(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHcl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateHclLong(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHclLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHclLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHclLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHclLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHclLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHclLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHclLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateHsl(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHsl(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHsl(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHsl(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsl")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateHslLong(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHslLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHslLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHslLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHslLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHslLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateHslLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHslLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateHue(a: Double, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHue")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def interpolateLab(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateLab")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateLab(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateLab")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateLab(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateLab")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateLab(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateLab")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateNumber(a: Double, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateNumber(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateNumber(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateNumber(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumber")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def interpolateNumberArray(a: js.Array[Double], b: js.Array[Double]): js.Function1[/* t */ Double, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Array[Double]]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolateNumberArray(a: js.Array[Double], b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  inline def interpolateNumberArray(a: NumberArray, b: js.Array[Double]): js.Function1[/* t */ Double, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Array[Double]]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.DataView): js.Function1[/* t */ Double, js.typedarray.DataView] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.DataView]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Float32Array): js.Function1[/* t */ Double, js.typedarray.Float32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float32Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Float64Array): js.Function1[/* t */ Double, js.typedarray.Float64Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Float64Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Int16Array): js.Function1[/* t */ Double, js.typedarray.Int16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int16Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Int32Array): js.Function1[/* t */ Double, js.typedarray.Int32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int32Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Int8Array): js.Function1[/* t */ Double, js.typedarray.Int8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Int8Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Uint16Array): js.Function1[/* t */ Double, js.typedarray.Uint16Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint16Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Uint32Array): js.Function1[/* t */ Double, js.typedarray.Uint32Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint32Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Uint8Array): js.Function1[/* t */ Double, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8Array]]
  inline def interpolateNumberArray(a: NumberArray, b: js.typedarray.Uint8ClampedArray): js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateNumberArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.typedarray.Uint8ClampedArray]]
  
  inline def interpolateObject[U /* <: js.Object */](a: Any, b: U): js.Function1[/* t */ Double, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateObject")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, U]]
  
  @JSImport("victory-vendor/d3-interpolate", "interpolateRgb")
  @js.native
  val interpolateRgb: ColorGammaInterpolationFactory = js.native
  
  inline def interpolateRgbBasis(colors: js.Array[String | ColorCommonInstance]): js.Function1[/* t */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRgbBasis")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateRgbBasisClosed(colors: js.Array[String | ColorCommonInstance]): js.Function1[/* t */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRgbBasisClosed")(colors.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateRound(a: Double, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRound")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateRound(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRound")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateRound(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRound")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  inline def interpolateRound(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRound")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def interpolateString(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateString(a: String, b: ToString): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateString(a: ToString, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  inline def interpolateString(a: ToString, b: ToString): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateTransformCss(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateTransformCss")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateTransformSvg(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateTransformSvg")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  inline def interpolateZoom(a: ZoomView, b: ZoomView): ZoomInterpolator = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateZoom")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ZoomInterpolator]
  
  inline def piecewise(
    interpolate: js.Function2[/* a */ ZoomView, /* b */ ZoomView, ZoomInterpolator],
    values: js.Array[ZoomView]
  ): ZoomInterpolator = (^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(interpolate.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ZoomInterpolator]
  inline def piecewise(values: js.Array[Any]): js.Function1[/* t */ Double, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(values.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* t */ Double, Any]]
  
  inline def piecewise_A_ArrayInterpolator[A /* <: js.Array[Any] */](
    interpolate: js.Function2[/* a */ js.Array[Any], /* b */ A, ArrayInterpolator[A]],
    values: js.Array[A]
  ): ArrayInterpolator[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(interpolate.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ArrayInterpolator[A]]
  inline def piecewise_A_ArrayInterpolator[A /* <: js.Array[Any] */](values: js.Array[A]): ArrayInterpolator[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(values.asInstanceOf[js.Any]).asInstanceOf[ArrayInterpolator[A]]
  
  inline def piecewise_TData_Function1[TData](interpolate: js.Function2[/* a */ TData, /* b */ TData, Any], values: js.Array[TData]): js.Function1[/* t */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(interpolate.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Any]]
  
  inline def piecewise_ZoomInterpolator(values: js.Array[ZoomView]): ZoomInterpolator = ^.asInstanceOf[js.Dynamic].applyDynamic("piecewise")(values.asInstanceOf[js.Any]).asInstanceOf[ZoomInterpolator]
  
  inline def quantize[T](interpolator: js.Function1[/* t */ Double, T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("quantize")(interpolator.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
