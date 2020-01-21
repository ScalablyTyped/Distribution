package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydb")
@js.native
object ydb extends js.Object {
  @js.native
  object db extends js.Object {
    @js.native
    object algo extends js.Object {
      @js.native
      class NestedLoop protected () extends Solver {
        def this(out: AnonPush) = this()
        def this(out: AnonPush, limit: Double) = this()
      }
      
      @js.native
      class Solver () extends js.Object
      
      @js.native
      class SortedMerge protected () extends Solver {
        def this(out: AnonPush) = this()
        def this(out: AnonPush, limit: Double) = this()
      }
      
      @js.native
      class ZigzagMerge protected () extends Solver {
        def this(out: AnonPush) = this()
        def this(out: AnonPush, limit: Double) = this()
      }
      
    }
    
  }
  
}

