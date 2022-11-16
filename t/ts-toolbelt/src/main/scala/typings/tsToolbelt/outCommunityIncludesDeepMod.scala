package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import typings.tsToolbelt.outBooleanInternalMod.Boolean
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCommunityIncludesDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Community/IncludesDeep._IncludesDeep<O, M, match, limit, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/Boolean/_Internal.Boolean> : never
    }}}
    */
  type IncludesDeep[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */, limit /* <: Double */] = Boolean
  
  /**
    * @hidden
    */
  type _IncludesDeep[O, M /* <: Any */, `match` /* <: Match */, limit /* <: Double */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.012<O, M, match, limit, I>[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<ts-toolbelt.ts-toolbelt/out/Iteration/Prev.Prev<I>> extends limit ? 2 : ts-toolbelt.ts-toolbelt/out/Any/Is.Is<O, M, match>] */ js.Any
}
