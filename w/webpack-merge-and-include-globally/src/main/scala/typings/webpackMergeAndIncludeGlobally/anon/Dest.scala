package typings.webpackMergeAndIncludeGlobally.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dest extends js.Object {
  var dest: String | (js.Function1[/* code */ String, StringDictionary[String]])
  var src: js.Array[String]
}

object Dest {
  @scala.inline
  def apply(dest: String | (js.Function1[/* code */ String, StringDictionary[String]]), src: js.Array[String]): Dest = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dest]
  }
}

