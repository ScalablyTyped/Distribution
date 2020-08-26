package typings.urql.queryMod

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import typings.urql.useQueryMod.UseQueryArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryProps[T, V] extends UseQueryArgs[V] {
  def children(arg: QueryState[T]): ReactElement = js.native
}

object QueryProps {
  @scala.inline
  def apply[T, V](children: QueryState[T] => ReactElement, query: String | DocumentNode): QueryProps[T, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryProps[T, V]]
  }
  @scala.inline
  implicit class QueryPropsOps[Self <: QueryProps[_, _], T, V] (val x: Self with (QueryProps[T, V])) extends AnyVal {
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
    def setChildren(value: QueryState[T] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

