package typings
package v8DashProfilerLib.v8DashProfilerMod.V8ProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * creates HEAP diff for two snapshots.
    */
  var compare: js.Function1[/* snapshot */ js.Object, scala.Unit] = js.native
  /**
    * removes snapshot from memory.
    */
  var delete: js.Function0[_] = js.native
  /**
    * provides short information about snapshot.
    */
  var getHeader: js.Function0[_] = js.native
  /**
    * low level serialization method.
    * Look Snapshot.export source for usage example.
    */
  var serialize: js.Function = js.native
  /**
    * provides simple export API for snapshot.
    * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
    * If callback will not be passed, export returns transform stream.
    */
  def export(): nodeLib.fsMod.ReadStream = js.native
  /**
    * provides simple export API for snapshot.
    * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
    * If callback will not be passed, export returns transform stream.
    */
  def export(callback: js.Function2[/* error */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
}

