package typings.victoryGroup

import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object victoryGroupMod {
  
  @JSImport("victory-group/lib/victory-group", "VictoryGroup")
  @js.native
  val VictoryGroup: NamedExoticComponent[VictoryGroupProps] & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryComponentConfiguration<VictoryGroupProps> */ Any) = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryGroupProps extends StObject {
    
    var categories: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var colorScale: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var domainPadding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPaddingPropType */ Any
      ] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryGroupTTargetType, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
  }
  object VictoryGroupProps {
    
    inline def apply(): VictoryGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryGroupProps]
    }
    
    extension [Self <: VictoryGroupProps](x: Self) {
      
      inline def setCategories(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorScale(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPaddingPropType */ Any
      ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
      
      inline def setDomainPaddingUndefined: Self = StObject.set(x, "domainPadding", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryGroupTTargetType, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryGroupTTargetType, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryGroup.victoryGroupStrings.data
    - typings.victoryGroup.victoryGroupStrings.labels
    - typings.victoryGroup.victoryGroupStrings.parent
  */
  trait VictoryGroupTTargetType extends StObject
  object VictoryGroupTTargetType {
    
    inline def data: typings.victoryGroup.victoryGroupStrings.data = "data".asInstanceOf[typings.victoryGroup.victoryGroupStrings.data]
    
    inline def labels: typings.victoryGroup.victoryGroupStrings.labels = "labels".asInstanceOf[typings.victoryGroup.victoryGroupStrings.labels]
    
    inline def parent: typings.victoryGroup.victoryGroupStrings.parent = "parent".asInstanceOf[typings.victoryGroup.victoryGroupStrings.parent]
  }
}
