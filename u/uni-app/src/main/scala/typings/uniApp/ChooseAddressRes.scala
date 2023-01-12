package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseAddressRes extends StObject {
  
  /**
    * 国标收货地址第二级地址
    */
  var cityName: js.UndefOr[String] = js.undefined
  
  /**
    * 国标收货地址第三级地址
    */
  var countyName: js.UndefOr[String] = js.undefined
  
  /**
    * 详细收货地址信息
    */
  var detailInfo: js.UndefOr[String] = js.undefined
  
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 收货地址国家码
    */
  var nationalCode: js.UndefOr[String] = js.undefined
  
  /**
    * 邮编
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * 国标收货地址第一级地址
    */
  var provinceName: js.UndefOr[String] = js.undefined
  
  /**
    * 收货人手机号码
    */
  var telNumber: js.UndefOr[String] = js.undefined
  
  /**
    * 收货人姓名
    */
  var userName: js.UndefOr[String] = js.undefined
}
object ChooseAddressRes {
  
  inline def apply(): ChooseAddressRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressRes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseAddressRes] (val x: Self) extends AnyVal {
    
    inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    inline def setCityNameUndefined: Self = StObject.set(x, "cityName", js.undefined)
    
    inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
    
    inline def setCountyNameUndefined: Self = StObject.set(x, "countyName", js.undefined)
    
    inline def setDetailInfo(value: String): Self = StObject.set(x, "detailInfo", value.asInstanceOf[js.Any])
    
    inline def setDetailInfoUndefined: Self = StObject.set(x, "detailInfo", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    inline def setNationalCode(value: String): Self = StObject.set(x, "nationalCode", value.asInstanceOf[js.Any])
    
    inline def setNationalCodeUndefined: Self = StObject.set(x, "nationalCode", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setProvinceName(value: String): Self = StObject.set(x, "provinceName", value.asInstanceOf[js.Any])
    
    inline def setProvinceNameUndefined: Self = StObject.set(x, "provinceName", js.undefined)
    
    inline def setTelNumber(value: String): Self = StObject.set(x, "telNumber", value.asInstanceOf[js.Any])
    
    inline def setTelNumberUndefined: Self = StObject.set(x, "telNumber", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
