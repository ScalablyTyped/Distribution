package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.ClassNameStyle
import typings.wixStyleReact.anon.FunctionComponentPageFoot
import typings.wixStyleReact.distTypesCommonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageMod {
  
  @JSImport("wix-style-react/dist/types/Page", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PageProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page", "default.Content")
    @js.native
    def Content: FC[ContentProps] = js.native
    inline def Content_=(x: FC[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.FixedContent")
    @js.native
    def FixedContent: FC[FixedContentProps] = js.native
    inline def FixedContent_=(x: FC[FixedContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedContent")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.FixedFooter")
    @js.native
    def FixedFooter: FC[FixedFooterProps] = js.native
    inline def FixedFooter_=(x: FC[FixedFooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedFooter")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Footer")
    @js.native
    def Footer: FunctionComponentPageFoot = js.native
    inline def Footer_=(x: FunctionComponentPageFoot): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Header")
    @js.native
    def Header: Instantiable0[typings.wixStyleReact.distTypesPageHeaderMod.default] = js.native
    inline def Header_=(x: Instantiable0[typings.wixStyleReact.distTypesPageHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Sticky")
    @js.native
    def Sticky: FC[StickyProps] = js.native
    inline def Sticky_=(x: FC[StickyProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sticky")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Tail")
    @js.native
    def Tail: FC[TailProps] = js.native
    inline def Tail_=(x: FC[TailProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tail")(x.asInstanceOf[js.Any])
  }
  
  trait ContentProps extends StObject {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    }
  }
  
  trait FixedContentProps extends StObject {
    
    var children: ReactElement
  }
  object FixedContentProps {
    
    inline def apply(children: ReactElement): FixedContentProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedContentProps]
    }
    
    extension [Self <: FixedContentProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait FixedFooterProps extends StObject {
    
    var children: ReactElement
  }
  object FixedFooterProps {
    
    inline def apply(children: ReactElement): FixedFooterProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedFooterProps]
    }
    
    extension [Self <: FixedFooterProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  type Page = PureComponent[PageProps, js.Object, Any]
  
  trait PageProps extends StObject {
    
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
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
    
    inline def apply(): PageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageProps]
    }
    
    extension [Self <: PageProps](x: Self) {
      
      inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setGradientClassName(value: String): Self = StObject.set(x, "gradientClassName", value.asInstanceOf[js.Any])
      
      inline def setGradientClassNameUndefined: Self = StObject.set(x, "gradientClassName", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setScrollProps(value: ScrollableContainerCommonProps): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
      
      inline def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
      
      inline def setScrollableContentRef(value: /* ref */ HTMLElement => Unit): Self = StObject.set(x, "scrollableContentRef", js.Any.fromFunction1(value))
      
      inline def setScrollableContentRefUndefined: Self = StObject.set(x, "scrollableContentRef", js.undefined)
      
      inline def setSidePadding(value: Double): Self = StObject.set(x, "sidePadding", value.asInstanceOf[js.Any])
      
      inline def setSidePaddingUndefined: Self = StObject.set(x, "sidePadding", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type StickyChildrenRenderFn = js.Function1[/* data */ ClassNameStyle, ReactElement]
  
  trait StickyProps extends StObject {
    
    var children: ReactElement | StickyChildrenRenderFn
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyProps {
    
    inline def apply(children: ReactElement | StickyChildrenRenderFn): StickyProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyProps]
    }
    
    extension [Self <: StickyProps](x: Self) {
      
      inline def setChildren(value: ReactElement | StickyChildrenRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ ClassNameStyle => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TailProps extends StObject {
    
    var children: ReactElement
    
    var minimized: js.UndefOr[Boolean] = js.undefined
  }
  object TailProps {
    
    inline def apply(children: ReactElement): TailProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TailProps]
    }
    
    extension [Self <: TailProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      inline def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
    }
  }
}
