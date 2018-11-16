package typings
package vueDashSelectLib.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueSelectProps extends js.Object {
  var clearSearchOnSelect: scala.Boolean = js.native
  var closeOnSelect: scala.Boolean = js.native
  var dir: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  var filterable: scala.Boolean = js.native
  var inputId: java.lang.String | scala.Null = js.native
  var label: java.lang.String = js.native
  var maxHeight: java.lang.String = js.native
  var multiple: scala.Boolean = js.native
  var noDrop: scala.Boolean = js.native
  @JSName("onChange")
  var onChange_Original: OptionConsumer = js.native
  var options: js.Array[_] = js.native
  var placeholder: java.lang.String = js.native
  var pushTags: scala.Boolean = js.native
  var resetOnOptionsChange: scala.Boolean = js.native
  var searchable: scala.Boolean = js.native
  var tabindex: scala.Double | scala.Null = js.native
  var taggable: scala.Boolean = js.native
  var transition: java.lang.String = js.native
  var value: js.Any = js.native
  def createOption(option: js.Any): js.Any = js.native
  def getOptionLabel(option: js.Any): java.lang.String = js.native
  def onChange(option: js.Any): scala.Unit = js.native
}

