package typings.tryghostContentApi.mod

import typings.tryghostContentApi.tryghostContentApiStrings.canary
import typings.tryghostContentApi.tryghostContentApiStrings.v2
import typings.tryghostContentApi.tryghostContentApiStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostContentAPIOptions extends js.Object {
  /** @default "ghost" */
  var ghostPath: js.UndefOr[String] = js.native
  /** @deprecated since version v2 */
  var host: js.UndefOr[String] = js.native
  var key: String = js.native
  var url: String = js.native
  /**
    * Version of GhostContentAPI
    *
    * Supported Versions: 'v2', 'v3', 'canary'
    */
  var version: v2 | v3 | canary = js.native
}

object GhostContentAPIOptions {
  @scala.inline
  def apply(key: String, url: String, version: v2 | v3 | canary): GhostContentAPIOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostContentAPIOptions]
  }
  @scala.inline
  implicit class GhostContentAPIOptionsOps[Self <: GhostContentAPIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: v2 | v3 | canary): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setGhostPath(value: String): Self = this.set("ghostPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGhostPath: Self = this.set("ghostPath", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
  
}

