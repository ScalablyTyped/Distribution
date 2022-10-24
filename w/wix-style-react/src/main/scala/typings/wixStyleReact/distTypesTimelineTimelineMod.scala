package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.CustomPrefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineTimelineMod {
  
  /** A timeline is a display of a list of events */
  @JSImport("wix-style-react/dist/types/Timeline/Timeline", JSImport.Default)
  @js.native
  open class default protected () extends Timeline {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Timeline/Timeline", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Timeline/Timeline", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Timeline/Timeline", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Timeline/Timeline", "default.propTypes.gap")
      @js.native
      val gap: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Timeline/Timeline", "default.propTypes.items")
      @js.native
      val items: Validator[js.Array[js.UndefOr[InferProps[CustomPrefix] | Null]]] = js.native
    }
  }
  
  /** A timeline is a display of a list of events */
  @js.native
  trait Timeline extends PureComponent[Any, Any, Any]
}
