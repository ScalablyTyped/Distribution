package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYFlatListData
  extends /* prop */ StringDictionary[js.Any] {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var subTitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object TYFlatListData {
  
  @scala.inline
  def apply(): TYFlatListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYFlatListData]
  }
  
  @scala.inline
  implicit class TYFlatListDataMutableBuilder[Self <: TYFlatListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
