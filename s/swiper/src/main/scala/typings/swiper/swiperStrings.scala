package typings.swiper

import typings.swiper.mod.AutoplayEvent
import typings.swiper.mod.CommonEvent
import typings.swiper.mod.LazyLoadingEvent
import typings.swiper.mod.PaginationEvent
import typings.swiper.mod.SwiperEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object swiperStrings {
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait autoplay
    extends AutoplayEvent
       with SwiperEvent
  
  @js.native
  sealed trait autoplayStart
    extends AutoplayEvent
       with SwiperEvent
  
  @js.native
  sealed trait autoplayStop
    extends AutoplayEvent
       with SwiperEvent
  
  @js.native
  sealed trait beforeDestroy
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait beforeLoopFix
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait bullets extends js.Object
  
  @js.native
  sealed trait click
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait column extends js.Object
  
  @js.native
  sealed trait container extends js.Object
  
  @js.native
  sealed trait coverflow extends js.Object
  
  @js.native
  sealed trait cube extends js.Object
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait doubleTap
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait fade extends js.Object
  
  @js.native
  sealed trait flip extends js.Object
  
  @js.native
  sealed trait fraction extends js.Object
  
  @js.native
  sealed trait fromEdge
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait imagesReady
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait init
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait lazyImageLoad
    extends LazyLoadingEvent
       with SwiperEvent
  
  @js.native
  sealed trait lazyImageReady
    extends LazyLoadingEvent
       with SwiperEvent
  
  @js.native
  sealed trait loopFix
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait observerUpdate
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait paginationRender
    extends PaginationEvent
       with SwiperEvent
  
  @js.native
  sealed trait paginationUpdate
    extends PaginationEvent
       with SwiperEvent
  
  @js.native
  sealed trait progress
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait progressbar extends js.Object
  
  @js.native
  sealed trait reachBeginning
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait reachEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait resize
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait row extends js.Object
  
  @js.native
  sealed trait setTransition
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait setTranslate
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slide extends js.Object
  
  @js.native
  sealed trait slideChange
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slideChangeTransitionEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slideChangeTransitionStart
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slideNextTransitionEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slideNextTransitionStart
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slidePrevTransitionEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait slidePrevTransitionStart
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait sliderMove
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait tap
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait touchEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait touchMove
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait touchMoveOpposite
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait touchStart
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait transitionEnd
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait transitionStart
    extends CommonEvent
       with SwiperEvent
  
  @js.native
  sealed trait vertical extends js.Object
  
  @js.native
  sealed trait wrapper extends js.Object
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def autoplay: autoplay = "autoplay".asInstanceOf[autoplay]
  @scala.inline
  def autoplayStart: autoplayStart = "autoplayStart".asInstanceOf[autoplayStart]
  @scala.inline
  def autoplayStop: autoplayStop = "autoplayStop".asInstanceOf[autoplayStop]
  @scala.inline
  def beforeDestroy: beforeDestroy = "beforeDestroy".asInstanceOf[beforeDestroy]
  @scala.inline
  def beforeLoopFix: beforeLoopFix = "beforeLoopFix".asInstanceOf[beforeLoopFix]
  @scala.inline
  def bullets: bullets = "bullets".asInstanceOf[bullets]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  @scala.inline
  def coverflow: coverflow = "coverflow".asInstanceOf[coverflow]
  @scala.inline
  def cube: cube = "cube".asInstanceOf[cube]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def doubleTap: doubleTap = "doubleTap".asInstanceOf[doubleTap]
  @scala.inline
  def fade: fade = "fade".asInstanceOf[fade]
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  @scala.inline
  def fraction: fraction = "fraction".asInstanceOf[fraction]
  @scala.inline
  def fromEdge: fromEdge = "fromEdge".asInstanceOf[fromEdge]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def imagesReady: imagesReady = "imagesReady".asInstanceOf[imagesReady]
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  @scala.inline
  def lazyImageLoad: lazyImageLoad = "lazyImageLoad".asInstanceOf[lazyImageLoad]
  @scala.inline
  def lazyImageReady: lazyImageReady = "lazyImageReady".asInstanceOf[lazyImageReady]
  @scala.inline
  def loopFix: loopFix = "loopFix".asInstanceOf[loopFix]
  @scala.inline
  def observerUpdate: observerUpdate = "observerUpdate".asInstanceOf[observerUpdate]
  @scala.inline
  def paginationRender: paginationRender = "paginationRender".asInstanceOf[paginationRender]
  @scala.inline
  def paginationUpdate: paginationUpdate = "paginationUpdate".asInstanceOf[paginationUpdate]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def progressbar: progressbar = "progressbar".asInstanceOf[progressbar]
  @scala.inline
  def reachBeginning: reachBeginning = "reachBeginning".asInstanceOf[reachBeginning]
  @scala.inline
  def reachEnd: reachEnd = "reachEnd".asInstanceOf[reachEnd]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def setTransition: setTransition = "setTransition".asInstanceOf[setTransition]
  @scala.inline
  def setTranslate: setTranslate = "setTranslate".asInstanceOf[setTranslate]
  @scala.inline
  def slide: slide = "slide".asInstanceOf[slide]
  @scala.inline
  def slideChange: slideChange = "slideChange".asInstanceOf[slideChange]
  @scala.inline
  def slideChangeTransitionEnd: slideChangeTransitionEnd = "slideChangeTransitionEnd".asInstanceOf[slideChangeTransitionEnd]
  @scala.inline
  def slideChangeTransitionStart: slideChangeTransitionStart = "slideChangeTransitionStart".asInstanceOf[slideChangeTransitionStart]
  @scala.inline
  def slideNextTransitionEnd: slideNextTransitionEnd = "slideNextTransitionEnd".asInstanceOf[slideNextTransitionEnd]
  @scala.inline
  def slideNextTransitionStart: slideNextTransitionStart = "slideNextTransitionStart".asInstanceOf[slideNextTransitionStart]
  @scala.inline
  def slidePrevTransitionEnd: slidePrevTransitionEnd = "slidePrevTransitionEnd".asInstanceOf[slidePrevTransitionEnd]
  @scala.inline
  def slidePrevTransitionStart: slidePrevTransitionStart = "slidePrevTransitionStart".asInstanceOf[slidePrevTransitionStart]
  @scala.inline
  def sliderMove: sliderMove = "sliderMove".asInstanceOf[sliderMove]
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  @scala.inline
  def touchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  @scala.inline
  def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  @scala.inline
  def touchMoveOpposite: touchMoveOpposite = "touchMoveOpposite".asInstanceOf[touchMoveOpposite]
  @scala.inline
  def touchStart: touchStart = "touchStart".asInstanceOf[touchStart]
  @scala.inline
  def transitionEnd: transitionEnd = "transitionEnd".asInstanceOf[transitionEnd]
  @scala.inline
  def transitionStart: transitionStart = "transitionStart".asInstanceOf[transitionStart]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def wrapper: wrapper = "wrapper".asInstanceOf[wrapper]
}

