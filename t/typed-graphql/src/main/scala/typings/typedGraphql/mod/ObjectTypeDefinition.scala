package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeDefinition
  extends TypeDefinition
     with Node {
  var fields: js.Array[FieldDefinition] = js.native
  var interfaces: js.UndefOr[js.Array[NamedType]] = js.native
  var kind: String = js.native
  var loc: js.UndefOr[Location] = js.native
  var name: Name = js.native
}

object ObjectTypeDefinition {
  @scala.inline
  def apply(fields: js.Array[FieldDefinition], kind: String, name: Name): ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeDefinition]
  }
  @scala.inline
  implicit class ObjectTypeDefinitionOps[Self <: ObjectTypeDefinition] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: FieldDefinition*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldDefinition]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfacesVarargs(value: NamedType*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfaces(value: js.Array[NamedType]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

