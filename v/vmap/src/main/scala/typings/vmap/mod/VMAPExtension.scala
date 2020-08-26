package typings.vmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about VMAP extension
  */
@js.native
trait VMAPExtension extends js.Object {
  /**
    * Object containing all this extension attributes and their name as the key
    */
  var attribute: js.Any = js.native
  /**
    * Object containing all this extension children and their name as the key
    */
  var children: js.Any = js.native
  /**
    * Object parsed from CDATA or as a fallback all of the text nodes of this extension concatenated
    */
  var value: js.Any = js.native
}

object VMAPExtension {
  @scala.inline
  def apply(attribute: js.Any, children: js.Any, value: js.Any): VMAPExtension = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAPExtension]
  }
  @scala.inline
  implicit class VMAPExtensionOps[Self <: VMAPExtension] (val x: Self) extends AnyVal {
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
    def setAttribute(value: js.Any): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

