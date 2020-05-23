package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The optional options to pass to the URL handling (iOS 10+). Pass a
  * dictionary with one or more of the following string-keys:
  *     * `UIApplicationOpenURLOptionsSourceApplicationKey` (String value)
  *     * `UIApplicationOpenURLOptionsAnnotationKey` (Array value)
  *     * `UIApplicationOpenURLOptionsOpenInPlaceKey` (Boolean value)
  *     * `UIApplicationOpenURLOptionUniversalLinksOnly` (Boolean value)
  * Read more about the available keys in the [Apple documentation](https://developer.apple.com/documentation/uikit/uiapplicationopenurloptionskey?language=objc).
  */
trait OpenURLOptions extends js.Object {
  /**
    * When you include this key in the options dictionary, the method opens the URL only if the URL is a valid universal link and there is an installed app capable of opening that URL.
    */
  var UIApplicationOpenURLOptionUniversalLinksOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * contains the information passed to a document interaction controller object's annotation property.
    */
  var UIApplicationOpenURLOptionsAnnotationKey: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * When the value of this property is `false`, you must copy the document to maintain access to it. If the flag is not set, you also must copy the document before you can use it.
    */
  var UIApplicationOpenURLOptionsOpenInPlaceKey: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of this key is an String containing the bundle ID of the app that made the request. If the request originated from another app belonging to your team, UIKit sets the value of this key to the ID of that app. If the team identifier of the originating app is different than the team identifier of the current app, the value of the key is nil.
    */
  var UIApplicationOpenURLOptionsSourceApplicationKey: js.UndefOr[java.lang.String] = js.undefined
}

object OpenURLOptions {
  @scala.inline
  def apply(
    UIApplicationOpenURLOptionUniversalLinksOnly: js.UndefOr[Boolean] = js.undefined,
    UIApplicationOpenURLOptionsAnnotationKey: js.Array[_] = null,
    UIApplicationOpenURLOptionsOpenInPlaceKey: js.UndefOr[Boolean] = js.undefined,
    UIApplicationOpenURLOptionsSourceApplicationKey: java.lang.String = null
  ): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(UIApplicationOpenURLOptionUniversalLinksOnly)) __obj.updateDynamic("UIApplicationOpenURLOptionUniversalLinksOnly")(UIApplicationOpenURLOptionUniversalLinksOnly.get.asInstanceOf[js.Any])
    if (UIApplicationOpenURLOptionsAnnotationKey != null) __obj.updateDynamic("UIApplicationOpenURLOptionsAnnotationKey")(UIApplicationOpenURLOptionsAnnotationKey.asInstanceOf[js.Any])
    if (!js.isUndefined(UIApplicationOpenURLOptionsOpenInPlaceKey)) __obj.updateDynamic("UIApplicationOpenURLOptionsOpenInPlaceKey")(UIApplicationOpenURLOptionsOpenInPlaceKey.get.asInstanceOf[js.Any])
    if (UIApplicationOpenURLOptionsSourceApplicationKey != null) __obj.updateDynamic("UIApplicationOpenURLOptionsSourceApplicationKey")(UIApplicationOpenURLOptionsSourceApplicationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenURLOptions]
  }
}

