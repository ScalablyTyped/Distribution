package typings
package visionLib.visionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View Manager
  * @see {@link https://github.com/hapijs/vision/blob/master/API.md#view-manager}
  */
@js.native
trait ViewManager extends js.Object {
  /**
    * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
    */
  @JSName("render")
  var render_Original: RenderMethod = js.native
  /**
    * Registers a helper, on all configured engines that have a registerHelper() method, for use during template rendering.
    * Engines without a registerHelper() method will be skipped.
    * The name is the name that templates should use to reference the helper and helper is the function that will be invoked when the helper is called.
    * @param name
    * @param helper
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerregisterhelpername-helper}
    */
  def registerHelper(name: java.lang.String, helper: js.Function1[/* repeated */ js.Any, _]): scala.Unit = js.native
  /**
    * Renders a template. This is typically not needed and it is usually more convenient to use server.render().
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#managerrendertemplate-context-options-callback}
    */
  def render(template: java.lang.String): js.Promise[java.lang.String] = js.native
  def render(template: java.lang.String, context: js.Any): js.Promise[java.lang.String] = js.native
  def render(template: java.lang.String, context: js.Any, options: ServerViewsConfiguration): js.Promise[java.lang.String] = js.native
}

