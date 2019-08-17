package typings.webicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webUrlConfigMod {
  import typings.webicon.webDynamicUrlDeclarationMod.DynamicUrlDeclaration

  type UrlConfig[T] = String | DynamicUrlDeclaration[T]
}
