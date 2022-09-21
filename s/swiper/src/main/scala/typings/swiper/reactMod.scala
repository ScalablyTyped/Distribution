package typings.swiper

import typings.react.mod.FunctionComponent
import typings.react.mod.VoidFunctionComponent
import typings.swiper.swiperReactMod.SlideData
import typings.swiper.swiperReactMod.SwiperProps
import typings.swiper.swiperReactMod.SwiperSlideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("swiper/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/react", "Swiper")
  @js.native
  val Swiper: FunctionComponent[SwiperProps] = js.native
  
  @JSImport("swiper/react", "SwiperSlide")
  @js.native
  val SwiperSlide: VoidFunctionComponent[SwiperSlideProps] = js.native
  
  inline def useSwiper(): typings.swiper.typesMod.Swiper = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[typings.swiper.typesMod.Swiper]
  
  inline def useSwiperSlide(): SlideData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[SlideData]
}
