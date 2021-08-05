package typings.subtitle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subtitle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(srtOrVtt: String): js.Array[subTitleType] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(srtOrVtt.asInstanceOf[js.Any]).asInstanceOf[js.Array[subTitleType]]
  
  inline def resync(captions: js.Array[subTitleType], time: Double): js.Array[subTitleType] = (^.asInstanceOf[js.Dynamic].applyDynamic("resync")(captions.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Array[subTitleType]]
  
  inline def stringify(captions: js.Array[subTitleType]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(captions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyVtt(captions: js.Array[subTitleType]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyVtt")(captions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toMS(timestamp: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toMS")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toSrtTime(timestamp: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSrtTime")(timestamp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toVttTime(timestamp: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toVttTime")(timestamp.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait subTitleType extends StObject {
    
    var end: Double | String
    
    var setting: js.UndefOr[String] = js.undefined
    
    var start: Double | String
    
    var text: String
  }
  object subTitleType {
    
    inline def apply(end: Double | String, start: Double | String, text: String): subTitleType = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[subTitleType]
    }
    
    extension [Self <: subTitleType](x: Self) {
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
