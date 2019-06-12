package typings
package vegaDashLiteLib.buildSrcCompileSplitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/split", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: java.lang.String, propertyOf: java.lang.String): Explicit[T] = js.native
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: java.lang.String, propertyOf: js.Symbol): Explicit[T] = js.native
  def defaultTieBreaker[S, T](v1: Explicit[T], v2: Explicit[T], property: java.lang.String, propertyOf: scala.Double): Explicit[T] = js.native
  def makeExplicit[T](value: T): Explicit[T] = js.native
  def makeImplicit[T](value: T): Explicit[T] = js.native
  def mergeValuesWithExplicit[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.Empty
  ): Explicit[T] = js.native
  def mergeValuesWithExplicit[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.Empty,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ java.lang.String, 
      /* propertyOf */ java.lang.String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_axis[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.axis
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_axis[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.axis,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ java.lang.String, 
      /* propertyOf */ java.lang.String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_legend[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.legend
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_legend[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.legend,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ java.lang.String, 
      /* propertyOf */ java.lang.String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_scale[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.scale
  ): Explicit[T] = js.native
  @JSName("mergeValuesWithExplicit")
  def mergeValuesWithExplicit_scale[S, T](
    v1: Explicit[T],
    v2: Explicit[T],
    property: java.lang.String,
    propertyOf: vegaDashLiteLib.vegaDashLiteLibStrings.scale,
    tieBreaker: js.Function4[
      /* v1 */ Explicit[T], 
      /* v2 */ Explicit[T], 
      /* property */ java.lang.String, 
      /* propertyOf */ java.lang.String, 
      Explicit[T]
    ]
  ): Explicit[T] = js.native
  def tieBreakByComparing[S, T](compare: js.Function2[/* v1 */ T, /* v2 */ T, scala.Double]): js.Function4[
    /* v1 */ Explicit[T], 
    /* v2 */ Explicit[T], 
    /* property */ java.lang.String, 
    /* propertyOf */ java.lang.String | scala.Double | js.Symbol, 
    Explicit[T]
  ] = js.native
}

