package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMap[TProcessor, THandler]
  extends /* uri */ org.scalablytyped.runtime.StringDictionary[ServerOptions[TProcessor, THandler]]

object ServiceMap {
  @scala.inline
  def apply[TProcessor, THandler](
    StringDictionary: /* uri */ org.scalablytyped.runtime.StringDictionary[ServerOptions[TProcessor, THandler]] = null
  ): ServiceMap[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ServiceMap[TProcessor, THandler]]
  }
}

