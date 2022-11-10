package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends StObject {
  
  /**
  	 * Calculates the digest {@link https://nodejs.org/api/crypto.html#crypto_hash_digest_encoding}
  	 */
  def digest(): String | Buffer = js.native
  def digest(encoding: String): String | Buffer = js.native
  
  /**
  	 * Update hash {@link https://nodejs.org/api/crypto.html#crypto_hash_update_data_inputencoding}
  	 */
  def update(data: String): Hash = js.native
  def update(data: String, inputEncoding: String): Hash = js.native
  def update(data: Buffer): Hash = js.native
  def update(data: Buffer, inputEncoding: String): Hash = js.native
}
