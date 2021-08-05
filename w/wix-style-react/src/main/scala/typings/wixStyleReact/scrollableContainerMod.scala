package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.wixStyleReact.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollableContainerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/common/ScrollableContainer", JSImport.Default)
  @js.native
  val default: FunctionComponent[ScrollableContainerProps] = js.native
  
  @js.native
  sealed trait AreaX extends StObject
  @JSImport("wix-style-react/dist/es/src/common/ScrollableContainer", "AreaX")
  @js.native
  object AreaX extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AreaX & String] = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with AreaX
    /* "end" */ val END: typings.wixStyleReact.scrollableContainerMod.AreaX.END & String = js.native
    
    @js.native
    sealed trait MIDDLE
      extends StObject
         with AreaX
    /* "middle" */ val MIDDLE: typings.wixStyleReact.scrollableContainerMod.AreaX.MIDDLE & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with AreaX
    /* "none" */ val NONE: typings.wixStyleReact.scrollableContainerMod.AreaX.NONE & String = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with AreaX
    /* "start" */ val START: typings.wixStyleReact.scrollableContainerMod.AreaX.START & String = js.native
  }
  
  @js.native
  sealed trait AreaY extends StObject
  @JSImport("wix-style-react/dist/es/src/common/ScrollableContainer", "AreaY")
  @js.native
  object AreaY extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AreaY & String] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with AreaY
    /* "bottom" */ val BOTTOM: typings.wixStyleReact.scrollableContainerMod.AreaY.BOTTOM & String = js.native
    
    @js.native
    sealed trait MIDDLE
      extends StObject
         with AreaY
    /* "middle" */ val MIDDLE: typings.wixStyleReact.scrollableContainerMod.AreaY.MIDDLE & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with AreaY
    /* "none" */ val NONE: typings.wixStyleReact.scrollableContainerMod.AreaY.NONE & String = js.native
    
    @js.native
    sealed trait TOP
      extends StObject
         with AreaY
    /* "top" */ val TOP: typings.wixStyleReact.scrollableContainerMod.AreaY.TOP & String = js.native
  }
  
  trait ScrollAreaData extends StObject {
    
    var area: Y
    
    var target: HTMLElement
  }
  object ScrollAreaData {
    
    inline def apply(area: Y, target: HTMLElement): ScrollAreaData = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollAreaData]
    }
    
    extension [Self <: ScrollAreaData](x: Self) {
      
      inline def setArea(value: Y): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollableContainerProps extends StObject {
    
    var onScrollAreaChanged: js.UndefOr[js.Function1[/* scrollChangedData */ ScrollAreaData, Unit]] = js.undefined
    
    var onScrollChanged: js.UndefOr[js.Function1[/* target */ HTMLElement, Unit]] = js.undefined
    
    var scrollThrottleWait: js.UndefOr[Double] = js.undefined
  }
  object ScrollableContainerProps {
    
    inline def apply(): ScrollableContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableContainerProps]
    }
    
    extension [Self <: ScrollableContainerProps](x: Self) {
      
      inline def setOnScrollAreaChanged(value: /* scrollChangedData */ ScrollAreaData => Unit): Self = StObject.set(x, "onScrollAreaChanged", js.Any.fromFunction1(value))
      
      inline def setOnScrollAreaChangedUndefined: Self = StObject.set(x, "onScrollAreaChanged", js.undefined)
      
      inline def setOnScrollChanged(value: /* target */ HTMLElement => Unit): Self = StObject.set(x, "onScrollChanged", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangedUndefined: Self = StObject.set(x, "onScrollChanged", js.undefined)
      
      inline def setScrollThrottleWait(value: Double): Self = StObject.set(x, "scrollThrottleWait", value.asInstanceOf[js.Any])
      
      inline def setScrollThrottleWaitUndefined: Self = StObject.set(x, "scrollThrottleWait", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ScrollableContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `scrollableContainerMod.foo` */
  override def _to: FunctionComponent[ScrollableContainerProps] = default
}
