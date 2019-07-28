package typings.atUirouterCore.libUrlMod

import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url", "BaseUrlRule")
@js.native
class BaseUrlRule protected ()
  extends typings.atUirouterCore.libUrlUrlRuleMod.BaseUrlRule {
  def this(`match`: UrlRuleMatchFn) = this()
  def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
}

