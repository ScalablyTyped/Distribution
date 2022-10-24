package typings.wixStyleReact

import typings.dndCore.distInterfacesMod.BackendFactory
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragDropContextProviderDragDropContextProviderMod {
  
  @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", JSImport.Default)
  @js.native
  open class default protected () extends DragDropContextProvider {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object childContextTypes {
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.childContextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.childContextTypes.dragDropManager")
      @js.native
      def dragDropManager: Requireable[js.Object] = js.native
      inline def dragDropManager_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDropManager")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object contextTypes {
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.contextTypes.dragDropManager")
      @js.native
      def dragDropManager: Requireable[js.Object] = js.native
      inline def dragDropManager_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDropManager")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.defaultProps.backend")
      @js.native
      def backend: BackendFactory = js.native
      inline def backend_=(x: BackendFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backend")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.propTypes.backend")
      @js.native
      def backend: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def backend_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backend")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DragDropContextProvider/DragDropContextProvider", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DragDropContextProvider extends Component[Any, Any, Any] {
    
    def getChildContext(): DragDropManager = js.native
    
    def getManager(): Any = js.native
  }
}
