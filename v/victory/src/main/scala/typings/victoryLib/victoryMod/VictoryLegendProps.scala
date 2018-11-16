package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VictoryLegendProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
       * The colorScale prop defines a color scale to be applied to each data
       * symbol in VictoryLegend. This prop should be given as an array of CSS
       * colors, or as a string corresponding to one of the built in color
       * scales: "grayscale", "qualitative", "heatmap", "warm", "cool", "red",
       * "green", "blue". VictoryLegend will assign a color to each symbol by
       * index, unless they are explicitly specified in the data object.
       * Colors will repeat when there are more symbols than colors in the
       * provided colorScale.
       */
  var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
  /**
       * Specify data via the data prop. VictoryLegend expects data as an
       * array of objects with name (required), symbol, and labels properties.
       * The data prop must be given as an array.
       */
  @JSName("data")
  var data_VictoryLegendProps: js.UndefOr[js.Array[victoryLib.Anon_Name]] = js.undefined
  /**
       * The gutter prop defines the number of pixels between legend rows or
       * columns, depending on orientation. When orientation is horizontal,
       * gutters are between columns. When orientation is vertical, gutters
       * are the space between rows.
       */
  var gutter: js.UndefOr[scala.Double] = js.undefined
  /**
       * The itemsPerRow prop determines how many items to render in each row
       * of a horizontal legend, or in each column of a vertical legend. This
       * prop should be given as an integer. When this prop is not given,
       * legend items will be rendered in a single row or column.
       */
  var itemsPerRow: js.UndefOr[scala.Double] = js.undefined
  /**
       * The orientation prop takes a string that defines whether legend data
       * are displayed in a row or column. When orientation is "horizontal",
       * legend items will be displayed in a single row. When orientation is
       * "vertical", legend items will be displayed in a single column. Line
       * and text-wrapping is not currently supported, so "vertical"
       * orientation is both the default setting and recommended for
       * displaying many series of data.
       * @default 'vertical'
       */
  var orientation: js.UndefOr[victoryLib.victoryLibStrings.horizontal | victoryLib.victoryLibStrings.vertical] = js.undefined
  /**
       * The style prop defines the style of the VictoryLegend component.
       * The style prop should be given as an object with styles defined for data, labels and
       * parent. Any valid svg styles are supported, but width, height, and
       * padding should be specified via props as they determine relative
       * layout for components in VictoryLegend.
       */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
  /**
       * The symbolSpacer prop defines the number of pixels between data
       * components and label components.
       */
  var symbolSpacer: js.UndefOr[scala.Double] = js.undefined
  /**
       * The x and y props define the base position of the legend element.
       */
  @JSName("x")
  var x_VictoryLegendProps: js.UndefOr[scala.Double] = js.undefined
  @JSName("y")
  var y_VictoryLegendProps: js.UndefOr[scala.Double] = js.undefined
}

