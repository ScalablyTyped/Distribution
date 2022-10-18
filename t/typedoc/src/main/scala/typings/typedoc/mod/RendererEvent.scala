package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "RendererEvent")
@js.native
open class RendererEvent protected ()
  extends typings.typedoc.distLibOutputMod.RendererEvent {
  def this(
    name: String,
    outputDirectory: String,
    project: typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ) = this()
}
/* static members */
object RendererEvent {
  
  /**
    * Triggered before the renderer starts rendering a project.
    * @event
    */
  @JSImport("typedoc", "RendererEvent.BEGIN")
  @js.native
  val BEGIN: /* "beginRender" */ String = js.native
  
  /**
    * Triggered after the renderer has written all documents.
    * @event
    */
  @JSImport("typedoc", "RendererEvent.END")
  @js.native
  val END: /* "endRender" */ String = js.native
}
