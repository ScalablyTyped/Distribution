package typings.wixStyleReact

import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Caption
import typings.wixStyleReact.anon.SkinString
import typings.wixStyleReact.distTypesSocialPostPreviewSocialPostPreviewDottypesMod.SocialPostPreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPostPreviewMod {
  
  /** SocialPostPreview */
  object default {
    
    inline def apply(props: SocialPostPreviewProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/SocialPostPreview", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SocialPostPreview", "default.defaultProps")
    @js.native
    def defaultProps: SkinString = js.native
    inline def defaultProps_=(x: SkinString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SocialPostPreview", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/SocialPostPreview", "default.propTypes")
    @js.native
    def propTypes: Caption = js.native
    inline def propTypes_=(x: Caption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
