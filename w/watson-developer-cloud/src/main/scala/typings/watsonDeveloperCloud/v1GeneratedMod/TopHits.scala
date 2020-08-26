package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TopHits. */
@js.native
trait TopHits extends js.Object {
  var hits: js.UndefOr[TopHitsResults] = js.native
  /** Number of top hits returned by the aggregation. */
  var size: js.UndefOr[Double] = js.native
}

object TopHits {
  @scala.inline
  def apply(): TopHits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHits]
  }
  @scala.inline
  implicit class TopHitsOps[Self <: TopHits] (val x: Self) extends AnyVal {
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
    def setHits(value: TopHitsResults): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHits: Self = this.set("hits", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

