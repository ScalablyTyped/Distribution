package typings.webcryptoCore.mod

import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyStorage
  extends StObject
     with CryptoStorage[typings.std.CryptoKey] {
  
  def getItem(index: String, algorithm: ImportAlgorithms, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[typings.std.CryptoKey] = js.native
}
