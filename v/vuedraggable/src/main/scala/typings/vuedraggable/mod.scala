package typings.vuedraggable

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuedraggable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait DraggableConstructor extends VueConstructor[Vue] {
    var methods: js.Any = js.native
    var props: js.Any = js.native
    var watch: js.Any = js.native
    def data(): js.Any = js.native
  }
  
  val default: DraggableConstructor = js.native
  val draggable: DraggableConstructor = js.native
}

