package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outStringSplitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/String/Split._Split<S, D> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, std.Array<string>> : never
    }}}
    */
  type Split[S /* <: String */, D /* <: String */] = js.Array[String]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    D extends '' ? ts-toolbelt.ts-toolbelt/out/List/Pop.Pop<ts-toolbelt.ts-toolbelt/out/String/Split.__Split<S, D, []>> : ts-toolbelt.ts-toolbelt/out/String/Split.__Split<S, D, []>
    }}}
    */
  type _Split[S /* <: String */, D /* <: String */] = __Split[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AS */ Any, 
    D, 
    /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]]
  ]
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferBS}${D}${inferAS} * / string ? ts-toolbelt.ts-toolbelt/out/String/Split.__Split</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AS * / any, D, [...T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BS * / any]> : [...T, S]
    }}}
    */
  type __Split[S /* <: String */, D /* <: String */, T /* <: js.Array[String] */] = /* import warning: importer.ImportType#apply c repeated non-array type: [...[...T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BS * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BS * / any] */ js.Array[
    /* import warning: importer.ImportType#apply c repeated non-array type: [...T, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BS * / any] */ js.Array[
      /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
    ]
  ]
}
