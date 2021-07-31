package typings.typeZoo

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type NoInfer[T] = T & typings.typeZoo.typeZooStrings.NoInfer & TopLevel[T]
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Overwrite[T, U] = (Omit[T, /* keyof T */ String]) & U
  
  type Param0[Func] = js.Any
  
  type Param1[Func] = js.Any
  
  type Param2[Func] = js.Any
  
  type Param3[Func] = js.Any
  
  type ParamTypes[F /* <: js.Function */] = (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any] | js.Object
  
  type Pick2[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: T[K1][P2]}}
    */ typings.typeZoo.typeZooStrings.Pick2 & TopLevel[T]
  
  type Pick3[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: T[K1][K2][P3]}}}
    */ typings.typeZoo.typeZooStrings.Pick3 & TopLevel[T]
  
  type Pick4[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T[K1][K2][K3] */ js.Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P1 in K1 ]: {[ P2 in K2 ]: {[ P3 in K3 ]: {[ P4 in K4 ]: T[K1][K2][K3][P4]}}}}
    */ typings.typeZoo.typeZooStrings.Pick4 & TopLevel[T]
  
  type Purify[T /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: T}[T] */ js.Any
}
