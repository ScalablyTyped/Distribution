package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18NLanMap
  extends StObject
     with /* lanKey */ StringDictionary[Record[String, String]] {
  
  var en: Record[String, String]
  
  var zh: Record[String, String]
}
object I18NLanMap {
  
  inline def apply(en: Record[String, String], zh: Record[String, String]): I18NLanMap = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any], zh = zh.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18NLanMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: I18NLanMap] (val x: Self) extends AnyVal {
    
    inline def setEn(value: Record[String, String]): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    inline def setZh(value: Record[String, String]): Self = StObject.set(x, "zh", value.asInstanceOf[js.Any])
  }
}
