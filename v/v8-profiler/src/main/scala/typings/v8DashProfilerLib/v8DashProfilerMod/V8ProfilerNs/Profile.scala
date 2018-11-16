package typings
package v8DashProfilerLib.v8DashProfilerMod.V8ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  /**
               * removes profile from memory.
               */
  var delete: js.Function0[_] = js.native
  /**
               * provides short information about profile.
               */
  var getHeader: js.Function0[_] = js.native
  /**
               * provides simple export API for profile.
               * callback(error, data) receives serialized profile as second argument. (Serialization is equal to JSON.stringify result).
               */
  def export(): nodeLib.fsMod.ReadStream = js.native
  /**
               * provides simple export API for profile.
               * callback(error, data) receives serialized profile as second argument. (Serialization is equal to JSON.stringify result).
               */
  def export(callback: js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
}

