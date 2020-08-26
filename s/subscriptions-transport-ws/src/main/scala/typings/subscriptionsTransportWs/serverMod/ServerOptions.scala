package typings.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.ValidationContext
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var execute: js.UndefOr[ExecuteFunction] = js.native
  var keepAlive: js.UndefOr[Double] = js.native
  var onConnect: js.UndefOr[js.Function] = js.native
  var onDisconnect: js.UndefOr[js.Function] = js.native
  var onOperation: js.UndefOr[js.Function] = js.native
  var onOperationComplete: js.UndefOr[js.Function] = js.native
  var rootValue: js.UndefOr[js.Any] = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var subscribe: js.UndefOr[SubscribeFunction] = js.native
  var validationRules: js.UndefOr[js.Array[_ | (js.Function1[/* context */ ValidationContext, _])]] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setExecute(
      value: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => (ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]]) | (js.Promise[ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]]]) | (AsyncIterator[
          ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]], 
          js.Any, 
          js.UndefOr[scala.Nothing]
        ])
    ): Self = this.set("execute", js.Any.fromFunction7(value))
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setKeepAlive(value: Double): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setOnConnect(value: js.Function): Self = this.set("onConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setOnDisconnect(value: js.Function): Self = this.set("onDisconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisconnect: Self = this.set("onDisconnect", js.undefined)
    @scala.inline
    def setOnOperation(value: js.Function): Self = this.set("onOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOperation: Self = this.set("onOperation", js.undefined)
    @scala.inline
    def setOnOperationComplete(value: js.Function): Self = this.set("onOperationComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOperationComplete: Self = this.set("onOperationComplete", js.undefined)
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSubscribe(
      value: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], /* subscribeFieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => (AsyncIterator[
          ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]], 
          js.Any, 
          js.UndefOr[scala.Nothing]
        ]) | (js.Promise[
          (AsyncIterator[
            ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]], 
            js.Any, 
            js.UndefOr[scala.Nothing]
          ]) | (ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]])
        ])
    ): Self = this.set("subscribe", js.Any.fromFunction8(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(value: (js.Any | (js.Function1[/* context */ ValidationContext, js.Any]))*): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(value: js.Array[_ | (js.Function1[/* context */ ValidationContext, _])]): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

