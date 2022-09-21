package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.collection.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcollection extends StObject {
  
  var Item: Instantiable1[/* options */ js.UndefOr[js.Object], typings.yandexMaps.mod.collection.Item]
}
object Typeofcollection {
  
  inline def apply(Item: Instantiable1[/* options */ js.UndefOr[js.Object], Item]): Typeofcollection = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcollection]
  }
  
  extension [Self <: Typeofcollection](x: Self) {
    
    inline def setItem(value: Instantiable1[/* options */ js.UndefOr[js.Object], Item]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
