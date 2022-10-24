package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksIllustrationMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
  
  trait IllustrationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var illustration: js.UndefOr[String | ReactNode] = js.undefined
  }
  object IllustrationProps {
    
    inline def apply(): IllustrationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IllustrationProps]
    }
    
    extension [Self <: IllustrationProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIllustration(value: String | ReactNode): Self = StObject.set(x, "illustration", value.asInstanceOf[js.Any])
      
      inline def setIllustrationUndefined: Self = StObject.set(x, "illustration", js.undefined)
    }
  }
}
