package typings
package stylefireLib.libStylerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var aliasMap: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var uncachedValues: js.UndefOr[stdLib.Set[java.lang.String]] = js.undefined
  var useCache: js.UndefOr[scala.Boolean] = js.undefined
  def onRead(key: java.lang.String, props: Props): js.Any
  def onRender(state: State, props: Props, changedValues: ChangedValues): scala.Unit
}

object Config {
  @scala.inline
  def apply(
    onRead: (java.lang.String, Props) => js.Any,
    onRender: (State, Props, ChangedValues) => scala.Unit,
    aliasMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    uncachedValues: stdLib.Set[java.lang.String] = null,
    useCache: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
    if (aliasMap != null) __obj.updateDynamic("aliasMap")(aliasMap)
    if (uncachedValues != null) __obj.updateDynamic("uncachedValues")(uncachedValues)
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache)
    __obj.asInstanceOf[Config]
  }
}

