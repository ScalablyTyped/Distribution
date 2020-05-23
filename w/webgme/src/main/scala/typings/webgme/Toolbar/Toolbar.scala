package typings.webgme.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  def add(item: ToolbarItem): ToolbarButton
  def addButton(params: ToolbarParams): ToolbarButton
  def addCheckBox(): ToolbarCheckBox
  def addColorPicker(params: ToolbarParams): ToolbarColorPicker
  def addDropDownButton(params: ToolbarParams): ToolbarDropDownButton
  def addLabel(): ToolbarLabel
  def addRadioButtonGroup(clickFn: ClickFn): ToolbarRadioButtonGroup
  def addSeparator(): ToolbarSeparator
  def addTextBox(params: ToolbarParams): ToolbarTextBox
  def addToggleButton(params: ToolbarParams): ToolbarToggleButton
  def refresh(): Unit
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
}

