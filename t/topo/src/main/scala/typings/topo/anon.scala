package typings.topo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After[TGroup] extends StObject {
    
    var after: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
    
    var before: js.UndefOr[TGroup | js.Array[TGroup]] = js.undefined
    
    var group: js.UndefOr[TGroup] = js.undefined
    
    var sort: js.UndefOr[Double] = js.undefined
  }
  object After {
    
    inline def apply[TGroup](): After[TGroup] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After[TGroup]]
    }
    
    extension [Self <: After[?], TGroup](x: Self & After[TGroup]) {
      
      inline def setAfter(value: TGroup | js.Array[TGroup]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: TGroup*): Self = StObject.set(x, "after", js.Array(value :_*))
      
      inline def setBefore(value: TGroup | js.Array[TGroup]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: TGroup*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      inline def setGroup(value: TGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setSort(value: Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
