package typings.victory.victoryMod

import typings.react.reactMod.ReactElement
import typings.victory.Anon_Left
import typings.victory.Anon_Name
import typings.victory.Anon_XY
import typings.victory.Anon_XYD3ScaleScalePropType
import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.horizontal
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.parent
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.vertical
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
  var borderComponent: js.UndefOr[ReactElement] = js.undefined
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
  var centerTitle: js.UndefOr[Boolean] = js.undefined
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
  var data_VictoryLegendProps: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  /**
    * VictoryLegend uses the standard eventKey prop to specify how event targets
    * are addressed. This prop is not commonly used.
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.undefined
  /**
    * VictoryLegend uses the standard events prop.
    */
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
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
  var gutter: js.UndefOr[Double | Anon_Left] = js.undefined
  /**
    * The itemsPerRow prop determines how many items to render in each row
    * of a horizontal legend, or in each column of a vertical legend. This
    * prop should be given as an integer. When this prop is not given,
    * legend items will be rendered in a single row or column.
    */
  var itemsPerRow: js.UndefOr[Double] = js.undefined
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
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * The rowGutter prop defines the number of pixels between legend rows.
    * This prop may be given as a number, or as an object with values
    * specified for “top” and “bottom” gutters. To set spacing between columns,
    * use the gutter prop.
    */
  var rowGutter: js.UndefOr[Double | (Omit[BlockProps, left | right])] = js.undefined
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
  var symbolSpacer: js.UndefOr[Double] = js.undefined
  /**
    * The title prop specifies a title to render with the legend.
    * This prop should be given as a string, or an array of strings for multi-line titles.
    */
  var title: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The titleComponent prop takes a component instance which will be used to render
    * a title for the component. The new element created from the passed
    * labelComponent will be supplied with the following properties: x, y, index, data,
    * datum, verticalAnchor, textAnchor, style, text, and events. Any of these props
    * may be overridden by passing in props to the supplied component, or modified
    * or ignored within the custom component itself. If labelComponent is omitted,
    * a new VictoryLabel will be created with the props described above.
    */
  var titleComponent: js.UndefOr[ReactElement] = js.undefined
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
  var x_VictoryLegendProps: js.UndefOr[Double] = js.undefined
  @JSName("y")
  var y_VictoryLegendProps: js.UndefOr[Double] = js.undefined
}

object VictoryLegendProps {
  @scala.inline
  def apply(
    animate: Boolean | AnimatePropTypeInterface = null,
    borderComponent: ReactElement = null,
    borderPadding: PaddingProps = null,
    categories: CategoryPropType = null,
    centerTitle: js.UndefOr[Boolean] = js.undefined,
    colorScale: ColorScalePropType = null,
    containerComponent: ReactElement = null,
    data: js.Array[Anon_Name] = null,
    dataComponent: ReactElement = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback | js.Array[String] = null,
    events: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]] = null,
    externalEventMutations: js.Array[_] = null,
    groupComponent: ReactElement = null,
    gutter: Double | Anon_Left = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    itemsPerRow: Int | Double = null,
    label: String | (js.Function1[/* data */ js.Any, String]) = null,
    labelComponent: ReactElement = null,
    maxDomain: Double | Anon_XY = null,
    minDomain: Double | Anon_XY = null,
    name: String = null,
    orientation: horizontal | vertical = null,
    padding: PaddingProps = null,
    rowGutter: Double | (Omit[BlockProps, left | right]) = null,
    scale: ScalePropType | D3Scale | Anon_XYD3ScaleScalePropType = null,
    standalone: js.UndefOr[Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbolSpacer: Int | Double = null,
    theme: VictoryThemeDefinition = null,
    title: String | js.Array[String] = null,
    titleComponent: ReactElement = null,
    titleOrientation: OrientationTypes = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    y0: DataGetterPropType = null
  ): VictoryLegendProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderComponent != null) __obj.updateDynamic("borderComponent")(borderComponent.asInstanceOf[js.Any])
    if (borderPadding != null) __obj.updateDynamic("borderPadding")(borderPadding.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(centerTitle)) __obj.updateDynamic("centerTitle")(centerTitle.asInstanceOf[js.Any])
    if (colorScale != null) __obj.updateDynamic("colorScale")(colorScale.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (externalEventMutations != null) __obj.updateDynamic("externalEventMutations")(externalEventMutations.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent.asInstanceOf[js.Any])
    if (maxDomain != null) __obj.updateDynamic("maxDomain")(maxDomain.asInstanceOf[js.Any])
    if (minDomain != null) __obj.updateDynamic("minDomain")(minDomain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rowGutter != null) __obj.updateDynamic("rowGutter")(rowGutter.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbolSpacer != null) __obj.updateDynamic("symbolSpacer")(symbolSpacer.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleComponent != null) __obj.updateDynamic("titleComponent")(titleComponent.asInstanceOf[js.Any])
    if (titleOrientation != null) __obj.updateDynamic("titleOrientation")(titleOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLegendProps]
  }
}

