package typings.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.native
  var domainHost: js.UndefOr[Boolean] = js.native
  var scheme: String = js.native
  var unicodeSupport: js.UndefOr[Boolean] = js.native
  def parse(components: ParentComponents, options: Options): Components = js.native
  def serialize(components: Components, options: Options): ParentComponents = js.native
}

object URISchemeHandler {
  @scala.inline
  def apply[/* <: typings.uriJs.mod.URIComponents */ Components, /* <: typings.uriJs.mod.URIOptions */ Options, /* <: typings.uriJs.mod.URIComponents */ ParentComponents](
    parse: (ParentComponents, Options) => Components,
    scheme: String,
    serialize: (Components, Options) => ParentComponents
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
  @scala.inline
  implicit class URISchemeHandlerOps[Self <: URISchemeHandler[_, _, _], /* <: typings.uriJs.mod.URIComponents */ Components, /* <: typings.uriJs.mod.URIOptions */ Options, /* <: typings.uriJs.mod.URIComponents */ ParentComponents] (val x: Self with (URISchemeHandler[Components, Options, ParentComponents])) extends AnyVal {
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
    def setParse(value: (ParentComponents, Options) => Components): Self = this.set("parse", js.Any.fromFunction2(value))
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialize(value: (Components, Options) => ParentComponents): Self = this.set("serialize", js.Any.fromFunction2(value))
    @scala.inline
    def setAbsolutePath(value: Boolean): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    @scala.inline
    def setDomainHost(value: Boolean): Self = this.set("domainHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainHost: Self = this.set("domainHost", js.undefined)
    @scala.inline
    def setUnicodeSupport(value: Boolean): Self = this.set("unicodeSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeSupport: Self = this.set("unicodeSupport", js.undefined)
  }
  
}

