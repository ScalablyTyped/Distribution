package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subheaderMod {
  
  @JSImport("wix-style-react/dist/es/src/Card/Subheader", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SubheaderProps, js.Object, js.Any]
  
  type Subheader = PureComponent[SubheaderProps, js.Object, js.Any]
  
  trait SubheaderProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[SubheaderSkin] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var title: ReactNode
  }
  object SubheaderProps {
    
    @scala.inline
    def apply(): SubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubheaderProps]
    }
    
    @scala.inline
    implicit class SubheaderPropsMutableBuilder[Self <: SubheaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setSkin(value: SubheaderSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.neutral
  */
  trait SubheaderSkin extends StObject
  object SubheaderSkin {
    
    @scala.inline
    def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
}
