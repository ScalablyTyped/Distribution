package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swiper", JSImport.Default)
@js.native
class default protected () extends Swiper {
  /**
    * Constructs a new Swiper instance.
    *
    * @param container Where Swiper applies to.
    * @param options   Instance options.
    */
  def this(container: SelectableElement) = this()
  def this(container: SelectableElement, options: SwiperOptions) = this()
}
/* static members */
object default {
  
  /**
    * Installs modules on Swiper in runtime.
    */
  @JSImport("swiper", "default.use")
  @js.native
  def use(modules: js.Array[SwiperModule]): Unit = js.native
}
