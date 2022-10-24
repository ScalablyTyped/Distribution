package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorExtraTextMod {
  
  @JSImport("wix-style-react/dist/types/Selector/ExtraText", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.wixStyleReact.distTypesSelectorExtraTextExtraTextMod.default {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Selector/ExtraText", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Selector/ExtraText", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Selector/ExtraText", "default.propTypes.text")
      @js.native
      def text: Validator[String] = js.native
      inline def text_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
  }
}
