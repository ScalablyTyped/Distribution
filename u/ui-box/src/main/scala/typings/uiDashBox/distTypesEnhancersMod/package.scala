package typings.uiDashBox

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.ObsoleteProperties
import typings.csstype.csstypeMod.StandardProperties
import typings.propDashTypes.propDashTypesMod.Validator
import typings.std.Pick
import typings.uiDashBox.Anon_Clearfix
import typings.uiDashBox.uiDashBoxNumbers.`0`
import typings.uiDashBox.uiDashBoxStrings.gridColumnGap
import typings.uiDashBox.uiDashBoxStrings.gridGap
import typings.uiDashBox.uiDashBoxStrings.gridRowGap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesEnhancersMod {
  type BoxCssProps[CP] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof CP ]: CP[P] | number | boolean | null | undefined}
    */ typings.uiDashBox.uiDashBoxStrings.BoxCssProps with CP
  type BoxPropValue = js.UndefOr[String | Double | Boolean | Null]
  type CssProps = (Pick[
    StandardProperties[String | `0`], 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 132 */ js.Any
  ]) with (Pick[ObsoleteProperties[String | `0`], gridColumnGap | gridGap | gridRowGap])
  type EnhancerProps = BoxCssProps[CssProps] with Anon_Clearfix
  type PropAliases = StringDictionary[js.Array[String]]
  type PropEnhancerValueType = String | Double
  type PropEnhancers = StringDictionary[js.Function1[/* value */ js.Any, EnhancedProp | Null]]
  type PropTypesMapping = StringDictionary[Validator[js.Any]]
  type PropValidators = StringDictionary[js.Function1[/* value */ js.Any, js.UndefOr[String]]]
}
