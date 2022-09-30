package typings.tsToolbelt.anon

import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78`[K /* <: Key */, A /* <: Any */] extends StObject {
  
  @JSName("!")
  var Exclamationmark: `7`[K, A]
  
  @JSName("?")
  var Questionmark: `8`[K, A]
}
object `78` {
  
  inline def apply[K /* <: Key */, A /* <: Any */](Exclamationmark: `7`[K, A], Questionmark: `8`[K, A]): `78`[K, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.updateDynamic("?")(Questionmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`[K, A]]
  }
  
  extension [Self <: `78`[?, ?], K /* <: Key */, A /* <: Any */](x: Self & (`78`[K, A])) {
    
    inline def setExclamationmark(value: `7`[K, A]): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
    
    inline def setQuestionmark(value: `8`[K, A]): Self = StObject.set(x, "?", value.asInstanceOf[js.Any])
  }
}
