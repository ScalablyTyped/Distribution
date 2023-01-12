package typings.tuyaPanelKit

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.tuyaPanelKit.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeUseScrollToTopMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useScrollToTop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ScrollOptions {
    
    inline def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.ScrollToTop
    - typings.tuyaPanelKit.anon.ScrollTo
    - typings.tuyaPanelKit.anon.ScrollToOffset
    - typings.tuyaPanelKit.anon.ScrollResponderScrollTo
  */
  trait ScrollableView
    extends StObject
       with ScrollableWrapper
  object ScrollableView {
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typings.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Unit): typings.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Unit): typings.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: () => Unit): typings.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollToTop]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.GetScrollResponder
    - typings.tuyaPanelKit.anon.GetNode
    - typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    inline def GetNode(getNode: () => ScrollableView): typings.tuyaPanelKit.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.GetNode]
    }
    
    inline def GetScrollResponder(getScrollResponder: () => ReactNode): typings.tuyaPanelKit.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.GetScrollResponder]
    }
    
    inline def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typings.tuyaPanelKit.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollResponderScrollTo]
    }
    
    inline def ScrollTo(scrollTo: ScrollOptions => Unit): typings.tuyaPanelKit.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollTo]
    }
    
    inline def ScrollToOffset(scrollToOffset: Animated => Unit): typings.tuyaPanelKit.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollToOffset]
    }
    
    inline def ScrollToTop(scrollToTop: () => Unit): typings.tuyaPanelKit.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.ScrollToTop]
    }
  }
}
