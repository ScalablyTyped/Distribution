package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLSchema")
@js.native
open class GraphQLSchema protected () extends StObject {
  def this(config: GraphQLSchemaConfig) = this()
  
  def getDirective(name: String): GraphQLDirective = js.native
  
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  
  def getMutationType(): GraphQLObjectType = js.native
  
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType] = js.native
  
  def getQueryType(): GraphQLObjectType = js.native
  
  def getSubscriptionType(): GraphQLObjectType = js.native
  
  def getType(name: String): GraphQLType = js.native
  
  def getTypeMap(): TypeMap = js.native
}
