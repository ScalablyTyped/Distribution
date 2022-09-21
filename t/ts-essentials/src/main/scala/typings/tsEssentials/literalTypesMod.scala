package typings.tsEssentials

import org.scalablytyped.runtime.TopLevel
import typings.std.Lowercase
import typings.tsEssentials.tsEssentialsStrings._empty
import typings.tsEssentials.tsEssentialsStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalTypesMod {
  
  type CamelCapitalizer[T] = js.Array[Any] | (PascalCapitalizer[Any, js.Array[Any]])
  
  type CamelCase[T] = T | (Join[CamelCapitalizer[SplitAnyCase[T]], _empty])
  
  type CamelCaseParser[T, Result /* <: js.Array[Any] */] = Any | Result
  
  type DeepCamelCaseProperties[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T as ts-essentials.ts-essentials/dist/literal-types.CamelCase<K> ]: ts-essentials.ts-essentials/dist/literal-types.DeepCamelCaseProperties<T[K]>}
    */ typings.tsEssentials.tsEssentialsStrings.DeepCamelCaseProperties & TopLevel[T])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IncludesSeparator[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsCamelCase[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsOneWord[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsPascalCase[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsBooleans.`false`
    - typings.tsEssentials.tsEssentialsBooleans.`true`
  */
  trait IsStringLiteral[T] extends StObject
  
  type Join[T, Result /* <: String */] = Result | Any
  
  type PascalCapitalizer[T, Result /* <: js.Array[Any] */] = Result | Any
  
  type PascalCaseParser[T, Result /* <: js.Array[Any] */] = Any | Result
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsEssentials.tsEssentialsStrings._underscore
    - typings.tsEssentials.tsEssentialsStrings.`-_`
  */
  trait Separator extends StObject
  object Separator {
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.tsEssentials.tsEssentialsStrings._underscore = "_".asInstanceOf[typings.tsEssentials.tsEssentialsStrings._underscore]
  }
  
  /** snake_case, CONSTANT_CASE, kebab-case or COBOL-CASE */
  type SeparatorCaseParser[T, Result /* <: js.Array[Any] */] = Result | (/* import warning: importer.ImportType#apply c repeated non-array type: Result */ js.Array[Result])
  
  type SplitAnyCase[T] = js.Array[Any | (Lowercase[T & String])]
  
  type WordInCamelCase[T, Ch /* <: String */] = Ch
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic * / any */ trait WordInPascalCase[T] extends StObject
}
