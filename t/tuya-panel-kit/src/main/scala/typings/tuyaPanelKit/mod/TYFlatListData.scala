package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TYFlatListData
  extends StObject
     with /**
  * @language zh-CN
  * @description 其他属性
  * @defaultValue null
  */
/**
  * @language en-US
  * @description Other attributes
  * @defaultValue null
  */
/* prop */ StringDictionary[Any] {
  
  /**
    * @language zh-CN
    * @description 右侧 Action 具体值
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Specific value of action on the right
    * @defaultValue null
    */
  var Action: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否已经选中
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Is it already selected
    * @defaultValue null
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description Key 值
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Key Value
    * @defaultValue null
    */
  var key: js.UndefOr[String | Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 改变回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Change callback
    * @defaultValue () => {}
    */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 副标题
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description SubTitle
    * @defaultValue null
    */
  var subTitle: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description 标题
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Title
    * @defaultValue null
    */
  var title: js.UndefOr[String] = js.undefined
}
object TYFlatListData {
  
  inline def apply(): TYFlatListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TYFlatListData]
  }
  
  extension [Self <: TYFlatListData](x: Self) {
    
    inline def setAction(value: Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
