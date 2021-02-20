package typings.wepy

import typings.std.ArrayBuffer
import typings.wepy.anon.Accuracy
import typings.wepy.anon.Address
import typings.wepy.anon.Alpha
import typings.wepy.anon.Altitude
import typings.wepy.anon.AnimationEnd
import typings.wepy.anon.AuthSetting
import typings.wepy.anon.BankAccount
import typings.wepy.anon.Brand
import typings.wepy.anon.Cancel
import typings.wepy.anon.CancelColor
import typings.wepy.anon.CanvasId
import typings.wepy.anon.CharSet
import typings.wepy.anon.CheckAuthMode
import typings.wepy.anon.Color
import typings.wepy.anon.Complete
import typings.wepy.anon.Compressed
import typings.wepy.anon.CreateTime
import typings.wepy.anon.Data
import typings.wepy.anon.DataKey
import typings.wepy.anon.Delay
import typings.wepy.anon.DestHeight
import typings.wepy.anon.Duration
import typings.wepy.anon.EncryptedData
import typings.wepy.anon.ErrMsg
import typings.wepy.anon.FileList
import typings.wepy.anon.Height
import typings.wepy.anon.Icon
import typings.wepy.anon.ItemColor
import typings.wepy.anon.Iv
import typings.wepy.anon.Key
import typings.wepy.anon.Lang
import typings.wepy.anon.Latitude
import typings.wepy.anon.NetworkType
import typings.wepy.anon.NonceStr
import typings.wepy.anon.Northeast
import typings.wepy.anon.OnlyFromCamera
import typings.wepy.anon.Padding
import typings.wepy.anon.PhoneNumber
import typings.wepy.anon.Scale
import typings.wepy.anon.Scope
import typings.wepy.anon.ScrollTop
import typings.wepy.anon.ShareTicket
import typings.wepy.anon.SupportMode
import typings.wepy.anon.TempFilePath
import typings.wepy.anon.Title
import typings.wepy.wepyStrings.CONNECT
import typings.wepy.wepyStrings.DELETE
import typings.wepy.wepyStrings.GET
import typings.wepy.wepyStrings.HEAD
import typings.wepy.wepyStrings.OPTIONS
import typings.wepy.wepyStrings.POST
import typings.wepy.wepyStrings.PUT
import typings.wepy.wepyStrings.TRACE
import typings.wepy.wepyStrings.arraybuffer
import typings.wepy.wepyStrings.json
import typings.wepy.wepyStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wxEnhancedMod {
  
  @js.native
  trait Animation
    extends RotateAnimation
       with ScaleAnimation
       with SkewAnimation
       with TranslateAnimation {
    
    def backgroundColor(x: String): Animation = js.native
    
    def bottom(x: Double): Animation = js.native
    
    def height(x: Double): Animation = js.native
    
    def left(x: Double): Animation = js.native
    
    def opacity(x: Double): Animation = js.native
    
    def right(x: Double): Animation = js.native
    
    def top(x: Double): Animation = js.native
    
    def width(x: Double): Animation = js.native
  }
  object Animation {
    
    @scala.inline
    def apply(
      backgroundColor: String => Animation,
      bottom: Double => Animation,
      height: Double => Animation,
      left: Double => Animation,
      opacity: Double => Animation,
      right: Double => Animation,
      rotate: Double => Animation,
      rotate3d: () => Animation,
      rotateX: Double => Animation,
      rotateY: Double => Animation,
      rotateZ: Double => Animation,
      scale: Double => Animation,
      scale3d: () => Animation,
      scaleX: Double => Animation,
      scaleY: Double => Animation,
      scaleZ: Double => Animation,
      skew: Double => Animation,
      skewX: Double => Animation,
      skewY: Double => Animation,
      top: Double => Animation,
      translate: Double => Animation,
      translate3d: () => Animation,
      translateX: Double => Animation,
      translateY: Double => Animation,
      translateZ: Double => Animation,
      width: Double => Animation
    ): Animation = {
      val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor), bottom = js.Any.fromFunction1(bottom), height = js.Any.fromFunction1(height), left = js.Any.fromFunction1(left), opacity = js.Any.fromFunction1(opacity), right = js.Any.fromFunction1(right), rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ), skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), top = js.Any.fromFunction1(top), translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), width = js.Any.fromFunction1(width))
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String => Animation): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBottom(value: Double => Animation): Self = StObject.set(x, "bottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeight(value: Double => Animation): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeft(value: Double => Animation): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpacity(value: Double => Animation): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRight(value: Double => Animation): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTop(value: Double => Animation): Self = StObject.set(x, "top", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidth(value: Double => Animation): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    }
  }
  
  type CallbackFunction[T] = js.Function1[/* callbacks */ Complete[T], Unit]
  
  @js.native
  trait FilePathParam extends StObject {
    
    var filePath: String = js.native
  }
  object FilePathParam {
    
    @scala.inline
    def apply(filePath: String): FilePathParam = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePathParam]
    }
    
    @scala.inline
    implicit class FilePathParamMutableBuilder[Self <: FilePathParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LagLng extends StObject {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  object LagLng {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): LagLng = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[LagLng]
    }
    
    @scala.inline
    implicit class LagLngMutableBuilder[Self <: LagLng] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapContext extends StObject {
    
    def getCenterLocation(callbacks: Complete[LagLng]): Unit = js.native
    @JSName("getCenterLocation")
    var getCenterLocation_Original: CallbackFunction[LagLng] = js.native
    
    def getRegion(callbacks: Complete[Northeast]): Unit = js.native
    @JSName("getRegion")
    var getRegion_Original: CallbackFunction[Northeast] = js.native
    
    def getScale(callbacks: Complete[Scale]): Unit = js.native
    @JSName("getScale")
    var getScale_Original: CallbackFunction[Scale] = js.native
    
    def includePoints(params: Padding): Unit = js.native
    
    def moveToLocation(): Unit = js.native
    
    def translateMarker(params: AnimationEnd): Unit = js.native
  }
  
  @js.native
  trait RequestParam extends UrlParam {
    
    var data: js.UndefOr[js.Object | String | ArrayBuffer] = js.native
    
    var dataType: js.UndefOr[json | text] = js.native
    
    var header: js.UndefOr[js.Object] = js.native
    
    var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
    
    var responseType: js.UndefOr[text | arraybuffer] = js.native
  }
  object RequestParam {
    
    @scala.inline
    def apply(url: String): RequestParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParam]
    }
    
    @scala.inline
    implicit class RequestParamMutableBuilder[Self <: RequestParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object | String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: json | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setResponseType(value: text | arraybuffer): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    }
  }
  
  @js.native
  trait RotateAnimation extends StObject {
    
    def rotate(deg: Double): Animation = js.native
    
    def rotate3d(): Animation = js.native
    
    def rotateX(deg: Double): Animation = js.native
    
    def rotateY(deg: Double): Animation = js.native
    
    def rotateZ(deg: Double): Animation = js.native
  }
  object RotateAnimation {
    
    @scala.inline
    def apply(
      rotate: Double => Animation,
      rotate3d: () => Animation,
      rotateX: Double => Animation,
      rotateY: Double => Animation,
      rotateZ: Double => Animation
    ): RotateAnimation = {
      val __obj = js.Dynamic.literal(rotate = js.Any.fromFunction1(rotate), rotate3d = js.Any.fromFunction0(rotate3d), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ))
      __obj.asInstanceOf[RotateAnimation]
    }
    
    @scala.inline
    implicit class RotateAnimationMutableBuilder[Self <: RotateAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Double => Animation): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotate3d(value: () => Animation): Self = StObject.set(x, "rotate3d", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRotateX(value: Double => Animation): Self = StObject.set(x, "rotateX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateY(value: Double => Animation): Self = StObject.set(x, "rotateY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateZ(value: Double => Animation): Self = StObject.set(x, "rotateZ", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ScaleAnimation extends StObject {
    
    def scale(sx: Double): Animation = js.native
    
    def scale3d(): Animation = js.native
    
    def scaleX(sx: Double): Animation = js.native
    
    def scaleY(sy: Double): Animation = js.native
    
    def scaleZ(sz: Double): Animation = js.native
  }
  object ScaleAnimation {
    
    @scala.inline
    def apply(
      scale: Double => Animation,
      scale3d: () => Animation,
      scaleX: Double => Animation,
      scaleY: Double => Animation,
      scaleZ: Double => Animation
    ): ScaleAnimation = {
      val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), scale3d = js.Any.fromFunction0(scale3d), scaleX = js.Any.fromFunction1(scaleX), scaleY = js.Any.fromFunction1(scaleY), scaleZ = js.Any.fromFunction1(scaleZ))
      __obj.asInstanceOf[ScaleAnimation]
    }
    
    @scala.inline
    implicit class ScaleAnimationMutableBuilder[Self <: ScaleAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: Double => Animation): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScale3d(value: () => Animation): Self = StObject.set(x, "scale3d", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScaleX(value: Double => Animation): Self = StObject.set(x, "scaleX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScaleY(value: Double => Animation): Self = StObject.set(x, "scaleY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScaleZ(value: Double => Animation): Self = StObject.set(x, "scaleZ", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SkewAnimation extends StObject {
    
    def skew(ax: Double): Animation = js.native
    
    def skewX(ax: Double): Animation = js.native
    
    def skewY(ay: Double): Animation = js.native
  }
  object SkewAnimation {
    
    @scala.inline
    def apply(skew: Double => Animation, skewX: Double => Animation, skewY: Double => Animation): SkewAnimation = {
      val __obj = js.Dynamic.literal(skew = js.Any.fromFunction1(skew), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY))
      __obj.asInstanceOf[SkewAnimation]
    }
    
    @scala.inline
    implicit class SkewAnimationMutableBuilder[Self <: SkewAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkew(value: Double => Animation): Self = StObject.set(x, "skew", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkewX(value: Double => Animation): Self = StObject.set(x, "skewX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkewY(value: Double => Animation): Self = StObject.set(x, "skewY", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TranslateAnimation extends StObject {
    
    def translate(tx: Double): Animation = js.native
    
    def translate3d(): Animation = js.native
    
    def translateX(tx: Double): Animation = js.native
    
    def translateY(ty: Double): Animation = js.native
    
    def translateZ(tz: Double): Animation = js.native
  }
  object TranslateAnimation {
    
    @scala.inline
    def apply(
      translate: Double => Animation,
      translate3d: () => Animation,
      translateX: Double => Animation,
      translateY: Double => Animation,
      translateZ: Double => Animation
    ): TranslateAnimation = {
      val __obj = js.Dynamic.literal(translate = js.Any.fromFunction1(translate), translate3d = js.Any.fromFunction0(translate3d), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ))
      __obj.asInstanceOf[TranslateAnimation]
    }
    
    @scala.inline
    implicit class TranslateAnimationMutableBuilder[Self <: TranslateAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslate(value: Double => Animation): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTranslate3d(value: () => Animation): Self = StObject.set(x, "translate3d", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranslateX(value: Double => Animation): Self = StObject.set(x, "translateX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTranslateY(value: Double => Animation): Self = StObject.set(x, "translateY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTranslateZ(value: Double => Animation): Self = StObject.set(x, "translateZ", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UrlParam extends StObject {
    
    var url: String = js.native
  }
  object UrlParam {
    
    @scala.inline
    def apply(url: String): UrlParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParam]
    }
    
    @scala.inline
    implicit class UrlParamMutableBuilder[Self <: UrlParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserInfo extends StObject {
    
    var avatarUrl: String = js.native
    
    var city: String = js.native
    
    var country: String = js.native
    
    var gender: String = js.native
    
    var language: String = js.native
    
    var nickName: String = js.native
    
    var province: String = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(
      avatarUrl: String,
      city: String,
      country: String,
      gender: String,
      language: String,
      nickName: String,
      province: String
    ): UserInfo = {
      val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WechatProfileDetails extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var firstName: js.UndefOr[String] = js.native
    
    var homeAddressCity: js.UndefOr[String] = js.native
    
    var homeAddressCountry: js.UndefOr[String] = js.native
    
    var homeAddressPostalCode: js.UndefOr[String] = js.native
    
    var homeAddressState: js.UndefOr[String] = js.native
    
    var homeAddressStreet: js.UndefOr[String] = js.native
    
    var homeFaxNumber: js.UndefOr[String] = js.native
    
    var homePhoneNumber: js.UndefOr[String] = js.native
    
    var lastName: js.UndefOr[String] = js.native
    
    var middleName: js.UndefOr[String] = js.native
    
    var mobilePhoneNumber: js.UndefOr[String] = js.native
    
    var nickName: js.UndefOr[String] = js.native
    
    var photoFilePath: js.UndefOr[String] = js.native
    
    var remark: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var workAddressCity: js.UndefOr[String] = js.native
    
    var workAddressCountry: js.UndefOr[String] = js.native
    
    var workAddressPostalCode: js.UndefOr[String] = js.native
    
    var workAddressState: js.UndefOr[String] = js.native
    
    var workAddressStreet: js.UndefOr[String] = js.native
  }
  object WechatProfileDetails {
    
    @scala.inline
    def apply(): WechatProfileDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WechatProfileDetails]
    }
    
    @scala.inline
    implicit class WechatProfileDetailsMutableBuilder[Self <: WechatProfileDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setHomeAddressCity(value: String): Self = StObject.set(x, "homeAddressCity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeAddressCityUndefined: Self = StObject.set(x, "homeAddressCity", js.undefined)
      
      @scala.inline
      def setHomeAddressCountry(value: String): Self = StObject.set(x, "homeAddressCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeAddressCountryUndefined: Self = StObject.set(x, "homeAddressCountry", js.undefined)
      
      @scala.inline
      def setHomeAddressPostalCode(value: String): Self = StObject.set(x, "homeAddressPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeAddressPostalCodeUndefined: Self = StObject.set(x, "homeAddressPostalCode", js.undefined)
      
      @scala.inline
      def setHomeAddressState(value: String): Self = StObject.set(x, "homeAddressState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeAddressStateUndefined: Self = StObject.set(x, "homeAddressState", js.undefined)
      
      @scala.inline
      def setHomeAddressStreet(value: String): Self = StObject.set(x, "homeAddressStreet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeAddressStreetUndefined: Self = StObject.set(x, "homeAddressStreet", js.undefined)
      
      @scala.inline
      def setHomeFaxNumber(value: String): Self = StObject.set(x, "homeFaxNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeFaxNumberUndefined: Self = StObject.set(x, "homeFaxNumber", js.undefined)
      
      @scala.inline
      def setHomePhoneNumber(value: String): Self = StObject.set(x, "homePhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomePhoneNumberUndefined: Self = StObject.set(x, "homePhoneNumber", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
      
      @scala.inline
      def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
      
      @scala.inline
      def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
      
      @scala.inline
      def setPhotoFilePath(value: String): Self = StObject.set(x, "photoFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotoFilePathUndefined: Self = StObject.set(x, "photoFilePath", js.undefined)
      
      @scala.inline
      def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemarkUndefined: Self = StObject.set(x, "remark", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWorkAddressCity(value: String): Self = StObject.set(x, "workAddressCity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddressCityUndefined: Self = StObject.set(x, "workAddressCity", js.undefined)
      
      @scala.inline
      def setWorkAddressCountry(value: String): Self = StObject.set(x, "workAddressCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddressCountryUndefined: Self = StObject.set(x, "workAddressCountry", js.undefined)
      
      @scala.inline
      def setWorkAddressPostalCode(value: String): Self = StObject.set(x, "workAddressPostalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddressPostalCodeUndefined: Self = StObject.set(x, "workAddressPostalCode", js.undefined)
      
      @scala.inline
      def setWorkAddressState(value: String): Self = StObject.set(x, "workAddressState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddressStateUndefined: Self = StObject.set(x, "workAddressState", js.undefined)
      
      @scala.inline
      def setWorkAddressStreet(value: String): Self = StObject.set(x, "workAddressStreet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkAddressStreetUndefined: Self = StObject.set(x, "workAddressStreet", js.undefined)
    }
  }
  
  @js.native
  trait WxEnhances extends StObject {
    
    def addPhoneContact(param: WechatProfileDetails): js.Promise[Unit] = js.native
    
    def authorize(param: Scope): js.Promise[_] = js.native
    
    def canIUse(name: String): js.Promise[Boolean] = js.native
    
    def canvasGetImageData(params: CanvasId, context: js.Any): js.Promise[Data] = js.native
    
    def canvasPutImageData(params: Height, context: js.Any): js.Promise[Unit] = js.native
    
    def canvasToTempFilePath(params: DestHeight, context: js.Any): js.Promise[TempFilePath] = js.native
    
    def checkIsSoterEnrolledInDevice(params: CheckAuthMode): js.Promise[ErrMsg] = js.native
    
    def checkIsSupportSoterAuthentication(): js.Promise[SupportMode] = js.native
    
    def checkSession(): js.Promise[Unit] = js.native
    
    def chooseInvoiceTitle(): js.Promise[BankAccount] = js.native
    
    def chooseLocation(): js.Promise[Address] = js.native
    
    def chooseVideo(params: Compressed): js.Promise[Duration] = js.native
    
    def clearStorage(): js.Promise[Unit] = js.native
    
    def createAnimation(params: Delay): js.Promise[Animation] = js.native
    
    def createCanvasContext(canvasId: String, context: js.Any): js.Promise[Unit] = js.native
    
    def createMapContext(mapId: String, context: js.Any): MapContext = js.native
    
    def createSelectorQuery(): js.Promise[js.Object] = js.native
    
    def getLocation(params: Altitude): js.Promise[Accuracy] = js.native
    
    def getNetworkType(): js.Promise[NetworkType] = js.native
    
    def getSavedFileInfo(params: FilePathParam): js.Promise[CreateTime] = js.native
    
    def getSavedFileList(): js.Promise[FileList] = js.native
    
    def getSetting(): js.Promise[AuthSetting] = js.native
    
    def getShareInfo(params: ShareTicket): js.Promise[EncryptedData] = js.native
    
    def getSystemInfo(): js.Promise[Brand] = js.native
    
    def getUserInfo(params: Lang): js.Promise[Iv] = js.native
    
    def hideLoading(): js.Promise[Unit] = js.native
    
    def hideNavigationBarLoading(): js.Promise[Unit] = js.native
    
    def makePhoneCall(params: PhoneNumber): js.Promise[Unit] = js.native
    
    def navigateTo(params: UrlParam): js.Promise[Unit] = js.native
    
    def onUserCaptureScreen(): js.Promise[Unit] = js.native
    
    def openLocation(params: Latitude): js.Promise[Unit] = js.native
    
    def pageScrollTo(params: ScrollTop): js.Promise[Unit] = js.native
    
    def redirectTo(params: UrlParam): js.Promise[Unit] = js.native
    
    def removeSavedFile(params: FilePathParam): js.Promise[Unit] = js.native
    
    def removeStorage(params: Key): js.Promise[Unit] = js.native
    
    def request(params: String): js.Promise[_] = js.native
    def request(params: RequestParam): js.Promise[_] = js.native
    
    def requestPayment(params: NonceStr): js.Promise[Unit] = js.native
    
    def scanCode(params: OnlyFromCamera): js.Promise[CharSet] = js.native
    
    def setNavigationBarAlpha(params: Alpha): js.Promise[Unit] = js.native
    
    def setNavigationBarColor(params: Color): js.Promise[Unit] = js.native
    
    def setNavigationBarTitle(params: Title): js.Promise[Unit] = js.native
    
    def setStorage(params: DataKey): js.Promise[Unit] = js.native
    
    def showActionSheet(params: ItemColor): js.Promise[Unit] = js.native
    
    def showLoading(params: Title): js.Promise[Unit] = js.native
    
    def showModal(params: CancelColor): js.Promise[Cancel] = js.native
    
    def showNavigationBarLoading(): js.Promise[Unit] = js.native
    
    def showToast(params: Icon): js.Promise[Unit] = js.native
    
    def switchTab(params: UrlParam): js.Promise[Unit] = js.native
  }
}
