package typings.wixStyleReact

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.floatingHelperContentMod.FloatingHelperContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingHelperMod {
  
  @JSImport("wix-style-react/dist/es/src/FloatingHelper", JSImport.Default)
  @js.native
  class default () extends FloatingHelper
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/FloatingHelper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/FloatingHelper", "default.Content")
    @js.native
    def Content: ComponentClass[FloatingHelperContentProps, ComponentState] = js.native
    @scala.inline
    def Content_=(x: ComponentClass[FloatingHelperContentProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FloatingHelper
    extends PureComponent[FloatingHelperProps, js.Object, js.Any] {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.dark
    - typings.wixStyleReact.wixStyleReactStrings.light
  */
  trait FloatingHelperAppearance extends StObject
  object FloatingHelperAppearance {
    
    @scala.inline
    def dark: typings.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.dark]
    
    @scala.inline
    def light: typings.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.light]
  }
  
  type FloatingHelperAppendTo = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
  
  type FloatingHelperMoveByOffset = MoveByOffset
  
  type FloatingHelperPlacement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
  
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
    
    @scala.inline
    def apply(placement: FloatingHelperPlacement): FloatingHelperProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingHelperProps]
    }
    
    @scala.inline
    implicit class FloatingHelperPropsMutableBuilder[Self <: FloatingHelperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setAppendTo(value: FloatingHelperAppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      @scala.inline
      def setInitiallyOpened(value: Boolean): Self = StObject.set(x, "initiallyOpened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyOpenedUndefined: Self = StObject.set(x, "initiallyOpened", js.undefined)
      
      @scala.inline
      def setMoveBy(value: FloatingHelperMoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: js.Function): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      @scala.inline
      def setPlacement(value: FloatingHelperPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
