package typings.vegaDashLite.buildSrcCompileSplitMod

import typings.vegaDashLite.vegaDashLiteStrings.Empty
import typings.vegaDashLite.vegaDashLiteStrings.axis
import typings.vegaDashLite.vegaDashLiteStrings.legend
import typings.vegaDashLite.vegaDashLiteStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/split", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: String): Explicit[T] = js.native
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: js.Symbol): Explicit[T] = js.native
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: Double): Explicit[T] = js.native
  def makeExplicit[T](value: T): Explicit[T] = js.native
  def makeImplicit[T](value: T): Explicit[T] = js.native
  def mergeValuesWithExplicit[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: Empty): Explicit[T] = js.native
  def mergeValuesWithExplicit[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: String,
    propertyOf: Empty,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ String, 
      /* propertyOf */ String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_axis[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: axis): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_axis[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: String,
    propertyOf: axis,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ String, 
      /* propertyOf */ String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_legend[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: legend): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_legend[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: String,
    propertyOf: legend,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ String, 
      /* propertyOf */ String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_scale[S, T](v1: Explicit[T], v2: Explicit[T], property: String, propertyOf: scale): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_scale[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: String,
    propertyOf: scale,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ String, 
      /* propertyOf */ String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  def tieBreakByComparing[S, T](compare: js.Function2[/* v1 */ T, /* v2 */ T, Double]): js.Function4[
    /* v1 */ Explicit[T], 
    /* v2 */ Explicit[T], 
    /* property */ String, 
    /* propertyOf */ String | Double | js.Symbol, 
    Explicit[T]
  ] = js.native
}

