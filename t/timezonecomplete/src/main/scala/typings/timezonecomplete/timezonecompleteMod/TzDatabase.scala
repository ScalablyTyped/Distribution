package typings.timezonecomplete.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TzDatabase")
@js.native
/**
  * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
  */
class TzDatabase protected ()
  extends typings.timezonecomplete.distLibTzDashDatabaseMod.TzDatabase

/* static members */
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
  def init(): Unit = js.native
  def init(data: js.Any): Unit = js.native
  def init(data: js.Array[_]): Unit = js.native
  /**
    * Single instance of this database
    */
  def instance(): typings.timezonecomplete.distLibTzDashDatabaseMod.TzDatabase = js.native
}

