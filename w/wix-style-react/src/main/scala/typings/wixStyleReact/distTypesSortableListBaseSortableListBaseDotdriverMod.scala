package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookString
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableListBaseSortableListBaseDotdriverMod {
  
  trait ReorderDataHooks extends StObject {
    
    var dataHookFrom: String
    
    var dataHookTo: String
  }
  object ReorderDataHooks {
    
    inline def apply(dataHookFrom: String, dataHookTo: String): ReorderDataHooks = {
      val __obj = js.Dynamic.literal(dataHookFrom = dataHookFrom.asInstanceOf[js.Any], dataHookTo = dataHookTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReorderDataHooks]
    }
    
    extension [Self <: ReorderDataHooks](x: Self) {
      
      inline def setDataHookFrom(value: String): Self = StObject.set(x, "dataHookFrom", value.asInstanceOf[js.Any])
      
      inline def setDataHookTo(value: String): Self = StObject.set(x, "dataHookTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortableListBaseDriver
    extends StObject
       with BaseDriver {
    
    def getItemPosition(itemDetails: DataHookString): Double
    
    def reorder(dataHooks: ReorderDataHooks): Unit
  }
  object SortableListBaseDriver {
    
    inline def apply(
      exists: () => Boolean,
      getItemPosition: DataHookString => Double,
      reorder: ReorderDataHooks => Unit
    ): SortableListBaseDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getItemPosition = js.Any.fromFunction1(getItemPosition), reorder = js.Any.fromFunction1(reorder))
      __obj.asInstanceOf[SortableListBaseDriver]
    }
    
    extension [Self <: SortableListBaseDriver](x: Self) {
      
      inline def setGetItemPosition(value: DataHookString => Double): Self = StObject.set(x, "getItemPosition", js.Any.fromFunction1(value))
      
      inline def setReorder(value: ReorderDataHooks => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    }
  }
}
