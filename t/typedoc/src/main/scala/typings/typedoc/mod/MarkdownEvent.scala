package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "MarkdownEvent")
@js.native
open class MarkdownEvent protected ()
  extends typings.typedoc.outputMod.MarkdownEvent {
  def this(name: String, originalText: String, parsedText: String) = this()
}
/* static members */
object MarkdownEvent {
  
  /**
    * Triggered on the renderer when this plugin parses a markdown string.
    * @event
    */
  @JSImport("typedoc", "MarkdownEvent.PARSE")
  @js.native
  val PARSE: /* "parseMarkdown" */ String = js.native
}
