package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Pick
import typings.typeFest.requiredKeysOfMod.RequiredKeysOf
import typings.typeFest.simplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreadMod {
  
  type Spread[FirstType /* <: Spreadable */, SecondType /* <: Spreadable */] = (Simplify[SpreadObject[FirstType, SecondType]]) | (SpreadTupleOrArray[FirstType, SecondType])
  
  type SpreadObject[FirstType /* <: js.Object */, SecondType /* <: js.Object */] = typings.typeFest.typeFestStrings.SpreadObject & TopLevel[Any] & (Pick[
    SecondType, 
    RequiredKeysOf[SecondType] | (Exclude[/* keyof SecondType */ String, /* keyof FirstType */ String])
  ])
  
  type SpreadTupleOrArray[FirstType /* <: TupleOrArray */, SecondType /* <: TupleOrArray */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: FirstType[number] */ js.Any
  ]
  
  type Spreadable = js.Object | TupleOrArray
  
  type TupleOrArray = Array[Any]
}
