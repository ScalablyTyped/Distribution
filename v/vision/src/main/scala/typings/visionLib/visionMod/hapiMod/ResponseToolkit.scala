package typings
package visionLib.visionMod.hapiMod

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
  def view(templatePath: java.lang.String): hapiLib.hapiMod.ResponseObject = js.native
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
  def view(templatePath: java.lang.String, context: js.Any): hapiLib.hapiMod.ResponseObject = js.native
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
  def view(
    templatePath: java.lang.String,
    context: js.Any,
    options: visionLib.visionMod.visionNs.ViewHandlerOrReplyOptions
  ): hapiLib.hapiMod.ResponseObject = js.native
}

