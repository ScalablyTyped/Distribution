package typings.atUirouterCore.libUrlInterfaceMod

import typings.atUirouterCore.atUirouterCoreStrings.REGEXP
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpRule extends UrlRule {
  var regexp: RegExp = js.native
  @JSName("type")
  var type_RegExpRule: REGEXP = js.native
}

