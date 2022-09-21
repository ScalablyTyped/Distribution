package typings.typeZoo

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ExcludeStrict[T, U /* <: T */] = T
  
  type ExtractStrict[T, U /* <: T */] = T
  
  type NoInfer[T] = T & typings.typeZoo.typeZooStrings.NoInfer & TopLevel[T]
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type OmitStrict[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Overwrite[T, U] = (Omit[T, /* keyof T */ String]) & U
  
  type Param0[Func] = Any
  
  type Param1[Func] = Any
  
  type Param2[Func] = Any
  
  type Param3[Func] = Any
  
  type ParamTypes[F /* <: js.Function */] = (js.Tuple4[Any, Any, Any, Any]) | (js.Tuple3[Any, Any, Any]) | (js.Tuple2[Any, Any]) | js.Array[Any] | js.Object
  
  type Pick2[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: T[K1][P2]}}
    */ typings.typeZoo.typeZooStrings.Pick2 & TopLevel[T]
  
  type Pick3[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: T[K1][K2][P3]}}}
    */ typings.typeZoo.typeZooStrings.Pick3 & TopLevel[T]
  
  type Pick4[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: {[ P4 in K4 ]: T[K1][K2][K3][P4]}}}}
    */ typings.typeZoo.typeZooStrings.Pick4 & TopLevel[T]
  
  type Public[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typings.typeZoo.typeZooStrings.Public & TopLevel[T]
  
  type Purify[T /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: T}[T] */ js.Any
}
