package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod {
  
  @JSImport("wix-style-react/dist/es/src/BaseModalLayout/LayoutBlocks/Content", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  trait ContentProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String | ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideBottomScrollDivider: js.UndefOr[Boolean] = js.undefined
    
    var hideTopScrollDivider: js.UndefOr[Boolean] = js.undefined
    
    var scrollProps: js.UndefOr[ScrollableContainerCommonProps] = js.undefined
  }
  object ContentProps {
    
    @scala.inline
    def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    @scala.inline
    implicit class ContentPropsMutableBuilder[Self <: ContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String | ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHideBottomScrollDivider(value: Boolean): Self = StObject.set(x, "hideBottomScrollDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideBottomScrollDividerUndefined: Self = StObject.set(x, "hideBottomScrollDivider", js.undefined)
      
      @scala.inline
      def setHideTopScrollDivider(value: Boolean): Self = StObject.set(x, "hideTopScrollDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTopScrollDividerUndefined: Self = StObject.set(x, "hideTopScrollDivider", js.undefined)
      
      @scala.inline
      def setScrollProps(value: ScrollableContainerCommonProps): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
    }
  }
}
