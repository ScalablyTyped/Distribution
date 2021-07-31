package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLElement
import typings.wixStyleReact.anon.Style
import typings.wixStyleReact.commonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  @JSImport("wix-style-react/dist/es/src/Page", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PageProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/Page", "default.Content")
    @js.native
    def Content: SFC[ContentProps] = js.native
    @scala.inline
    def Content_=(x: SFC[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Page", "default.FixedContent")
    @js.native
    def FixedContent: SFC[FixedContentProps] = js.native
    @scala.inline
    def FixedContent_=(x: SFC[FixedContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedContent")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Page", "default.Header")
    @js.native
    def Header: Instantiable0[typings.wixStyleReact.pageHeaderMod.default] = js.native
    @scala.inline
    def Header_=(x: Instantiable0[typings.wixStyleReact.pageHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Page", "default.Sticky")
    @js.native
    def Sticky: SFC[StickyProps] = js.native
    @scala.inline
    def Sticky_=(x: SFC[StickyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sticky")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Page", "default.Tail")
    @js.native
    def Tail: SFC[TailProps] = js.native
    @scala.inline
    def Tail_=(x: SFC[TailProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tail")(x.asInstanceOf[js.Any])
  }
  
  trait ContentProps extends StObject {
    
    var children: ReactNode
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
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
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    }
  }
  
  trait FixedContentProps extends StObject {
    
    var children: ReactElement
  }
  object FixedContentProps {
    
    @scala.inline
    def apply(children: ReactElement): FixedContentProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedContentProps]
    }
    
    @scala.inline
    implicit class FixedContentPropsMutableBuilder[Self <: FixedContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  type Page = PureComponent[PageProps, js.Object, js.Any]
  
  trait PageProps extends StObject {
    
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gradientClassName: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var scrollProps: js.UndefOr[ScrollableContainerCommonProps] = js.undefined
    
    var scrollableContentRef: js.UndefOr[js.Function1[/* ref */ HTMLElement, Unit]] = js.undefined
    
    var sidePadding: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PageProps {
    
    @scala.inline
    def apply(): PageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageProps]
    }
    
    @scala.inline
    implicit class PagePropsMutableBuilder[Self <: PageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setGradientClassName(value: String): Self = StObject.set(x, "gradientClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientClassNameUndefined: Self = StObject.set(x, "gradientClassName", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setScrollProps(value: ScrollableContainerCommonProps): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
      
      @scala.inline
      def setScrollableContentRef(value: /* ref */ HTMLElement => Unit): Self = StObject.set(x, "scrollableContentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollableContentRefUndefined: Self = StObject.set(x, "scrollableContentRef", js.undefined)
      
      @scala.inline
      def setSidePadding(value: Double): Self = StObject.set(x, "sidePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidePaddingUndefined: Self = StObject.set(x, "sidePadding", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type StickyChildrenRenderFn = js.Function1[/* data */ Style, ReactElement]
  
  trait StickyProps extends StObject {
    
    var children: ReactElement | StickyChildrenRenderFn
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyProps {
    
    @scala.inline
    def apply(children: ReactElement | StickyChildrenRenderFn): StickyProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyProps]
    }
    
    @scala.inline
    implicit class StickyPropsMutableBuilder[Self <: StickyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | StickyChildrenRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* data */ Style => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TailProps extends StObject {
    
    var children: ReactElement
    
    var minimized: js.UndefOr[Boolean] = js.undefined
  }
  object TailProps {
    
    @scala.inline
    def apply(children: ReactElement): TailProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TailProps]
    }
    
    @scala.inline
    implicit class TailPropsMutableBuilder[Self <: TailProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
    }
  }
}
