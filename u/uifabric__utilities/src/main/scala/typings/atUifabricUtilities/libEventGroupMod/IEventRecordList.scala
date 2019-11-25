package typings.atUifabricUtilities.libEventGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventRecordList
  extends /* id */ StringDictionary[js.Array[IEventRecord] | Double] {
  var count: Double
}

object IEventRecordList {
  @scala.inline
  def apply(count: Double, StringDictionary: /* id */ StringDictionary[js.Array[IEventRecord] | Double] = null): IEventRecordList = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IEventRecordList]
  }
}

