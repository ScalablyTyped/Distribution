package typings.web3

import typings.web3.ethAccountsMod.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Account extends js.Object {
  def add(account: String): js.Any = js.native
  def add(account: Account): js.Any = js.native
  def clear(): js.Any = js.native
  def create(numberOfAccounts: Double, entropy: String): js.Array[Account] = js.native
  def load(password: String, keyname: String): js.Any = js.native
  def remove(account: String): js.Any = js.native
  def remove(account: Double): js.Any = js.native
  def save(password: String): String = js.native
  def save(password: String, keyname: String): String = js.native
}

