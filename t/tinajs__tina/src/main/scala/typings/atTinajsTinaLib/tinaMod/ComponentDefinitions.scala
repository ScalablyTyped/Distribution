package typings
package atTinajsTinaLib.tinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComponentDefinitions extends ComponentLifecycles {
  var data: ScalablyTyped.runtime.StringDictionary[js.Any]
  var methods: ScalablyTyped.runtime.StringDictionary[js.ThisFunction0[/* this */ Component, _]]
  var mixins: js.Array[stdLib.Partial[ComponentDefinitions]]
  var properties: ComponentProperties
  def compute(data: ScalablyTyped.runtime.StringDictionary[js.Any]): ScalablyTyped.runtime.StringDictionary[js.Any]
}

