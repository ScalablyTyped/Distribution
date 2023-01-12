package typings.victoryStack

import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.victoryStack.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryStackMod {
  
  @JSImport("victory-stack/lib/victory-stack", "VictoryStack")
  @js.native
  val VictoryStack: NamedExoticComponent[VictoryStackProps] & Type & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryComponentConfiguration<VictoryStackProps> */ Any) = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryStackProps extends StObject {
    
    var bins: js.UndefOr[Double | (js.Array[js.Date | Double])] = js.undefined
    
    var categories: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var colorScale: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryStackTTargetType, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var fillInMissingData: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
    
    var xOffset: js.UndefOr[Double] = js.undefined
  }
  object VictoryStackProps {
    
    inline def apply(): VictoryStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryStackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryStackProps] (val x: Self) extends AnyVal {
      
      inline def setBins(value: Double | (js.Array[js.Date | Double])): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      inline def setBinsVarargs(value: (js.Date | Double)*): Self = StObject.set(x, "bins", js.Array(value*))
      
      inline def setCategories(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColorScale(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryStackTTargetType, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryStackTTargetType, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setFillInMissingData(value: Boolean): Self = StObject.set(x, "fillInMissingData", value.asInstanceOf[js.Any])
      
      inline def setFillInMissingDataUndefined: Self = StObject.set(x, "fillInMissingData", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryStack.victoryStackStrings.data
    - typings.victoryStack.victoryStackStrings.labels
    - typings.victoryStack.victoryStackStrings.parent
  */
  trait VictoryStackTTargetType extends StObject
  object VictoryStackTTargetType {
    
    inline def data: typings.victoryStack.victoryStackStrings.data = "data".asInstanceOf[typings.victoryStack.victoryStackStrings.data]
    
    inline def labels: typings.victoryStack.victoryStackStrings.labels = "labels".asInstanceOf[typings.victoryStack.victoryStackStrings.labels]
    
    inline def parent: typings.victoryStack.victoryStackStrings.parent = "parent".asInstanceOf[typings.victoryStack.victoryStackStrings.parent]
  }
}
