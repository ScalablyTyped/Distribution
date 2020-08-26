package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The optional suffix present on implementation files.
    *
    * @default ""
    */
  var implSuffix: js.UndefOr[String] = js.native
  /**
    * The function used to modify attributes and operations
    * with the `[CEReactions]` extended attribute.
    *
    * The default value is the identity function.
    */
  var processCEReactions: js.UndefOr[CodeProcessor] = js.native
  /**
    * The function used to modify attributes and operations
    * with the `[HTMLConstructor]` extended attribute.
    *
    * The default value is the identity function.
    */
  var processHTMLConstructor: js.UndefOr[CodeProcessor] = js.native
  /**
    * The function used to generate attributes and operations
    * with the `[Reflect]` extended attribute.
    *
    * @default null
    */
  var processReflect: js.UndefOr[AttributeProcessor | Null] = js.native
  /**
    * Whether non-fatal errors should be ignored.
    *
    * @default false
    */
  var suppressErrors: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setImplSuffix(value: String): Self = this.set("implSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplSuffix: Self = this.set("implSuffix", js.undefined)
    @scala.inline
    def setProcessCEReactions(value: CodeProcessor): Self = this.set("processCEReactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessCEReactions: Self = this.set("processCEReactions", js.undefined)
    @scala.inline
    def setProcessHTMLConstructor(value: CodeProcessor): Self = this.set("processHTMLConstructor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessHTMLConstructor: Self = this.set("processHTMLConstructor", js.undefined)
    @scala.inline
    def setProcessReflect(value: AttributeProcessor): Self = this.set("processReflect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessReflect: Self = this.set("processReflect", js.undefined)
    @scala.inline
    def setProcessReflectNull: Self = this.set("processReflect", null)
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrors: Self = this.set("suppressErrors", js.undefined)
  }
  
}

