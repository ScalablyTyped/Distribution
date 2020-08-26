package typings.swaggerSchemaOfficial.anon

import typings.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEmptyValue extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
  var in: query = js.native
}

object AllowEmptyValue {
  @scala.inline
  def apply(in: query): AllowEmptyValue = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEmptyValue]
  }
  @scala.inline
  implicit class AllowEmptyValueOps[Self <: AllowEmptyValue] (val x: Self) extends AnyVal {
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
    def setIn(value: query): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowEmptyValue(value: Boolean): Self = this.set("allowEmptyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptyValue: Self = this.set("allowEmptyValue", js.undefined)
    @scala.inline
    def setCollectionFormat(value: ParameterCollectionFormat): Self = this.set("collectionFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionFormat: Self = this.set("collectionFormat", js.undefined)
  }
  
}

