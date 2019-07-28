package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionListTypeRef extends IntrospectionTypeRef {
  var kind: LIST
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply(kind: LIST, ofType: IntrospectionTypeRef = null): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (ofType != null) __obj.updateDynamic("ofType")(ofType)
    __obj.asInstanceOf[IntrospectionListTypeRef]
  }
}

