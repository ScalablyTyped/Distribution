package typings.webgme.ToolbarNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Toolbar.Toolbar")
@js.native
class Toolbar protected () extends js.Object {
  def this(element: Element) = this()
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

