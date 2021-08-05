package typings.vegaLite.srcMarkMod

import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega.vega.Orientation, std.Array<'cornerRadiusTopLeft' | 'cornerRadiusTopRight' | 'cornerRadiusBottomLeft' | 'cornerRadiusBottomRight'>>> */
object BAR_CORNER_RADIUS_INDEX {
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX.horizontal")
  @js.native
  def horizontal: js.UndefOr[
    js.Array[
      cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
    ]
  ] = js.native
  inline def horizontal_=(
    x: js.UndefOr[
      js.Array[
        cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(x.asInstanceOf[js.Any])
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX.vertical")
  @js.native
  def vertical: js.UndefOr[
    js.Array[
      cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
    ]
  ] = js.native
  inline def vertical_=(
    x: js.UndefOr[
      js.Array[
        cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
}
