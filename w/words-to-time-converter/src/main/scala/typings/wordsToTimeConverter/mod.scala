package typings.wordsToTimeConverter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("words-to-time-converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wordsToHours(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsToHours")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def wordsToHours(text: String, speed: SpeedType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordsToHours")(text.asInstanceOf[js.Any], speed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wordsToMinutes(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsToMinutes")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def wordsToMinutes(text: String, speed: SpeedType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordsToMinutes")(text.asInstanceOf[js.Any], speed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wordsToSeconds(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wordsToSeconds")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def wordsToSeconds(text: String, speed: SpeedType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wordsToSeconds")(text.asInstanceOf[js.Any], speed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordsToTimeConverter.wordsToTimeConverterStrings.slow
    - typings.wordsToTimeConverter.wordsToTimeConverterStrings.average
    - typings.wordsToTimeConverter.wordsToTimeConverterStrings.fast
  */
  trait SpeedType extends StObject
  object SpeedType {
    
    inline def average: typings.wordsToTimeConverter.wordsToTimeConverterStrings.average = "average".asInstanceOf[typings.wordsToTimeConverter.wordsToTimeConverterStrings.average]
    
    inline def fast: typings.wordsToTimeConverter.wordsToTimeConverterStrings.fast = "fast".asInstanceOf[typings.wordsToTimeConverter.wordsToTimeConverterStrings.fast]
    
    inline def slow: typings.wordsToTimeConverter.wordsToTimeConverterStrings.slow = "slow".asInstanceOf[typings.wordsToTimeConverter.wordsToTimeConverterStrings.slow]
  }
}
