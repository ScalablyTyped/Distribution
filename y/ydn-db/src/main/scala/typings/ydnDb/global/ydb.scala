package typings.ydnDb.global

import typings.ydnDb.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ydb")
@js.native
object ydb extends js.Object {
  
  @js.native
  object db extends js.Object {
    
    @js.native
    object algo extends js.Object {
      
      @js.native
      class NestedLoop protected ()
        extends typings.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
      
      @js.native
      class Solver ()
        extends typings.ydnDb.ydb.db.algo.Solver
      
      @js.native
      class SortedMerge protected ()
        extends typings.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
      
      @js.native
      class ZigzagMerge protected ()
        extends typings.ydnDb.ydb.db.algo.Solver {
        def this(out: Push) = this()
        def this(out: Push, limit: Double) = this()
      }
    }
  }
}
