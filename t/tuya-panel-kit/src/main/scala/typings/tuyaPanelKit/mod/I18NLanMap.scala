package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18NLanMap extends /* lanKey */ StringDictionary[Record[String, String]] {
  
  var en: Record[String, String] = js.native
  
  var zh: Record[String, String] = js.native
}
object I18NLanMap {
  
  @scala.inline
  def apply(en: Record[String, String], zh: Record[String, String]): I18NLanMap = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any], zh = zh.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18NLanMap]
  }
  
  @scala.inline
  implicit class I18NLanMapMutableBuilder[Self <: I18NLanMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEn(value: Record[String, String]): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZh(value: Record[String, String]): Self = StObject.set(x, "zh", value.asInstanceOf[js.Any])
  }
}
