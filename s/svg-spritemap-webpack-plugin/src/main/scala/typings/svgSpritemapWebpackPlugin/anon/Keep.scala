package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keep extends js.Object {
  /**
    * Whether to keep the chunk after it's been emitted by webpack.
    */
  var keep: js.UndefOr[Boolean] = js.native
  /**
    * Name of the chunk that will be generated.
    */
  var name: js.UndefOr[String] = js.native
}

object Keep {
  @scala.inline
  def apply(): Keep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keep]
  }
  @scala.inline
  implicit class KeepOps[Self <: Keep] (val x: Self) extends AnyVal {
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
    def setKeep(value: Boolean): Self = this.set("keep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeep: Self = this.set("keep", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

