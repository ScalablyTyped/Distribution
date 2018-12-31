package typings
package xDashEditableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditable extends js.Object {
  var options: XEditableOptions
  def activate(): scala.Unit
  def destroy(): scala.Unit
  def disable(): scala.Unit
  def enable(): scala.Unit
  def getValue(isSingle: scala.Boolean): js.Any
  def hide(): scala.Unit
  def option(key: js.Any, value: js.Any): scala.Unit
  def setValue(value: js.Any, convertStr: scala.Boolean): scala.Unit
  def show(closeAll: scala.Boolean): scala.Unit
  def submit(options: XEditableSubmitOptions): scala.Unit
  def toggle(closeAll: scala.Boolean): scala.Unit
  def toggleDisabled(): scala.Unit
  def validate(): scala.Unit
}

