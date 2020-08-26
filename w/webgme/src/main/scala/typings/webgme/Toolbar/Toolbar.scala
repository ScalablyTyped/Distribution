package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toolbar extends js.Object {
  def add(item: ToolbarItem): ToolbarButton = js.native
  def addButton(params: ToolbarParams): ToolbarButton = js.native
  def addCheckBox(): ToolbarCheckBox = js.native
  def addColorPicker(params: ToolbarParams): ToolbarColorPicker = js.native
  def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton = js.native
  def addLabel(): ToolbarLabel = js.native
  def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup = js.native
  def addSeparator(): ToolbarSeparator = js.native
  def addTextBox(params: ToolbarParams): ToolbarTextBox = js.native
  def addToggleButton(params: ToolbarParams): ToolbarToggleButton = js.native
  def refresh(): Unit = js.native
}

object Toolbar {
  @scala.inline
  def apply(
    add: ToolbarItem => ToolbarButton,
    addButton: ToolbarParams => ToolbarButton,
    addCheckBox: () => ToolbarCheckBox,
    addColorPicker: ToolbarParams => ToolbarColorPicker,
    addDropDownButton: ToolbarParams => ToolbarDropDownButton,
    addLabel: () => ToolbarLabel,
    addRadioButtonGroup: ClickFn => ToolbarRadioButtonGroup,
    addSeparator: () => ToolbarSeparator,
    addTextBox: ToolbarParams => ToolbarTextBox,
    addToggleButton: ToolbarParams => ToolbarToggleButton,
    refresh: () => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addButton = js.Any.fromFunction1(addButton), addCheckBox = js.Any.fromFunction0(addCheckBox), addColorPicker = js.Any.fromFunction1(addColorPicker), addDropDownButton = js.Any.fromFunction1(addDropDownButton), addLabel = js.Any.fromFunction0(addLabel), addRadioButtonGroup = js.Any.fromFunction1(addRadioButtonGroup), addSeparator = js.Any.fromFunction0(addSeparator), addTextBox = js.Any.fromFunction1(addTextBox), addToggleButton = js.Any.fromFunction1(addToggleButton), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Toolbar]
  }
  @scala.inline
  implicit class ToolbarOps[Self <: typings.webgme.Toolbar.Toolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: ToolbarItem => ToolbarButton): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddButton(value: ToolbarParams => ToolbarButton): Self = this.set("addButton", js.Any.fromFunction1(value))
    @scala.inline
    def setAddCheckBox(value: () => ToolbarCheckBox): Self = this.set("addCheckBox", js.Any.fromFunction0(value))
    @scala.inline
    def setAddColorPicker(value: ToolbarParams => ToolbarColorPicker): Self = this.set("addColorPicker", js.Any.fromFunction1(value))
    @scala.inline
    def setAddDropDownButton(value: ToolbarParams => ToolbarDropDownButton): Self = this.set("addDropDownButton", js.Any.fromFunction1(value))
    @scala.inline
    def setAddLabel(value: () => ToolbarLabel): Self = this.set("addLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setAddRadioButtonGroup(value: ClickFn => ToolbarRadioButtonGroup): Self = this.set("addRadioButtonGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setAddSeparator(value: () => ToolbarSeparator): Self = this.set("addSeparator", js.Any.fromFunction0(value))
    @scala.inline
    def setAddTextBox(value: ToolbarParams => ToolbarTextBox): Self = this.set("addTextBox", js.Any.fromFunction1(value))
    @scala.inline
    def setAddToggleButton(value: ToolbarParams => ToolbarToggleButton): Self = this.set("addToggleButton", js.Any.fromFunction1(value))
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
  
}

