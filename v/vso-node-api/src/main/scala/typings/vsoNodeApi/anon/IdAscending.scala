package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdAscending extends js.Object {
  var idAscending: scala.Double = js.native
  var idDescending: scala.Double = js.native
  var nameAscending: scala.Double = js.native
  var nameDescending: scala.Double = js.native
}

object IdAscending {
  @scala.inline
  def apply(
    idAscending: scala.Double,
    idDescending: scala.Double,
    nameAscending: scala.Double,
    nameDescending: scala.Double
  ): IdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAscending]
  }
  @scala.inline
  implicit class IdAscendingOps[Self <: IdAscending] (val x: Self) extends AnyVal {
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
    def setIdAscending(value: scala.Double): Self = this.set("idAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdDescending(value: scala.Double): Self = this.set("idDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameAscending(value: scala.Double): Self = this.set("nameAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameDescending(value: scala.Double): Self = this.set("nameDescending", value.asInstanceOf[js.Any])
  }
  
}

