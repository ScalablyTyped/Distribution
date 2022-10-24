package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlighterHighlighterMod {
  
  @JSImport("wix-style-react/dist/types/Highlighter/Highlighter", JSImport.Default)
  @js.native
  open class default protected () extends Highlighter {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Highlighter/Highlighter", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Highlighter/Highlighter", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Highlighter/Highlighter", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** match to highlight */
      @JSImport("wix-style-react/dist/types/Highlighter/Highlighter", "default.propTypes.match")
      @js.native
      val `match`: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait Highlighter extends PureComponent[Any, Any, Any] {
    
    def nextChildKey(): String = js.native
  }
}
