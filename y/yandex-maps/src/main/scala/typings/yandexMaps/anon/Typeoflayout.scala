package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import typings.yandexMaps.mod.layout.ImageWithContent
import typings.yandexMaps.mod.layout.PieChart
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflayout extends StObject {
  
  var Image: Instantiable0[typings.yandexMaps.mod.layout.Image]
  
  var ImageWithContent: Instantiable0[typings.yandexMaps.mod.layout.ImageWithContent]
  
  var PieChart: Instantiable0[typings.yandexMaps.mod.layout.PieChart]
  
  val storage: Storage
  
  val templateBased: TypeoftemplateBased
}
object Typeoflayout {
  
  inline def apply(
    Image: Instantiable0[typings.yandexMaps.mod.layout.Image],
    ImageWithContent: Instantiable0[ImageWithContent],
    PieChart: Instantiable0[PieChart],
    storage: Storage,
    templateBased: TypeoftemplateBased
  ): Typeoflayout = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ImageWithContent = ImageWithContent.asInstanceOf[js.Any], PieChart = PieChart.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], templateBased = templateBased.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoflayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoflayout] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Instantiable0[typings.yandexMaps.mod.layout.Image]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageWithContent(value: Instantiable0[ImageWithContent]): Self = StObject.set(x, "ImageWithContent", value.asInstanceOf[js.Any])
    
    inline def setPieChart(value: Instantiable0[PieChart]): Self = StObject.set(x, "PieChart", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setTemplateBased(value: TypeoftemplateBased): Self = StObject.set(x, "templateBased", value.asInstanceOf[js.Any])
  }
}
