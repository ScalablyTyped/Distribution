package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.ReactChild
import typings.react.mod.ReactFragment
import typings.react.mod.ReactPortal
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Divider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageFooterPageFooterMod {
  
  object default {
    
    /** Layout footer component of 3 columns */
    inline def apply(param0: Divider): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.defaultProps.divider_1")
      @js.native
      val divider1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      inline def children(props: Any, propName: Any): ReactChild | ReactFragment | ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("children")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[ReactChild | ReactFragment | ReactPortal]
      
      @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageFooter/PageFooter", "default.propTypes.divider")
      @js.native
      val divider: Requireable[Boolean] = js.native
    }
  }
}
