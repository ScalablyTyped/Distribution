package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.body
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined swagger-schema-official.swagger-schema-official.BaseParameter & {  in :'body',   schema :swagger-schema-official.swagger-schema-official.Schema | undefined} */
@js.native
trait BodyParameter extends js.Object {
  var description: js.UndefOr[String] = js.native
  var in: (body | query | path | header | formData) with body = js.native
  var name: String = js.native
  var required: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[Schema] = js.native
}

object BodyParameter {
  @scala.inline
  def apply(in: (body | query | path | header | formData) with body, name: String): BodyParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParameter]
  }
  @scala.inline
  implicit class BodyParameterOps[Self <: BodyParameter] (val x: Self) extends AnyVal {
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
    def setIn(value: (body | query | path | header | formData) with body): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

