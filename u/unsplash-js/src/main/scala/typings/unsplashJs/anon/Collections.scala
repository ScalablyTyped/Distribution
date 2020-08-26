package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collections extends js.Object {
  var collections: js.UndefOr[js.Array[String]] = js.native
  var count: js.UndefOr[Double] = js.native
  var featured: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object Collections {
  @scala.inline
  def apply(): Collections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collections]
  }
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFeatured(value: Boolean): Self = this.set("featured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatured: Self = this.set("featured", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

