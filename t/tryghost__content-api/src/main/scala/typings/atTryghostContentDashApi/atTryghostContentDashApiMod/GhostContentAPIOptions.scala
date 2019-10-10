package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.atTryghostContentDashApiStrings.canary
import typings.atTryghostContentDashApi.atTryghostContentDashApiStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostContentAPIOptions extends js.Object {
  /** @default "ghost" */
  var ghostPath: js.UndefOr[String] = js.undefined
  /** @deprecated since version v2 */
  var host: js.UndefOr[String] = js.undefined
  var key: String
  var url: String
  /**
    * Version of GhostContentAPI
    *
    * Supported Versions: 'v2', 'canary'
    */
  var version: v2 | canary
}

object GhostContentAPIOptions {
  @scala.inline
  def apply(key: String, url: String, version: v2 | canary, ghostPath: String = null, host: String = null): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key, url = url, version = version.asInstanceOf[js.Any])
    if (ghostPath != null) __obj.updateDynamic("ghostPath")(ghostPath)
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
}

