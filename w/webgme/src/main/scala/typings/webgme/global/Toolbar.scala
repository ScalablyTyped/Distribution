package typings.webgme.global

import typings.std.Element
import typings.webgme.Toolbar.ClickFn
import typings.webgme.Toolbar.ToolbarParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Toolbar")
@js.native
object Toolbar extends js.Object {
  @js.native
  class Toolbar protected ()
    extends typings.webgme.Toolbar.Toolbar {
    def this(element: Element) = this()
    /* CompleteClass */
    override def add(item: typings.webgme.Toolbar.ToolbarItem): typings.webgme.Toolbar.ToolbarButton = js.native
    /* CompleteClass */
    override def addButton(params: ToolbarParams): typings.webgme.Toolbar.ToolbarButton = js.native
    /* CompleteClass */
    override def addCheckBox(): typings.webgme.Toolbar.ToolbarCheckBox = js.native
    /* CompleteClass */
    override def addColorPicker(params: ToolbarParams): typings.webgme.Toolbar.ToolbarColorPicker = js.native
    /* CompleteClass */
    override def addDropDownButton(params: ToolbarParams): typings.webgme.Toolbar.ToolbarDropDownButton = js.native
    /* CompleteClass */
    override def addLabel(): typings.webgme.Toolbar.ToolbarLabel = js.native
    /* CompleteClass */
    override def addRadioButtonGroup(clickFn: ClickFn): typings.webgme.Toolbar.ToolbarRadioButtonGroup = js.native
    /* CompleteClass */
    override def addSeparator(): typings.webgme.Toolbar.ToolbarSeparator = js.native
    /* CompleteClass */
    override def addTextBox(params: ToolbarParams): typings.webgme.Toolbar.ToolbarTextBox = js.native
    /* CompleteClass */
    override def addToggleButton(params: ToolbarParams): typings.webgme.Toolbar.ToolbarToggleButton = js.native
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  
  @js.native
  class ToolbarButton ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarCheckBox ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarColorPicker ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarDropDownButton ()
    extends typings.webgme.Toolbar.ToolbarDropDownButton {
    /* CompleteClass */
    override def addButton(params: ToolbarParams): typings.webgme.Toolbar.ToolbarButton = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarItem ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarLabel ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarRadioButtonGroup ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarSeparator ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarTextBox ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  class ToolbarToggleButton ()
    extends typings.webgme.Toolbar.ToolbarItem {
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def enabled(value: Boolean): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
}

