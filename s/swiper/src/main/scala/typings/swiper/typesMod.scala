package typings.swiper

import typings.std.HTMLElement
import typings.swiper.sharedMod.CSSSelector
import typings.swiper.sharedMod.SwiperModule
import typings.swiper.swiperClassMod.default
import typings.swiper.swiperOptionsMod.SwiperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("swiper/types", "Swiper")
  @js.native
  open class Swiper protected () extends default {
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
    
    @JSImport("swiper/types", "Swiper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Swiper default options
      */
    /* static member */
    @JSImport("swiper/types", "Swiper.defaults")
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
    @JSImport("swiper/types", "Swiper.extendedDefaults")
    @js.native
    def extendedDefaults: SwiperOptions = js.native
    inline def extendedDefaults_=(x: SwiperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedDefaults")(x.asInstanceOf[js.Any])
    
    /**
      * Installs modules on Swiper in runtime.
      */
    /* static member */
    inline def use(modules: js.Array[SwiperModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
