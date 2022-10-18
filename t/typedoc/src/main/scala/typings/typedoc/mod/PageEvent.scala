package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "PageEvent")
@js.native
open class PageEvent[Model] protected ()
  extends typings.typedoc.distLibOutputMod.PageEvent[Model] {
  /**
    * Create a new Event instance.
    */
  def this(name: String) = this()
}
/* static members */
object PageEvent {
  
  /**
    * Triggered before a document will be rendered.
    * @event
    */
  @JSImport("typedoc", "PageEvent.BEGIN")
  @js.native
  val BEGIN: /* "beginPage" */ String = js.native
  
  /**
    * Triggered after a document has been rendered, just before it is written to disc.
    * @event
    */
  @JSImport("typedoc", "PageEvent.END")
  @js.native
  val END: /* "endPage" */ String = js.native
}
