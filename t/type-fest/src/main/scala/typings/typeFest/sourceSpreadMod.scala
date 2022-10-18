package typings.typeFest

import typings.std.Exclude
import typings.std.Pick
import typings.typeFest.sourceRequiredKeysOfMod.RequiredKeysOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSpreadMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    FirstType extends type-fest.type-fest/source/spread.TupleOrArray ? SecondType extends type-fest.type-fest/source/spread.TupleOrArray ? type-fest.type-fest/source/spread.SpreadTupleOrArray<FirstType, SecondType> : type-fest.type-fest/source/simplify.Simplify<type-fest.type-fest/source/spread.SpreadObject<FirstType, SecondType>> : type-fest.type-fest/source/simplify.Simplify<type-fest.type-fest/source/spread.SpreadObject<FirstType, SecondType>>
    }}}
    */
  @js.native
  trait Spread[FirstType /* <: Spreadable */, SecondType /* <: Spreadable */] extends StObject
  
  type SpreadObject[FirstType /* <: js.Object */, SecondType /* <: js.Object */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof FirstType ]: Key extends keyof SecondType? FirstType[Key] | std.Required<SecondType>[Key] : FirstType[Key]} */ js.Any) & (Pick[
    SecondType, 
    RequiredKeysOf[SecondType] | (Exclude[/* keyof SecondType */ String, /* keyof FirstType */ String])
  ])
  
  type SpreadTupleOrArray[FirstType /* <: TupleOrArray */, SecondType /* <: TupleOrArray */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: FirstType[number] */ js.Any
  ]
  
  type Spreadable = js.Object | TupleOrArray
  
  type TupleOrArray = Array[Any]
}
