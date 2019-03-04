package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNonNullTypeRef extends IntrospectionTypeRef {
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.NON_NULL
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply(kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.NON_NULL, ofType: IntrospectionTypeRef = null): IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (ofType != null) __obj.updateDynamic("ofType")(ofType)
    __obj.asInstanceOf[IntrospectionNonNullTypeRef]
  }
}

