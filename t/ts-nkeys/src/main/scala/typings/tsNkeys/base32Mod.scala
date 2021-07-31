package typings.tsNkeys

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def decode(src: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def encode(src: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
}
