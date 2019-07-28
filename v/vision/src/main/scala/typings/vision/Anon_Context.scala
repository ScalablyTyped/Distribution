package typings.vision

import typings.vision.visionMod.ViewHandlerOrReplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /** optional object used by the template to render context-specific result. Defaults to no context {}. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * optional object used to override the server's views manager configuration for this response.
    * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * TODO check if it can have `defaultExtension`.
    */
  var options: js.UndefOr[ViewHandlerOrReplyOptions] = js.undefined
  /** the template filename and path, relative to the templates path configured via the server views manager. */
  var template: String
}

object Anon_Context {
  @scala.inline
  def apply(template: String, context: js.Object = null, options: ViewHandlerOrReplyOptions = null): Anon_Context = {
    val __obj = js.Dynamic.literal(template = template)
    if (context != null) __obj.updateDynamic("context")(context)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Context]
  }
}

