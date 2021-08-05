package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.HasBackgroundImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderMod {
  
  @JSImport("wix-style-react/dist/es/src/PageHeader", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PageHeaderProps, js.Object, js.Any]
  
  type ActionsBarRenderFn = js.Function1[/* data */ HasBackgroundImage, ReactNode]
  
  type BreadcrumbsRenderFn = js.Function1[/* minimized */ Boolean, ReactNode]
  
  type PageHeader = PureComponent[PageHeaderProps, js.Object, js.Any]
  
  trait PageHeaderProps extends StObject {
    
    var actionsBar: js.UndefOr[ReactNode | ActionsBarRenderFn] = js.undefined
    
    var breadcrumbs: js.UndefOr[ReactNode | BreadcrumbsRenderFn] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hasBackgroundImage: js.UndefOr[Boolean] = js.undefined
    
    var minimized: js.UndefOr[Boolean] = js.undefined
    
    var onBackClicked: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var showBackButton: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode | TitleRenderFn] = js.undefined
  }
  object PageHeaderProps {
    
    inline def apply(): PageHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    extension [Self <: PageHeaderProps](x: Self) {
      
      inline def setActionsBar(value: ReactNode | ActionsBarRenderFn): Self = StObject.set(x, "actionsBar", value.asInstanceOf[js.Any])
      
      inline def setActionsBarFunction1(value: /* data */ HasBackgroundImage => ReactNode): Self = StObject.set(x, "actionsBar", js.Any.fromFunction1(value))
      
      inline def setActionsBarUndefined: Self = StObject.set(x, "actionsBar", js.undefined)
      
      inline def setBreadcrumbs(value: ReactNode | BreadcrumbsRenderFn): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbsFunction1(value: /* minimized */ Boolean => ReactNode): Self = StObject.set(x, "breadcrumbs", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHasBackgroundImage(value: Boolean): Self = StObject.set(x, "hasBackgroundImage", value.asInstanceOf[js.Any])
      
      inline def setHasBackgroundImageUndefined: Self = StObject.set(x, "hasBackgroundImage", js.undefined)
      
      inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      inline def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
      
      inline def setOnBackClicked(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBackClicked", js.Any.fromFunction1(value))
      
      inline def setOnBackClickedUndefined: Self = StObject.set(x, "onBackClicked", js.undefined)
      
      inline def setShowBackButton(value: Boolean): Self = StObject.set(x, "showBackButton", value.asInstanceOf[js.Any])
      
      inline def setShowBackButtonUndefined: Self = StObject.set(x, "showBackButton", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode | TitleRenderFn): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* minimized */ Boolean => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type TitleRenderFn = js.Function1[/* minimized */ Boolean, ReactNode]
}
