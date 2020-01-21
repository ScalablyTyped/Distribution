package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("swiper", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Installs modules on Swiper in runtime.
    */
  def use(modules: js.Array[SwiperModule]): Unit = js.native
}

