package typings.workboxPrecaching.fetchListenerOptionsMod

import typings.std.RegExp
import typings.std.URL
import typings.workboxPrecaching.anon.Url
import typings.workboxPrecaching.urlmanipulationMod.URLManipulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchListenerOptions extends js.Object {
  var cleanURLs: js.UndefOr[Boolean] = js.native
  var directoryIndex: js.UndefOr[String] = js.native
  var ignoreURLParametersMatching: js.UndefOr[js.Array[RegExp]] = js.native
  var urlManipulation: js.UndefOr[URLManipulation] = js.native
}

object FetchListenerOptions {
  @scala.inline
  def apply(): FetchListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchListenerOptions]
  }
  @scala.inline
  implicit class FetchListenerOptionsOps[Self <: FetchListenerOptions] (val x: Self) extends AnyVal {
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
    def setCleanURLs(value: Boolean): Self = this.set("cleanURLs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanURLs: Self = this.set("cleanURLs", js.undefined)
    @scala.inline
    def setDirectoryIndex(value: String): Self = this.set("directoryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryIndex: Self = this.set("directoryIndex", js.undefined)
    @scala.inline
    def setIgnoreURLParametersMatchingVarargs(value: RegExp*): Self = this.set("ignoreURLParametersMatching", js.Array(value :_*))
    @scala.inline
    def setIgnoreURLParametersMatching(value: js.Array[RegExp]): Self = this.set("ignoreURLParametersMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreURLParametersMatching: Self = this.set("ignoreURLParametersMatching", js.undefined)
    @scala.inline
    def setUrlManipulation(value: /* url */ Url => js.Array[URL]): Self = this.set("urlManipulation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUrlManipulation: Self = this.set("urlManipulation", js.undefined)
  }
  
}

