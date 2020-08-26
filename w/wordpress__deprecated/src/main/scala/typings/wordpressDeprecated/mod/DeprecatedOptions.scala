package typings.wordpressDeprecated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecatedOptions extends js.Object {
  /**
    * Feature to use instead.
    */
  var alternative: js.UndefOr[String] = js.native
  /**
    * Additional message to help transition away from the deprecated feature.
    */
  var hint: js.UndefOr[String] = js.native
  /**
    * Link to documentation.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Plugin name if it's a plugin feature.
    */
  var plugin: js.UndefOr[String] = js.native
  /**
    * Version in which the feature will be removed.
    */
  var version: js.UndefOr[String] = js.native
}

object DeprecatedOptions {
  @scala.inline
  def apply(): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedOptions]
  }
  @scala.inline
  implicit class DeprecatedOptionsOps[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
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
    def setAlternative(value: String): Self = this.set("alternative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternative: Self = this.set("alternative", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

