package typings.vision.mod.hapiAugmentingMod

import typings.hapi.mod.ResponseObject
import typings.vision.mod.ViewHandlerOrReplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseToolkit extends js.Object {
  /**
    * Concludes the handler activity by returning control over to the router with a templatized view response
    * Returns a response object. The generated response will have the variety property set to view.
    * The response flow control rules apply.
    * @param template  the template filename and path, relative to the templates path configured via the server views manager.
    * @param context  optional object used by the template to render context-specific result. Defaults to no context {}.
    * @param options  optional object used to override the server's views manager configuration for this response.
    *                 Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#replyviewtemplate-context-options}
    */
  def view(templatePath: String): ResponseObject = js.native
  def view(templatePath: String, context: js.Any): ResponseObject = js.native
  def view(templatePath: String, context: js.Any, options: ViewHandlerOrReplyOptions): ResponseObject = js.native
}

