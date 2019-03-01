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

object VictoryLegendProps {
  @scala.inline
  def apply(
    animate: AnimatePropTypeInterface = null,
    categories: CategoryPropType = null,
    colorScale: ColorScalePropType = null,
    containerComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    data: js.Array[victoryLib.Anon_Name] = null,
    dataComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    domain: DomainPropType = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    gutter: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    itemsPerRow: scala.Int | scala.Double = null,
    label: java.lang.String | victoryLib.Anon_DataAnyString = null,
    labelComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    name: java.lang.String = null,
    orientation: victoryLib.victoryLibStrings.horizontal | victoryLib.victoryLibStrings.vertical = null,
    padding: scala.Double | victoryLib.Anon_BottomLeft = null,
    scale: ScalePropType | D3Scale | victoryLib.Anon_XYD3Scale = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbolSpacer: scala.Int | scala.Double = null,
    theme: VictoryThemeDefinition = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): VictoryLegendProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbolSpacer != null) __obj.updateDynamic("symbolSpacer")(symbolSpacer.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLegendProps]
  }
}

