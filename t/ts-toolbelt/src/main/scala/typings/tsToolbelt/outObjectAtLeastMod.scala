package typings.tsToolbelt

import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectOptionalMod.OptionalFlat
import typings.tsToolbelt.outObjectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectAtLeastMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/AtLeast._AtLeast<O, K> : never
    }}}
    */
  type AtLeast[O /* <: js.Object */, K /* <: Key */] = (_Pick[RequiredIfKeys[O, K], K]) & (OptionalFlat[RequiredIfKeys[O, K]])
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<keyof O & K, K> extends 1 ? ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredFlat<O> : O
    }}}
    */
  type RequiredIfKeys[O /* <: js.Object */, K /* <: Key */] = O
  
  /**
    * @hidden
    */
  type _AtLeast[O /* <: js.Object */, K /* <: Key */] = ComputeRaw[__AtLeast[RequiredIfKeys[O, K], K]]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    K extends keyof O ? ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K> & ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalFlat<O> : O
    }}}
    */
  type __AtLeast[O /* <: js.Object */, K /* <: Key */] = O
}
