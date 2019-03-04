package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNamedTypeRef extends IntrospectionTypeRef {
  var kind: java.lang.String
  var name: java.lang.String
}

object IntrospectionNamedTypeRef {
  @scala.inline
  def apply(kind: java.lang.String, name: java.lang.String): IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[IntrospectionNamedTypeRef]
  }
}

