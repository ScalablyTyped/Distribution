package typings
package uiDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesEnhancersMod {
  type BoxCssProps[CP] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof CP ]: CP[P] | number | boolean | null | undefined}
    */ uiDashBoxLib.uiDashBoxLibStrings.BoxCssProps with CP
  type BoxPropValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type CssProps = (stdLib.Pick[
    csstypeLib.csstypeMod.StandardProperties[java.lang.String | uiDashBoxLib.uiDashBoxLibNumbers.`0`], 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 132 */ js.Any
  ]) with (stdLib.Pick[
    csstypeLib.csstypeMod.ObsoleteProperties[java.lang.String | uiDashBoxLib.uiDashBoxLibNumbers.`0`], 
    uiDashBoxLib.uiDashBoxLibStrings.gridColumnGap | uiDashBoxLib.uiDashBoxLibStrings.gridGap | uiDashBoxLib.uiDashBoxLibStrings.gridRowGap
  ])
  type EnhancerProps = BoxCssProps[CssProps] with uiDashBoxLib.Anon_Clearfix
  type PropAliases = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type PropEnhancerValueType = java.lang.String | scala.Double
  type PropEnhancers = org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ js.Any, EnhancedProp | scala.Null]]
  type PropTypesMapping = org.scalablytyped.runtime.StringDictionary[propDashTypesLib.propDashTypesMod.Validator[js.Any]]
  type PropValidators = org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]]
}
