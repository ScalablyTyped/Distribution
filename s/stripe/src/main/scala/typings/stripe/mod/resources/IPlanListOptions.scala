package typings.stripe.mod.resources

import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlanListOptions extends IListOptionsCreated {
  /**
    * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Only return plans for the given product.
    */
  var product: js.UndefOr[String] = js.native
}

object IPlanListOptions {
  @scala.inline
  def apply(): IPlanListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanListOptions]
  }
  @scala.inline
  implicit class IPlanListOptionsOps[Self <: IPlanListOptions] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

