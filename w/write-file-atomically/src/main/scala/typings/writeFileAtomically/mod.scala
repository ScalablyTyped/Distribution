package typings.writeFileAtomically

import typings.node.Buffer
import typings.std.Uint8Array
import typings.writeFileAtomic.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-file-atomically", JSImport.Namespace)
  @js.native
  def apply(path: String, data: Data): js.Promise[Unit] = js.native
  @JSImport("write-file-atomically", JSImport.Namespace)
  @js.native
  def apply(path: String, data: Data, options: Options): js.Promise[Unit] = js.native
  
  type Data = String | Buffer | Uint8Array
}
