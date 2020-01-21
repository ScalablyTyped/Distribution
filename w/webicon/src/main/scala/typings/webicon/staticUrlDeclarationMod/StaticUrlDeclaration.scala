package typings.webicon.staticUrlDeclarationMod

import typings.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticUrlDeclaration extends UrlDeclarationBase {
  @JSName("url")
  var url_StaticUrlDeclaration: js.UndefOr[String] = js.undefined
}

object StaticUrlDeclaration {
  @scala.inline
  def apply(params: js.Any = null, url: String = null): StaticUrlDeclaration = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticUrlDeclaration]
  }
}

