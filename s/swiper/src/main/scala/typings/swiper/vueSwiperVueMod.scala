package typings.swiper

import typings.react.mod.global.JSX.Element
import typings.swiper.anon.A11y
import typings.swiper.anon.ActiveIndexChange
import typings.swiper.anon.IsActive
import typings.swiper.anon.Lazy
import typings.vueReactivity.mod.Ref_
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.ResolveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueSwiperVueMod {
  
  @JSImport("swiper/vue/swiper-vue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/vue/swiper-vue", "Swiper")
  @js.native
  val Swiper: DefineComponent_[
    A11y, 
    js.Function0[Element], 
    Any, 
    js.Object, 
    js.Object, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    ActiveIndexChange, 
    String, 
    PublicProps, 
    ResolveProps[A11y, ActiveIndexChange], 
    ExtractDefaultPropTypes[A11y], 
    js.Object
  ] = js.native
  
  @JSImport("swiper/vue/swiper-vue", "SwiperSlide")
  @js.native
  val SwiperSlide: DefineComponent_[
    Lazy, 
    js.Object, 
    js.Object, 
    ComputedOptions, 
    MethodOptions, 
    ComponentOptionsMixin, 
    ComponentOptionsMixin, 
    js.Object, 
    String, 
    PublicProps, 
    ResolveProps[Lazy, js.Object], 
    ExtractDefaultPropTypes[Lazy], 
    js.Object
  ] = js.native
  
  inline def useSwiper(): Ref_[typings.swiper.typesMod.Swiper] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[Ref_[typings.swiper.typesMod.Swiper]]
  
  inline def useSwiperSlide(): Ref_[IsActive] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[Ref_[IsActive]]
}
