package typings.swiper

import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.swiper.anon.AutoplayDelay
import typings.swiper.anon.IsActive
import typings.swiper.swiperBooleans.`false`
import typings.swiper.swiperStrings.`ng-template[swiperSlide]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularAngularSrcSwiperSlideDotdirectiveMod {
  
  @JSImport("swiper/angular/angular/src/swiper-slide.directive", "SwiperSlideDirective")
  @js.native
  open class SwiperSlideDirective protected () extends StObject {
    def this(template: TemplateRef[Any]) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _hasClass: Any = js.native
    
    /* private */ var _zoom: Any = js.native
    
    var autoplayDelay: String | Null = js.native
    
    var `class`: String = js.native
    
    def classNames: String = js.native
    def classNames_=(`val`: String): Unit = js.native
    
    def ngClass_=(`val`: String): Unit = js.native
    
    var slideData: IsActive = js.native
    
    var slideIndex: Double = js.native
    
    var template: TemplateRef[Any] = js.native
    
    var virtualIndex: Double = js.native
    
    def zoom: Boolean = js.native
    def zoom_=(`val`: Boolean): Unit = js.native
  }
  /* static members */
  object SwiperSlideDirective {
    
    @JSImport("swiper/angular/angular/src/swiper-slide.directive", "SwiperSlideDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swiper/angular/angular/src/swiper-slide.directive", "SwiperSlideDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        SwiperSlideDirective, 
        `ng-template[swiperSlide]`, 
        scala.Nothing, 
        AutoplayDelay, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          SwiperSlideDirective, 
          `ng-template[swiperSlide]`, 
          scala.Nothing, 
          AutoplayDelay, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("swiper/angular/angular/src/swiper-slide.directive", "SwiperSlideDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SwiperSlideDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SwiperSlideDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
