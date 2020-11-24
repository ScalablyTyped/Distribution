package typings.vision.mod.hapiAugmentingMod

import typings.vision.mod.RenderMethod
import typings.vision.mod.ServerViewsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /**
    * request.render() works the same way as server.render() but is for use inside of request handlers.
    * server.render() does not work inside request handlers when called via request.server.render() if the view manager was created by a plugin.
    * This is because the request.server object does not have access to the plugin realm where the view manager was configured.
    * request.render() gets its realm from the route that the request was bound to.
    * Note that this will not work in onRequest extensions added by the plugin because the route isn't yet set at this point in the request
    * lifecycle and the request.render() method will produce the same limited results server.render() can.
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#requestrendertemplate-context-options-callback}
    */
  def render(template: String): js.Promise[String] = js.native
  def render(template: String, context: js.UndefOr[scala.Nothing], options: ServerViewsConfiguration): js.Promise[String] = js.native
  def render(template: String, context: js.Any): js.Promise[String] = js.native
  def render(template: String, context: js.Any, options: ServerViewsConfiguration): js.Promise[String] = js.native
  /**
    * request.render() works the same way as server.render() but is for use inside of request handlers.
    * server.render() does not work inside request handlers when called via request.server.render() if the view manager was created by a plugin.
    * This is because the request.server object does not have access to the plugin realm where the view manager was configured.
    * request.render() gets its realm from the route that the request was bound to.
    * Note that this will not work in onRequest extensions added by the plugin because the route isn't yet set at this point in the request
    * lifecycle and the request.render() method will produce the same limited results server.render() can.
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#requestrendertemplate-context-options-callback}
    */
  @JSName("render")
  var render_Original: RenderMethod = js.native
}
