package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.Arrow
import typings.tuyaPanelKit.anon.CellBg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionDataProps extends StObject {
  
  var data: js.UndefOr[js.Array[Arrow]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[js.Any] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[CellBg] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}
object SectionDataProps {
  
  inline def apply(): SectionDataProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionDataProps]
  }
  
  extension [Self <: SectionDataProps](x: Self) {
    
    inline def setData(value: js.Array[Arrow]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Arrow*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTheme(value: CellBg): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
