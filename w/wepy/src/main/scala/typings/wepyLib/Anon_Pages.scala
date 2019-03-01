package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pages extends js.Object {
  var pages: js.Array[java.lang.String]
  var window: wepyLib.pageMod.PageConfig
}

object Anon_Pages {
  @scala.inline
  def apply(pages: js.Array[java.lang.String], window: wepyLib.pageMod.PageConfig): Anon_Pages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Anon_Pages]
  }
}

