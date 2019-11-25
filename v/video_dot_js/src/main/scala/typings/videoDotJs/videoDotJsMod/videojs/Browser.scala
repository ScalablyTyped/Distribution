package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var ANDROID_VERSION: Double | Null
  var CHROME_VERSION: Double
  var IE_VERSION: Double
  var IOS_VERSION: Double | Null
  var IS_ANDROID: Boolean
  var IS_ANY_SAFARI: Boolean
  var IS_CHROME: Boolean
  var IS_EDGE: Boolean
  var IS_IOS: Boolean
  var IS_IPAD: Boolean
  var IS_IPHONE: Boolean
  var IS_IPOD: Boolean
  var IS_NATIVE_ANDROID: Boolean
  var IS_SAFARI: Boolean
  var TOUCH_ENABLED: Boolean
}

object Browser {
  @scala.inline
  def apply(
    CHROME_VERSION: Double,
    IE_VERSION: Double,
    IS_ANDROID: Boolean,
    IS_ANY_SAFARI: Boolean,
    IS_CHROME: Boolean,
    IS_EDGE: Boolean,
    IS_IOS: Boolean,
    IS_IPAD: Boolean,
    IS_IPHONE: Boolean,
    IS_IPOD: Boolean,
    IS_NATIVE_ANDROID: Boolean,
    IS_SAFARI: Boolean,
    TOUCH_ENABLED: Boolean,
    ANDROID_VERSION: Int | Double = null,
    IOS_VERSION: Int | Double = null
  ): Browser = {
    val __obj = js.Dynamic.literal(CHROME_VERSION = CHROME_VERSION.asInstanceOf[js.Any], IE_VERSION = IE_VERSION.asInstanceOf[js.Any], IS_ANDROID = IS_ANDROID.asInstanceOf[js.Any], IS_ANY_SAFARI = IS_ANY_SAFARI.asInstanceOf[js.Any], IS_CHROME = IS_CHROME.asInstanceOf[js.Any], IS_EDGE = IS_EDGE.asInstanceOf[js.Any], IS_IOS = IS_IOS.asInstanceOf[js.Any], IS_IPAD = IS_IPAD.asInstanceOf[js.Any], IS_IPHONE = IS_IPHONE.asInstanceOf[js.Any], IS_IPOD = IS_IPOD.asInstanceOf[js.Any], IS_NATIVE_ANDROID = IS_NATIVE_ANDROID.asInstanceOf[js.Any], IS_SAFARI = IS_SAFARI.asInstanceOf[js.Any], TOUCH_ENABLED = TOUCH_ENABLED.asInstanceOf[js.Any])
    if (ANDROID_VERSION != null) __obj.updateDynamic("ANDROID_VERSION")(ANDROID_VERSION.asInstanceOf[js.Any])
    if (IOS_VERSION != null) __obj.updateDynamic("IOS_VERSION")(IOS_VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

