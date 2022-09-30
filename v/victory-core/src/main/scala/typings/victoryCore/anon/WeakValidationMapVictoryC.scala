package typings.victoryCore.anon

import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.victoryCore.propTypesMod.AnimatePropTypeInterface
import typings.victoryCore.propTypesMod.ColorScalePropType
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.propTypesMod.DomainPaddingPropType
import typings.victoryCore.propTypesMod.EventCallbackInterface
import typings.victoryCore.propTypesMod.RangePropType
import typings.victoryCore.propTypesMod.ScalePropType
import typings.victoryCore.propTypesMod.StringOrNumberOrList
import typings.victoryCore.victoryLabelMod.OriginType
import typings.victoryCore.victoryThemeTypesMod.PaddingProps
import typings.victoryCore.victoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<victory-core.victory-core/lib/victory-util/common-props.VictoryCommonProps> */
trait WeakValidationMapVictoryC extends StObject {
  
  var animate: js.UndefOr[Validator[js.UndefOr[AnimatePropTypeInterface | Boolean | Null]]] = js.undefined
  
  var colorScale: js.UndefOr[Validator[js.UndefOr[ColorScalePropType | Null]]] = js.undefined
  
  var containerComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var domainPadding: js.UndefOr[Validator[js.UndefOr[DomainPaddingPropType | Null]]] = js.undefined
  
  var externalEventMutations: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Array[EventCallbackInterface[js.Array[String] | String, StringOrNumberOrList]]) | Null
      ]
    ]
  ] = js.undefined
  
  var groupComponent: js.UndefOr[Validator[js.UndefOr[Null | ReactElement]]] = js.undefined
  
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var horizontal: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var maxDomain: js.UndefOr[Validator[js.UndefOr[Double | Null | XY]]] = js.undefined
  
  var minDomain: js.UndefOr[Validator[js.UndefOr[Double | Null | XY]]] = js.undefined
  
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var origin: js.UndefOr[Validator[js.UndefOr[Null | OriginType]]] = js.undefined
  
  var padding: js.UndefOr[Validator[js.UndefOr[Null | PaddingProps]]] = js.undefined
  
  var polar: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var range: js.UndefOr[Validator[js.UndefOr[Null | RangePropType]]] = js.undefined
  
  var scale: js.UndefOr[Validator[js.UndefOr[D3Scale[Any] | Null | ScalePropType | Y]]] = js.undefined
  
  var sharedEvents: js.UndefOr[Validator[js.UndefOr[Events | Null]]] = js.undefined
  
  var singleQuadrantDomainPadding: js.UndefOr[Validator[js.UndefOr[`0` | Boolean | Null]]] = js.undefined
  
  var standalone: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var theme: js.UndefOr[Validator[js.UndefOr[Null | VictoryThemeDefinition]]] = js.undefined
  
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}
object WeakValidationMapVictoryC {
  
  inline def apply(): WeakValidationMapVictoryC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapVictoryC]
  }
  
  extension [Self <: WeakValidationMapVictoryC](x: Self) {
    
    inline def setAnimate(value: Validator[js.UndefOr[AnimatePropTypeInterface | Boolean | Null]]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setColorScale(value: Validator[js.UndefOr[ColorScalePropType | Null]]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    inline def setContainerComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponentUndefined: Self = StObject.set(x, "containerComponent", js.undefined)
    
    inline def setDomainPadding(value: Validator[js.UndefOr[DomainPaddingPropType | Null]]): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
    
    inline def setExternalEventMutations(
      value: Validator[
          js.UndefOr[
            (js.Array[EventCallbackInterface[js.Array[String] | String, StringOrNumberOrList]]) | Null
          ]
        ]
    ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
    
    inline def setGroupComponent(value: Validator[js.UndefOr[Null | ReactElement]]): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setHeight(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setMaxDomain(value: Validator[js.UndefOr[Double | Null | XY]]): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMaxDomainUndefined: Self = StObject.set(x, "maxDomain", js.undefined)
    
    inline def setMinDomain(value: Validator[js.UndefOr[Double | Null | XY]]): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomainUndefined: Self = StObject.set(x, "minDomain", js.undefined)
    
    inline def setName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: Validator[js.UndefOr[Null | OriginType]]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPadding(value: Validator[js.UndefOr[Null | PaddingProps]]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPolar(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRange(value: Validator[js.UndefOr[Null | RangePropType]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setScale(value: Validator[js.UndefOr[D3Scale[Any] | Null | ScalePropType | Y]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSharedEvents(value: Validator[js.UndefOr[Events | Null]]): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSharedEventsUndefined: Self = StObject.set(x, "sharedEvents", js.undefined)
    
    inline def setSingleQuadrantDomainPadding(value: Validator[js.UndefOr[`0` | Boolean | Null]]): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPaddingUndefined: Self = StObject.set(x, "singleQuadrantDomainPadding", js.undefined)
    
    inline def setStandalone(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[Null | VictoryThemeDefinition]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setWidth(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
