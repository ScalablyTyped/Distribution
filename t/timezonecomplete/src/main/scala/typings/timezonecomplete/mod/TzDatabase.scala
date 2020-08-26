package typings.timezonecomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TzDatabase")
@js.native
/**
  * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
  * @throws AlreadyCreated if an instance already exists
  * @throws timezonecomplete.InvalidTimeZoneData if `data` is empty or invalid
  */
class TzDatabase protected ()
  extends typings.timezonecomplete.tzDatabaseMod.TzDatabase

/* static members */
@JSImport("timezonecomplete", "TzDatabase")
@js.native
object TzDatabase extends js.Object {
  /**
    * Single instance member
    */
  var _instance: js.Any = js.native
  /**
    * (re-) initialize timezonecomplete with time zone data
    *
    * @param data TZ data as JSON object (from one of the tzdata NPM modules).
    *             If not given, Timezonecomplete will search for installed modules.
    * @throws timezonecomplete.InvalidTimeZoneData if `data` or the global time zone data is invalid
    */
  def init(): Unit = js.native
  def init(data: js.Any): Unit = js.native
  def init(data: js.Array[_]): Unit = js.native
  /**
    * Single instance of this database
    * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
    */
  def instance(): typings.timezonecomplete.tzDatabaseMod.TzDatabase = js.native
}

