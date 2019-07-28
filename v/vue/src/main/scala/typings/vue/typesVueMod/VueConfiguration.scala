package typings.vue.typesVueMod

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
    val __obj = js.Dynamic.literal(async = async, devtools = devtools, errorHandler = js.Any.fromFunction3(errorHandler), ignoredElements = ignoredElements, keyCodes = keyCodes, optionMergeStrategies = optionMergeStrategies, performance = performance, productionTip = productionTip, silent = silent, warnHandler = js.Any.fromFunction3(warnHandler))
  
    __obj.asInstanceOf[VueConfiguration]
  }
}

