package typings.webicon.webStaticUrlDeclarationMod

import typings.webicon.webUrlDeclarationBaseMod.UrlDeclarationBase
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
    if (params != null) __obj.updateDynamic("params")(params)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[StaticUrlDeclaration]
  }
}

