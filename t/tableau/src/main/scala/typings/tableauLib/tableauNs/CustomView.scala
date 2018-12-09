package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.CustomView")
@js.native
class CustomView () extends js.Object {
  /** Indicates whether the custom view is public or private. */
  def getAdvertised(): scala.Boolean = js.native
  /** Gets or sets whether this is the default custom view. */
  def getDefault(): scala.Boolean = js.native
  /** User-friendly name for the custom view */
  def getName(): java.lang.String = js.native
  /** Gets the user that created the custom view. */
  def getOwnerName(): java.lang.String = js.native
  /** Unique URL to load this view again. */
  def getUrl(): java.lang.String = js.native
  /** Gets the Workbook to which this CustomView belongs. */
  def getWorkbook(): Workbook = js.native
  /** After saveAsync() is called, the result of the getUrl method is no longer blank. */
  def saveAsync(): js.Promise[CustomView] = js.native
  /** Indicates whether the custom view is public or private. */
  def setAdvertised(bool: scala.Boolean): scala.Boolean = js.native
  /** User-friendly name for the custom view */
  def setName(name: java.lang.String): java.lang.String = js.native
}

