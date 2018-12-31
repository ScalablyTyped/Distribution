package typings
package visionLib.visionMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * Utilizes the server views manager to render a template
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
    */
  @JSName("render")
  var render_Original: visionLib.visionMod.visionNs.RenderMethod = js.native
  /**
    * Utilizes the server views manager to render a template
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverrendertemplate-context-options-callback}
    */
  def render(template: java.lang.String): js.Promise[java.lang.String] = js.native
  def render(template: java.lang.String, context: js.Any): js.Promise[java.lang.String] = js.native
  def render(
    template: java.lang.String,
    context: js.Any,
    options: visionLib.visionMod.visionNs.ServerViewsConfiguration
  ): js.Promise[java.lang.String] = js.native
  /**
    * Initializes the server views manager
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#serverviewsoptions}
    */
  def views(options: visionLib.visionMod.visionNs.ServerViewsConfiguration): visionLib.visionMod.visionNs.ViewManager = js.native
}

