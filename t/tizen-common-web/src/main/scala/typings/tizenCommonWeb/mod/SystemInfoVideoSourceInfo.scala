package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoVideoSourceInfo extends StObject {
  
  /**
    * Represents the input number of the input source.
    *
    * If the source is "HDMI 2", the _number_ is 2.
    */
  val inputSource: Double
  
  /**
    * Represents if there is a signal provided on the source.
    *
    * The _signal_ attribute can be null. The null value means that information about signal could not be retrieved at the time of returning this object.
    * If the value is true, it means that there is signal provided. The value set to false means, that there is no signal.
    * By default getPropertyValue functions does not support this member, and will return object with _signal_ value set to null, it is supported only by TVWindow module. To get data about signal use [tizen.tvwindow.getSource()](./tvwindow.html#TVWindowManager::getSource) or [tizen.tvwindow.setSource()](./tvwindow.html#TVWindowManager::setSource).
    *
    * @since 5.5
    */
  val signal: Boolean | Null
  
  /**
    * Represents the type of the video input source.
    */
  val `type`: SystemInfoVideoSourceType
}
object SystemInfoVideoSourceInfo {
  
  inline def apply(inputSource: Double, `type`: SystemInfoVideoSourceType): SystemInfoVideoSourceInfo = {
    val __obj = js.Dynamic.literal(inputSource = inputSource.asInstanceOf[js.Any], signal = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoVideoSourceInfo] (val x: Self) extends AnyVal {
    
    inline def setInputSource(value: Double): Self = StObject.set(x, "inputSource", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: Boolean): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setType(value: SystemInfoVideoSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
