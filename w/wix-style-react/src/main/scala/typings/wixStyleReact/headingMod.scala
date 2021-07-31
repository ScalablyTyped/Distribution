package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.HTMLAttributes
import typings.react.mod.SFC
import typings.std.HTMLHeadingElement
import typings.wixStyleReact.ellipsisMod.EllipsisCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/Heading", JSImport.Default)
  @js.native
  val default: SFC[HeadingProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Heading", "Heading")
  @js.native
  val Heading: SFC[HeadingProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.H1
    - typings.wixStyleReact.wixStyleReactStrings.H2
    - typings.wixStyleReact.wixStyleReactStrings.H3
    - typings.wixStyleReact.wixStyleReactStrings.H4
    - typings.wixStyleReact.wixStyleReactStrings.H5
    - typings.wixStyleReact.wixStyleReactStrings.H6
  */
  trait HeadingAppearance extends StObject
  object HeadingAppearance {
    
    @scala.inline
    def H1: typings.wixStyleReact.wixStyleReactStrings.H1 = "H1".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H1]
    
    @scala.inline
    def H2: typings.wixStyleReact.wixStyleReactStrings.H2 = "H2".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H2]
    
    @scala.inline
    def H3: typings.wixStyleReact.wixStyleReactStrings.H3 = "H3".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H3]
    
    @scala.inline
    def H4: typings.wixStyleReact.wixStyleReactStrings.H4 = "H4".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H4]
    
    @scala.inline
    def H5: typings.wixStyleReact.wixStyleReactStrings.H5 = "H5".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H5]
    
    @scala.inline
    def H6: typings.wixStyleReact.wixStyleReactStrings.H6 = "H6".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.H6]
  }
  
  trait HeadingProps
    extends StObject
       with HTMLAttributes[HTMLHeadingElement]
       with EllipsisCommonProps {
    
    var appearance: js.UndefOr[HeadingAppearance] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
  }
  object HeadingProps {
    
    @scala.inline
    def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearance(value: HeadingAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
  
  type _To = SFC[HeadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `headingMod.foo` */
  override def _to: SFC[HeadingProps] = default
}
