package typings.urqlCore.anon

import typings.urqlCore.urqlCoreStrings.hit
import typings.urqlCore.urqlCoreStrings.miss
import typings.urqlCore.urqlCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOutcome extends js.Object {
  var cacheOutcome: js.UndefOr[miss | partial | hit] = js.native
  var networkLatency: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[Double] = js.native
}

object CacheOutcome {
  @scala.inline
  def apply(): CacheOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOutcome]
  }
  @scala.inline
  implicit class CacheOutcomeOps[Self <: CacheOutcome] (val x: Self) extends AnyVal {
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
    def setCacheOutcome(value: miss | partial | hit): Self = this.set("cacheOutcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheOutcome: Self = this.set("cacheOutcome", js.undefined)
    @scala.inline
    def setNetworkLatency(value: Double): Self = this.set("networkLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkLatency: Self = this.set("networkLatency", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

