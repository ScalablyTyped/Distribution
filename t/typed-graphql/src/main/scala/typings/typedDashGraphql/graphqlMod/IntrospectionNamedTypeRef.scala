package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNamedTypeRef extends IntrospectionTypeRef {
  var kind: String
  var name: String
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply(kind: String, name: String): IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[IntrospectionNamedTypeRef]
  }
}

