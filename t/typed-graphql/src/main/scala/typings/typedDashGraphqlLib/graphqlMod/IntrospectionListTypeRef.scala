package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionListTypeRef extends IntrospectionTypeRef {
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.LIST
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.undefined
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply(kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.LIST, ofType: IntrospectionTypeRef = null): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    if (ofType != null) __obj.updateDynamic("ofType")(ofType)
    __obj.asInstanceOf[IntrospectionListTypeRef]
  }
}

