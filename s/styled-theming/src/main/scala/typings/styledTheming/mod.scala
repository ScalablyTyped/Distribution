package typings.styledTheming

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String, values: ThemeMap): ThemeSet = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ThemeSet]
  
  @JSImport("styled-theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def variants[TProp /* <: String */, TVariant /* <: String */](name: String, prop: TProp, values: VariantMap[TVariant]): VariantSet[TProp, TVariant] = (^.asInstanceOf[js.Dynamic].applyDynamic("variants")(name.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[VariantSet[TProp, TVariant]]
  
  type ThemeMap = StringDictionary[ThemeValue]
  
  type ThemeSet = js.Function1[/* props */ js.Object, String]
  
  type ThemeValue = ThemeValueFn | ThemeValueResult
  
  type ThemeValueFn = js.Function1[/* props */ js.Object, ThemeValueResult]
  
  type ThemeValueResult = String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlattenInterpolation<ThemeProps<any>> */ Any)
  
  type VariantMap[TVariant /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in TVariant ]: styled-theming.styled-theming.ThemeMap}
    */ typings.styledTheming.styledThemingStrings.VariantMap & TopLevel[Any]
  
  type VariantSet[TProp /* <: String */, TVariant /* <: String */] = js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in TProp ]:? TVariant}
    */ /* props */ typings.styledTheming.styledThemingStrings.VariantSet & TopLevel[Any], 
    String
  ]
}
