package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outStringSplitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/String/Split._Split<S, D> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, std.Array<string>> : never
    }}}
    */
  @js.native
  trait Split[S /* <: String */, D /* <: String */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    D extends '' ? ts-toolbelt.ts-toolbelt/out/List/Pop.Pop<ts-toolbelt.ts-toolbelt/out/String/Split.__Split<S, D, []>> : ts-toolbelt.ts-toolbelt/out/String/Split.__Split<S, D, []>
    }}}
    */
  @js.native
  trait _Split[S /* <: String */, D /* <: String */] extends StObject
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferBS}${D}${inferAS} * / string ? ts-toolbelt.ts-toolbelt/out/String/Split.__Split</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AS * / any, D, [...T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BS * / any]> : [...T, S]
    }}}
    */
  @js.native
  trait __Split[S /* <: String */, D /* <: String */, T /* <: js.Array[String] */] extends StObject
}
