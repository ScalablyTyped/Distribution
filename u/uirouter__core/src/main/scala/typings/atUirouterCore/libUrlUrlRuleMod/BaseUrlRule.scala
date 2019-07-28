package typings.atUirouterCore.libUrlUrlRuleMod

import typings.atUirouterCore.libUrlInterfaceMod.UrlRule
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlRule", "BaseUrlRule")
@js.native
class BaseUrlRule protected () extends UrlRule {
  def this(`match`: UrlRuleMatchFn) = this()
  def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
}

