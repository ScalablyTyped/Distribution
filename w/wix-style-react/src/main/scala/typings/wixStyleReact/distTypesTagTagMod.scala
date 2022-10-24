package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagTagMod {
  
  /**
    * A Tag component
    */
  @JSImport("wix-style-react/dist/types/Tag/Tag", JSImport.Default)
  @js.native
  open class default protected () extends Tag {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Tag/Tag", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.defaultProps.removable_1")
      @js.native
      val removable1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.defaultProps.theme_1")
      @js.native
      val theme1: String = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Tag/Tag", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.children")
      @js.native
      val children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.id")
      @js.native
      val id: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.maxWidth")
      @js.native
      val maxWidth: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.onRemove")
      @js.native
      val onRemove: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.removable")
      @js.native
      val removable: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.theme")
      @js.native
      val theme: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tag/Tag", "default.propTypes.thumb")
      @js.native
      val thumb: Requireable[ReactElementLike] = js.native
    }
  }
  
  /**
    * A Tag component
    */
  @js.native
  trait Tag extends PureComponent[Any, Any, Any] {
    
    def _handleOnClick(event: Any): Any = js.native
    
    def _handleRemoveClick(event: Any): Unit = js.native
    
    def _handleRemoveKeyDown(event: Any): Unit = js.native
    
    def _renderRemoveButton(): Element | Null = js.native
    
    def _renderText(): Element = js.native
    
    def _renderThumb(): Element | Null = js.native
  }
}
