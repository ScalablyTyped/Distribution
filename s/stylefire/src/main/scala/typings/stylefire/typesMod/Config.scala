package typings.stylefire.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var aliasMap: js.UndefOr[StringDictionary[String]] = js.undefined
  var uncachedValues: js.UndefOr[Set[String]] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
  def onRead(key: String, props: Props): js.Any
  def onRender(state: State, props: Props, changedValues: ChangedValues): Unit
}

object Config {
  @scala.inline
  def apply(
    onRead: (String, Props) => js.Any,
    onRender: (State, Props, ChangedValues) => Unit,
    aliasMap: StringDictionary[String] = null,
    uncachedValues: Set[String] = null,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
    if (aliasMap != null) __obj.updateDynamic("aliasMap")(aliasMap.asInstanceOf[js.Any])
    if (uncachedValues != null) __obj.updateDynamic("uncachedValues")(uncachedValues.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

