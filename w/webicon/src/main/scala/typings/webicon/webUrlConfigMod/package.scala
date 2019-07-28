package typings.webicon

import typings.webicon.webDynamicUrlDeclarationMod.DynamicUrlDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webUrlConfigMod {
  type UrlConfig[T] = String | DynamicUrlDeclaration[T]
}
