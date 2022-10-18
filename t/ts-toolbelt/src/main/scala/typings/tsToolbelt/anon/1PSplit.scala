package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1PSplit`[P /* <: typings.tsToolbelt.outListListMod.List[Any] */, PRest /* <: typings.tsToolbelt.outListListMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */] extends StObject {
  
  var `0`: /* import warning: importer.ImportType#apply Failed type conversion: P extends [...infer A, ...PRest] ? ts-toolbelt.ts-toolbelt/out/Function/Curry._SplitParams<ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<P>, [...PSplit, A], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<PRest>> : never */ js.Any
  
  var `1`: PSplit
  
  var `2`: js.Array[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
    ]
  ]
}
object `1PSplit` {
  
  inline def apply[P /* <: typings.tsToolbelt.outListListMod.List[Any] */, PRest /* <: typings.tsToolbelt.outListListMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */](
    `0`: /* import warning: importer.ImportType#apply Failed type conversion: P extends [...infer A, ...PRest] ? ts-toolbelt.ts-toolbelt/out/Function/Curry._SplitParams<ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<P>, [...PSplit, A], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<PRest>> : never */ js.Any,
    `1`: PSplit,
    `2`: js.Array[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
      ]
    ]
  ): `1PSplit`[P, PRest, PSplit] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1PSplit`[P, PRest, PSplit]]
  }
  
  extension [Self <: `1PSplit`[?, ?, ?], P /* <: typings.tsToolbelt.outListListMod.List[Any] */, PRest /* <: typings.tsToolbelt.outListListMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */](x: Self & (`1PSplit`[P, PRest, PSplit])) {
    
    inline def set0(
      value: /* import warning: importer.ImportType#apply Failed type conversion: P extends [...infer A, ...PRest] ? ts-toolbelt.ts-toolbelt/out/Function/Curry._SplitParams<ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<P>, [...PSplit, A], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<PRest>> : never */ js.Any
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: PSplit): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(
      value: js.Array[
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set2Varargs(
      value: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
        ])*
    ): Self = StObject.set(x, "2", js.Array(value*))
  }
}
