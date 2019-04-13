package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewLoader extends js.Object {
  var loader: java.lang.String
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object NewLoader {
  @scala.inline
  def apply(loader: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any] = null): NewLoader = {
    val __obj = js.Dynamic.literal(loader = loader)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[NewLoader]
  }
}

