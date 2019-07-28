package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcChannelMod {
  type Channel = String
  type NonPositionChannel = /* import warning: ImportType.apply Failed type conversion: std.Array<'text' | 'shape' | 'color' | 'fill' | 'stroke' | 'opacity' | 'size' | 'detail' | 'key' | 'tooltip' | 'href' | 'order'>[0] */ js.Any
  type NonPositionScaleChannel = /* import warning: ImportType.apply Failed type conversion: std.Array<'shape' | 'color' | 'fill' | 'stroke' | 'opacity' | 'size'>[0] */ js.Any
  type PositionScaleChannel = /* import warning: ImportType.apply Failed type conversion: std.Array<'x' | 'y'>[0] */ js.Any
  type ScaleChannel = /* import warning: ImportType.apply Failed type conversion: std.Array<'shape' | 'x' | 'y' | 'color' | 'fill' | 'stroke' | 'opacity' | 'size'>[0] */ js.Any
  type SupportedMark = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ mark in vega-lite.vega-lite/build/src/mark.Mark ]:? boolean}
    */ typings.vegaDashLite.vegaDashLiteStrings.SupportedMark with js.Any
}
