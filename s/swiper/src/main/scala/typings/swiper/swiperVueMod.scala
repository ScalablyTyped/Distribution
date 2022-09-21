package typings.swiper

import typings.react.mod.global.JSX.Element
import typings.swiper.anon.ActiveIndexChange
import typings.swiper.anon.AllowSlideNext
import typings.swiper.anon.IsDuplicate
import typings.swiper.anon.SwiperRef
import typings.vueReactivity.mod.Ref_
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.EmitsToProps
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.ExtractPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperVueMod {
  
  @JSImport("swiper/vue/swiper-vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/vue/swiper-vue", "Swiper")
  @js.native
  val Swiper: DefineComponent_[
    AllowSlideNext, 
    js.Function0[Element], 
    Any, 
    js.Object, 
    js.Object, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    ActiveIndexChange, 
    String, 
    PublicProps, 
    (AllowSlideNext | ExtractPropTypes[AllowSlideNext]) & (EmitsToProps[ActiveIndexChange] | js.Object), 
    ExtractDefaultPropTypes[AllowSlideNext]
  ] = js.native
  
  @JSImport("swiper/vue/swiper-vue", "SwiperSlide")
  @js.native
  val SwiperSlide: DefineComponent_[
    SwiperRef, 
    js.Object, 
    js.Object, 
    ComputedOptions, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    (SwiperRef | ExtractPropTypes[SwiperRef]) & (EmitsToProps[js.Object] | js.Object), 
    ExtractDefaultPropTypes[SwiperRef]
  ] = js.native
  
  inline def useSwiper(): Ref_[typings.swiper.typesMod.Swiper] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[Ref_[typings.swiper.typesMod.Swiper]]
  
  inline def useSwiperSlide(): Ref_[IsDuplicate] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[Ref_[IsDuplicate]]
}
