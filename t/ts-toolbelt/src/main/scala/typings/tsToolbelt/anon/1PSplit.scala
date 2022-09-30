package typings.tsToolbelt.anon

import typings.tsToolbelt.curryMod._SplitParams
import typings.tsToolbelt.tailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1PSplit`[P /* <: typings.tsToolbelt.listMod.List[Any] */, PRest /* <: typings.tsToolbelt.listMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */] extends StObject {
  
  var `0`: _SplitParams[
    Tail[P], 
    /* import warning: importer.ImportType#apply c repeated non-array type: PSplit */ js.Array[PSplit], 
    Tail[PRest]
  ]
  
  var `1`: PSplit
  
  var `2`: js.Array[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
    ]
  ]
}
object `1PSplit` {
  
  inline def apply[P /* <: typings.tsToolbelt.listMod.List[Any] */, PRest /* <: typings.tsToolbelt.listMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */](
    `0`: _SplitParams[
      Tail[P], 
      /* import warning: importer.ImportType#apply c repeated non-array type: PSplit */ js.Array[PSplit], 
      Tail[PRest]
    ],
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
  
  extension [Self <: `1PSplit`[?, ?, ?], P /* <: typings.tsToolbelt.listMod.List[Any] */, PRest /* <: typings.tsToolbelt.listMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */](x: Self & (`1PSplit`[P, PRest, PSplit])) {
    
    inline def set0(
      value: _SplitParams[
          Tail[P], 
          /* import warning: importer.ImportType#apply c repeated non-array type: PSplit */ js.Array[PSplit], 
          Tail[PRest]
        ]
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
