package typings.tsNkeys

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/base32", JSImport.Namespace)
@js.native
object base32Mod extends js.Object {
  
  @js.native
  class base32 () extends js.Object
  /* static members */
  @js.native
  object base32 extends js.Object {
    
    var alphabet: String = js.native
    
    def decode(src: Buffer): Buffer = js.native
    
    def encode(src: Buffer): Buffer = js.native
  }
}
