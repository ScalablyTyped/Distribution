package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RW[Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] extends StObject {
  
  @JSName("!")
  var Exclamationmark: R[Path, A]
  
  @JSName("?")
  var Questionmark: W[Path, A]
}
object RW {
  
  inline def apply[Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A](Exclamationmark: R[Path, A], Questionmark: W[Path, A]): RW[Path, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.updateDynamic("?")(Questionmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[RW[Path, A]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RW[?, ?], Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] (val x: Self & (RW[Path, A])) extends AnyVal {
    
    inline def setExclamationmark(value: R[Path, A]): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
    
    inline def setQuestionmark(value: W[Path, A]): Self = StObject.set(x, "?", value.asInstanceOf[js.Any])
  }
}
