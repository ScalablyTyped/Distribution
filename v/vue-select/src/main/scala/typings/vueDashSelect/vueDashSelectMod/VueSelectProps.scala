package typings.vueDashSelect.vueDashSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueSelectProps extends js.Object {
  var autocomplete: String
  var clearSearchOnSelect: Boolean
  var clearable: Boolean
  var closeOnSelect: Boolean
  var dir: String
  var disabled: Boolean
  var filterable: Boolean
  var index: String | Null
  var inputId: String | Null
  var label: String
  var maxHeight: String
  var multiple: Boolean
  var noDrop: Boolean
  var options: js.Array[_]
  var placeholder: String
  var pushTags: Boolean
  var resetOnOptionsChange: Boolean
  var searchable: Boolean
  var selectOnTab: Boolean
  var tabindex: Double | Null
  var taggable: Boolean
  var transition: String
  var value: js.Any
  def createOption(option: js.Any): js.Any
  def filter(options: js.Array[_], search: String): Boolean
  def filterBy(option: js.Any, label: String, search: String): Boolean
  def getOptionLabel(option: js.Any): String
  def onChange(`val`: js.Any): Unit
  def onInput(`val`: js.Any): Unit
  def onTab(): Unit
}

object VueSelectProps {
  @scala.inline
  def apply(
    autocomplete: String,
    clearSearchOnSelect: Boolean,
    clearable: Boolean,
    closeOnSelect: Boolean,
    createOption: js.Any => js.Any,
    dir: String,
    disabled: Boolean,
    filter: (js.Array[_], String) => Boolean,
    filterBy: (js.Any, String, String) => Boolean,
    filterable: Boolean,
    getOptionLabel: js.Any => String,
    label: String,
    maxHeight: String,
    multiple: Boolean,
    noDrop: Boolean,
    onChange: js.Any => Unit,
    onInput: js.Any => Unit,
    onTab: () => Unit,
    options: js.Array[_],
    placeholder: String,
    pushTags: Boolean,
    resetOnOptionsChange: Boolean,
    searchable: Boolean,
    selectOnTab: Boolean,
    taggable: Boolean,
    transition: String,
    value: js.Any,
    index: String = null,
    inputId: String = null,
    tabindex: Int | Double = null
  ): VueSelectProps = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete, clearSearchOnSelect = clearSearchOnSelect, clearable = clearable, closeOnSelect = closeOnSelect, createOption = js.Any.fromFunction1(createOption), dir = dir, disabled = disabled, filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable, getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label, maxHeight = maxHeight, multiple = multiple, noDrop = noDrop, onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options, placeholder = placeholder, pushTags = pushTags, resetOnOptionsChange = resetOnOptionsChange, searchable = searchable, selectOnTab = selectOnTab, taggable = taggable, transition = transition, value = value)
    if (index != null) __obj.updateDynamic("index")(index)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectProps]
  }
}

