package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.concatMod.Concat
import typings.tsToolbelt.functionMod.Function
import typings.tsToolbelt.functionParametersMod.Parameters
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.objectNonNullableMod.NonNullableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curryMod {
  
  @js.native
  trait Curry[F /* <: Function[Any, Any] */] extends StObject {
    
    def apply[P /* <: Gaps[Parameters[F]] */, G /* <: typings.tsToolbelt.listMod.List[Any] */, R /* <: Any */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param p because its type Gaps<Parameters<F>> | P is not an array type */ p: P
    ): (Curry[js.Function1[/* p */ G, R]]) | R = js.native
    def apply[P /* <: Gaps[Parameters[F]] */, G /* <: typings.tsToolbelt.listMod.List[Any] */, R /* <: Any */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param p because its type Gaps<Parameters<F>> | P is not an array type */ p: Gaps[Parameters[F]]
    ): (Curry[js.Function1[/* p */ G, R]]) | R = js.native
  }
  
  /**
    * @hidden
    */
  type GapOf[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, I /* <: Iteration */] = LN | (Concat[
    LN, 
    /* import warning: importer.ImportType#apply Failed type conversion: L2[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
  ])
  
  /**
    * @hidden
    */
  type Gaps[L /* <: typings.tsToolbelt.listMod.List[Any] */] = Cast[
    NonNullableFlat[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof L ]:? L[K] | ts-toolbelt.ts-toolbelt/out/Any/x.x}
    */ typings.tsToolbelt.tsToolbeltStrings.Gaps & TopLevel[L]
    ], 
    typings.tsToolbelt.listMod.List[Any]
  ]
  
  /**
    * @hidden
    */
  type GapsOf[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: typings.tsToolbelt.listMod.List[Any] */] = Cast[Any, typings.tsToolbelt.listMod.List[Any]]
  
  /**
    * Undoes the job of [[SplitParams]]
    * @hidden
    */
  type JoinParams[P /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */] = Cast[Any, typings.tsToolbelt.listMod.List[Any]]
  
  /**
    * Splits tuples to preserve their labels
    * @hidden
    */
  type SplitParams[P /* <: typings.tsToolbelt.listMod.List[Any] */] = Cast[Any, js.Array[typings.tsToolbelt.listMod.List[Any]]]
  
  /**
    * @hidden
    */
  type _GapsOf[L1 /* <: typings.tsToolbelt.listMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, LN /* <: typings.tsToolbelt.listMod.List[Any] */, L2D /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0GapsOf<L1, L2, LN, I, L2D>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L1>>] */ js.Any
  
  /**
    * @hidden
    */
  type _JoinParams[PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, L /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0JoinParams<PSplit, L>[number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<PSplit> ? 2 : PSplit extends [] ? 1 : 0] */ js.Any
  
  /**
    * @hidden
    */
  type _SplitParams[P /* <: typings.tsToolbelt.listMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, PRest /* <: typings.tsToolbelt.listMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1PSplit<P, PRest, PSplit>[number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<P> ? 2 : P extends [] ? 1 : 0] */ js.Any
}
