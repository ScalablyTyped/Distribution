package typings
package vueLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VueConfiguration extends js.Object {
  var devtools: scala.Boolean
  var ignoredElements: js.Array[java.lang.String | stdLib.RegExp]
  var keyCodes: ScalablyTyped.runtime.StringDictionary[scala.Double | js.Array[scala.Double]]
  var optionMergeStrategies: js.Any
  var performance: scala.Boolean
  var productionTip: scala.Boolean
  var silent: scala.Boolean
  def errorHandler(err: stdLib.Error, vm: Vue, info: java.lang.String): scala.Unit
  def warnHandler(msg: java.lang.String, vm: Vue, trace: java.lang.String): scala.Unit
}

