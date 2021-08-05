package typings.wixStyleReact

import typings.wixStyleReact.anon.AddedId
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortableListDriverMod {
  
  trait SortableListDriver
    extends StObject
       with BaseDriver {
    
    def reorder(data: AddedId): Unit
  }
  object SortableListDriver {
    
    inline def apply(exists: () => Boolean, reorder: AddedId => Unit): SortableListDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), reorder = js.Any.fromFunction1(reorder))
      __obj.asInstanceOf[SortableListDriver]
    }
    
    extension [Self <: SortableListDriver](x: Self) {
      
      inline def setReorder(value: AddedId => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    }
  }
}
