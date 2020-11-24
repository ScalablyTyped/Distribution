package typings.treat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type BasicCSSProperties = typings.csstype.mod.Properties[java.lang.String | scala.Double]
  
  type CSSKeyframes = org.scalablytyped.runtime.StringDictionary[typings.treat.typesMod.BasicCSSProperties]
  
  type CSSPropertiesAndPseudos = typings.treat.typesMod.CSSProperties with typings.treat.typesMod.PseudoProperties
  
  type ClassRef = java.lang.String
  
  type PostCSS = js.Object
  
  type PseudoProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in treat.treat/lib/types/transformCSS.SimplePseudos[number] ]:? treat.treat/lib/types/types.CSSProperties}
    */ typings.treat.treatStrings.PseudoProperties with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type SelectorMap = org.scalablytyped.runtime.StringDictionary[typings.treat.typesMod.CSSProperties]
  
  type Style = typings.treat.typesMod.StyleWithSelectors with typings.treat.typesMod.MediaQueries[typings.treat.typesMod.StyleWithSelectors] with typings.treat.typesMod.FeatureQueries[typings.treat.typesMod.StyleWithSelectors]
  
  type StyleMap[StyleName /* <: java.lang.String | scala.Double */, StyleType] = typings.std.Record[StyleName, StyleType]
  
  type StylesMap[StyleName /* <: java.lang.String | scala.Double */] = typings.std.Record[StyleName, typings.treat.typesMod.ClassRef]
  
  type ThemeRef = java.lang.String
  
  type ThemedStyle[StyleType, Theme] = (js.Function1[/* theme */ Theme, StyleType]) | StyleType
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.treat.typesMod.TreatModuleObject
    - typings.treat.typesMod.TreatModuleArray
  */
  type TreatModuleValue = js.UndefOr[
    typings.treat.typesMod._TreatModuleValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
}
