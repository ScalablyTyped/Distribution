package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLoader extends js.Object {
  var loader: String
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object NewLoader {
  @scala.inline
  def apply(loader: String, options: StringDictionary[js.Any] = null): NewLoader = {
    val __obj = js.Dynamic.literal(loader = loader)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[NewLoader]
  }
}

