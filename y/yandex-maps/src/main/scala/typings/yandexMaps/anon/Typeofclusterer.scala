package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.Clusterer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofclusterer extends StObject {
  
  var Balloon: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Balloon]
  
  var Hint: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Hint]
}
object Typeofclusterer {
  
  inline def apply(
    Balloon: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Balloon],
    Hint: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Hint]
  ): Typeofclusterer = {
    val __obj = js.Dynamic.literal(Balloon = Balloon.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofclusterer]
  }
  
  extension [Self <: Typeofclusterer](x: Self) {
    
    inline def setBalloon(value: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Balloon]): Self = StObject.set(x, "Balloon", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Instantiable1[/* clusterer */ Clusterer_, typings.yandexMaps.mod.clusterer.Hint]): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
  }
}
