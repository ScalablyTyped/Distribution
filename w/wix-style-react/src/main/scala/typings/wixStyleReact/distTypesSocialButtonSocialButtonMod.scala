package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.IconOnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialButtonSocialButtonMod {
  
  object default {
    
    /** Social networks share button with title */
    inline def apply(param0: IconOnClick): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.propTypes.icon")
      @js.native
      val icon: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SocialButton/SocialButton", "default.propTypes.text")
      @js.native
      val text: Requireable[ReactNodeLike] = js.native
    }
  }
}
