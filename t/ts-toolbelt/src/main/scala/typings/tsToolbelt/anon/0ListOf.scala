package typings.tsToolbelt.anon

import typings.tsToolbelt.iterationKeyMod.Key
import typings.tsToolbelt.iterationMod.Iteration
import typings.tsToolbelt.listOfMod.AppendExists
import typings.tsToolbelt.listOfMod.___ListOf
import typings.tsToolbelt.nextMod.Next
import typings.tsToolbelt.unionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0ListOf`[O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typings.tsToolbelt.listMod.List[Any] */] extends StObject {
  
  var `0`: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]]
  
  var `1`: LN
}
object `0ListOf` {
  
  inline def apply[O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typings.tsToolbelt.listMod.List[Any] */](`0`: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]], `1`: LN): `0ListOf`[O, K, I, LN] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0ListOf`[O, K, I, LN]]
  }
  
  extension [Self <: `0ListOf`[?, ?, ?, ?], O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typings.tsToolbelt.listMod.List[Any] */](x: Self & (`0ListOf`[O, K, I, LN])) {
    
    inline def set0(value: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
