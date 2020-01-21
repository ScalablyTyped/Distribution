package typings.tryghostContentApi.mod

import typings.tryghostContentApi.tryghostContentApiStrings.canary
import typings.tryghostContentApi.tryghostContentApiStrings.v2
import typings.tryghostContentApi.tryghostContentApiStrings.v3
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
    * Supported Versions: 'v2', 'v3', 'canary'
    */
  var version: v2 | v3 | canary
}

object GhostContentAPIOptions {
  @scala.inline
  def apply(key: String, url: String, version: v2 | v3 | canary, ghostPath: String = null, host: String = null): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (ghostPath != null) __obj.updateDynamic("ghostPath")(ghostPath.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
}

