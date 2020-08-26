package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLDirectiveConfig extends js.Object {
  var args: js.UndefOr[js.Array[GraphQLArgument]] = js.native
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var onField: js.UndefOr[Boolean] = js.native
  var onFragment: js.UndefOr[Boolean] = js.native
  var onOperation: js.UndefOr[Boolean] = js.native
}

object GraphQLDirectiveConfig {
  @scala.inline
  def apply(name: String): GraphQLDirectiveConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfig]
  }
  @scala.inline
  implicit class GraphQLDirectiveConfigOps[Self <: GraphQLDirectiveConfig] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: GraphQLArgument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[GraphQLArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOnField(value: Boolean): Self = this.set("onField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnField: Self = this.set("onField", js.undefined)
    @scala.inline
    def setOnFragment(value: Boolean): Self = this.set("onFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFragment: Self = this.set("onFragment", js.undefined)
    @scala.inline
    def setOnOperation(value: Boolean): Self = this.set("onOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOperation: Self = this.set("onOperation", js.undefined)
  }
  
}

