package typings
package vueDashSelectLib.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectProps extends js.Object {
  var autocomplete: java.lang.String
  var clearSearchOnSelect: scala.Boolean
  var clearable: scala.Boolean
  var closeOnSelect: scala.Boolean
  var dir: java.lang.String
  var disabled: scala.Boolean
  var filterable: scala.Boolean
  var index: java.lang.String | scala.Null
  var inputId: java.lang.String | scala.Null
  var label: java.lang.String
  var maxHeight: java.lang.String
  var multiple: scala.Boolean
  var noDrop: scala.Boolean
  var options: js.Array[_]
  var placeholder: java.lang.String
  var pushTags: scala.Boolean
  var resetOnOptionsChange: scala.Boolean
  var searchable: scala.Boolean
  var selectOnTab: scala.Boolean
  var tabindex: scala.Double | scala.Null
  var taggable: scala.Boolean
  var transition: java.lang.String
  var value: js.Any
  def createOption(option: js.Any): js.Any
  def filter(options: js.Array[_], search: java.lang.String): scala.Boolean
  def filterBy(option: js.Any, label: java.lang.String, search: java.lang.String): scala.Boolean
  def getOptionLabel(option: js.Any): java.lang.String
  def onChange(`val`: js.Any): scala.Unit
  def onInput(`val`: js.Any): scala.Unit
  def onTab(): scala.Unit
}

object VueSelectProps {
  @scala.inline
  def apply(
    autocomplete: java.lang.String,
    clearSearchOnSelect: scala.Boolean,
    clearable: scala.Boolean,
    closeOnSelect: scala.Boolean,
    createOption: js.Any => js.Any,
    dir: java.lang.String,
    disabled: scala.Boolean,
    filter: (js.Array[_], java.lang.String) => scala.Boolean,
    filterBy: (js.Any, java.lang.String, java.lang.String) => scala.Boolean,
    filterable: scala.Boolean,
    getOptionLabel: js.Any => java.lang.String,
    label: java.lang.String,
    maxHeight: java.lang.String,
    multiple: scala.Boolean,
    noDrop: scala.Boolean,
    onChange: js.Any => scala.Unit,
    onInput: js.Any => scala.Unit,
    onTab: () => scala.Unit,
    options: js.Array[_],
    placeholder: java.lang.String,
    pushTags: scala.Boolean,
    resetOnOptionsChange: scala.Boolean,
    searchable: scala.Boolean,
    selectOnTab: scala.Boolean,
    taggable: scala.Boolean,
    transition: java.lang.String,
    value: js.Any,
    index: java.lang.String = null,
    inputId: java.lang.String = null,
    tabindex: scala.Int | scala.Double = null
  ): VueSelectProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, clearSearchOnSelect = clearSearchOnSelect, clearable = clearable, closeOnSelect = closeOnSelect, createOption = js.Any.fromFunction1(createOption), dir = dir, disabled = disabled, filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable, getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label, maxHeight = maxHeight, multiple = multiple, noDrop = noDrop, onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options, placeholder = placeholder, pushTags = pushTags, resetOnOptionsChange = resetOnOptionsChange, searchable = searchable, selectOnTab = selectOnTab, taggable = taggable, transition = transition, value = value)
    if (index != null) __obj.updateDynamic("index")(index)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectProps]
  }
}

