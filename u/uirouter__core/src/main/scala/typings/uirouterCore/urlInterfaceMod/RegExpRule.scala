package typings.uirouterCore.urlInterfaceMod

import typings.std.RegExp
import typings.uirouterCore.uirouterCoreStrings.REGEXP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpRule extends UrlRule {
  var regexp: RegExp = js.native
  @JSName("type")
  var type_RegExpRule: REGEXP = js.native
}

