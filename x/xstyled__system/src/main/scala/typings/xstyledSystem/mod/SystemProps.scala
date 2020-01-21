package typings.xstyledSystem.mod

import typings.csstype.mod.AlignContentProperty
import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.AlignSelfProperty
import typings.csstype.mod.BackgroundImageProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.BorderBottomProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.BorderLeftProperty
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderRightProperty
import typings.csstype.mod.BorderStyleProperty
import typings.csstype.mod.BorderTopProperty
import typings.csstype.mod.BorderWidthProperty
import typings.csstype.mod.BottomProperty
import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.FlexBasisProperty
import typings.csstype.mod.FlexDirectionProperty
import typings.csstype.mod.FlexProperty
import typings.csstype.mod.FlexWrapProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.GridAutoColumnsProperty
import typings.csstype.mod.GridAutoFlowProperty
import typings.csstype.mod.GridAutoRowsProperty
import typings.csstype.mod.GridColumnGapProperty
import typings.csstype.mod.GridColumnProperty
import typings.csstype.mod.GridGapProperty
import typings.csstype.mod.GridRowGapProperty
import typings.csstype.mod.GridRowProperty
import typings.csstype.mod.GridTemplateAreasProperty
import typings.csstype.mod.GridTemplateColumnsProperty
import typings.csstype.mod.GridTemplateRowsProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.JustifyContentProperty
import typings.csstype.mod.JustifyItemsProperty
import typings.csstype.mod.JustifySelfProperty
import typings.csstype.mod.LeftProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.MarginBottomProperty
import typings.csstype.mod.MarginLeftProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.MarginTopProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.PaddingBottomProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.PaddingRightProperty
import typings.csstype.mod.PaddingTopProperty
import typings.csstype.mod.PositionProperty
import typings.csstype.mod.RightProperty
import typings.csstype.mod.TextAlignProperty
import typings.csstype.mod.TextShadowProperty
import typings.csstype.mod.TextTransformProperty
import typings.csstype.mod.TopProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemProps
  extends BackgroundProps
     with BackgroundColorProps[StyledSystemLength]
     with BackgroundImageProps
     with BackgroundSizeProps[StyledSystemLength]
     with BackgroundPositionProps[StyledSystemLength]
     with BackgroundRepeatProps
     with OpacityProps
     with OverflowProps
     with TransitionProps
     with BorderProps[StyledSystemLength]
     with BorderTopProps[StyledSystemLength]
     with BorderTopColorProps
     with BorderRightProps[StyledSystemLength]
     with BorderRightColorProps
     with BorderBottomProps[StyledSystemLength]
     with BorderBottomColorProps
     with BorderLeftProps[StyledSystemLength]
     with BorderLeftColorProps
     with BorderColorProps
     with BorderWidthProps[StyledSystemLength]
     with BorderStyleProps
     with BorderRadiusProps[StyledSystemLength]
     with DisplayProps
     with AlignItemsProps
     with AlignContentProps
     with JustifyContentProps
     with JustifyItemsProps
     with FlexWrapProps
     with FlexBasisProps[StyledSystemLength]
     with FlexDirectionProps
     with FlexProps[StyledSystemLength]
     with JustifySelfProps
     with AlignSelfProps
     with OrderProps
     with GridGapProps[StyledSystemLength]
     with GridColumnGapProps[StyledSystemLength]
     with GridRowGapProps[StyledSystemLength]
     with GridColumnProps
     with GridRowProps
     with GridAutoFlowProps
     with GridAutoColumnsProps[StyledSystemLength]
     with GridAutoRowsProps[StyledSystemLength]
     with GridTemplateColumnsProps[StyledSystemLength]
     with GridTemplateRowsProps[StyledSystemLength]
     with GridTemplateAreasProps
     with GridAreaProps
     with WidthProps[StyledSystemLength]
     with HeightProps[StyledSystemLength]
     with MaxWidthProps[StyledSystemLength]
     with MaxHeightProps[StyledSystemLength]
     with MinWidthProps[StyledSystemLength]
     with MinHeightProps[StyledSystemLength]
     with SizeProps[StyledSystemLength]
     with VerticalAlignProps[StyledSystemLength]
     with PositionProps
     with ZIndexProps
     with TopProps[StyledSystemLength]
     with RightProps[StyledSystemLength]
     with BottomProps[StyledSystemLength]
     with LeftProps[StyledSystemLength]
     with BoxShadowProps
     with TextShadowProps
     with MarginProps[StyledSystemLength]
     with MarginTopProps[StyledSystemLength]
     with MarginRightProps[StyledSystemLength]
     with MarginBottomProps[StyledSystemLength]
     with MarginLeftProps[StyledSystemLength]
     with MarginXProps[StyledSystemLength]
     with MarginYProps[StyledSystemLength]
     with PaddingProps[StyledSystemLength]
     with PaddingTopProps[StyledSystemLength]
     with PaddingRightProps[StyledSystemLength]
     with PaddingBottomProps[StyledSystemLength]
     with PaddingLeftProps[StyledSystemLength]
     with PaddingXProps[StyledSystemLength]
     with PaddingYProps[StyledSystemLength]
     with FontFamilyProps
     with FontSizeProps[StyledSystemLength]
     with LineHeightProps[StyledSystemLength]
     with FontWeightProps
     with TextAlignProps
     with LetterSpacingProps[StyledSystemLength]
     with ColorProps
     with TextTransformProps
     with ColProps
     with RowProps

object SystemProps {
  @scala.inline
  def apply(
    alignContent: ResponsiveValue[AlignContentProperty] = null,
    alignItems: ResponsiveValue[AlignItemsProperty] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty] = null,
    background: ResponsiveValue[BackgroundProperty[String]] = null,
    backgroundColor: ResponsiveValue[BackgroundProperty[StyledSystemLength]] = null,
    backgroundImage: ResponsiveValue[BackgroundImageProperty] = null,
    backgroundPosition: ResponsiveValue[BackgroundPositionProperty[StyledSystemLength]] = null,
    backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty] = null,
    backgroundSize: ResponsiveValue[BackgroundSizeProperty[StyledSystemLength]] = null,
    border: ResponsiveValue[BorderProperty[StyledSystemLength]] = null,
    borderBottom: ResponsiveValue[BorderBottomProperty[StyledSystemLength]] = null,
    borderBottomColor: ResponsiveValue[BorderColorProperty] = null,
    borderColor: ResponsiveValue[BorderColorProperty] = null,
    borderLeft: ResponsiveValue[BorderLeftProperty[StyledSystemLength]] = null,
    borderLeftColor: ResponsiveValue[BorderColorProperty] = null,
    borderRadius: ResponsiveValue[BorderRadiusProperty[StyledSystemLength]] = null,
    borderRight: ResponsiveValue[BorderRightProperty[StyledSystemLength]] = null,
    borderRightColor: ResponsiveValue[BorderColorProperty] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty | Double] = null,
    borderTop: ResponsiveValue[BorderTopProperty[StyledSystemLength]] = null,
    borderTopColor: ResponsiveValue[BorderColorProperty] = null,
    borderWidth: ResponsiveValue[BorderWidthProperty[StyledSystemLength]] = null,
    bottom: ResponsiveValue[BottomProperty[StyledSystemLength]] = null,
    boxShadow: ResponsiveValue[BoxShadowProperty | Double] = null,
    col: ResponsiveValue[String | Double | Boolean] = null,
    color: js.Any = null,
    display: ResponsiveValue[DisplayProperty] = null,
    flex: ResponsiveValue[FlexProperty[StyledSystemLength]] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[StyledSystemLength]] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty] = null,
    fontFamily: ResponsiveValue[FontFamilyProperty | Double] = null,
    fontSize: ResponsiveValue[FontSizeProperty[StyledSystemLength]] = null,
    fontWeight: ResponsiveValue[FontWeightProperty | AliasKey] = null,
    gridArea: ResponsiveValue[String] = null,
    gridAutoColumns: ResponsiveValue[GridAutoColumnsProperty[StyledSystemLength]] = null,
    gridAutoFlow: ResponsiveValue[GridAutoFlowProperty] = null,
    gridAutoRows: ResponsiveValue[GridAutoRowsProperty[StyledSystemLength]] = null,
    gridColumn: ResponsiveValue[GridColumnProperty] = null,
    gridColumnGap: ResponsiveValue[GridColumnGapProperty[StyledSystemLength]] = null,
    gridGap: ResponsiveValue[GridGapProperty[StyledSystemLength]] = null,
    gridRow: ResponsiveValue[GridRowProperty] = null,
    gridRowGap: ResponsiveValue[GridRowGapProperty[StyledSystemLength]] = null,
    gridTemplateAreas: ResponsiveValue[GridTemplateAreasProperty] = null,
    gridTemplateColumns: ResponsiveValue[GridTemplateColumnsProperty[StyledSystemLength]] = null,
    gridTemplateRows: ResponsiveValue[GridTemplateRowsProperty[StyledSystemLength]] = null,
    height: ResponsiveValue[HeightProperty[StyledSystemLength]] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty] = null,
    left: ResponsiveValue[LeftProperty[StyledSystemLength]] = null,
    letterSpacing: ResponsiveValue[LetterSpacingProperty[StyledSystemLength]] = null,
    lineHeight: ResponsiveValue[LineHeightProperty[StyledSystemLength]] = null,
    m: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    margin: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    marginBottom: ResponsiveValue[MarginBottomProperty[StyledSystemLength]] = null,
    marginLeft: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    marginRight: ResponsiveValue[MarginRightProperty[StyledSystemLength]] = null,
    marginTop: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[StyledSystemLength]] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[StyledSystemLength]] = null,
    mb: ResponsiveValue[MarginBottomProperty[StyledSystemLength]] = null,
    minHeight: ResponsiveValue[MinHeightProperty[StyledSystemLength]] = null,
    minWidth: ResponsiveValue[MinWidthProperty[StyledSystemLength]] = null,
    ml: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    mr: ResponsiveValue[MarginRightProperty[StyledSystemLength]] = null,
    mt: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    mx: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    my: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    opacity: ResponsiveValue[GlobalsNumber] = null,
    order: ResponsiveValue[GlobalsNumber] = null,
    overflow: ResponsiveValue[OverflowProperty] = null,
    p: ResponsiveValue[PaddingProperty[StyledSystemLength]] = null,
    padding: ResponsiveValue[PaddingProperty[StyledSystemLength]] = null,
    paddingBottom: ResponsiveValue[PaddingBottomProperty[StyledSystemLength]] = null,
    paddingLeft: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    paddingRight: ResponsiveValue[PaddingRightProperty[StyledSystemLength]] = null,
    paddingTop: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[StyledSystemLength]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    position: ResponsiveValue[PositionProperty] = null,
    pr: ResponsiveValue[PaddingRightProperty[StyledSystemLength]] = null,
    pt: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null,
    px: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    py: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null,
    right: ResponsiveValue[RightProperty[StyledSystemLength]] = null,
    row: ResponsiveValue[String | Double | Boolean] = null,
    size: ResponsiveValue[HeightProperty[StyledSystemLength]] = null,
    textAlign: ResponsiveValue[TextAlignProperty] = null,
    textShadow: ResponsiveValue[TextShadowProperty | Double] = null,
    textTransform: ResponsiveValue[TextTransformProperty] = null,
    top: ResponsiveValue[TopProperty[StyledSystemLength]] = null,
    transition: ResponsiveValue[String] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[StyledSystemLength]] = null,
    width: ResponsiveValue[WidthProperty[StyledSystemLength]] = null,
    zIndex: ResponsiveValue[ZIndexProperty | AliasKey] = null
  ): SystemProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemProps]
  }
}

