package typings.v8Profiler.mod

import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends js.Object {
  
  /**
    * removes profile from memory.
    */
  def delete(): js.Any = js.native
  
  /**
    * provides simple export API for profile.
    * callback(error, data) receives serialized profile as second argument. (Serialization is equal to JSON.stringify result).
    */
  def export(): ReadStream = js.native
  /**
    * provides simple export API for profile.
    * callback(error, data) receives serialized profile as second argument. (Serialization is equal to JSON.stringify result).
    */
  def export(callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]): Unit = js.native
  
  /**
    * provides short information about profile.
    */
  def getHeader(): js.Any = js.native
}
