package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object illustrationMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/LayoutBlocks/Illustration", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
  
  trait IllustrationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var illustration: js.UndefOr[String | ReactNode] = js.undefined
  }
  object IllustrationProps {
    
    @scala.inline
    def apply(): IllustrationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IllustrationProps]
    }
    
    @scala.inline
    implicit class IllustrationPropsMutableBuilder[Self <: IllustrationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setIllustration(value: String | ReactNode): Self = StObject.set(x, "illustration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllustrationUndefined: Self = StObject.set(x, "illustration", js.undefined)
    }
  }
}
