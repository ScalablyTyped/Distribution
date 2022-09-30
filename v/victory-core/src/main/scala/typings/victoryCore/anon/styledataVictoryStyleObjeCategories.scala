package typings.victoryCore.anon

import typings.react.mod.ReactElement
import typings.victoryCore.propTypesMod.AnimatePropTypeInterface
import typings.victoryCore.propTypesMod.CategoryPropType
import typings.victoryCore.propTypesMod.ColorScalePropType
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.DataGetterPropType
import typings.victoryCore.propTypesMod.DomainPaddingPropType
import typings.victoryCore.propTypesMod.DomainPropType
import typings.victoryCore.propTypesMod.EventCallbackInterface
import typings.victoryCore.propTypesMod.RangePropType
import typings.victoryCore.propTypesMod.ScalePropType
import typings.victoryCore.propTypesMod.SortOrderPropType
import typings.victoryCore.propTypesMod.StringOrNumberOrList
import typings.victoryCore.victoryLabelMod.OriginType
import typings.victoryCore.victoryThemeTypesMod.PaddingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  style :{  data :victory-core.victory-core/lib/victory-theme/types.VictoryStyleObject | undefined,   labels :victory-core.victory-core/lib/victory-theme/types.VictoryLabelStyleObject | std.Array<victory-core.victory-core/lib/victory-theme/types.VictoryLabelStyleObject> | undefined,   flyout :victory-core.victory-core/lib/victory-theme/types.VictoryStyleObject | undefined} | undefined} & victory-core.victory-core/lib/victory-util/common-props.VictoryCommonThemeProps & victory-core.victory-core/lib/victory-util/common-props.VictoryDatableProps */
trait styledataVictoryStyleObjeCategories extends StObject {
  
  var animate: js.UndefOr[Boolean | AnimatePropTypeInterface] = js.undefined
  
  var categories: js.UndefOr[CategoryPropType] = js.undefined
  
  var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
  
  var containerComponent: js.UndefOr[ReactElement] = js.undefined
  
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var dataComponent: js.UndefOr[ReactElement] = js.undefined
  
  var domain: js.UndefOr[DomainPropType] = js.undefined
  
  var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
  
  var externalEventMutations: js.UndefOr[
    js.Array[EventCallbackInterface[String | js.Array[String], StringOrNumberOrList]]
  ] = js.undefined
  
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  var maxDomain: js.UndefOr[Double | XY] = js.undefined
  
  var minDomain: js.UndefOr[Double | XY] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[OriginType] = js.undefined
  
  var padding: js.UndefOr[PaddingProps] = js.undefined
  
  var polar: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[RangePropType] = js.undefined
  
  var samples: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[ScalePropType | D3Scale[Any] | Y] = js.undefined
  
  var sharedEvents: js.UndefOr[Events] = js.undefined
  
  var singleQuadrantDomainPadding: js.UndefOr[Boolean | `0`] = js.undefined
  
  var sortKey: js.UndefOr[DataGetterPropType] = js.undefined
  
  var sortOrder: js.UndefOr[SortOrderPropType] = js.undefined
  
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Flyout] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[DataGetterPropType] = js.undefined
  
  var y: js.UndefOr[DataGetterPropType] = js.undefined
  
  var y0: js.UndefOr[DataGetterPropType] = js.undefined
}
object styledataVictoryStyleObjeCategories {
  
  inline def apply(): styledataVictoryStyleObjeCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styledataVictoryStyleObjeCategories]
  }
  
  extension [Self <: styledataVictoryStyleObjeCategories](x: Self) {
    
    inline def setAnimate(value: Boolean | AnimatePropTypeInterface): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setCategories(value: CategoryPropType): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setColorScale(value: ColorScalePropType): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value*))
    
    inline def setContainerComponent(value: ReactElement): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataComponent(value: ReactElement): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
    
    inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDomain(value: DomainPropType): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainPadding(value: DomainPaddingPropType): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExternalEventMutations(value: js.Array[EventCallbackInterface[String | js.Array[String], StringOrNumberOrList]]): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
    
    inline def setExternalEventMutationsVarargs(value: (EventCallbackInterface[String | js.Array[String], StringOrNumberOrList])*): Self = StObject.set(x, "externalEventMutations", js.Array(value*))
    
    inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setMaxDomain(value: Double | XY): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
    
    inline def setMinDomain(value: Double | XY): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPadding(value: PaddingProps): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRange(value: RangePropType): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setScale(value: ScalePropType | D3Scale[Any] | Y): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSharedEvents(value: Events): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
    
    inline def setSingleQuadrantDomainPadding(value: Boolean | `0`): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
    
    inline def setSortKey(value: DataGetterPropType): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "sortKey", js.Any.fromFunction1(value))
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    inline def setSortKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "sortKey", js.Array(value*))
    
    inline def setSortOrder(value: SortOrderPropType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setStyle(value: Flyout): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: DataGetterPropType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: (Double | String)*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: DataGetterPropType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: DataGetterPropType): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Function1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "y0", js.Any.fromFunction1(value))
    
    inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    inline def setY0Varargs(value: (Double | String)*): Self = StObject.set(x, "y0", js.Array(value*))
    
    inline def setYFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: (Double | String)*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
