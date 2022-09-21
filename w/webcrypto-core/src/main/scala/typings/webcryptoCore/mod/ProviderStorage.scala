package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "ProviderStorage")
@js.native
open class ProviderStorage () extends StObject {
  
  def algorithms: js.Array[String] = js.native
  
  def get(algorithmName: String): ProviderCrypto | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  /* private */ var items: Any = js.native
  
  def length: Double = js.native
  
  def removeAt(algorithmName: String): ProviderCrypto | Null = js.native
  
  def set(provider: ProviderCrypto): Unit = js.native
}
