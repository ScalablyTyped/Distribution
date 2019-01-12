package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Values extends js.Object {
  def clear(): scala.Unit = js.native
  def focus(item: java.lang.String): scala.Unit = js.native
  def getCleanValues(): js.Any = js.native
  def getDirtyValues(): js.Any = js.native
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  def isDirty(): scala.Boolean = js.native
  def markInvalid(name: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
  def setDirty(): scala.Unit = js.native
  def setDirty(mark: scala.Boolean): scala.Unit = js.native
  def setValues(values: js.Any): scala.Unit = js.native
  def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
}

