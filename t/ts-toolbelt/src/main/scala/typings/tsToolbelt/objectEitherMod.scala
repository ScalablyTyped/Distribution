package typings.tsToolbelt

import typings.tsToolbelt.booleanInternalMod.Boolean
import typings.tsToolbelt.computeMod.ComputeRaw
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.objectOmitMod._Omit
import typings.tsToolbelt.strictMod.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectEitherMod {
  
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
