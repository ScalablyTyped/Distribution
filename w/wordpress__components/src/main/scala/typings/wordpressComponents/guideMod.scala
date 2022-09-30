package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guideMod extends Shortcut {
  
  @JSImport("@wordpress/components/guide", JSImport.Default)
  @js.native
  val default: ComponentType[GuideProps] = js.native
  
  trait GuidePage extends StObject {
    
    var content: ReactNode
    
    var image: js.UndefOr[ReactNode] = js.undefined
  }
  object GuidePage {
    
    inline def apply(): GuidePage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GuidePage]
    }
    
    extension [Self <: GuidePage](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  trait GuideProps extends StObject {
    
    /**
      * @deprecated use the `pages` prop instead
      * @since 5.5
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentLabel: js.UndefOr[String] = js.undefined
    
    var finishButtonText: js.UndefOr[ReactNode] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pages: js.UndefOr[js.Array[GuidePage]] = js.undefined
  }
  object GuideProps {
    
    inline def apply(): GuideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GuideProps]
    }
    
    extension [Self <: GuideProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentLabel(value: String): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      inline def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      inline def setFinishButtonText(value: ReactNode): Self = StObject.set(x, "finishButtonText", value.asInstanceOf[js.Any])
      
      inline def setFinishButtonTextUndefined: Self = StObject.set(x, "finishButtonText", js.undefined)
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setPages(value: js.Array[GuidePage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: GuidePage*): Self = StObject.set(x, "pages", js.Array(value*))
    }
  }
  
  type _To = ComponentType[GuideProps]
  
  /* This means you don't have to write `default`, but can instead just say `guideMod.foo` */
  override def _to: ComponentType[GuideProps] = default
}
