package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chunk extends js.Object {
  var chunk: js.UndefOr[Keep] = js.native
  /**
    * Filename of the generated file (located at the webpack output.path), [hash] and [contenthash] are supported.
    */
  var filename: js.UndefOr[String] = js.native
  var svg: js.UndefOr[Sizes] = js.native
  /**
    * Whether to include the SVG4Everybody helper in your entries.
    */
  var svg4everybody: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * Options object to pass to SVG Optimizer.
    */
  var svgo: js.UndefOr[Boolean | js.Object] = js.native
}

object Chunk {
  @scala.inline
  def apply(): Chunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chunk]
  }
  @scala.inline
  implicit class ChunkOps[Self <: Chunk] (val x: Self) extends AnyVal {
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
    def setChunk(value: Keep): Self = this.set("chunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setSvg(value: Sizes): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setSvg4everybody(value: Boolean | js.Object): Self = this.set("svg4everybody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg4everybody: Self = this.set("svg4everybody", js.undefined)
    @scala.inline
    def setSvgo(value: Boolean | js.Object): Self = this.set("svgo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgo: Self = this.set("svgo", js.undefined)
  }
  
}

