package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPreviewSocialPreviewMod {
  
  /**
    * A displayer for a social post
    */
  @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", JSImport.Default)
  @js.native
  open class default protected () extends SocialPreview {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** A social post link description */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.description")
      @js.native
      def description: Requireable[String] = js.native
      inline def description_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
      
      /** A slot to render a media item, most common will be the ImageViewer component */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.media")
      @js.native
      def media: Requireable[ReactNodeLike] = js.native
      inline def media_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("media")(x.asInstanceOf[js.Any])
      
      /** A url representation of the social post link */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.previewUrl")
      @js.native
      def previewUrl: Requireable[String] = js.native
      inline def previewUrl_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("previewUrl")(x.asInstanceOf[js.Any])
      
      /** Specifies the size of the preview. Size small works only in combination with twitter skin */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Changes the style of the preview */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** A social post link title */
      @JSImport("wix-style-react/dist/types/SocialPreview/SocialPreview", "default.propTypes.title")
      @js.native
      def title: Requireable[String] = js.native
      inline def title_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A displayer for a social post
    */
  @js.native
  trait SocialPreview extends Component[Any, Any, Any] {
    
    def _isTwitter(): Boolean = js.native
    
    def _isTwitterSmall(): Boolean = js.native
    
    def _renderDescription(): Element = js.native
    
    def _renderMedia(): Any = js.native
    
    def _renderTitle(): Element = js.native
    
    def _renderUrl(): Any = js.native
    
    def _renderUrlText(): Element = js.native
  }
}
