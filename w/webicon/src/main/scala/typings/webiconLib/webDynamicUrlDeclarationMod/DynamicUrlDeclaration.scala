package typings
package webiconLib.webDynamicUrlDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicUrlDeclaration[T]
  extends webiconLib.webUrlDeclarationBaseMod.UrlDeclarationBase {
  /**
    * Either the actual url or a function for generating the url.
    */
  @JSName("url")
  var url_DynamicUrlDeclaration: js.UndefOr[
    java.lang.String | (js.Function1[
      /* args */ T, 
      java.lang.String | webiconLib.webStaticUrlDeclarationMod.StaticUrlDeclaration
    ])
  ] = js.undefined
}

object DynamicUrlDeclaration {
  @scala.inline
  def apply[T](
    params: js.Any = null,
    url: java.lang.String | (js.Function1[
      /* args */ T, 
      java.lang.String | webiconLib.webStaticUrlDeclarationMod.StaticUrlDeclaration
    ]) = null
  ): DynamicUrlDeclaration[T] = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicUrlDeclaration[T]]
  }
}

