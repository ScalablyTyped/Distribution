package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The optional options to pass to the URL handling (iOS 10+). Pass a
  * dictionary with one or more of the following string-keys:
  *     * `UIApplicationOpenURLOptionsSourceApplicationKey` (String value)
  *     * `UIApplicationOpenURLOptionsAnnotationKey` (Array value)
  *     * `UIApplicationOpenURLOptionsOpenInPlaceKey` (Boolean value)
  *     * `UIApplicationOpenURLOptionUniversalLinksOnly` (Boolean value)
  * Read more about the available keys in the [Apple documentation](https://developer.apple.com/documentation/uikit/uiapplicationopenurloptionskey?language=objc).
  */
@js.native
trait OpenURLOptions extends StObject {
  
  /**
    * When you include this key in the options dictionary, the method opens the URL only if the URL is a valid universal link and there is an installed app capable of opening that URL.
    */
  var UIApplicationOpenURLOptionUniversalLinksOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * contains the information passed to a document interaction controller object's annotation property.
    */
  var UIApplicationOpenURLOptionsAnnotationKey: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * When the value of this property is `false`, you must copy the document to maintain access to it. If the flag is not set, you also must copy the document before you can use it.
    */
  var UIApplicationOpenURLOptionsOpenInPlaceKey: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of this key is an String containing the bundle ID of the app that made the request. If the request originated from another app belonging to your team, UIKit sets the value of this key to the ID of that app. If the team identifier of the originating app is different than the team identifier of the current app, the value of the key is nil.
    */
  var UIApplicationOpenURLOptionsSourceApplicationKey: js.UndefOr[String] = js.native
}
object OpenURLOptions {
  
  @scala.inline
  def apply(): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenURLOptions]
  }
  
  @scala.inline
  implicit class OpenURLOptionsMutableBuilder[Self <: OpenURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUIApplicationOpenURLOptionUniversalLinksOnly(value: Boolean): Self = StObject.set(x, "UIApplicationOpenURLOptionUniversalLinksOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIApplicationOpenURLOptionUniversalLinksOnlyUndefined: Self = StObject.set(x, "UIApplicationOpenURLOptionUniversalLinksOnly", js.undefined)
    
    @scala.inline
    def setUIApplicationOpenURLOptionsAnnotationKey(value: js.Array[_]): Self = StObject.set(x, "UIApplicationOpenURLOptionsAnnotationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIApplicationOpenURLOptionsAnnotationKeyUndefined: Self = StObject.set(x, "UIApplicationOpenURLOptionsAnnotationKey", js.undefined)
    
    @scala.inline
    def setUIApplicationOpenURLOptionsAnnotationKeyVarargs(value: js.Any*): Self = StObject.set(x, "UIApplicationOpenURLOptionsAnnotationKey", js.Array(value :_*))
    
    @scala.inline
    def setUIApplicationOpenURLOptionsOpenInPlaceKey(value: Boolean): Self = StObject.set(x, "UIApplicationOpenURLOptionsOpenInPlaceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIApplicationOpenURLOptionsOpenInPlaceKeyUndefined: Self = StObject.set(x, "UIApplicationOpenURLOptionsOpenInPlaceKey", js.undefined)
    
    @scala.inline
    def setUIApplicationOpenURLOptionsSourceApplicationKey(value: String): Self = StObject.set(x, "UIApplicationOpenURLOptionsSourceApplicationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIApplicationOpenURLOptionsSourceApplicationKeyUndefined: Self = StObject.set(x, "UIApplicationOpenURLOptionsSourceApplicationKey", js.undefined)
  }
}
