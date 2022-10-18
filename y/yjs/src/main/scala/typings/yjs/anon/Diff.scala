package typings.yjs.anon

import typings.yjs.distSrcStructsItemMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  var diff: Double
  
  var item: Item
}
object Diff {
  
  inline def apply(diff: Double, item: Item): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  
  extension [Self <: Diff](x: Self) {
    
    inline def setDiff(value: Double): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
