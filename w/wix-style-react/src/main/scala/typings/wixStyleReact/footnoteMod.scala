package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footnoteMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/LayoutBlocks/Footnote", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  trait FootnoteProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footnote: js.UndefOr[ReactNode] = js.undefined
  }
  object FootnoteProps {
    
    @scala.inline
    def apply(): FootnoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FootnoteProps]
    }
    
    @scala.inline
    implicit class FootnotePropsMutableBuilder[Self <: FootnoteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFootnote(value: ReactNode): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
    }
  }
}
