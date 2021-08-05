package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testimonialListMod {
  
  @JSImport("wix-style-react/dist/es/src/TestimonialList", JSImport.Default)
  @js.native
  class default ()
    extends Component[TestimonialListProps, js.Object, js.Any]
  
  type TestimonialList = Component[TestimonialListProps, js.Object, js.Any]
  
  trait TestimonialListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var testimonials: js.UndefOr[js.Array[TestimonialType]] = js.undefined
  }
  object TestimonialListProps {
    
    inline def apply(): TestimonialListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestimonialListProps]
    }
    
    extension [Self <: TestimonialListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setTestimonials(value: js.Array[TestimonialType]): Self = StObject.set(x, "testimonials", value.asInstanceOf[js.Any])
      
      inline def setTestimonialsUndefined: Self = StObject.set(x, "testimonials", js.undefined)
      
      inline def setTestimonialsVarargs(value: TestimonialType*): Self = StObject.set(x, "testimonials", js.Array(value :_*))
    }
  }
  
  trait TestimonialType extends StObject {
    
    var authorName: String
    
    var avatar: ReactNode
    
    var text: String
  }
  object TestimonialType {
    
    inline def apply(authorName: String, text: String): TestimonialType = {
      val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestimonialType]
    }
    
    extension [Self <: TestimonialType](x: Self) {
      
      inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
