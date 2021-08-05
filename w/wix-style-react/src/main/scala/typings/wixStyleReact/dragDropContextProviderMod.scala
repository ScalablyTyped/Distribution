package typings.wixStyleReact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragDropContextProviderMod {
  
  @JSImport("wix-style-react/dist/es/src/DragDropContextProvider", JSImport.Default)
  @js.native
  class default ()
    extends Component[DragDropContextProviderProps, js.Object, js.Any]
  
  type DragDropContextProvider = Component[DragDropContextProviderProps, js.Object, js.Any]
  
  trait DragDropContextProviderProps extends StObject {
    
    var backend: js.UndefOr[js.Function] = js.undefined
  }
  object DragDropContextProviderProps {
    
    inline def apply(): DragDropContextProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragDropContextProviderProps]
    }
    
    extension [Self <: DragDropContextProviderProps](x: Self) {
      
      inline def setBackend(value: js.Function): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    }
  }
}
