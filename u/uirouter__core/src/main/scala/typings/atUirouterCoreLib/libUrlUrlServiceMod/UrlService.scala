package typings
package atUirouterCoreLib.libUrlUrlServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlService", "UrlService")
@js.native
class UrlService protected ()
  extends atUirouterCoreLib.libCommonCoreservicesMod.LocationServices
     with atUirouterCoreLib.libUrlInterfaceMod.UrlSyncApi {
  /** @hidden */
  def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @hidden */ var _stopListeningFn: js.Any = js.native
  /**
    * The nested [[UrlConfig]] API to configure the URL and retrieve URL information
    *
    * See: [[UrlConfig]] for details
    */
  var config: atUirouterCoreLib.libUrlUrlConfigMod.UrlConfig = js.native
  /** @hidden */ var interceptDeferred: scala.Boolean = js.native
  var router: js.Any = js.native
  /**
    * The nested [[UrlRules]] API for managing URL rules and rewrites
    *
    * See: [[UrlRules]] for details
    */
  var rules: atUirouterCoreLib.libUrlUrlRulesMod.UrlRules = js.native
  /**
    * Matches a URL
    *
    * Given a URL (as a [[UrlParts]] object), check all rules and determine the best matching rule.
    * Return the result as a [[MatchResult]].
    */
  def `match`(url: atUirouterCoreLib.libUrlInterfaceMod.UrlParts): atUirouterCoreLib.libUrlInterfaceMod.MatchResult = js.native
  /**
    * Gets the current URL parts
    *
    * This method returns the different parts of the current URL (the [[path]], [[search]], and [[hash]]) as a [[UrlParts]] object.
    */
  def parts(): atUirouterCoreLib.libUrlInterfaceMod.UrlParts = js.native
}

