package typings.tsToolbelt

import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outBooleanInternalMod.Boolean
import typings.tsToolbelt.outObjectOmitMod._Omit
import typings.tsToolbelt.outUnionStrictMod.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectEitherMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Either._Either<O, K, strict> : never
    }}}
    */
  type Either[O /* <: js.Object */, K /* <: Key */, strict /* <: Boolean */] = _Either[O, K, strict]
  
  /**
    * @hidden
    */
  type EitherLoose[O /* <: js.Object */, K /* <: Key */] = ComputeRaw[__Either[O, K]]
  
  /**
    * @hidden
    */
  type EitherStrict[O /* <: js.Object */, K /* <: Key */] = Strict[__Either[O, K]]
  
  type _Either[O /* <: js.Object */, K /* <: Key */, strict /* <: Boolean */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0EitherLoose<O, K>[strict] */ js.Any
  
  /**
    * @hidden
    */
  type __Either[O /* <: js.Object */, K /* <: Key */] = (_Omit[O, K]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, P>}[K] */ js.Any)
}
