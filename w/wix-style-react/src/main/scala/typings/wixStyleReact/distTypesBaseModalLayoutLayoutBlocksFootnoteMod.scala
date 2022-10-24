package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksFootnoteMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Footnote", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  trait FootnoteProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footnote: js.UndefOr[ReactNode] = js.undefined
  }
  object FootnoteProps {
    
    inline def apply(): FootnoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FootnoteProps]
    }
    
    extension [Self <: FootnoteProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
      
      inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
    }
  }
}
