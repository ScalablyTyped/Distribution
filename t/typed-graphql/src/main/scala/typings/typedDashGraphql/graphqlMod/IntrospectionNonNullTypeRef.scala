package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.NON_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNonNullTypeRef extends IntrospectionTypeRef {
  var kind: NON_NULL
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply(kind: NON_NULL, ofType: IntrospectionTypeRef = null): IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (ofType != null) __obj.updateDynamic("ofType")(ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef]
  }
}

