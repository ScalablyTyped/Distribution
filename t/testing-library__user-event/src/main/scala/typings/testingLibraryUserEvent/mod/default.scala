package typings.testingLibraryUserEvent.mod

import typings.std.HTMLElement
import typings.std.MouseEventInit
import typings.testingLibraryUserEvent.anon.InitialSelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/user-event", JSImport.Default)
@js.native
object default extends js.Object {
  
  def clear(element: TargetElement): Unit = js.native
  
  def click(element: TargetElement): Unit = js.native
  def click(element: TargetElement, init: js.UndefOr[scala.Nothing], options: IClickOptions): Unit = js.native
  def click(element: TargetElement, init: MouseEventInit): Unit = js.native
  def click(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = js.native
  
  def dblClick(element: TargetElement): Unit = js.native
  def dblClick(element: TargetElement, init: js.UndefOr[scala.Nothing], options: IClickOptions): Unit = js.native
  def dblClick(element: TargetElement, init: MouseEventInit): Unit = js.native
  def dblClick(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = js.native
  
  def deselectOptions(element: TargetElement, values: String): Unit = js.native
  def deselectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = js.native
  def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = js.native
  def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = js.native
  def deselectOptions(element: TargetElement, values: HTMLElement): Unit = js.native
  def deselectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = js.native
  
  def hover(element: TargetElement): Unit = js.native
  def hover(element: TargetElement, init: MouseEventInit): Unit = js.native
  
  def paste(element: TargetElement, text: String): Unit = js.native
  def paste(
    element: TargetElement,
    text: String,
    init: js.UndefOr[scala.Nothing],
    pasteOptions: InitialSelectionEnd
  ): Unit = js.native
  def paste(element: TargetElement, text: String, init: MouseEventInit): Unit = js.native
  def paste(element: TargetElement, text: String, init: MouseEventInit, pasteOptions: InitialSelectionEnd): Unit = js.native
  
  def selectOptions(element: TargetElement, values: String): Unit = js.native
  def selectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = js.native
  def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = js.native
  def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = js.native
  def selectOptions(element: TargetElement, values: HTMLElement): Unit = js.native
  def selectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = js.native
  
  def tab(): Unit = js.native
  def tab(userOpts: ITabUserOptions): Unit = js.native
  
  def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String): Unit | js.Promise[Unit] = js.native
  def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String, userOpts: T): Unit | js.Promise[Unit] = js.native
  
  def unhover(element: TargetElement): Unit = js.native
  def unhover(element: TargetElement, init: MouseEventInit): Unit = js.native
  
  def upload(element: TargetElement, files: FilesArgument): Unit = js.native
  def upload(element: TargetElement, files: FilesArgument, init: UploadInitArgument): Unit = js.native
}
