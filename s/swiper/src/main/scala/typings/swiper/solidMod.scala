package typings.swiper

import typings.swiper.solidSwiperSolidMod.SlideData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solidMod {
  
  @JSImport("swiper/solid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/solid", "Swiper")
  @js.native
  val Swiper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SwiperProps> */ Any = js.native
  
  @JSImport("swiper/solid", "SwiperSlide")
  @js.native
  val SwiperSlide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SwiperSlideProps> */ Any = js.native
  
  inline def useSwiper(): typings.swiper.typesMod.Swiper = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[typings.swiper.typesMod.Swiper]
  
  inline def useSwiperSlide(): SlideData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[SlideData]
}
