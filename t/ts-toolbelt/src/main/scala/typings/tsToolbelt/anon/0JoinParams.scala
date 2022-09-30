package typings.tsToolbelt.anon

import typings.tsToolbelt.curryMod._JoinParams
import typings.tsToolbelt.tailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0JoinParams`[PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, L /* <: typings.tsToolbelt.listMod.List[Any] */] extends StObject {
  
  var `0`: _JoinParams[
    Tail[PSplit], 
    /* import warning: importer.ImportType#apply c repeated non-array type: L */ js.Array[L]
  ]
  
  var `1`: L
  
  var `2`: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: PSplit[number] */ js.Any
  ]
}
object `0JoinParams` {
  
  inline def apply[PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, L /* <: typings.tsToolbelt.listMod.List[Any] */](
    `0`: _JoinParams[
      Tail[PSplit], 
      /* import warning: importer.ImportType#apply c repeated non-array type: L */ js.Array[L]
    ],
    `1`: L,
    `2`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: PSplit[number] */ js.Any
    ]
  ): `0JoinParams`[PSplit, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0JoinParams`[PSplit, L]]
  }
  
  extension [Self <: `0JoinParams`[?, ?], PSplit /* <: js.Array[typings.tsToolbelt.listMod.List[Any]] */, L /* <: typings.tsToolbelt.listMod.List[Any] */](x: Self & (`0JoinParams`[PSplit, L])) {
    
    inline def set0(
      value: _JoinParams[
          Tail[PSplit], 
          /* import warning: importer.ImportType#apply c repeated non-array type: L */ js.Array[L]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: PSplit[number] */ js.Any
        ]
    ): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set2Varargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: PSplit[number] */ js.Any)*
    ): Self = StObject.set(x, "2", js.Array(value*))
  }
}
