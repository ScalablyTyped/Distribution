package typings.tsNkeys

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base32Mod {
  
  @JSImport("ts-nkeys/lib/base32", "base32")
  @js.native
  class base32 () extends StObject
  /* static members */
  object base32 {
    
    @JSImport("ts-nkeys/lib/base32", "base32")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts-nkeys/lib/base32", "base32.alphabet")
    @js.native
    def alphabet: String = js.native
    @scala.inline
    def alphabet_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(x.asInstanceOf[js.Any])
    
    @JSImport("ts-nkeys/lib/base32", "base32.decode")
    @js.native
    def decode(src: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/base32", "base32.encode")
    @js.native
    def encode(src: Buffer): Buffer = js.native
  }
}
