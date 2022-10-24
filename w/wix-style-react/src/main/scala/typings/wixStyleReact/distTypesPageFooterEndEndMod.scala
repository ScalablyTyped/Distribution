package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageFooterEndEndMod {
  
  @JSImport("wix-style-react/dist/types/PageFooter/End/End", JSImport.Default)
  @js.native
  open class default protected () extends End {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PageFooter/End/End", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/PageFooter/End/End", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends Component[Any, Any, Any]
}
