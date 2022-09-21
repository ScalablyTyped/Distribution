package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLList")
@js.native
open class GraphQLList protected ()
  extends StObject
     with GraphQLInputType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(`type`: GraphQLType) = this()
  
  var ofType: GraphQLType = js.native
}
