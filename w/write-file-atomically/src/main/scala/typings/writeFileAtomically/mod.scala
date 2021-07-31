package typings.writeFileAtomically

import typings.node.Buffer
import typings.std.Uint8Array
import typings.writeFileAtomic.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String, data: Data): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(path: String, data: Data, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("write-file-atomically", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Data = String | Buffer | Uint8Array
}
