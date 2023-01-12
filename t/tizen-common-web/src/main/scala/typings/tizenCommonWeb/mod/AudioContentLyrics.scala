package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContentLyrics extends StObject {
  
  /**
    * The array of lyrics snippets.
    *
    * If the lyrics are not synchronized, the array has only one member with full lyrics.
    */
  val texts: js.Array[String]
  
  /**
    * The array of timestamps in milliseconds for lyrics.
    *
    * If the lyrics are not synchronized (if there is no time information for the lyrics) the array is undefined.
    */
  val timestamps: js.Array[Double]
  
  /**
    * The type of lyrics, that is, whether they are synchronized with the music.
    */
  val `type`: AudioContentLyricsType
}
object AudioContentLyrics {
  
  inline def apply(texts: js.Array[String], timestamps: js.Array[Double], `type`: AudioContentLyricsType): AudioContentLyrics = {
    val __obj = js.Dynamic.literal(texts = texts.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContentLyrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioContentLyrics] (val x: Self) extends AnyVal {
    
    inline def setTexts(value: js.Array[String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsVarargs(value: String*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setTimestamps(value: js.Array[Double]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: Double*): Self = StObject.set(x, "timestamps", js.Array(value*))
    
    inline def setType(value: AudioContentLyricsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
