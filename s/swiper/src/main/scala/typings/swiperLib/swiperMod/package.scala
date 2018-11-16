package typings
package swiperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swiperMod {
  type AutoplayEvent = swiperLib.swiperLibStrings.autoplayStart | swiperLib.swiperLibStrings.autoplayStop | swiperLib.swiperLibStrings.autoplay
  type CommonEvent = swiperLib.swiperLibStrings.init | swiperLib.swiperLibStrings.beforeDestroy | swiperLib.swiperLibStrings.slideChange | swiperLib.swiperLibStrings.slideChangeTransitionStart | swiperLib.swiperLibStrings.slideChangeTransitionEnd | swiperLib.swiperLibStrings.slideNextTransitionStart | swiperLib.swiperLibStrings.slideNextTransitionEnd | swiperLib.swiperLibStrings.slidePrevTransitionStart | swiperLib.swiperLibStrings.slidePrevTransitionEnd | swiperLib.swiperLibStrings.transitionStart | swiperLib.swiperLibStrings.transitionEnd | swiperLib.swiperLibStrings.touchStart | swiperLib.swiperLibStrings.touchMove | swiperLib.swiperLibStrings.touchMoveOpposite | swiperLib.swiperLibStrings.sliderMove | swiperLib.swiperLibStrings.touchEnd | swiperLib.swiperLibStrings.click | swiperLib.swiperLibStrings.tap | swiperLib.swiperLibStrings.doubleTap | swiperLib.swiperLibStrings.imagesReady | swiperLib.swiperLibStrings.progress | swiperLib.swiperLibStrings.reachBeginning | swiperLib.swiperLibStrings.reachEnd | swiperLib.swiperLibStrings.fromEdge | swiperLib.swiperLibStrings.setTranslate | swiperLib.swiperLibStrings.setTransition | swiperLib.swiperLibStrings.resize
  type DOM7Element = js.Any
  type LazyLoadingEvent = swiperLib.swiperLibStrings.lazyImageLoad | swiperLib.swiperLibStrings.lazyImageReady
  type PaginationEvent = swiperLib.swiperLibStrings.paginationRender | swiperLib.swiperLibStrings.paginationUpdate
  type SelectableElement = java.lang.String | stdLib.HTMLElement
  type SwiperEvent = CommonEvent | PaginationEvent | AutoplayEvent | LazyLoadingEvent
  type SwiperModule = swiperLib.distJsSwiperDotEsmMod.Navigation | swiperLib.distJsSwiperDotEsmMod.Pagination | swiperLib.distJsSwiperDotEsmMod.Scrollbar | swiperLib.distJsSwiperDotEsmMod.Autoplay | swiperLib.distJsSwiperDotEsmMod.Parallax | swiperLib.distJsSwiperDotEsmMod.Lazy | swiperLib.distJsSwiperDotEsmMod.EffectFade | swiperLib.distJsSwiperDotEsmMod.EffectCoverflow | swiperLib.distJsSwiperDotEsmMod.EffectFlip | swiperLib.distJsSwiperDotEsmMod.EffectCube | swiperLib.distJsSwiperDotEsmMod.Zoom | swiperLib.distJsSwiperDotEsmMod.Keyboard | swiperLib.distJsSwiperDotEsmMod.Mousewheel | swiperLib.distJsSwiperDotEsmMod.Virtual | swiperLib.distJsSwiperDotEsmMod.HashNavigation | swiperLib.distJsSwiperDotEsmMod.History | swiperLib.distJsSwiperDotEsmMod.Controller | swiperLib.distJsSwiperDotEsmMod.A11y
}
