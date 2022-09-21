package typings.xsalsa20

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("xsalsa20", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Xor {
    /**
      * Create a new xor instance.
      *
      * @param nonce Should be 24 bytes.
      * @param key Should be 32 bytes.
      */
    def this(nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array) = this()
    def this(nonce: js.typedarray.Uint8Array, key: Buffer) = this()
    def this(nonce: Buffer, key: js.typedarray.Uint8Array) = this()
    def this(nonce: Buffer, key: Buffer) = this()
  }
  @JSImport("xsalsa20", JSImport.Namespace)
  @js.native
  val ^ : XSalsa20 = js.native
  
  @js.native
  trait XSalsa20
    extends StObject
       with /**
    * Create a new xor instance.
    *
    * @param nonce Should be 24 bytes.
    * @param key Should be 32 bytes.
    */
  Instantiable2[
          (/* nonce */ Buffer) | (/* nonce */ js.typedarray.Uint8Array), 
          (/* key */ Buffer) | (/* key */ js.typedarray.Uint8Array), 
          Xor
        ] {
    
    /**
      * Create a new xor instance.
      *
      * @param nonce Should be 24 bytes.
      * @param key Should be 32 bytes.
      */
    def apply(nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Xor = js.native
    def apply(nonce: js.typedarray.Uint8Array, key: Buffer): Xor = js.native
    def apply(nonce: Buffer, key: js.typedarray.Uint8Array): Xor = js.native
    def apply(nonce: Buffer, key: Buffer): Xor = js.native
    
    /**
      * Bytes required for the key buffer.
      */
    val KEYBYTES: Double = js.native
    
    /**
      * Bytes required for the nonce buffer.
      */
    val NONCEBYTES: Double = js.native
  }
  
  @js.native
  trait Xor extends StObject {
    
    /**
      * Update the xor instance with a new input buffer. Optionally you can pass in an output buffer.
      *
      * @example
      * import * as crypto from 'crypto';
      * import xsalsa20 = require('xsalsa20');
      *
      * const key = crypto.randomBytes(xsalsa20.KEYBYTES);
      * const nonce = crypto.randomBytes(xsalsa20.NONCEBYTES);
      *
      * const xor = xsalsa20(nonce, key);
      *
      * console.log(xor.update(Buffer.from('hello')));
      * console.log(xor.update(Buffer.from('world')));
      *
      * xor.finalize();
      */
    def update[TOut /* <: js.typedarray.Uint8Array | Buffer */](input: js.typedarray.Uint8Array): TOut = js.native
    def update[TOut /* <: js.typedarray.Uint8Array | Buffer */](input: js.typedarray.Uint8Array, output: TOut): TOut = js.native
    def update[TOut /* <: js.typedarray.Uint8Array | Buffer */](input: Buffer): TOut = js.native
    def update[TOut /* <: js.typedarray.Uint8Array | Buffer */](input: Buffer, output: TOut): TOut = js.native
  }
  
  type _To = XSalsa20
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: XSalsa20 = ^
}
