package typings.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.stylableRuntime.typesMod.NodeRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyedListRendererMod {
  
  @JSImport("@stylable/runtime/cjs/keyed-list-renderer", "createDOMListRenderer")
  @js.native
  def createDOMListRenderer[I, O /* <: Element */, C /* <: Element */](nodeRenderer: NodeRenderer[I, O]): DOMListRenderer[I, O, C] = js.native
  
  @js.native
  trait DOMListRenderer[I, O /* <: Element */, C /* <: Element */] extends StObject {
    
    var nodes: StringDictionary[O] = js.native
    
    def render(container: C): Unit = js.native
    def render(container: C, data: js.Array[I]): Unit = js.native
  }
}
