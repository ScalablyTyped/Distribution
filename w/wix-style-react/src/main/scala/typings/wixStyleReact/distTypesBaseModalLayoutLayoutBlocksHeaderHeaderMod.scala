package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.HeadingAppearance
import typings.wixStyleReact.anon.ShowHeaderDivider
import typings.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.headingAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksHeaderHeaderMod {
  
  object Header {
    
    inline def apply(param0: ShowHeaderDivider): Any = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Title(param0: HeadingAppearance): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Title")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.defaultProps.showHeaderDivider_1")
      @js.native
      val showHeaderDivider1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.defaultProps.titleAppearance_1")
      @js.native
      val titleAppearance1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.showHeaderDivider")
      @js.native
      val showHeaderDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.title")
      @js.native
      val title: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.titleAppearance")
      @js.native
      val titleAppearance: js.UndefOr[Validator[js.UndefOr[headingAppearance | Null]]] = js.native
    }
  }
}
