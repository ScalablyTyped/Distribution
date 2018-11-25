package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLInterfaceTypeConfig extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var name: java.lang.String
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
}

