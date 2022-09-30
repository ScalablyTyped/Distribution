package typings.victoryAxis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grid extends StObject {
  
  var axis: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
  ] = js.undefined
  
  var axisLabel: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any
    ])
  ] = js.undefined
  
  var grid: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
  ] = js.undefined
  
  var parent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
  ] = js.undefined
  
  var tickLabels: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any
    ])
  ] = js.undefined
  
  var ticks: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryTickStyleObject */ Any
  ] = js.undefined
}
object Grid {
  
  inline def apply(): Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grid]
  }
  
  extension [Self <: Grid](x: Self) {
    
    inline def setAxis(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
    ): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisLabel(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any
        ])
    ): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelUndefined: Self = StObject.set(x, "axisLabel", js.undefined)
    
    inline def setAxisLabelVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any)*
    ): Self = StObject.set(x, "axisLabel", js.Array(value*))
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setGrid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
    ): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setParent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryStyleObject */ Any
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTickLabels(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any
        ])
    ): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    inline def setTickLabelsUndefined: Self = StObject.set(x, "tickLabels", js.undefined)
    
    inline def setTickLabelsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryLabelStyleObject */ Any)*
    ): Self = StObject.set(x, "tickLabels", js.Array(value*))
    
    inline def setTicks(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryTickStyleObject */ Any
    ): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
