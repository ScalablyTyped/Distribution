package typings.typeFest

import typings.std.Pick
import typings.std.Required
import typings.typeFest.sourceExceptMod.Except
import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetRequiredMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // `extends unknown` is always going to be the case and is used to convert any
  // union into a [distributive conditional
  // type](https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html#distributive-conditional-types).
  BaseType extends unknown ? type-fest.type-fest/source/simplify.Simplify<// Pick just the keys that are optional from the base type.
  type-fest.type-fest/source/except.Except<BaseType, Keys, {  requireExactProps :false}> & // Pick the keys that should be required from the base type and make them required.
  std.Required<std.Pick<BaseType, Keys>>> : never
    }}}
    */
  type SetRequired[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are optional from the base type.
  Except[
      BaseType, 
      Keys, 
      /* import warning: importer.ImportType#apply Failed type conversion: {  requireExactProps :false} */ js.Any
    ]) & (// Pick the keys that should be required from the base type and make them required.
  Required[Pick[BaseType, Keys]])
  ]
}
