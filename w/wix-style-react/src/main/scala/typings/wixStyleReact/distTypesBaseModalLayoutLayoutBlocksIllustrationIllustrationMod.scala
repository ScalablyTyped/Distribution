package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.wixStyleReact.anon.ChildrenClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksIllustrationIllustrationMod {
  
  object Illustration {
    
    inline def apply(param0: ChildrenClassName): Any = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.illustration")
      @js.native
      val illustration: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
    }
  }
}
