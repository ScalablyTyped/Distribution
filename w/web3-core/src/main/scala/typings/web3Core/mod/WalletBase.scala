package typings.web3Core.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core", "WalletBase")
@js.native
open class WalletBase protected ()
  extends StObject
     with /* key */ NumberDictionary[Account] {
  def this(accounts: AccountsBase) = this()
  
  def add(account: String): AddedAccount = js.native
  def add(account: AddAccount): AddedAccount = js.native
  
  def clear(): WalletBase = js.native
  
  def create(numberOfAccounts: Double): WalletBase = js.native
  def create(numberOfAccounts: Double, entropy: String): WalletBase = js.native
  
  def decrypt(keystoreArray: js.Array[EncryptedKeystoreV3Json], password: String): WalletBase = js.native
  
  var defaultKeyName: String = js.native
  
  def encrypt(password: String): js.Array[EncryptedKeystoreV3Json] = js.native
  
  var length: Double = js.native
  
  def load(password: String): WalletBase = js.native
  def load(password: String, keyName: String): WalletBase = js.native
  
  def remove(account: String): Boolean = js.native
  def remove(account: Double): Boolean = js.native
  
  def save(password: String): Boolean = js.native
  def save(password: String, keyName: String): Boolean = js.native
}
