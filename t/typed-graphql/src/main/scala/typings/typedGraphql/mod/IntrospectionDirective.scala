package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionDirective extends js.Object {
  var args: js.Array[IntrospectionInputValue] = js.native
  var description: js.UndefOr[String] = js.native
  var locations: js.Array[DirectiveLocationEnum] = js.native
  var name: String = js.native
}

object IntrospectionDirective {
  @scala.inline
  def apply(args: js.Array[IntrospectionInputValue], locations: js.Array[DirectiveLocationEnum], name: String): IntrospectionDirective = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionDirective]
  }
  @scala.inline
  implicit class IntrospectionDirectiveOps[Self <: IntrospectionDirective] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: IntrospectionInputValue*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[IntrospectionInputValue]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationsVarargs(value: DirectiveLocationEnum*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[DirectiveLocationEnum]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

