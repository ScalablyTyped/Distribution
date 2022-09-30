package typings.tsToolbelt.anon

import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RW[Path /* <: typings.tsToolbelt.listMod.List[Key] */, A] extends StObject {
  
  @JSName("!")
  var Exclamationmark: R[Path, A]
  
  @JSName("?")
  var Questionmark: W[Path, A]
}
object RW {
  
  inline def apply[Path /* <: typings.tsToolbelt.listMod.List[Key] */, A](Exclamationmark: R[Path, A], Questionmark: W[Path, A]): RW[Path, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.updateDynamic("?")(Questionmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[RW[Path, A]]
  }
  
  extension [Self <: RW[?, ?], Path /* <: typings.tsToolbelt.listMod.List[Key] */, A](x: Self & (RW[Path, A])) {
    
    inline def setExclamationmark(value: R[Path, A]): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
    
    inline def setQuestionmark(value: W[Path, A]): Self = StObject.set(x, "?", value.asInstanceOf[js.Any])
  }
}
