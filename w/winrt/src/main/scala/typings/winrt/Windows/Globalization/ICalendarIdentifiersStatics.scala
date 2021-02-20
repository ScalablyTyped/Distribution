package typings.winrt.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarIdentifiersStatics extends StObject {
  
  var gregorian: String = js.native
  
  var hebrew: String = js.native
  
  var hijri: String = js.native
  
  var japanese: String = js.native
  
  var julian: String = js.native
  
  var korean: String = js.native
  
  var taiwan: String = js.native
  
  var thai: String = js.native
  
  var umAlQura: String = js.native
}
object ICalendarIdentifiersStatics {
  
  @scala.inline
  def apply(
    gregorian: String,
    hebrew: String,
    hijri: String,
    japanese: String,
    julian: String,
    korean: String,
    taiwan: String,
    thai: String,
    umAlQura: String
  ): ICalendarIdentifiersStatics = {
    val __obj = js.Dynamic.literal(gregorian = gregorian.asInstanceOf[js.Any], hebrew = hebrew.asInstanceOf[js.Any], hijri = hijri.asInstanceOf[js.Any], japanese = japanese.asInstanceOf[js.Any], julian = julian.asInstanceOf[js.Any], korean = korean.asInstanceOf[js.Any], taiwan = taiwan.asInstanceOf[js.Any], thai = thai.asInstanceOf[js.Any], umAlQura = umAlQura.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarIdentifiersStatics]
  }
  
  @scala.inline
  implicit class ICalendarIdentifiersStaticsMutableBuilder[Self <: ICalendarIdentifiersStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGregorian(value: String): Self = StObject.set(x, "gregorian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHebrew(value: String): Self = StObject.set(x, "hebrew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHijri(value: String): Self = StObject.set(x, "hijri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJapanese(value: String): Self = StObject.set(x, "japanese", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJulian(value: String): Self = StObject.set(x, "julian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKorean(value: String): Self = StObject.set(x, "korean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaiwan(value: String): Self = StObject.set(x, "taiwan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThai(value: String): Self = StObject.set(x, "thai", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUmAlQura(value: String): Self = StObject.set(x, "umAlQura", value.asInstanceOf[js.Any])
  }
}
