package typings.tern.ternMod

import typings.tern.anon.End
import typings.tern.ternStrings.global
import typings.tern.ternStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefsQueryResult extends js.Object {
  /** The name of the variable or property */
  var name: String = js.native
  var refs: js.Array[End] = js.native
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[global | local] = js.native
}

object RefsQueryResult {
  @scala.inline
  def apply(name: String, refs: js.Array[End]): RefsQueryResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
  @scala.inline
  implicit class RefsQueryResultOps[Self <: RefsQueryResult] (val x: Self) extends AnyVal {
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
    def setRefsVarargs(value: End*): Self = this.set("refs", js.Array(value :_*))
    @scala.inline
    def setRefs(value: js.Array[End]): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: global | local): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

