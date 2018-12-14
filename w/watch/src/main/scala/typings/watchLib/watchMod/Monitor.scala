package typings
package watchLib.watchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitor
  extends nodeLib.eventsMod.EventEmitter {
  var files: org.scalablytyped.runtime.StringDictionary[nodeLib.fsMod.Stats] = js.native
  @JSName("on")
  def on_changed(
    event: watchLib.watchLibStrings.changed,
    listener: js.Function3[
      /* f */ FileOrFiles, 
      /* current */ nodeLib.fsMod.Stats, 
      /* prev */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_created(
    event: watchLib.watchLibStrings.created,
    listener: js.Function2[/* f */ FileOrFiles, /* stat */ nodeLib.fsMod.Stats, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_removed(
    event: watchLib.watchLibStrings.removed,
    listener: js.Function2[/* f */ FileOrFiles, /* stat */ nodeLib.fsMod.Stats, scala.Unit]
  ): this.type = js.native
  def stop(): scala.Unit = js.native
}

