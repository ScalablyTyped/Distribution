package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericModalLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/GenericModalLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[GenericModalLayoutProps, js.Object, js.Any]
  
  type GenericModalLayout = PureComponent[GenericModalLayoutProps, js.Object, js.Any]
  
  trait GenericModalLayoutProps extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var fullscreen: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
  }
  object GenericModalLayoutProps {
    
    @scala.inline
    def apply(): GenericModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericModalLayoutProps]
    }
    
    @scala.inline
    implicit class GenericModalLayoutPropsMutableBuilder[Self <: GenericModalLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
