package typings.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesEnhancersMod {
  
  type BoxCssProps[CP] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof CP ]: CP[P] | number | false | null | undefined}
    */ typings.uiBox.uiBoxStrings.BoxCssProps with org.scalablytyped.runtime.TopLevel[CP]
  
  type BoxPropValue = js.UndefOr[
    java.lang.String | scala.Double | typings.uiBox.uiBoxBooleans.`false` | scala.Null
  ]
  
  type PropAliases = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  type PropEnhancerValueType = java.lang.String | scala.Double
  
  type PropEnhancers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* value */ js.Any, typings.uiBox.typesEnhancersMod.EnhancedProp | scala.Null]
  ]
  
  type PropTypesMapping = org.scalablytyped.runtime.StringDictionary[typings.propTypes.mod.Validator[js.Any]]
  
  type PropValidators = org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]]
}
