package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.iterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMod {
  
  type Sub[N1 /* <: Double */, N2 /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.ts-toolbelt/out/Number/Sub._Sub<ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N1>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N2>>[0] */ js.Any
  
  /**
    * @hidden
    */
  type SubNegative[N1 /* <: Iteration */, N2 /* <: Iteration */] = Cast[Any, Iteration]
  
  /**
    * @hidden
    */
  type SubPositive[N1 /* <: Iteration */, N2 /* <: Iteration */] = Cast[Any, Iteration]
  
  type _Sub[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1SubNegative<N1, N2>[ts-toolbelt.ts-toolbelt/out/Number/IsNegative._IsNegative<N2>] */ js.Any
  
  /**
    * @hidden
    */
  type _SubNegative[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0SubNegative<N1, N2>[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> extends 0 ? 1 : number extends ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> ? 2 : 0] */ js.Any
  
  /**
    * @hidden
    */
  type _SubPositive[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0SubPositive<N1, N2>[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> extends 0 ? 1 : number extends ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> ? 2 : 0] */ js.Any
}
