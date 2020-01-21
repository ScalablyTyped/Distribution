package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.uirouterCoreStrings.STATE
import typings.uirouterCore.uirouterCoreStrings.URLMATCHER
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherUrlRule extends UrlRule {
  @JSName("type")
  var type_MatcherUrlRule: URLMATCHER | STATE = js.native
  var urlMatcher: UrlMatcher = js.native
}

