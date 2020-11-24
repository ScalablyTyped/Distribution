package typings.tsNkeys

import typings.node.Buffer
import typings.tsNkeys.mod.KeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/public", JSImport.Namespace)
@js.native
object publicMod extends js.Object {
  
  @js.native
  class PublicKey protected () extends KeyPair {
    def this(publicKey: Buffer) = this()
    
    var publicKey: Buffer = js.native
  }
}
