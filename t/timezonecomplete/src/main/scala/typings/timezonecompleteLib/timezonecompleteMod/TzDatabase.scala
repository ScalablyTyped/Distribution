package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TzDatabase")
@js.native
/**
  * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
  */
class TzDatabase protected ()
  extends timezonecompleteLib.distLibTzDashDatabaseMod.TzDatabase

@JSImport("timezonecomplete", "TzDatabase")
@js.native
object TzDatabase extends js.Object {
  /**
    * Single instance member
    */
  var _instance: js.UndefOr[js.Any] = js.native
  /**
    * (re-) initialize timezonecomplete with time zone data
    *
    * @param data TZ data as JSON object (from one of the tzdata NPM modules).
    *             If not given, Timezonecomplete will search for installed modules.
    */
  def init(): scala.Unit = js.native
  def init(data: js.Any): scala.Unit = js.native
  def init(data: js.Array[_]): scala.Unit = js.native
  /**
    * Single instance of this database
    */
  def instance(): timezonecompleteLib.distLibTzDashDatabaseMod.TzDatabase = js.native
}

