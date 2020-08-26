package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Orientation extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.native
  var orientation: js.UndefOr[String] = js.native
}

object Orientation {
  @scala.inline
  def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  @scala.inline
  implicit class OrientationOps[Self <: Orientation] (val x: Self) extends AnyVal {
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
    def setCollectionsVarargs(value: String*): Self = this.set("collections", js.Array(value :_*))
    @scala.inline
    def setCollections(value: js.Array[String]): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

