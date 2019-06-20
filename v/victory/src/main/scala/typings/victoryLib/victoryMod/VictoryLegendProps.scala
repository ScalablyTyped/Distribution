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
    * The borderComponent prop takes a component instance which will be responsible
    * for rendering a border around the legend. The new element created from the passed
    * borderComponent will be provided with the following properties calculated by
    * VictoryLegend: x, y, width, height, and style. Any of these props may be
    * overridden by passing in props to the supplied component, or modified or ignored
    * within the custom component itself. If a borderComponent
    * is not provided, VictoryLegend will use its default Border component.
    * Please note that the default width and height calculated
    * for the border component is based on approximated
    * text measurements, and may need to be adjusted.
    * @default <Border/>
    */
  var borderComponent: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  /**
    * The borderPadding specifies the amount of padding that should
    * be added between the legend items and the border. This prop may be given as
    * a number, or asanobject with values specified for top, bottom, left, and right.
    * Please note that the default width and height calculated for the border
    * component is based on approximated text measurements, so padding may need to be adjusted.
    */
  var borderPadding: js.UndefOr[PaddingProps] = js.undefined
  /**
    * The centerTitle boolean prop specifies whether a legend title should be centered.
    */
  var centerTitle: js.UndefOr[scala.Boolean] = js.undefined
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
    * VictoryLegend uses the standard eventKey prop to specify how event targets
    * are addressed. This prop is not commonly used.
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback | js.Array[java.lang.String]] = js.undefined
  /**
    * VictoryLegend uses the standard events prop.
    */
  var events: js.UndefOr[
    js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        StringOrNumberOrCallback
      ]
    ]
  ] = js.undefined
  /**
    * VictoryLegend uses the standard externalEventMutations prop.
    */
  var externalEventMutations: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The gutter prop defines the number of pixels between legend rows or
    * columns, depending on orientation. When orientation is horizontal,
    * gutters are between columns. When orientation is vertical, gutters
    * are the space between rows.
    */
  var gutter: js.UndefOr[scala.Double | victoryLib.Anon_Left] = js.undefined
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
    * The rowGutter prop defines the number of pixels between legend rows.
    * This prop may be given as a number, or as an object with values
    * specified for “top” and “bottom” gutters. To set spacing between columns,
    * use the gutter prop.
    */
  var rowGutter: js.UndefOr[
    scala.Double | (Omit[BlockProps, victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right])
  ] = js.undefined
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
    * The title prop specifies a title to render with the legend.
    * This prop should be given as a string, or an array of strings for multi-line titles.
    */
  var title: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The titleComponent prop takes a component instance which will be used to render
    * a title for the component. The new element created from the passed
    * labelComponent will be supplied with the following properties: x, y, index, data,
    * datum, verticalAnchor, textAnchor, style, text, and events. Any of these props
    * may be overridden by passing in props to the supplied component, or modified
    * or ignored within the custom component itself. If labelComponent is omitted,
    * a new VictoryLabel will be created with the props described above.
    */
  var titleComponent: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  /**
    * The titleOrientation prop specifies where the a title should be rendered
    * in relation to the rest of the legend. Possible values
    * for this prop are “top”, “bottom”, “left”, and “right”.
    * @default (provided by default theme): titleOrientation="top"
    */
  var titleOrientation: js.UndefOr[OrientationTypes] = js.undefined
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
    borderComponent: reactLib.reactMod.ReactElement = null,
    borderPadding: PaddingProps = null,
    categories: CategoryPropType = null,
    centerTitle: js.UndefOr[scala.Boolean] = js.undefined,
    colorScale: ColorScalePropType = null,
    containerComponent: reactLib.reactMod.ReactElement = null,
    data: js.Array[victoryLib.Anon_Name] = null,
    dataComponent: reactLib.reactMod.ReactElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback | js.Array[java.lang.String] = null,
    events: js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        StringOrNumberOrCallback
      ]
    ] = null,
    externalEventMutations: js.Array[_] = null,
    groupComponent: reactLib.reactMod.ReactElement = null,
    gutter: scala.Double | victoryLib.Anon_Left = null,
    height: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    itemsPerRow: scala.Int | scala.Double = null,
    label: java.lang.String | victoryLib.Fn_DataAnyString = null,
    labelComponent: reactLib.reactMod.ReactElement = null,
    name: java.lang.String = null,
    orientation: victoryLib.victoryLibStrings.horizontal | victoryLib.victoryLibStrings.vertical = null,
    padding: PaddingProps = null,
    rowGutter: scala.Double | (Omit[BlockProps, victoryLib.victoryLibStrings.left | victoryLib.victoryLibStrings.right]) = null,
    scale: ScalePropType | D3Scale | victoryLib.Anon_XYD3Scale = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbolSpacer: scala.Int | scala.Double = null,
    theme: VictoryThemeDefinition = null,
    title: java.lang.String | js.Array[java.lang.String] = null,
    titleComponent: reactLib.reactMod.ReactElement = null,
    titleOrientation: OrientationTypes = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    y0: DataGetterPropType = null
  ): VictoryLegendProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (borderComponent != null) __obj.updateDynamic("borderComponent")(borderComponent)
    if (borderPadding != null) __obj.updateDynamic("borderPadding")(borderPadding.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(centerTitle)) __obj.updateDynamic("centerTitle")(centerTitle)
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (externalEventMutations != null) __obj.updateDynamic("externalEventMutations")(externalEventMutations)
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowGutter != null) __obj.updateDynamic("rowGutter")(rowGutter.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbolSpacer != null) __obj.updateDynamic("symbolSpacer")(symbolSpacer.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleComponent != null) __obj.updateDynamic("titleComponent")(titleComponent)
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLegendProps]
  }
}

