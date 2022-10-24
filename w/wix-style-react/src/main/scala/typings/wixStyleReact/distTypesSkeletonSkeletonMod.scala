package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.SizeString
import typings.wixStyleReact.anon.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonSkeletonMod {
  
  /**
    * Skeleton is a “placeholder” component.
    * Used for filling up screen usually for when some async operation is ongoing.
    */
  @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", JSImport.Default)
  @js.native
  open class default protected () extends Skeleton {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.defaultProps.alignment_1")
      @js.native
      val alignment1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.defaultProps.content_1")
      @js.native
      val content1: js.Array[SizeString] = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.defaultProps.spacing_1")
      @js.native
      val spacing1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.propTypes.alignment")
      @js.native
      val alignment: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.propTypes.content")
      @js.native
      val content: Validator[js.Array[js.UndefOr[InferProps[SizeType] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Skeleton/Skeleton", "default.propTypes.spacing")
      @js.native
      val spacing: Requireable[String] = js.native
    }
  }
  
  /**
    * Skeleton is a “placeholder” component.
    * Used for filling up screen usually for when some async operation is ongoing.
    */
  @js.native
  trait Skeleton extends PureComponent[Any, Any, Any]
}
