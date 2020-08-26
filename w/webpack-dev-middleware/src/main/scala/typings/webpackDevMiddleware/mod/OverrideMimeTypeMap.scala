package typings.webpackDevMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverrideMimeTypeMap extends js.Object {
  var force: Boolean = js.native
  var typeMap: MimeTypeMap = js.native
}

object OverrideMimeTypeMap {
  @scala.inline
  def apply(force: Boolean, typeMap: MimeTypeMap): OverrideMimeTypeMap = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideMimeTypeMap]
  }
  @scala.inline
  implicit class OverrideMimeTypeMapOps[Self <: OverrideMimeTypeMap] (val x: Self) extends AnyVal {
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeMap(value: MimeTypeMap): Self = this.set("typeMap", value.asInstanceOf[js.Any])
  }
  
}

