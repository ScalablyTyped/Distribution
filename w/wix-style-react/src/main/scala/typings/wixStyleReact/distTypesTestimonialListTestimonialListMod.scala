package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.AuthorName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestimonialListTestimonialListMod {
  
  /** TestimonialList is a group of layouts that display avatar, description and name. It's used in a footer of a marketing page layout. */
  @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", JSImport.Default)
  @js.native
  open class default protected () extends TestimonialList {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.defaultProps.cols_1")
      @js.native
      val cols1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.defaultProps.testimonials_1")
      @js.native
      val testimonials1: js.Array[scala.Nothing] = js.native
    }
    
    @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.propTypes.cols")
      @js.native
      val cols: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TestimonialList/TestimonialList", "default.propTypes.testimonials")
      @js.native
      val testimonials: Requireable[js.Array[js.UndefOr[InferProps[AuthorName] | Null]]] = js.native
    }
  }
  
  /** TestimonialList is a group of layouts that display avatar, description and name. It's used in a footer of a marketing page layout. */
  @js.native
  trait TestimonialList extends Component[Any, Any, Any]
}
