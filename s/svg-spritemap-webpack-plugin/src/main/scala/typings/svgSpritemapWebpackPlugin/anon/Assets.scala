package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assets extends js.Object {
  val assets: js.Object = js.native
  val filename: String = js.native
}

object Assets {
  @scala.inline
  def apply(assets: js.Object, filename: String): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
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
    def setAssets(value: js.Object): Self = this.set("assets", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
  }
  
}

