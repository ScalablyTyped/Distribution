package typings.victoryAxis.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisComponent extends StObject {
  
  var axisComponent: Element
  
  var axisLabelComponent: Element
  
  var containerComponent: Element
  
  var fixLabelOverlap: Boolean
  
  var gridComponent: Element
  
  var groupComponent: Element
  
  var standalone: Boolean
  
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  
  var tickComponent: Element
  
  var tickLabelComponent: Element
}
object AxisComponent {
  
  inline def apply(
    axisComponent: Element,
    axisLabelComponent: Element,
    containerComponent: Element,
    fixLabelOverlap: Boolean,
    gridComponent: Element,
    groupComponent: Element,
    standalone: Boolean,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any,
    tickComponent: Element,
    tickLabelComponent: Element
  ): AxisComponent = {
    val __obj = js.Dynamic.literal(axisComponent = axisComponent.asInstanceOf[js.Any], axisLabelComponent = axisLabelComponent.asInstanceOf[js.Any], containerComponent = containerComponent.asInstanceOf[js.Any], fixLabelOverlap = fixLabelOverlap.asInstanceOf[js.Any], gridComponent = gridComponent.asInstanceOf[js.Any], groupComponent = groupComponent.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tickComponent = tickComponent.asInstanceOf[js.Any], tickLabelComponent = tickLabelComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisComponent] (val x: Self) extends AnyVal {
    
    inline def setAxisComponent(value: Element): Self = StObject.set(x, "axisComponent", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelComponent(value: Element): Self = StObject.set(x, "axisLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setContainerComponent(value: Element): Self = StObject.set(x, "containerComponent", value.asInstanceOf[js.Any])
    
    inline def setFixLabelOverlap(value: Boolean): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
    
    inline def setGridComponent(value: Element): Self = StObject.set(x, "gridComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: Element): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTickComponent(value: Element): Self = StObject.set(x, "tickComponent", value.asInstanceOf[js.Any])
    
    inline def setTickLabelComponent(value: Element): Self = StObject.set(x, "tickLabelComponent", value.asInstanceOf[js.Any])
  }
}
