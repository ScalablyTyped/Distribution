package typings
package atUifabricUtilitiesLib.libEventGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventRecordList
  extends /* id */ org.scalablytyped.runtime.StringDictionary[js.Array[IEventRecord] | scala.Double] {
  var count: scala.Double
}

object IEventRecordList {
  @scala.inline
  def apply(
    count: scala.Double,
    StringDictionary: /* id */ org.scalablytyped.runtime.StringDictionary[js.Array[IEventRecord] | scala.Double] = null
  ): IEventRecordList = {
    val __obj = js.Dynamic.literal(count = count)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IEventRecordList]
  }
}

