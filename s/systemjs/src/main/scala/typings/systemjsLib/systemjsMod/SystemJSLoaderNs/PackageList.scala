package typings
package systemjsLib.systemjsMod.SystemJSLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageList[T]
  extends /* packageName */ org.scalablytyped.runtime.StringDictionary[T]

object PackageList {
  @scala.inline
  def apply[T](StringDictionary: /* packageName */ org.scalablytyped.runtime.StringDictionary[T] = null): PackageList[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PackageList[T]]
  }
}

