package typings.webicon.webDynamicUrlDeclarationMod

import typings.webicon.webStaticUrlDeclarationMod.StaticUrlDeclaration
import typings.webicon.webUrlDeclarationBaseMod.UrlDeclarationBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicUrlDeclaration[T] extends UrlDeclarationBase {
  /**
    * Either the actual url or a function for generating the url.
    */
  @JSName("url")
  var url_DynamicUrlDeclaration: js.UndefOr[String | (js.Function1[/* args */ T, String | StaticUrlDeclaration])] = js.undefined
}

object DynamicUrlDeclaration {
  @scala.inline
  def apply[T](
    params: js.Any = null,
    url: String | (js.Function1[/* args */ T, String | StaticUrlDeclaration]) = null
  ): DynamicUrlDeclaration[T] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicUrlDeclaration[T]]
  }
}

