package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
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
  implicit class I18NLanMapOps[Self <: I18NLanMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEn(value: Record[String, String]): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZh(value: Record[String, String]): Self = this.set("zh", value.asInstanceOf[js.Any])
  }
}
