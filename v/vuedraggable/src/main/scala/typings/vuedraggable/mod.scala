package typings.vuedraggable

import org.scalablytyped.runtime.Shortcut
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vuedraggable", JSImport.Default)
  @js.native
  val default: DraggableConstructor = js.native
  
  @JSImport("vuedraggable", "draggable")
  @js.native
  val draggable: DraggableConstructor = js.native
  
  @js.native
  trait DraggableConstructor extends VueConstructor[Vue] {
    
    def data(): js.Any = js.native
    
    var methods: js.Any = js.native
    
    var props: js.Any = js.native
    
    var watch: js.Any = js.native
  }
  
  type _To = DraggableConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: DraggableConstructor = default
}
