package typings.swiper

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.swiper.anon.TypeofCommonModule
import typings.swiper.anon.TypeofSwiperComponent
import typings.swiper.anon.TypeofSwiperSlideDirectiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperModuleMod {
  
  @JSImport("swiper/angular/angular/src/swiper.module", "SwiperModule")
  @js.native
  open class SwiperModule () extends StObject
  /* static members */
  object SwiperModule {
    
    @JSImport("swiper/angular/angular/src/swiper.module", "SwiperModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swiper/angular/angular/src/swiper.module", "SwiperModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SwiperModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SwiperModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("swiper/angular/angular/src/swiper.module", "SwiperModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[SwiperModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("swiper/angular/angular/src/swiper.module", "SwiperModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        SwiperModule, 
        js.Tuple2[TypeofSwiperComponent, TypeofSwiperSlideDirectiv], 
        js.Array[TypeofCommonModule], 
        js.Tuple2[TypeofSwiperComponent, TypeofSwiperSlideDirectiv]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          SwiperModule, 
          js.Tuple2[TypeofSwiperComponent, TypeofSwiperSlideDirectiv], 
          js.Array[TypeofCommonModule], 
          js.Tuple2[TypeofSwiperComponent, TypeofSwiperSlideDirectiv]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
}
