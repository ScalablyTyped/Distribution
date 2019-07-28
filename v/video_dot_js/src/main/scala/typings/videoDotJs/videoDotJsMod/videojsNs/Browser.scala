package typings.videoDotJs.videoDotJsMod.videojsNs

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
    val __obj = js.Dynamic.literal(CHROME_VERSION = CHROME_VERSION, IE_VERSION = IE_VERSION, IS_ANDROID = IS_ANDROID, IS_ANY_SAFARI = IS_ANY_SAFARI, IS_CHROME = IS_CHROME, IS_EDGE = IS_EDGE, IS_IOS = IS_IOS, IS_IPAD = IS_IPAD, IS_IPHONE = IS_IPHONE, IS_IPOD = IS_IPOD, IS_NATIVE_ANDROID = IS_NATIVE_ANDROID, IS_SAFARI = IS_SAFARI, TOUCH_ENABLED = TOUCH_ENABLED)
    if (ANDROID_VERSION != null) __obj.updateDynamic("ANDROID_VERSION")(ANDROID_VERSION.asInstanceOf[js.Any])
    if (IOS_VERSION != null) __obj.updateDynamic("IOS_VERSION")(IOS_VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
}

