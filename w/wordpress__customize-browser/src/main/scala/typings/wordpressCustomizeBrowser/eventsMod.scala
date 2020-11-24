package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Callbacks
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  @js.native
  class Events[T /* <: /* keyof any */ String */] () extends js.Object {
    
    def bind(id: T): this.type = js.native
    
    // TODO: class with statics instead?
    var topics: Record[T, Callbacks[js.Function]] = js.native
    
    def trigger(id: T): this.type = js.native
    
    def unbind(id: T): this.type = js.native
  }
}
