package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.animateMod.Animate.Props
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.Origin
import typings.wordpressComponents.anon.`0`
import typings.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typings.wordpressComponents.wordpressComponentsStrings.appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/animate", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Animate {
    
    trait AppearProps
      extends StObject
         with BaseProps
         with Props {
      
      var options: js.UndefOr[Origin] = js.undefined
      
      @JSName("type")
      var type_AppearProps: appear
    }
    object AppearProps {
      
      @scala.inline
      def apply(children: ClassName => ReactNode): AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("appear")
        __obj.asInstanceOf[AppearProps]
      }
      
      @scala.inline
      implicit class AppearPropsMutableBuilder[Self <: AppearProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(value: Origin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setType(value: appear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait BaseProps extends StObject {
      
      def children(props: ClassName): ReactNode
      
      var `type`: appear | `slide-in`
    }
    object BaseProps {
      
      @scala.inline
      def apply(children: ClassName => ReactNode, `type`: appear | `slide-in`): BaseProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ClassName => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        @scala.inline
        def setType(value: appear | `slide-in`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.animateMod.Animate.AppearProps
      - typings.wordpressComponents.animateMod.Animate.SlideInProps
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def AppearProps(children: ClassName => ReactNode): typings.wordpressComponents.animateMod.Animate.AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("appear")
        __obj.asInstanceOf[typings.wordpressComponents.animateMod.Animate.AppearProps]
      }
      
      @scala.inline
      def SlideInProps(children: ClassName => ReactNode): typings.wordpressComponents.animateMod.Animate.SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("slide-in")
        __obj.asInstanceOf[typings.wordpressComponents.animateMod.Animate.SlideInProps]
      }
    }
    
    trait SlideInProps
      extends StObject
         with BaseProps
         with Props {
      
      var options: js.UndefOr[`0`] = js.undefined
      
      @JSName("type")
      var type_SlideInProps: `slide-in`
    }
    object SlideInProps {
      
      @scala.inline
      def apply(children: ClassName => ReactNode): SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")("slide-in")
        __obj.asInstanceOf[SlideInProps]
      }
      
      @scala.inline
      implicit class SlideInPropsMutableBuilder[Self <: SlideInProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(value: `0`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setType(value: `slide-in`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
