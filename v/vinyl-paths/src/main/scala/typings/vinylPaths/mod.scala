package typings.vinylPaths

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vinyl-paths", JSImport.Namespace)
  @js.native
  val ^ : PathsStatic = js.native
  
  type Callback = js.Function1[/* path */ String, Any]
  
  @js.native
  trait Paths
    extends StObject
       with ReadWriteStream {
    
    var paths: js.Array[String] = js.native
  }
  
  type PathsStatic = js.Function1[/* callback */ js.UndefOr[Callback], Paths]
  
  type _To = PathsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PathsStatic = ^
}
