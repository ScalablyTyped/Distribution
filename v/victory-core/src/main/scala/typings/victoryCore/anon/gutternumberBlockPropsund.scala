package typings.victoryCore.anon

import typings.react.mod.ReactElement
import typings.victoryCore.libTypesPropTypesMod.AnimatePropTypeInterface
import typings.victoryCore.libTypesPropTypesMod.ColorScalePropType
import typings.victoryCore.libTypesPropTypesMod.D3Scale
import typings.victoryCore.libTypesPropTypesMod.DomainPaddingPropType
import typings.victoryCore.libTypesPropTypesMod.EventCallbackInterface
import typings.victoryCore.libTypesPropTypesMod.RangePropType
import typings.victoryCore.libTypesPropTypesMod.ScalePropType
import typings.victoryCore.libTypesPropTypesMod.StringOrNumberOrList
import typings.victoryCore.libVictoryLabelVictoryLabelMod.OriginType
import typings.victoryCore.libVictoryThemeTypesMod.BlockProps
import typings.victoryCore.libVictoryThemeTypesMod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gutter :number | victory-core.victory-core/lib/victory-theme/types.BlockProps | undefined,   rowGutter :number | victory-core.victory-core/lib/victory-theme/types.BlockProps | undefined,   orientation :string | undefined,   titleOrientation :string | undefined,   style :{  data :victory-core.victory-core/lib/victory-theme/types.VictoryStyleObject & {  type :string | undefined} | undefined,   border :victory-core.victory-core/lib/victory-theme/types.VictoryStyleObject | undefined,   labels :victory-core.victory-core/lib/victory-theme/types.VictoryLabelStyleObject | std.Array<victory-core.victory-core/lib/victory-theme/types.VictoryLabelStyleObject> | undefined,   title :victory-core.victory-core/lib/victory-theme/types.VictoryLabelStyleObject | undefined} | undefined,   itemsPerRow :number | undefined,   x :number | undefined,   y :number | undefined,   centerTitle :boolean | undefined,   borderPadding :number | victory-core.victory-core/lib/victory-theme/types.BlockProps | undefined} & victory-core.victory-core/lib/victory-util/common-props.VictoryCommonThemeProps */
trait gutternumberBlockPropsund extends StObject {
  
  var animate: js.UndefOr[Boolean | AnimatePropTypeInterface] = js.undefined
  
  var borderPadding: js.UndefOr[Double | BlockProps] = js.undefined
  
  var centerTitle: js.UndefOr[Boolean] = js.undefined
  
  var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
  
  var containerComponent: js.UndefOr[ReactElement] = js.undefined
  
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
  
  var externalEventMutations: js.UndefOr[
    js.Array[EventCallbackInterface[String | js.Array[String], StringOrNumberOrList]]
  ] = js.undefined
  
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  
  var gutter: js.UndefOr[Double | BlockProps] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var itemsPerRow: js.UndefOr[Double] = js.undefined
  
  var maxDomain: js.UndefOr[Double | `4`] = js.undefined
  
  var minDomain: js.UndefOr[Double | `4`] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[OriginType] = js.undefined
  
  var padding: js.UndefOr[PaddingProps] = js.undefined
  
  var polar: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[RangePropType] = js.undefined
  
  var rowGutter: js.UndefOr[Double | BlockProps] = js.undefined
  
  var scale: js.UndefOr[ScalePropType | D3Scale[Any] | XY] = js.undefined
  
  var sharedEvents: js.UndefOr[Events] = js.undefined
  
  var singleQuadrantDomainPadding: js.UndefOr[Boolean | `5`] = js.undefined
  
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Border] = js.undefined
  
  var titleOrientation: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object gutternumberBlockPropsund {
  
  inline def apply(): gutternumberBlockPropsund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gutternumberBlockPropsund]
  }
  
  extension [Self <: gutternumberBlockPropsund](x: Self) {
    
    inline def setAnimate(value: Boolean | AnimatePropTypeInterface): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBorderPadding(value: Double | BlockProps): Self = StObject.set(x, "borderPadding", value.asInstanceOf[js.Any])
    
    inline def setBorderPaddingUndefined: Self = StObject.set(x, "borderPadding", js.undefined)
    
    inline def setCenterTitle(value: Boolean): Self = StObject.set(x, "centerTitle", value.asInstanceOf[js.Any])
    
    inline def setCenterTitleUndefined: Self = StObject.set(x, "centerTitle", js.undefined)
    
    inline def setColorScale(value: ColorScalePropType): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value*))
    
    inline def setContainerComponent(value: ReactElement): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
    
    inline def setDomainPadding(value: DomainPaddingPropType): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    inline def setExternalEventMutations(value: js.Array[EventCallbackInterface[String | js.Array[String], StringOrNumberOrList]]): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
    
    inline def setExternalEventMutationsVarargs(value: (EventCallbackInterface[String | js.Array[String], StringOrNumberOrList])*): Self = StObject.set(x, "externalEventMutations", js.Array(value*))
    
    inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setGutter(value: Double | BlockProps): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setItemsPerRow(value: Double): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
    
    inline def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
    
    inline def setMaxDomain(value: Double | `4`): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
    
    inline def setMinDomain(value: Double | `4`): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPadding(value: PaddingProps): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRange(value: RangePropType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setRowGutter(value: Double | BlockProps): Self = StObject.set(x, "rowGutter", value.asInstanceOf[js.Any])
    
    inline def setRowGutterUndefined: Self = StObject.set(x, "rowGutter", js.undefined)
    
    inline def setScale(value: ScalePropType | D3Scale[Any] | XY): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSharedEvents(value: Events): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
    
    inline def setSingleQuadrantDomainPadding(value: Boolean | `5`): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setStyle(value: Border): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitleOrientation(value: String): Self = StObject.set(x, "titleOrientation", value.asInstanceOf[js.Any])
    
    inline def setTitleOrientationUndefined: Self = StObject.set(x, "titleOrientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
