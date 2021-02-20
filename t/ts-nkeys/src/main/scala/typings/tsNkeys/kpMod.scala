package typings.tsNkeys

import typings.node.Buffer
import typings.tsNkeys.mod.KeyPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kpMod {
  
  @JSImport("ts-nkeys/lib/kp", "KP")
  @js.native
  class KP protected () extends KeyPair {
    def this(seed: Buffer) = this()
    
    def getRawSeed(): Buffer = js.native
    
    var seed: Buffer = js.native
  }
}
