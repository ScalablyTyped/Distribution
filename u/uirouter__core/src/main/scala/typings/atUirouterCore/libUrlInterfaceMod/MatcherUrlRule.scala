package typings.atUirouterCore.libUrlInterfaceMod

import typings.atUirouterCore.atUirouterCoreStrings.STATE
import typings.atUirouterCore.atUirouterCoreStrings.URLMATCHER
import typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherUrlRule extends UrlRule {
  @JSName("type")
  var type_MatcherUrlRule: URLMATCHER | STATE = js.native
  var urlMatcher: UrlMatcher = js.native
}

