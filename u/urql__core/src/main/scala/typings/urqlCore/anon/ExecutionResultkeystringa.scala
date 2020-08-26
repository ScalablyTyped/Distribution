package typings.urqlCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @urql/core.@urql/core/dist/types/types.ExecutionResult<{[key: string] : any}, {[key: string] : any}> & {  extensions :std.Record<string, any> | undefined} */
@js.native
trait ExecutionResultkeystringa extends js.Object {
  // TS_SPECIFIC: TData. Motivation: https://github.com/graphql/graphql-js/pull/2490#issuecomment-639154229
  var data: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var extensions: js.UndefOr[StringDictionary[js.Any]] with (js.UndefOr[Record[String, _]]) = js.native
}

object ExecutionResultkeystringa {
  @scala.inline
  def apply(extensions: js.UndefOr[StringDictionary[js.Any]] with (js.UndefOr[Record[String, _]])): ExecutionResultkeystringa = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResultkeystringa]
  }
  @scala.inline
  implicit class ExecutionResultkeystringaOps[Self <: ExecutionResultkeystringa] (val x: Self) extends AnyVal {
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
    def setExtensions(value: js.UndefOr[StringDictionary[js.Any]] with (js.UndefOr[Record[String, _]])): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

