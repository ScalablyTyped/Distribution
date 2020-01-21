package typings.vueSelect.mod

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
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], clearSearchOnSelect = clearSearchOnSelect.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], createOption = js.Any.fromFunction1(createOption), dir = dir.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filter = js.Any.fromFunction2(filter), filterBy = js.Any.fromFunction3(filterBy), filterable = filterable.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), label = label.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], noDrop = noDrop.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onInput = js.Any.fromFunction1(onInput), onTab = js.Any.fromFunction0(onTab), options = options.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], pushTags = pushTags.asInstanceOf[js.Any], resetOnOptionsChange = resetOnOptionsChange.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], selectOnTab = selectOnTab.asInstanceOf[js.Any], taggable = taggable.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueSelectProps]
  }
}

