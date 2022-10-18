package typings.typescriptTuple

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  type Append[Tuple /* <: js.Array[Any] */, Addend] = Reverse[Prepend[Reverse[Tuple], Addend]]
  
  type CompareLength[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] = typings.typescriptTuple.libUtilsMod.CompareLength[Left, Right]
  
  type Concat[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */] = typings.typescriptTuple.libUtilsMod.Concat[Left, Right]
  
  type ConcatMultiple[TupleSet /* <: js.Array[js.Array[Any]] */] = typings.typescriptTuple.libUtilsMod.ConcatMultiple[TupleSet]
  
  type Drop[Tuple /* <: js.Array[Any] */, Quantity /* <: Double */] = typings.typescriptTuple.libUtilsMod.Drop[Tuple, Quantity, js.Array[Any]]
  
  type FillTuple[Tuple /* <: js.Array[Any] */, Replacement] = typings.typescriptTuple.libUtilsMod.FillTuple[Tuple, Replacement, js.Array[Any]]
  
  type FilterTuple[TupleSet /* <: js.Array[Any] */, Mask] = typings.typescriptTuple.libUtilsMod.FilterTuple[TupleSet, Mask]
  
  type First[Tuple /* <: Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: Tuple[0] */ js.Any
  
  type IsFinite[Tuple /* <: js.Array[Any] */, Finite, Infinite] = typings.typescriptTuple.libUtilsMod.IsFinite[Tuple, Finite, Infinite]
  
  type Last[Tuple /* <: js.Array[Any] */] = typings.typescriptTuple.libUtilsMod.Last[Tuple, scala.Nothing]
  
  type LongestTuple[TupleSet /* <: Array[js.Array[Any]] */] = typings.typescriptTuple.libUtilsMod.LongestTuple[TupleSet, js.Array[Any]]
  
  type Prepend[Tuple /* <: js.Array[Any] */, Addend] = typings.typescriptTuple.libUtilsMod.Prepend[Tuple, Addend]
  
  type Repeat[Type, Count /* <: Double */] = typings.typescriptTuple.libUtilsMod.Repeat[Type, Count, js.Array[Any]]
  
  type Reverse[Tuple /* <: js.Array[Any] */] = typings.typescriptTuple.libUtilsMod.Reverse[Tuple, js.Array[Any]]
  
  type ShortestTuple[TupleSet /* <: Array[js.Array[Any]] */] = typings.typescriptTuple.libUtilsMod.ShortestTuple[TupleSet, js.Array[Any]]
  
  type SliceStartQuantity[Tuple /* <: js.Array[Any] */, Start /* <: Double */, Quantity /* <: Double */] = typings.typescriptTuple.libUtilsMod.SliceStartQuantity[Tuple, Start, Quantity, js.Array[Any], js.Array[Any]]
  
  type SortTwoTuple[Left /* <: js.Array[Any] */, Right /* <: js.Array[Any] */, WhenEqual] = typings.typescriptTuple.libUtilsMod.SortTwoTuple[Left, Right, WhenEqual]
  
  type Tail[Tuple /* <: js.Array[Any] */] = typings.typescriptTuple.libUtilsMod.Tail[Tuple]
}
