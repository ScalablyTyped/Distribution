package typings.uirouterCore.mod

import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typings.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "BaseUrlRule")
@js.native
class BaseUrlRule protected ()
  extends typings.uirouterCore.libUrlMod.BaseUrlRule {
  def this(`match`: UrlRuleMatchFn) = this()
  def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
}

