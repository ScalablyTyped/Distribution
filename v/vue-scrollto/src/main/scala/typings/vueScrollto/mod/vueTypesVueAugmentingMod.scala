package typings.vueScrollto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$scrollTo")
    var $scrollTo_Original: ScrollToFunction = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: ElementDescriptor): js.Function0[Unit] = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
    @JSName("$scrollTo")
    def $scrollTo(options: ScrollOptions): js.Function0[Unit] = js.native
  }
  
}

