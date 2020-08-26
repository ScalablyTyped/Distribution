package typings.typedGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLFieldConfig extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.native
  var deprecationReason: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.native
  var `type`: GraphQLOutputType = js.native
}

object GraphQLFieldConfig {
  @scala.inline
  def apply(`type`: GraphQLOutputType): GraphQLFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFieldConfig]
  }
  @scala.inline
  implicit class GraphQLFieldConfigOps[Self <: GraphQLFieldConfig] (val x: Self) extends AnyVal {
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
    def setType(value: GraphQLOutputType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: GraphQLFieldConfigArgumentMap): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setResolve(
      value: (/* source */ js.Any, /* args */ StringDictionary[js.Any], /* context */ js.Any, /* info */ GraphQLResolveInfo) => js.Any
    ): Self = this.set("resolve", js.Any.fromFunction4(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

