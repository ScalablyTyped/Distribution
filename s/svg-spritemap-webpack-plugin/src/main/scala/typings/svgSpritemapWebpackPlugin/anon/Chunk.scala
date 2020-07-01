package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chunk extends js.Object {
  var chunk: js.UndefOr[Keep] = js.undefined
  /**
    * Filename of the generated file (located at the webpack output.path), [hash] and [contenthash] are supported.
    */
  var filename: js.UndefOr[String] = js.undefined
  var svg: js.UndefOr[Sizes] = js.undefined
  /**
    * Whether to include the SVG4Everybody helper in your entries.
    */
  var svg4everybody: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
    * Options object to pass to SVG Optimizer.
    */
  var svgo: js.UndefOr[Boolean | js.Object] = js.undefined
}

object Chunk {
  @scala.inline
  def apply(
    chunk: Keep = null,
    filename: String = null,
    svg: Sizes = null,
    svg4everybody: Boolean | js.Object = null,
    svgo: Boolean | js.Object = null
  ): Chunk = {
    val __obj = js.Dynamic.literal()
    if (chunk != null) __obj.updateDynamic("chunk")(chunk.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (svg4everybody != null) __obj.updateDynamic("svg4everybody")(svg4everybody.asInstanceOf[js.Any])
    if (svgo != null) __obj.updateDynamic("svgo")(svgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
}

