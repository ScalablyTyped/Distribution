package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationOfMod.IterationOf
import typings.tsToolbelt.keyMod.Key
import typings.tsToolbelt.recordMod.RecordOR
import typings.tsToolbelt.recordMod.RecordOW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait W[Path /* <: typings.tsToolbelt.listMod.List[Key] */, A] extends StObject {
  
  var R: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
  
  var W: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
}
object W {
  
  inline def apply[Path /* <: typings.tsToolbelt.listMod.List[Key] */, A](
    R: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]],
    W: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]
  ): W[Path, A] = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[W[Path, A]]
  }
  
  extension [Self <: W[?, ?], Path /* <: typings.tsToolbelt.listMod.List[Key] */, A](x: Self & (W[Path, A])) {
    
    inline def setR(value: RecordOR[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setW(value: RecordOW[Path, A, IterationOf[typings.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
  }
}
