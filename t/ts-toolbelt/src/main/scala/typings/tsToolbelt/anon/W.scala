package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outIterationIterationOfMod.IterationOf
import typings.tsToolbelt.outObjectPRecordMod.RecordOR
import typings.tsToolbelt.outObjectPRecordMod.RecordOW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait W[Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] extends StObject {
  
  var R: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
  
  var W: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
}
object W {
  
  inline def apply[Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A](
    R: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]],
    W: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
  ): W[Path, A] = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[W[Path, A]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: W[?, ?], Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] (val x: Self & (W[Path, A])) extends AnyVal {
    
    inline def setR(value: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setW(value: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
  }
}
