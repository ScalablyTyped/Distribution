package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.modalHeadingMod.headingAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/LayoutBlocks/Header", "Header")
  @js.native
  val Header: FunctionComponent[HeaderProps] = js.native
  
  trait HeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var showHeaderDivider: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String | ReactNode] = js.undefined
    
    var titleAppearance: js.UndefOr[headingAppearance] = js.undefined
  }
  object HeaderProps {
    
    @scala.inline
    def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setShowHeaderDivider(value: Boolean): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderDividerUndefined: Self = StObject.set(x, "showHeaderDivider", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAppearance(value: headingAppearance): Self = StObject.set(x, "titleAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAppearanceUndefined: Self = StObject.set(x, "titleAppearance", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
