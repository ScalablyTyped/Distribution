package typings.tsToolbelt

import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectAtLeastMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/AtLeast._AtLeast<O, K> : never
    }}}
    */
  @js.native
  trait AtLeast[O /* <: js.Object */, K /* <: Key */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<keyof O & K, K> extends 1 ? ts-toolbelt.ts-toolbelt/out/Object/Required.RequiredFlat<O> : O
    }}}
    */
  @js.native
  trait RequiredIfKeys[O /* <: js.Object */, K /* <: Key */] extends StObject
  
  /**
    * @hidden
    */
  type _AtLeast[O /* <: js.Object */, K /* <: Key */] = ComputeRaw[__AtLeast[RequiredIfKeys[O, K], K]]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends keyof O ? ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, K> & ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalFlat<O> : O
    }}}
    */
  @js.native
  trait __AtLeast[O /* <: js.Object */, K /* <: Key */] extends StObject
}
