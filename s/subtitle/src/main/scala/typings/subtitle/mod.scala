package typings.subtitle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("subtitle", "parse")
  @js.native
  def parse(srtOrVtt: String): js.Array[subTitleType] = js.native
  
  @JSImport("subtitle", "resync")
  @js.native
  def resync(captions: js.Array[subTitleType], time: Double): js.Array[subTitleType] = js.native
  
  @JSImport("subtitle", "stringify")
  @js.native
  def stringify(captions: js.Array[subTitleType]): String = js.native
  
  @JSImport("subtitle", "stringifyVtt")
  @js.native
  def stringifyVtt(captions: js.Array[subTitleType]): String = js.native
  
  @JSImport("subtitle", "toMS")
  @js.native
  def toMS(timestamp: String): Double = js.native
  
  @JSImport("subtitle", "toSrtTime")
  @js.native
  def toSrtTime(timestamp: Double): String = js.native
  
  @JSImport("subtitle", "toVttTime")
  @js.native
  def toVttTime(timestamp: Double): String = js.native
  
  @js.native
  trait subTitleType extends StObject {
    
    var end: Double | String = js.native
    
    var setting: js.UndefOr[String] = js.native
    
    var start: Double | String = js.native
    
    var text: String = js.native
  }
  object subTitleType {
    
    @scala.inline
    def apply(end: Double | String, start: Double | String, text: String): subTitleType = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[subTitleType]
    }
    
    @scala.inline
    implicit class subTitleTypeMutableBuilder[Self <: subTitleType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      @scala.inline
      def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
