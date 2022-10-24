package typings.wixStyleReact.mod

import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Caption
import typings.wixStyleReact.anon.SkinString
import typings.wixStyleReact.distTypesSocialPostPreviewSocialPostPreviewDottypesMod.SocialPostPreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SocialPostPreview */
object SocialPostPreview {
  
  inline def apply(props: SocialPostPreviewProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("wix-style-react", "SocialPostPreview")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "SocialPostPreview.defaultProps")
  @js.native
  def defaultProps: SkinString = js.native
  inline def defaultProps_=(x: SkinString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "SocialPostPreview.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "SocialPostPreview.propTypes")
  @js.native
  def propTypes: Caption = js.native
  inline def propTypes_=(x: Caption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
