package typings
package vueLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueConfiguration extends js.Object {
  var async: scala.Boolean
  var devtools: scala.Boolean
  var ignoredElements: js.Array[java.lang.String | stdLib.RegExp]
  var keyCodes: org.scalablytyped.runtime.StringDictionary[scala.Double | js.Array[scala.Double]]
  var optionMergeStrategies: js.Any
  var performance: scala.Boolean
  var productionTip: scala.Boolean
  var silent: scala.Boolean
  def errorHandler(err: stdLib.Error, vm: Vue, info: java.lang.String): scala.Unit
  def warnHandler(msg: java.lang.String, vm: Vue, trace: java.lang.String): scala.Unit
}

object VueConfiguration {
  @scala.inline
  def apply(
    async: scala.Boolean,
    devtools: scala.Boolean,
    errorHandler: js.Function3[stdLib.Error, Vue, java.lang.String, scala.Unit],
    ignoredElements: js.Array[java.lang.String | stdLib.RegExp],
    keyCodes: org.scalablytyped.runtime.StringDictionary[scala.Double | js.Array[scala.Double]],
    optionMergeStrategies: js.Any,
    performance: scala.Boolean,
    productionTip: scala.Boolean,
    silent: scala.Boolean,
    warnHandler: js.Function3[java.lang.String, Vue, java.lang.String, scala.Unit]
  ): VueConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    __obj.updateDynamic("devtools")(devtools)
    __obj.updateDynamic("errorHandler")(errorHandler)
    __obj.updateDynamic("ignoredElements")(ignoredElements)
    __obj.updateDynamic("keyCodes")(keyCodes)
    __obj.updateDynamic("optionMergeStrategies")(optionMergeStrategies)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("productionTip")(productionTip)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("warnHandler")(warnHandler)
    __obj.asInstanceOf[VueConfiguration]
  }
}

