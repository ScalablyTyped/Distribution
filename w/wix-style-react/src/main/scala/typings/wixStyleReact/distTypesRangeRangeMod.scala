package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.HasFocusFirst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRangeRangeMod {
  
  @JSImport("wix-style-react/dist/types/Range/Range", JSImport.Default)
  @js.native
  open class default protected () extends Range {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Range/Range", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Range/Range", "default.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Range/Range", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait Range extends PureComponent[Any, Any, Any] {
    
    def _doKeyDown(e: Any): Unit = js.native
    
    def _handleBlurFirst(): Unit = js.native
    
    def _handleBlurLast(): Unit = js.native
    
    def _handleFocusFirst(): Unit = js.native
    
    def _handleFocusLast(): Unit = js.native
    
    @JSName("state")
    var state_Range: HasFocusFirst = js.native
  }
}
