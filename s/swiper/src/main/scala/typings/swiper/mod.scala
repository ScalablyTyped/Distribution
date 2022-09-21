package typings.swiper

import typings.std.HTMLElement
import typings.swiper.sharedMod.CSSSelector
import typings.swiper.sharedMod.SwiperModule
import typings.swiper.swiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swiper", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.swiper.swiperClassMod.default {
    def this(container: HTMLElement) = this()
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: CSSSelector) = this()
    def this(container: HTMLElement, options: SwiperOptions) = this()
    def this(container: CSSSelector, options: SwiperOptions) = this()
  }
  object default {
    
    @JSImport("swiper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Swiper default options
      */
    /* static member */
    @JSImport("swiper", "default.defaults")
    @js.native
    def defaults: SwiperOptions = js.native
    inline def defaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /**
      * Extend global Swiper defaults
      */
    /* static member */
    inline def extendDefaults(options: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Object with global Swiper extended options
      */
    /* static member */
    @JSImport("swiper", "default.extendedDefaults")
    @js.native
    def extendedDefaults: SwiperOptions = js.native
    inline def extendedDefaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedDefaults")(x.asInstanceOf[js.Any])
    
    /**
      * Installs modules on Swiper in runtime.
      */
    /* static member */
    inline def use(modules: js.Array[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("swiper", "A11y")
  @js.native
  val A11y: SwiperModule = js.native
  
  @JSImport("swiper", "Autoplay")
  @js.native
  val Autoplay: SwiperModule = js.native
  
  @JSImport("swiper", "Controller")
  @js.native
  val Controller: SwiperModule = js.native
  
  @JSImport("swiper", "EffectCards")
  @js.native
  val EffectCards: SwiperModule = js.native
  
  @JSImport("swiper", "EffectCoverflow")
  @js.native
  val EffectCoverflow: SwiperModule = js.native
  
  @JSImport("swiper", "EffectCreative")
  @js.native
  val EffectCreative: SwiperModule = js.native
  
  @JSImport("swiper", "EffectCube")
  @js.native
  val EffectCube: SwiperModule = js.native
  
  @JSImport("swiper", "EffectFade")
  @js.native
  val EffectFade: SwiperModule = js.native
  
  @JSImport("swiper", "EffectFlip")
  @js.native
  val EffectFlip: SwiperModule = js.native
  
  @JSImport("swiper", "FreeMode")
  @js.native
  val FreeMode: SwiperModule = js.native
  
  @JSImport("swiper", "Grid")
  @js.native
  val Grid: SwiperModule = js.native
  
  @JSImport("swiper", "HashNavigation")
  @js.native
  val HashNavigation: SwiperModule = js.native
  
  @JSImport("swiper", "History")
  @js.native
  val History: SwiperModule = js.native
  
  @JSImport("swiper", "Keyboard")
  @js.native
  val Keyboard: SwiperModule = js.native
  
  @JSImport("swiper", "Lazy")
  @js.native
  val Lazy: SwiperModule = js.native
  
  @JSImport("swiper", "Manipulation")
  @js.native
  val Manipulation: SwiperModule = js.native
  
  @JSImport("swiper", "Mousewheel")
  @js.native
  val Mousewheel: SwiperModule = js.native
  
  @JSImport("swiper", "Navigation")
  @js.native
  val Navigation: SwiperModule = js.native
  
  @JSImport("swiper", "Pagination")
  @js.native
  val Pagination: SwiperModule = js.native
  
  @JSImport("swiper", "Parallax")
  @js.native
  val Parallax: SwiperModule = js.native
  
  @JSImport("swiper", "Scrollbar")
  @js.native
  val Scrollbar: SwiperModule = js.native
  
  @JSImport("swiper", "Swiper")
  @js.native
  open class Swiper protected ()
    extends typings.swiper.swiperClassMod.default {
    def this(container: HTMLElement) = this()
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: CSSSelector) = this()
    def this(container: HTMLElement, options: SwiperOptions) = this()
    def this(container: CSSSelector, options: SwiperOptions) = this()
  }
  object Swiper {
    
    @JSImport("swiper", "Swiper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Swiper default options
      */
    /* static member */
    @JSImport("swiper", "Swiper.defaults")
    @js.native
    def defaults: SwiperOptions = js.native
    inline def defaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /**
      * Extend global Swiper defaults
      */
    /* static member */
    inline def extendDefaults(options: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Object with global Swiper extended options
      */
    /* static member */
    @JSImport("swiper", "Swiper.extendedDefaults")
    @js.native
    def extendedDefaults: SwiperOptions = js.native
    inline def extendedDefaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedDefaults")(x.asInstanceOf[js.Any])
    
    /**
      * Installs modules on Swiper in runtime.
      */
    /* static member */
    inline def use(modules: js.Array[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("swiper", "Thumbs")
  @js.native
  val Thumbs: SwiperModule = js.native
  
  @JSImport("swiper", "Virtual")
  @js.native
  val Virtual: SwiperModule = js.native
  
  @JSImport("swiper", "Zoom")
  @js.native
  val Zoom: SwiperModule = js.native
}
