package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLUnionTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.native
  var types: js.Array[GraphQLObjectType] = js.native
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply(name: String, types: js.Array[GraphQLObjectType]): GraphQLUnionTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLUnionTypeConfig]
  }
  @scala.inline
  implicit class GraphQLUnionTypeConfigOps[Self <: GraphQLUnionTypeConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: GraphQLObjectType*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[GraphQLObjectType]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setResolveType(
      value: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => GraphQLObjectType
    ): Self = this.set("resolveType", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResolveType: Self = this.set("resolveType", js.undefined)
  }
  
}

