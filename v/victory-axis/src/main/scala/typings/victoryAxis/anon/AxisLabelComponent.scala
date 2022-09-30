package typings.victoryAxis.anon

import typings.react.mod.ReactElement
import typings.victoryAxis.victoryAxisStrings.blue
import typings.victoryAxis.victoryAxisStrings.bottom
import typings.victoryAxis.victoryAxisStrings.cool
import typings.victoryAxis.victoryAxisStrings.grayscale
import typings.victoryAxis.victoryAxisStrings.green
import typings.victoryAxis.victoryAxisStrings.heatmap
import typings.victoryAxis.victoryAxisStrings.left
import typings.victoryAxis.victoryAxisStrings.linear
import typings.victoryAxis.victoryAxisStrings.log
import typings.victoryAxis.victoryAxisStrings.qualitative
import typings.victoryAxis.victoryAxisStrings.red
import typings.victoryAxis.victoryAxisStrings.right
import typings.victoryAxis.victoryAxisStrings.sqrt
import typings.victoryAxis.victoryAxisStrings.time
import typings.victoryAxis.victoryAxisStrings.top
import typings.victoryAxis.victoryAxisStrings.warm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelComponent extends StObject {
  
  var animate: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any)
  
  var axisComponent: ReactElement
  
  var axisLabelComponent: ReactElement
  
  var axisValue: String | Double | js.Object | js.Date
  
  var colorScale: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue
  
  var containerComponent: ReactElement
  
  var crossAxis: Boolean
  
  var dependentAxis: Boolean
  
  var disableInlineStyles: Boolean
  
  var domain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
  
  var domainPadding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
  
  var events: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
  ]
  
  var externalEventMutations: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
  ]
  
  var fixLabelOverlap: Boolean
  
  var gridComponent: ReactElement
  
  var groupComponent: ReactElement
  
  var height: Double
  
  var horizontal: Boolean
  
  var invertAxis: Boolean
  
  var label: String | (js.Function1[/* data */ Any, String | Double | Null])
  
  var labelComponent: ReactElement
  
  var maxDomain: Double | `0`
  
  var minDomain: Double | `0`
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var orientation: left | bottom | right | top
  
  var origin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any
  
  var padding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any)
  
  var polar: Boolean
  
  var range: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`
  
  var scale: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`
  
  var sharedEvents: Events
  
  var singleQuadrantDomainPadding: Boolean | `2`
  
  var standalone: Boolean
  
  var style: Grid
  
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  
  var tickComponent: ReactElement
  
  var tickCount: Double
  
  var tickFormat: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double])
  
  var tickLabelComponent: ReactElement
  
  var tickValues: js.Array[Any]
  
  var width: Double
}
object AxisLabelComponent {
  
  inline def apply(
    animate: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any),
    axisComponent: ReactElement,
    axisLabelComponent: ReactElement,
    axisValue: String | Double | js.Object | js.Date,
    colorScale: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue,
    containerComponent: ReactElement,
    crossAxis: Boolean,
    dependentAxis: Boolean,
    disableInlineStyles: Boolean,
    domain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`,
    domainPadding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`,
    events: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
    ],
    externalEventMutations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
    ],
    fixLabelOverlap: Boolean,
    gridComponent: ReactElement,
    groupComponent: ReactElement,
    height: Double,
    horizontal: Boolean,
    invertAxis: Boolean,
    label: String | (js.Function1[/* data */ Any, String | Double | Null]),
    labelComponent: ReactElement,
    maxDomain: Double | `0`,
    minDomain: Double | `0`,
    name: String,
    offsetX: Double,
    offsetY: Double,
    orientation: left | bottom | right | top,
    origin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any,
    padding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any),
    polar: Boolean,
    range: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`,
    scale: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`,
    sharedEvents: Events,
    singleQuadrantDomainPadding: Boolean | `2`,
    standalone: Boolean,
    style: Grid,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any,
    tickComponent: ReactElement,
    tickCount: Double,
    tickFormat: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double]),
    tickLabelComponent: ReactElement,
    tickValues: js.Array[Any],
    width: Double
  ): AxisLabelComponent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], axisComponent = axisComponent.asInstanceOf[js.Any], axisLabelComponent = axisLabelComponent.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], containerComponent = containerComponent.asInstanceOf[js.Any], crossAxis = crossAxis.asInstanceOf[js.Any], dependentAxis = dependentAxis.asInstanceOf[js.Any], disableInlineStyles = disableInlineStyles.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], domainPadding = domainPadding.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], externalEventMutations = externalEventMutations.asInstanceOf[js.Any], fixLabelOverlap = fixLabelOverlap.asInstanceOf[js.Any], gridComponent = gridComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], invertAxis = invertAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = labelComponent.asInstanceOf[js.Any], maxDomain = maxDomain.asInstanceOf[js.Any], minDomain = minDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], sharedEvents = sharedEvents.asInstanceOf[js.Any], singleQuadrantDomainPadding = singleQuadrantDomainPadding.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tickComponent = tickComponent.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], tickFormat = tickFormat.asInstanceOf[js.Any], tickLabelComponent = tickLabelComponent.asInstanceOf[js.Any], tickValues = tickValues.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelComponent]
  }
  
  extension [Self <: AxisLabelComponent](x: Self) {
    
    inline def setAnimate(
      value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any)
    ): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAxisComponent(value: ReactElement): Self = StObject.set(x, "axisComponent", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelComponent(value: ReactElement): Self = StObject.set(x, "axisLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setAxisValue(value: String | Double | js.Object | js.Date): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
    
    inline def setColorScale(value: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value*))
    
    inline def setContainerComponent(value: ReactElement): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setDependentAxis(value: Boolean): Self = StObject.set(x, "dependentAxis", value.asInstanceOf[js.Any])
    
    inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDomain(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
    ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainPadding(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
    ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setEvents(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternalEventMutations(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
        ]
    ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any)*
    ): Self = StObject.set(x, "externalEventMutations", js.Array(value*))
    
    inline def setFixLabelOverlap(value: Boolean): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
    
    inline def setGridComponent(value: ReactElement): Self = StObject.set(x, "gridComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setInvertAxis(value: Boolean): Self = StObject.set(x, "invertAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String | (js.Function1[/* data */ Any, String | Double | Null])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelComponent(value: ReactElement): Self = StObject.set(x, "labelComponent", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: /* data */ Any => String | Double | Null): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setMaxDomain(value: Double | `0`): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomain(value: Double | `0`): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: left | bottom | right | top): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrigin(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any
    ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPadding(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any)
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setRange(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`
    ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setScale(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSharedEvents(value: Events): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPadding(value: Boolean | `2`): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Grid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTickComponent(value: ReactElement): Self = StObject.set(x, "tickComponent", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickFormat(
      value: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double])
    ): Self = StObject.set(x, "tickFormat", value.asInstanceOf[js.Any])
    
    inline def setTickFormatFunction3(value: (/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any]) => String | Double): Self = StObject.set(x, "tickFormat", js.Any.fromFunction3(value))
    
    inline def setTickFormatVarargs(value: Any*): Self = StObject.set(x, "tickFormat", js.Array(value*))
    
    inline def setTickLabelComponent(value: ReactElement): Self = StObject.set(x, "tickLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setTickValues(value: js.Array[Any]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesVarargs(value: Any*): Self = StObject.set(x, "tickValues", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
