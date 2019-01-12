package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditAbility extends js.Object {
  def edit(id: js.Any): scala.Unit = js.native
  def editCancel(): scala.Unit = js.native
  def editNext(): scala.Unit = js.native
  def editStop(): scala.Unit = js.native
  def focusEditor(id: js.Any): scala.Unit = js.native
  def getEditState(): js.Any = js.native
  def getEditor(): js.Any = js.native
  def getEditor(id: java.lang.String): js.Any = js.native
  def getEditorValue(): java.lang.String = js.native
  def validateEditor(): scala.Boolean = js.native
  def validateEditor(id: java.lang.String): scala.Boolean = js.native
  def validateEditor(id: scala.Double): scala.Boolean = js.native
}

