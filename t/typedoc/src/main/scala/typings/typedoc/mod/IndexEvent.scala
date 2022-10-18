package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "IndexEvent")
@js.native
open class IndexEvent protected ()
  extends typings.typedoc.distLibOutputMod.IndexEvent {
  def this(name: String, searchResults: js.Array[typings.typedoc.distLibModelsMod.DeclarationReflection]) = this()
}
/* static members */
object IndexEvent {
  
  /**
    * Triggered on the renderer when the search index is being prepared.
    * @event
    */
  @JSImport("typedoc", "IndexEvent.PREPARE_INDEX")
  @js.native
  val PREPARE_INDEX: /* "prepareIndex" */ String = js.native
}
