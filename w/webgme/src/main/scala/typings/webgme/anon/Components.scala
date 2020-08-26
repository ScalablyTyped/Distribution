package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  /**
    * Routing path (keys) from origin and file-path 
    * (values) to custom REST components.
    * Use the RestRouterGenerator plugin to generate 
    * a template router (see the generated file for more info).
    *   config.rest.components = {};
    */
  var components: js.Any = js.native
}

object Components {
  @scala.inline
  def apply(components: js.Any): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  @scala.inline
  implicit class ComponentsOps[Self <: Components] (val x: Self) extends AnyVal {
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
    def setComponents(value: js.Any): Self = this.set("components", value.asInstanceOf[js.Any])
  }
  
}

