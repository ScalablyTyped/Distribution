package typings.victoryCore

import typings.react.mod.ReactElement
import typings.victoryCore.anon.Events
import typings.victoryCore.anon.WeakValidationMapVictoryC
import typings.victoryCore.anon.WeakValidationMapVictoryCActive
import typings.victoryCore.anon.WeakValidationMapVictoryD
import typings.victoryCore.anon.`0`
import typings.victoryCore.anon.`5`
import typings.victoryCore.anon.`6`
import typings.victoryCore.libTypesCallbacksMod.CallbackArgs
import typings.victoryCore.libTypesCallbacksMod.NumberOrCallback
import typings.victoryCore.libTypesCallbacksMod.StringOrCallback
import typings.victoryCore.libTypesPropTypesMod.AnimatePropTypeInterface
import typings.victoryCore.libTypesPropTypesMod.CategoryPropType
import typings.victoryCore.libTypesPropTypesMod.ColorScalePropType
import typings.victoryCore.libTypesPropTypesMod.D3Scale
import typings.victoryCore.libTypesPropTypesMod.DataGetterPropType
import typings.victoryCore.libTypesPropTypesMod.DomainPaddingPropType
import typings.victoryCore.libTypesPropTypesMod.DomainPropType
import typings.victoryCore.libTypesPropTypesMod.EventCallbackInterface
import typings.victoryCore.libTypesPropTypesMod.RangePropType
import typings.victoryCore.libTypesPropTypesMod.ScalePropType
import typings.victoryCore.libTypesPropTypesMod.SortOrderPropType
import typings.victoryCore.libTypesPropTypesMod.StringOrNumberOrList
import typings.victoryCore.libVictoryLabelVictoryLabelMod.OriginType
import typings.victoryCore.libVictoryThemeTypesMod.PaddingProps
import typings.victoryCore.libVictoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilCommonPropsMod {
  
  object CommonProps {
    
    @JSImport("victory-core/lib/victory-util/common-props", "CommonProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-util/common-props", "CommonProps.baseProps")
    @js.native
    def baseProps: WeakValidationMapVictoryC = js.native
    inline def baseProps_=(x: WeakValidationMapVictoryC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-util/common-props", "CommonProps.dataProps")
    @js.native
    def dataProps: WeakValidationMapVictoryD = js.native
    inline def dataProps_=(x: WeakValidationMapVictoryD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-util/common-props", "CommonProps.primitiveProps")
    @js.native
    def primitiveProps: WeakValidationMapVictoryCActive = js.native
    inline def primitiveProps_=(x: WeakValidationMapVictoryCActive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitiveProps")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryCommonPrimitiveProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabel: js.UndefOr[StringOrCallback] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var desc: js.UndefOr[String | js.Function] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[js.Object] = js.undefined
    
    var id: js.UndefOr[Double | String | js.Function] = js.undefined
    
    var index: js.UndefOr[Double | String] = js.undefined
    
    var origin: js.UndefOr[OriginType] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Any] = js.undefined
    
    var shapeRendering: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var tabIndex: js.UndefOr[NumberOrCallback] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
  }
  object VictoryCommonPrimitiveProps {
    
    inline def apply(): VictoryCommonPrimitiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCommonPrimitiveProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryCommonPrimitiveProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaLabel(value: StringOrCallback): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelFunction1(value: /* args */ CallbackArgs => String): Self = StObject.set(x, "ariaLabel", js.Any.fromFunction1(value))
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDesc(value: String | js.Function): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setId(value: Double | String | js.Function): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: NumberOrCallback): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "tabIndex", js.Any.fromFunction1(value))
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait VictoryCommonProps
    extends StObject
       with VictoryCommonThemeProps {
    
    var theme: js.UndefOr[VictoryThemeDefinition] = js.undefined
  }
  object VictoryCommonProps {
    
    inline def apply(): VictoryCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryCommonProps] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: VictoryThemeDefinition): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait VictoryCommonThemeProps extends StObject {
    
    var animate: js.UndefOr[Boolean | AnimatePropTypeInterface] = js.undefined
    
    var colorScale: js.UndefOr[ColorScalePropType] = js.undefined
    
    var containerComponent: js.UndefOr[ReactElement] = js.undefined
    
    var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
    
    var externalEventMutations: js.UndefOr[
        js.Array[EventCallbackInterface[String | js.Array[String], StringOrNumberOrList]]
      ] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var maxDomain: js.UndefOr[Double | `5`] = js.undefined
    
    var minDomain: js.UndefOr[Double | `5`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[OriginType] = js.undefined
    
    var padding: js.UndefOr[PaddingProps] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[RangePropType] = js.undefined
    
    var scale: js.UndefOr[ScalePropType | D3Scale[Any] | `0`] = js.undefined
    
    var sharedEvents: js.UndefOr[Events] = js.undefined
    
    var singleQuadrantDomainPadding: js.UndefOr[Boolean | `6`] = js.undefined
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VictoryCommonThemeProps {
    
    inline def apply(): VictoryCommonThemeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryCommonThemeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryCommonThemeProps] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean | AnimatePropTypeInterface): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
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
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setMaxDomain(value: Double | `5`): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
      
      inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
      
      inline def setMinDomain(value: Double | `5`): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
      
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
      
      inline def setScale(value: ScalePropType | D3Scale[Any] | `0`): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSharedEvents(value: Events): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
      
      inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
      
      inline def setSingleQuadrantDomainPadding(value: Boolean | `6`): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
      
      inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait VictoryDatableProps extends StObject {
    
    var categories: js.UndefOr[CategoryPropType] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var dataComponent: js.UndefOr[ReactElement] = js.undefined
    
    var domain: js.UndefOr[DomainPropType] = js.undefined
    
    var domainPadding: js.UndefOr[DomainPaddingPropType] = js.undefined
    
    var samples: js.UndefOr[Double] = js.undefined
    
    var sortKey: js.UndefOr[DataGetterPropType] = js.undefined
    
    var sortOrder: js.UndefOr[SortOrderPropType] = js.undefined
    
    var x: js.UndefOr[DataGetterPropType] = js.undefined
    
    var y: js.UndefOr[DataGetterPropType] = js.undefined
    
    var y0: js.UndefOr[DataGetterPropType] = js.undefined
  }
  object VictoryDatableProps {
    
    inline def apply(): VictoryDatableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryDatableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryDatableProps] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: CategoryPropType): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: ReactElement): Self = StObject.set(x, "dataComponent", value.asInstanceOf[js.Any])
      
      inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDomain(value: DomainPropType): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainPadding(value: DomainPaddingPropType): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
      
      inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setSortKey(value: DataGetterPropType): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "sortKey", js.Any.fromFunction1(value))
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setSortKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "sortKey", js.Array(value*))
      
      inline def setSortOrder(value: SortOrderPropType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
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
}
