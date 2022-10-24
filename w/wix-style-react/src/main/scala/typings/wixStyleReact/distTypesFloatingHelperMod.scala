package typings.wixStyleReact

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.wixStyleReact.distTypesCommonMod.MoveByOffset
import typings.wixStyleReact.distTypesFloatingHelperFloatingHelperContentMod.FloatingHelperContentProps
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperMod {
  
  @JSImport("wix-style-react/dist/types/FloatingHelper", JSImport.Default)
  @js.native
  open class default () extends FloatingHelper
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/FloatingHelper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/FloatingHelper", "default.Content")
    @js.native
    def Content: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
    inline def Content_=(x: ComponentClass[FloatingHelperContentProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FloatingHelper
    extends PureComponent[FloatingHelperProps, js.Object, Any] {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
  */
  trait FloatingHelperAppearance extends StObject
  object FloatingHelperAppearance {
    
    inline def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
  }
  
  type FloatingHelperAppendTo = AppendTo
  
  type FloatingHelperMoveByOffset = MoveByOffset
  
  type FloatingHelperPlacement = Placement
  
  trait FloatingHelperProps extends StObject {
    
    var appearance: js.UndefOr[FloatingHelperAppearance] = js.undefined
    
    var appendTo: js.UndefOr[FloatingHelperAppendTo] = js.undefined
    
    var content: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var initiallyOpened: js.UndefOr[Boolean] = js.undefined
    
    var moveBy: js.UndefOr[FloatingHelperMoveByOffset] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onOpen: js.UndefOr[js.Function] = js.undefined
    
    var opened: js.UndefOr[Boolean] = js.undefined
    
    var placement: FloatingHelperPlacement
    
    var target: ReactNode
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object FloatingHelperProps {
    
    inline def apply(placement: FloatingHelperPlacement): FloatingHelperProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingHelperProps]
    }
    
    extension [Self <: FloatingHelperProps](x: Self) {
      
      inline def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAppendTo(value: FloatingHelperAppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setInitiallyOpened(value: Boolean): Self = StObject.set(x, "initiallyOpened", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenedUndefined: Self = StObject.set(x, "initiallyOpened", js.undefined)
      
      inline def setMoveBy(value: FloatingHelperMoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: js.Function): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setPlacement(value: FloatingHelperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
