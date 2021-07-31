package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("wix-style-react/dist/es/src/Loader", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[LoaderProps, js.Object, js.Any]
  
  type Loader = PureComponent[LoaderProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.blue
    - typings.wixStyleReact.wixStyleReactStrings.white
  */
  trait LoaderColor extends StObject
  object LoaderColor {
    
    @scala.inline
    def blue: typings.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.blue]
    
    @scala.inline
    def white: typings.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.white]
  }
  
  trait LoaderProps extends StObject {
    
    var color: js.UndefOr[LoaderColor] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[LoaderSize] = js.undefined
    
    var status: js.UndefOr[LoaderStatus] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object LoaderProps {
    
    @scala.inline
    def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: LoaderColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setSize(value: LoaderSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: LoaderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait LoaderSize extends StObject
  object LoaderSize {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.loading
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.error
  */
  trait LoaderStatus extends StObject
  object LoaderStatus {
    
    @scala.inline
    def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    @scala.inline
    def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    @scala.inline
    def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
  }
}
