package typings.wikibaseSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersTimeMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wikibaseTimeToDateObject(wikibaseTime: TimeInputValue): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToDateObject")(wikibaseTime.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def wikibaseTimeToEpochTime(value: TimeInputValue): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToEpochTime")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def wikibaseTimeToISOString(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToISOString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wikibaseTimeToSimpleDay(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToSimpleDay")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TimeInputValue = String | WikibaseTimeObject
  
  trait WikibaseTimeObject extends StObject {
    
    var precision: Double
    
    var time: String
  }
  object WikibaseTimeObject {
    
    inline def apply(precision: Double, time: String): WikibaseTimeObject = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[WikibaseTimeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WikibaseTimeObject] (val x: Self) extends AnyVal {
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
