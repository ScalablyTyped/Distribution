package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.INTERFACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionInterfaceType extends IntrospectionType {
  var description: js.UndefOr[String] = js.native
  var fields: js.Array[IntrospectionField] = js.native
  var kind: INTERFACE = js.native
  var name: String = js.native
  var possibleTypes: js.Array[IntrospectionNamedTypeRef] = js.native
}

object IntrospectionInterfaceType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
  @scala.inline
  implicit class IntrospectionInterfaceTypeOps[Self <: IntrospectionInterfaceType] (val x: Self) extends AnyVal {
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
    def setKind(value: INTERFACE): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPossibleTypesVarargs(value: IntrospectionNamedTypeRef*): Self = this.set("possibleTypes", js.Array(value :_*))
    @scala.inline
    def setPossibleTypes(value: js.Array[IntrospectionNamedTypeRef]): Self = this.set("possibleTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

