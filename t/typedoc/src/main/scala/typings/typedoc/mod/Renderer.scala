package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Renderer")
@js.native
open class Renderer protected ()
  extends typings.typedoc.distLibOutputMod.Renderer {
  /**
    * Create new Component instance.
    */
  def this(owner: typings.typedoc.distLibApplicationMod.Application) = this()
}
/* static members */
object Renderer {
  
  /** @event */
  @JSImport("typedoc", "Renderer.EVENT_BEGIN")
  @js.native
  val EVENT_BEGIN: /* "beginRender" */ String = js.native
  
  /** @event */
  @JSImport("typedoc", "Renderer.EVENT_BEGIN_PAGE")
  @js.native
  val EVENT_BEGIN_PAGE: /* "beginPage" */ String = js.native
  
  /** @event */
  @JSImport("typedoc", "Renderer.EVENT_END")
  @js.native
  val EVENT_END: /* "endRender" */ String = js.native
  
  /** @event */
  @JSImport("typedoc", "Renderer.EVENT_END_PAGE")
  @js.native
  val EVENT_END_PAGE: /* "endPage" */ String = js.native
  
  /** @event */
  @JSImport("typedoc", "Renderer.EVENT_PREPARE_INDEX")
  @js.native
  val EVENT_PREPARE_INDEX: /* "prepareIndex" */ String = js.native
}
