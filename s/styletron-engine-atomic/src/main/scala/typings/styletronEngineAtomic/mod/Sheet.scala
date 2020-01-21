package typings.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  var attrs: StringDictionary[String]
  var css: String
}

object Sheet {
  @scala.inline
  def apply(attrs: StringDictionary[String], css: String): Sheet = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sheet]
  }
}

