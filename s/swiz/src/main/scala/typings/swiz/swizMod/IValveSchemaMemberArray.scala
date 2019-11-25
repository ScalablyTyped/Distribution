package typings.swiz.swizMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValveSchemaMemberArray
  extends IValveSchemaMember
     with /* index */ StringDictionary[IValveSchemaMember]

object IValveSchemaMemberArray {
  @scala.inline
  def apply(StringDictionary: /* index */ StringDictionary[IValveSchemaMember] = null): IValveSchemaMemberArray = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IValveSchemaMemberArray]
  }
}

