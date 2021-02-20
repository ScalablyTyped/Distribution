package typings.v8Profiler

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.ReadStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("v8-profiler", JSImport.Namespace)
  @js.native
  val ^ : Profiler = js.native
  
  @js.native
  trait Profile extends StObject {
    
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
  
  @js.native
  trait Profiler extends StObject {
    
    def deleteAllProfiles(): Unit = js.native
    
    def deleteAllSnapshots(): Unit = js.native
    
    /**
      * Changes default CPU profiler sampling interval to the specified number of microseconds.
      * Default interval is 1000us.
      * This method must be called when there are no profiles being recorded.
      * If called without arguments it resets interval to default.
      */
    def setSamplingInterval(): Unit = js.native
    def setSamplingInterval(ms: Double): Unit = js.native
    
    /**
      * start CPU profiling.
      * name is optional argument, by default profile name will be constructed from its uid.
      * recsamples is true by default.
      */
    def startProfiling(): Unit = js.native
    def startProfiling(name: js.UndefOr[scala.Nothing], recsamples: Boolean): Unit = js.native
    def startProfiling(name: String): Unit = js.native
    def startProfiling(name: String, recsamples: Boolean): Unit = js.native
    
    /**
      * returns new CPU Profile instance.
      * There is no strictly described behavior for usage without name argument.
      */
    def stopProfiling(): Profile = js.native
    def stopProfiling(name: String): Profile = js.native
    
    /**
      * returns new HEAP Snapshot instance.
      * name is optional argument, by default snapshot name will be constructed from its uid.
      */
    def takeSnapshot(): Snapshot = js.native
    def takeSnapshot(name: String): Snapshot = js.native
  }
  
  @js.native
  trait Snapshot extends StObject {
    
    /**
      * creates HEAP diff for two snapshots.
      */
    def compare(snapshot: Snapshot): Unit = js.native
    
    /**
      * removes snapshot from memory.
      */
    def delete(): js.Any = js.native
    
    /**
      * provides simple export API for snapshot.
      * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
      * If callback will not be passed, export returns transform stream.
      */
    def export(): ReadStream = js.native
    /**
      * provides simple export API for snapshot.
      * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
      * If callback will not be passed, export returns transform stream.
      */
    def export(callback: js.Function2[/* error */ Error, /* data */ js.Any, Unit]): Unit = js.native
    
    /**
      * provides short information about snapshot.
      */
    def getHeader(): js.Any = js.native
    
    /**
      * low level serialization method.
      * Look Snapshot.export source for usage example.
      */
    var serialize: js.Function = js.native
  }
  
  type _To = Profiler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Profiler = ^
}
