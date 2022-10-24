package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.anon.GetIsMenuExpanded
import typings.wixStyleReact.anon.GetIsMenuExpandedSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarMod {
  
  @JSImport("wix-style-react/dist/types/Sidebar", JSImport.Default)
  @js.native
  open class default () extends Sidebar
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Sidebar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Sidebar", "default.BackButton")
    @js.native
    def BackButton: Instantiable0[typings.wixStyleReact.distTypesSidebarBackButtonMod.default] = js.native
    inline def BackButton_=(x: Instantiable0[typings.wixStyleReact.distTypesSidebarBackButtonMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BackButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Sidebar", "default.Item")
    @js.native
    def Item: Instantiable0[SidebarItem] = js.native
    inline def Item_=(x: Instantiable0[SidebarItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Sidebar", "default.PersistentFooter")
    @js.native
    def PersistentFooter: Instantiable0[SidebarPersistentFooter] = js.native
    inline def PersistentFooter_=(x: Instantiable0[SidebarPersistentFooter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PersistentFooter")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Sidebar", "default.PersistentHeader")
    @js.native
    def PersistentHeader: Instantiable0[SidebarPersistentHeader] = js.native
    inline def PersistentHeader_=(x: Instantiable0[SidebarPersistentHeader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PersistentHeader")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/Sidebar", "SidebarContextConsumer")
  @js.native
  open class SidebarContextConsumer protected ()
    extends Component[SidebarContextConsumerProps, js.Object, Any] {
    def this(props: SidebarContextConsumerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarContextConsumerProps, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/Sidebar", "SidebarItem")
  @js.native
  open class SidebarItem protected ()
    extends PureComponent[SidebarItemProps, js.Object, Any] {
    def this(props: SidebarItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarItemProps, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/Sidebar", "SidebarItemContextConsumer")
  @js.native
  open class SidebarItemContextConsumer protected ()
    extends Component[SidebarItemContextConsumerProps, js.Object, Any] {
    def this(props: SidebarItemContextConsumerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarItemContextConsumerProps, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/Sidebar", "SidebarPersistentFooter")
  @js.native
  open class SidebarPersistentFooter protected ()
    extends Component[SidebarPersistentFooterProps, js.Object, Any] {
    def this(props: SidebarPersistentFooterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarPersistentFooterProps, context: Any) = this()
  }
  
  @JSImport("wix-style-react/dist/types/Sidebar", "SidebarPersistentHeader")
  @js.native
  open class SidebarPersistentHeader protected ()
    extends Component[SidebarPersistentHeaderProps, js.Object, Any] {
    def this(props: SidebarPersistentHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarPersistentHeaderProps, context: Any) = this()
  }
  
  @js.native
  trait Sidebar
    extends Component[SidebarProps, js.Object, Any] {
    
    def setSelectedKey(setSelectedKey: String): Unit = js.native
  }
  
  trait SidebarClassNames extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var sideBar: js.UndefOr[String] = js.undefined
    
    var slider: js.UndefOr[String] = js.undefined
    
    var sliderInFromLeft: js.UndefOr[String] = js.undefined
    
    var sliderInFromRight: js.UndefOr[String] = js.undefined
    
    var sliderOutToLeft: js.UndefOr[String] = js.undefined
    
    var sliderOutToRight: js.UndefOr[String] = js.undefined
  }
  object SidebarClassNames {
    
    inline def apply(): SidebarClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarClassNames]
    }
    
    extension [Self <: SidebarClassNames](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setSideBar(value: String): Self = StObject.set(x, "sideBar", value.asInstanceOf[js.Any])
      
      inline def setSideBarUndefined: Self = StObject.set(x, "sideBar", js.undefined)
      
      inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderInFromLeft(value: String): Self = StObject.set(x, "sliderInFromLeft", value.asInstanceOf[js.Any])
      
      inline def setSliderInFromLeftUndefined: Self = StObject.set(x, "sliderInFromLeft", js.undefined)
      
      inline def setSliderInFromRight(value: String): Self = StObject.set(x, "sliderInFromRight", value.asInstanceOf[js.Any])
      
      inline def setSliderInFromRightUndefined: Self = StObject.set(x, "sliderInFromRight", js.undefined)
      
      inline def setSliderOutToLeft(value: String): Self = StObject.set(x, "sliderOutToLeft", value.asInstanceOf[js.Any])
      
      inline def setSliderOutToLeftUndefined: Self = StObject.set(x, "sliderOutToLeft", js.undefined)
      
      inline def setSliderOutToRight(value: String): Self = StObject.set(x, "sliderOutToRight", value.asInstanceOf[js.Any])
      
      inline def setSliderOutToRightUndefined: Self = StObject.set(x, "sliderOutToRight", js.undefined)
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
    }
  }
  
  trait SidebarContextConsumerProps extends StObject {
    
    def children(renderProps: GetIsMenuExpanded): ReactNode
  }
  object SidebarContextConsumerProps {
    
    inline def apply(children: GetIsMenuExpanded => ReactNode): SidebarContextConsumerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[SidebarContextConsumerProps]
    }
    
    extension [Self <: SidebarContextConsumerProps](x: Self) {
      
      inline def setChildren(value: GetIsMenuExpanded => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait SidebarItemContextConsumerProps extends StObject {
    
    def children(renderProps: GetIsMenuExpandedSelected): ReactNode
  }
  object SidebarItemContextConsumerProps {
    
    inline def apply(children: GetIsMenuExpandedSelected => ReactNode): SidebarItemContextConsumerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[SidebarItemContextConsumerProps]
    }
    
    extension [Self <: SidebarItemContextConsumerProps](x: Self) {
      
      inline def setChildren(value: GetIsMenuExpandedSelected => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait SidebarItemProps extends StObject {
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var innerMenu: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var itemKey: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* itemKey */ String, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.undefined
  }
  object SidebarItemProps {
    
    inline def apply(): SidebarItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarItemProps]
    }
    
    extension [Self <: SidebarItemProps](x: Self) {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setInnerMenu(value: js.Array[ReactNode]): Self = StObject.set(x, "innerMenu", value.asInstanceOf[js.Any])
      
      inline def setInnerMenuUndefined: Self = StObject.set(x, "innerMenu", js.undefined)
      
      inline def setInnerMenuVarargs(value: ReactNode*): Self = StObject.set(x, "innerMenu", js.Array(value*))
      
      inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
      
      inline def setOnClick(value: (/* itemKey */ String, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait SidebarPersistentFooterProps extends StObject
  
  trait SidebarPersistentHeaderProps extends StObject
  
  trait SidebarProps extends StObject {
    
    var classNames: js.UndefOr[SidebarClassNames] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var isHidden: js.UndefOr[Boolean] = js.undefined
    
    var selectedKey: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[SidebarSkin] = js.undefined
  }
  object SidebarProps {
    
    inline def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setClassNames(value: SidebarClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSkin(value: SidebarSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
  */
  trait SidebarSkin extends StObject
  object SidebarSkin {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
  }
}
