package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserParameters extends js.Object {
  /**
    * Turn the tagsNames to lowercase
    */
  var lowercaseTagnames: js.UndefOr[Boolean] = js.native
  /**
    * Disables xml namespaces
    */
  var noNamespaces: js.UndefOr[Boolean] = js.native
  /**
    * Do not normalize whitespaces in text
    */
  var noNormalizeWhitespaces: js.UndefOr[Boolean] = js.native
  /**
    * Disable position tracing of sax
    */
  var noTracing: js.UndefOr[Boolean] = js.native
  /**
    * Do not trimtext and comment nodes
    */
  var noTrim: js.UndefOr[Boolean] = js.native
  /**
    * Whenever or not to use a strict parser
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Allow only predefined entities
    */
  var strictEntities: js.UndefOr[Boolean] = js.native
}

object ParserParameters {
  @scala.inline
  def apply(): ParserParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserParameters]
  }
  @scala.inline
  implicit class ParserParametersOps[Self <: ParserParameters] (val x: Self) extends AnyVal {
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
    def setLowercaseTagnames(value: Boolean): Self = this.set("lowercaseTagnames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercaseTagnames: Self = this.set("lowercaseTagnames", js.undefined)
    @scala.inline
    def setNoNamespaces(value: Boolean): Self = this.set("noNamespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoNamespaces: Self = this.set("noNamespaces", js.undefined)
    @scala.inline
    def setNoNormalizeWhitespaces(value: Boolean): Self = this.set("noNormalizeWhitespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoNormalizeWhitespaces: Self = this.set("noNormalizeWhitespaces", js.undefined)
    @scala.inline
    def setNoTracing(value: Boolean): Self = this.set("noTracing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoTracing: Self = this.set("noTracing", js.undefined)
    @scala.inline
    def setNoTrim(value: Boolean): Self = this.set("noTrim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoTrim: Self = this.set("noTrim", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setStrictEntities(value: Boolean): Self = this.set("strictEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictEntities: Self = this.set("strictEntities", js.undefined)
  }
  
}

