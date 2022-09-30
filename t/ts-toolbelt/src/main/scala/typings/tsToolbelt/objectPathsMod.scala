package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectPathsMod {
  
  type Paths[O, P /* <: typings.tsToolbelt.listMod.List[Any] */] = Cast[Any, typings.tsToolbelt.listMod.List[Key]]
  
  /**
    * @hidden
    */
  type UnionOf[A] = /* import warning: importer.ImportType#apply Failed type conversion: A[keyof A] */ js.Any
  
  /**
    * @hidden
    */
  type _Paths[O, P /* <: typings.tsToolbelt.listMod.List[Any] */] = UnionOf[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn | ts-toolbelt.ts-toolbelt/out/Misc/Primitive.Primitive? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : [ts-toolbelt.ts-toolbelt/out/Any/Keys.Keys<O[K]>] extends [never]? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : 12 extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<P>? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : ts-toolbelt.ts-toolbelt/out/Object/Paths._Paths<O[K], [...P, K | undefined]>}
    */ typings.tsToolbelt.tsToolbeltStrings._Paths & TopLevel[Any]
  ]
}
