package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLElement
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.map.Container
import typings.yandexMaps.mod.map.Converter
import typings.yandexMaps.mod.map.Copyrights
import typings.yandexMaps.mod.map.GeoObjects
import typings.yandexMaps.mod.map.ZoomRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofmap extends StObject {
  
  var Balloon: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Balloon]
  
  var Container: Instantiable1[/* parentElement */ String | HTMLElement, typings.yandexMaps.mod.map.Container]
  
  var Converter: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Converter]
  
  var Copyrights: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Copyrights]
  
  var GeoObjects: Instantiable2[
    /* map */ Map_, 
    /* options */ js.UndefOr[js.Object], 
    typings.yandexMaps.mod.map.GeoObjects
  ]
  
  var Hint: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Hint]
  
  var ZoomRange: Instantiable2[
    /* map */ Map_, 
    /* constraints */ js.Array[Double], 
    typings.yandexMaps.mod.map.ZoomRange
  ]
  
  val action: Typeofaction
  
  val behavior: TypeofbehaviorManager
  
  val layer: Typeoflayer
  
  val margin: Typeofmargin
  
  val pane: Typeofpane
}
object Typeofmap {
  
  inline def apply(
    Balloon: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Balloon],
    Container: Instantiable1[/* parentElement */ String | HTMLElement, Container],
    Converter: Instantiable1[/* map */ Map_, Converter],
    Copyrights: Instantiable1[/* map */ Map_, Copyrights],
    GeoObjects: Instantiable2[/* map */ Map_, /* options */ js.UndefOr[js.Object], GeoObjects],
    Hint: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Hint],
    ZoomRange: Instantiable2[/* map */ Map_, /* constraints */ js.Array[Double], ZoomRange],
    action: Typeofaction,
    behavior: TypeofbehaviorManager,
    layer: Typeoflayer,
    margin: Typeofmargin,
    pane: Typeofpane
  ): Typeofmap = {
    val __obj = js.Dynamic.literal(Balloon = Balloon.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], Converter = Converter.asInstanceOf[js.Any], Copyrights = Copyrights.asInstanceOf[js.Any], GeoObjects = GeoObjects.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], ZoomRange = ZoomRange.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], behavior = behavior.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofmap]
  }
  
  extension [Self <: Typeofmap](x: Self) {
    
    inline def setAction(value: Typeofaction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBalloon(value: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Balloon]): Self = StObject.set(x, "Balloon", value.asInstanceOf[js.Any])
    
    inline def setBehavior(value: TypeofbehaviorManager): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Instantiable1[/* parentElement */ String | HTMLElement, Container]): Self = StObject.set(x, "Container", value.asInstanceOf[js.Any])
    
    inline def setConverter(value: Instantiable1[/* map */ Map_, Converter]): Self = StObject.set(x, "Converter", value.asInstanceOf[js.Any])
    
    inline def setCopyrights(value: Instantiable1[/* map */ Map_, Copyrights]): Self = StObject.set(x, "Copyrights", value.asInstanceOf[js.Any])
    
    inline def setGeoObjects(value: Instantiable2[/* map */ Map_, /* options */ js.UndefOr[js.Object], GeoObjects]): Self = StObject.set(x, "GeoObjects", value.asInstanceOf[js.Any])
    
    inline def setHint(value: Instantiable1[/* map */ Map_, typings.yandexMaps.mod.map.Hint]): Self = StObject.set(x, "Hint", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Typeoflayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Typeofmargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setPane(value: Typeofpane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setZoomRange(value: Instantiable2[/* map */ Map_, /* constraints */ js.Array[Double], ZoomRange]): Self = StObject.set(x, "ZoomRange", value.asInstanceOf[js.Any])
  }
}
