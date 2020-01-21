package typings.webicon

import typings.webicon.dynamicUrlDeclarationMod.DynamicUrlDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webicon/Web/UrlConfig", JSImport.Namespace)
@js.native
object urlConfigMod extends js.Object {
  type UrlConfig[T] = String | DynamicUrlDeclaration[T]
}

