package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.BackButtonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerHeaderComposerHeaderMod {
  
  object default {
    
    /** ComposerHeader */
    inline def apply(param0: BackButtonValue): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.defaultProps.dropShadow_1")
      @js.native
      val dropShadow1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.propTypes.backButtonValue")
      @js.native
      val backButtonValue: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.propTypes.dropShadow")
      @js.native
      val dropShadow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.propTypes.onBackClick")
      @js.native
      val onBackClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ComposerHeader/ComposerHeader", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
    }
  }
}
