package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.OBJECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionObjectType extends IntrospectionType {
  var description: js.UndefOr[String] = js.native
  var fields: js.Array[IntrospectionField] = js.native
  var interfaces: js.Array[IntrospectionNamedTypeRef] = js.native
  var kind: OBJECT = js.native
  var name: String = js.native
}

object IntrospectionObjectType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionObjectType]
  }
  @scala.inline
  implicit class IntrospectionObjectTypeOps[Self <: IntrospectionObjectType] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: IntrospectionField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[IntrospectionField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfacesVarargs(value: IntrospectionNamedTypeRef*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[IntrospectionNamedTypeRef]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: OBJECT): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

