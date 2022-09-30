package typings.victoryAxis.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import typings.react.mod.ReactElement
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: js.UndefOr[
    Validator[
      js.UndefOr[
        Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var axisComponent: Requireable[ReactElementLike]
  
  var axisLabelComponent: Requireable[ReactElementLike]
  
  var axisValue: Requireable[String | Double | js.Object]
  
  var categories: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]]
  
  var colorScale: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ColorScalePropType */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var containerComponent: js.UndefOr[Validator[js.UndefOr[ReactElement | Null]]] = js.undefined
  
  var crossAxis: Requireable[Boolean]
  
  var dependentAxis: Requireable[Boolean]
  
  var domainPadding: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var events: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]]
  
  var externalEventMutations: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
        ]) | Null
      ]
    ]
  ] = js.undefined
  
  var fixLabelOverlap: Requireable[Boolean]
  
  var gridComponent: Requireable[ReactElementLike]
  
  var groupComponent: Requireable[ReactElementLike]
  
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var horizontal: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var invertAxis: Requireable[Boolean]
  
  var label: Requireable[Any]
  
  var maxDomain: js.UndefOr[Validator[js.UndefOr[Double | `0` | Null]]] = js.undefined
  
  var minDomain: js.UndefOr[Validator[js.UndefOr[Double | `0` | Null]]] = js.undefined
  
  var name: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.undefined
  
  var offsetX: Requireable[Double]
  
  var offsetY: Requireable[Double]
  
  var orientation: Requireable[String]
  
  var origin: Requireable[InferProps[XY]]
  
  var padding: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.PaddingProps */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var range: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.RangeTuple> */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var scale: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | `1` | Null
      ]
    ]
  ] = js.undefined
  
  var sharedEvents: js.UndefOr[Validator[js.UndefOr[Events | Null]]] = js.undefined
  
  var singleQuadrantDomainPadding: js.UndefOr[Validator[js.UndefOr[Boolean | `2` | Null]]] = js.undefined
  
  var standalone: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var stringMap: Requireable[js.Object]
  
  var style: Requireable[InferProps[AxisLabel]]
  
  var theme: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
      ]
    ]
  ] = js.undefined
  
  var tickComponent: Requireable[ReactElementLike]
  
  var tickCount: Requireable[js.UndefOr[Double | Null]]
  
  var tickFormat: Requireable[(js.Function1[/* repeated */ Any, Any]) | js.Array[Any]]
  
  var tickLabelComponent: Requireable[ReactElementLike]
  
  var tickValues: Requireable[js.UndefOr[js.Array[Any]]]
  
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}
object Animate {
  
  inline def apply(
    axisComponent: Requireable[ReactElementLike],
    axisLabelComponent: Requireable[ReactElementLike],
    axisValue: Requireable[String | Double | js.Object],
    categories: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]],
    crossAxis: Requireable[Boolean],
    dependentAxis: Requireable[Boolean],
    events: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]],
    fixLabelOverlap: Requireable[Boolean],
    gridComponent: Requireable[ReactElementLike],
    groupComponent: Requireable[ReactElementLike],
    invertAxis: Requireable[Boolean],
    label: Requireable[Any],
    offsetX: Requireable[Double],
    offsetY: Requireable[Double],
    orientation: Requireable[String],
    origin: Requireable[InferProps[XY]],
    stringMap: Requireable[js.Object],
    style: Requireable[InferProps[AxisLabel]],
    tickComponent: Requireable[ReactElementLike],
    tickCount: Requireable[js.UndefOr[Double | Null]],
    tickFormat: Requireable[(js.Function1[/* repeated */ Any, Any]) | js.Array[Any]],
    tickLabelComponent: Requireable[ReactElementLike],
    tickValues: Requireable[js.UndefOr[js.Array[Any]]]
  ): Animate = {
    val __obj = js.Dynamic.literal(axisComponent = axisComponent.asInstanceOf[js.Any], axisLabelComponent = axisLabelComponent.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], crossAxis = crossAxis.asInstanceOf[js.Any], dependentAxis = dependentAxis.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], fixLabelOverlap = fixLabelOverlap.asInstanceOf[js.Any], gridComponent = gridComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], invertAxis = invertAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], stringMap = stringMap.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tickComponent = tickComponent.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], tickFormat = tickFormat.asInstanceOf[js.Any], tickLabelComponent = tickLabelComponent.asInstanceOf[js.Any], tickValues = tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
  
  extension [Self <: Animate](x: Self) {
    
    inline def setAnimate(
      value: Validator[
          js.UndefOr[
            Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAxisComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "axisComponent", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "axisLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setAxisValue(value: Requireable[String | Double | js.Object]): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Requireable[(js.Array[js.UndefOr[String | Null]]) | InferProps[Y]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setColorScale(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ColorScalePropType */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setContainerComponent(value: Validator[js.UndefOr[ReactElement | Null]]): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
    
    inline def setCrossAxis(value: Requireable[Boolean]): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setDependentAxis(value: Requireable[Boolean]): Self = StObject.set(x, "dependentAxis", value.asInstanceOf[js.Any])
    
    inline def setDomainPadding(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.PaddingType> */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    inline def setEvents(value: Requireable[js.Array[js.UndefOr[InferProps[EventHandlers] | Null]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutations(
      value: Validator[
          js.UndefOr[
            (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
    
    inline def setFixLabelOverlap(value: Requireable[Boolean]): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
    
    inline def setGridComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "gridComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInvertAxis(value: Requireable[Boolean]): Self = StObject.set(x, "invertAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[Any]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxDomain(value: Validator[js.UndefOr[Double | `0` | Null]]): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
    
    inline def setMinDomain(value: Validator[js.UndefOr[Double | `0` | Null]]): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
    
    inline def setName(value: Validator[js.UndefOr[String | Null]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffsetX(value: Requireable[Double]): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Requireable[Double]): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Requireable[String]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Requireable[InferProps[XY]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPadding(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.PaddingProps */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRange(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.ForAxes<imported_victory-core.RangeTuple> */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setScale(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | `1` | Null
          ]
        ]
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSharedEvents(value: Validator[js.UndefOr[Events | Null]]): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
    
    inline def setSingleQuadrantDomainPadding(value: Validator[js.UndefOr[Boolean | `2` | Null]]): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
    
    inline def setStandalone(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setStringMap(value: Requireable[js.Object]): Self = StObject.set(x, "stringMap", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[InferProps[AxisLabel]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTheme(
      value: Validator[
          js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any) | Null
          ]
        ]
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTickComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "tickComponent", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Requireable[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickFormat(value: Requireable[(js.Function1[/* repeated */ Any, Any]) | js.Array[Any]]): Self = StObject.set(x, "tickFormat", value.asInstanceOf[js.Any])
    
    inline def setTickLabelComponent(value: Requireable[ReactElementLike]): Self = StObject.set(x, "tickLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setTickValues(value: Requireable[js.UndefOr[js.Array[Any]]]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
