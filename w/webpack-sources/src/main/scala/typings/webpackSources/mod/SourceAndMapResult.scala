package typings.webpackSources.mod

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAndMapResult extends js.Object {
  var map: RawSourceMap | Null = js.native
  var source: String = js.native
}

object SourceAndMapResult {
  @scala.inline
  def apply(source: String): SourceAndMapResult = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAndMapResult]
  }
  @scala.inline
  implicit class SourceAndMapResultOps[Self <: SourceAndMapResult] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapNull: Self = this.set("map", null)
  }
  
}

