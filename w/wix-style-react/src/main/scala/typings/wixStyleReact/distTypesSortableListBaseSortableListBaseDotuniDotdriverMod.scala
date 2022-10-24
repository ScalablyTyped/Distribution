package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookString
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortableListBaseSortableListBaseDotuniDotdriverMod {
  
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
  
  trait SortableListBaseUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getItemPosition(itemDetails: DataHookString): js.Promise[Double]
    
    def reorder(dataHooks: ReorderDataHooks): js.Promise[Unit]
  }
  object SortableListBaseUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getItemPosition: DataHookString => js.Promise[Double],
      reorder: ReorderDataHooks => js.Promise[Unit]
    ): SortableListBaseUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getItemPosition = js.Any.fromFunction1(getItemPosition), reorder = js.Any.fromFunction1(reorder))
      __obj.asInstanceOf[SortableListBaseUniDriver]
    }
    
    extension [Self <: SortableListBaseUniDriver](x: Self) {
      
      inline def setGetItemPosition(value: DataHookString => js.Promise[Double]): Self = StObject.set(x, "getItemPosition", js.Any.fromFunction1(value))
      
      inline def setReorder(value: ReorderDataHooks => js.Promise[Unit]): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    }
  }
}
