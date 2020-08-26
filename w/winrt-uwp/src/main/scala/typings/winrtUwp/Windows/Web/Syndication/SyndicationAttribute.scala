package typings.winrtUwp.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom attribute not defined in the specification. */
@js.native
trait SyndicationAttribute extends js.Object {
  /** Gets the name of the syndication attribute. */
  var name: String = js.native
  /** Gets the namespace of the attribute. */
  var namespace: String = js.native
  /** Gets or sets the value of the attribute. */
  var value: String = js.native
}

object SyndicationAttribute {
  @scala.inline
  def apply(name: String, namespace: String, value: String): SyndicationAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationAttribute]
  }
  @scala.inline
  implicit class SyndicationAttributeOps[Self <: SyndicationAttribute] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

