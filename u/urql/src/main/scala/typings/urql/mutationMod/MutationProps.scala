package typings.urql.mutationMod

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationProps[T, V] extends js.Object {
  var query: DocumentNode | String = js.native
  def children(arg: MutationState[T, V]): ReactElement = js.native
}

object MutationProps {
  @scala.inline
  def apply[T, V](children: MutationState[T, V] => ReactElement, query: DocumentNode | String): MutationProps[T, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationProps[T, V]]
  }
  @scala.inline
  implicit class MutationPropsOps[Self <: MutationProps[_, _], T, V] (val x: Self with (MutationProps[T, V])) extends AnyVal {
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
    def setChildren(value: MutationState[T, V] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setQuery(value: DocumentNode | String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

