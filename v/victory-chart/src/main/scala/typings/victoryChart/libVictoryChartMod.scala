package typings.victoryChart

import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.victoryChart.anon.Pickanyparentbackgroundan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryChartMod {
  
  @JSImport("victory-chart/lib/victory-chart", "VictoryChart")
  @js.native
  val VictoryChart: NamedExoticComponent[VictoryChartProps] = js.native
  
  trait AxesType extends StObject {
    
    var dependent: js.UndefOr[ReactElement | Null] = js.undefined
    
    var independent: js.UndefOr[ReactElement | Null] = js.undefined
  }
  object AxesType {
    
    inline def apply(): AxesType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesType]
    }
    
    extension [Self <: AxesType](x: Self) {
      
      inline def setDependent(value: ReactElement): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
      
      inline def setDependentNull: Self = StObject.set(x, "dependent", null)
      
      inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
      
      inline def setIndependent(value: ReactElement): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
      
      inline def setIndependentNull: Self = StObject.set(x, "independent", null)
      
      inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any */ trait VictoryChartProps extends StObject {
    
    var backgroundComponent: js.UndefOr[ReactElement] = js.undefined
    
    var categories: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var defaultAxes: js.UndefOr[AxesType] = js.undefined
    
    var defaultPolarAxes: js.UndefOr[AxesType] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var endAngle: js.UndefOr[Double] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, Array<string> | Array<number> | string | number> */ Any
        ]
      ] = js.undefined
    
    var innerRadius: js.UndefOr[Double] = js.undefined
    
    var prependDefaultAxes: js.UndefOr[Boolean] = js.undefined
    
    var startAngle: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[Pickanyparentbackgroundan] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object VictoryChartProps {
    
    inline def apply(): VictoryChartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryChartProps]
    }
    
    extension [Self <: VictoryChartProps](x: Self) {
      
      inline def setBackgroundComponent(value: ReactElement): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      inline def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      inline def setCategories(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefaultAxes(value: AxesType): Self = StObject.set(x, "defaultAxes", value.asInstanceOf[js.Any])
      
      inline def setDefaultAxesUndefined: Self = StObject.set(x, "defaultAxes", js.undefined)
      
      inline def setDefaultPolarAxes(value: AxesType): Self = StObject.set(x, "defaultPolarAxes", value.asInstanceOf[js.Any])
      
      inline def setDefaultPolarAxesUndefined: Self = StObject.set(x, "defaultPolarAxes", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, Array<string> | Array<number> | string | number> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, Array<string> | Array<number> | string | number> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setPrependDefaultAxes(value: Boolean): Self = StObject.set(x, "prependDefaultAxes", value.asInstanceOf[js.Any])
      
      inline def setPrependDefaultAxesUndefined: Self = StObject.set(x, "prependDefaultAxes", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStyle(value: Pickanyparentbackgroundan): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
