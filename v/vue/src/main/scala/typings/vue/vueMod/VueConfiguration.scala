package typings.vue.vueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConfiguration extends js.Object {
  var async: Boolean
  var devtools: Boolean
  var ignoredElements: js.Array[String | RegExp]
  var keyCodes: StringDictionary[Double | js.Array[Double]]
  var optionMergeStrategies: js.Any
  var performance: Boolean
  var productionTip: Boolean
  var silent: Boolean
  def errorHandler(err: Error, vm: Vue, info: String): Unit
  def warnHandler(msg: String, vm: Vue, trace: String): Unit
}

object VueConfiguration {
  @scala.inline
  def apply(
    async: Boolean,
    devtools: Boolean,
    errorHandler: (Error, Vue, String) => Unit,
    ignoredElements: js.Array[String | RegExp],
    keyCodes: StringDictionary[Double | js.Array[Double]],
    optionMergeStrategies: js.Any,
    performance: Boolean,
    productionTip: Boolean,
    silent: Boolean,
    warnHandler: (String, Vue, String) => Unit
  ): VueConfiguration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction3(errorHandler), ignoredElements = ignoredElements.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], productionTip = productionTip.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], warnHandler = js.Any.fromFunction3(warnHandler))
  
    __obj.asInstanceOf[VueConfiguration]
  }
}

