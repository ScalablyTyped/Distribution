package typings.styledTheming

import org.scalablytyped.runtime.StringDictionary
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
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in TVariant ]: styled-theming.styled-theming.ThemeMap}
    }}}
    */
  @js.native
  trait VariantMap[TVariant /* <: String */] extends StObject
  
  type VariantSet[TProp /* <: String */, TVariant /* <: String */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in TProp ]:? TVariant} */ /* props */ js.Any, 
    String
  ]
}
