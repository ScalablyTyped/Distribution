package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map all nested selectors
  */
trait CSSSelectorObject
  extends /* cssSelector */ StringDictionary[SystemStyleObject]
     with SystemStyleObject

object CSSSelectorObject {
  @scala.inline
  def apply(StringDictionary: /* cssSelector */ StringDictionary[SystemStyleObject] = null): CSSSelectorObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CSSSelectorObject]
  }
}

