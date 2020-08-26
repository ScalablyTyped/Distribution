package typings.vision.anon

import typings.vision.mod.ViewHandlerOrReplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /** optional object used by the template to render context-specific result. Defaults to no context {}. */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * optional object used to override the server's views manager configuration for this response.
    * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * TODO check if it can have `defaultExtension`.
    */
  var options: js.UndefOr[ViewHandlerOrReplyOptions] = js.native
  /** the template filename and path, relative to the templates path configured via the server views manager. */
  var template: String = js.native
}

object Context {
  @scala.inline
  def apply(template: String): Context = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setOptions(value: ViewHandlerOrReplyOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

