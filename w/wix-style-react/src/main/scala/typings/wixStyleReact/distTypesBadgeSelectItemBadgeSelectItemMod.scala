package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisabledId
import typings.wixStyleReact.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectItemBadgeSelectItemMod {
  
  @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.ellipsis")
      @js.native
      val ellipsis: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.highlighted")
      @js.native
      val highlighted: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.selected")
      @js.native
      val selected: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.skin")
      @js.native
      val skin: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.suffix")
      @js.native
      val suffix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelectItem/BadgeSelectItem", "default.propTypes.text")
      @js.native
      val text: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
    }
  }
  
  inline def badgeSelectItemBuilder(param0: Size): DisabledId = ^.asInstanceOf[js.Dynamic].applyDynamic("badgeSelectItemBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[DisabledId]
}
