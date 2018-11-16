package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Clear extends js.Object {
  def add(account: java.lang.String): js.Any = js.native
  def add(account: web3Lib.ethAccountsMod.Account): js.Any = js.native
  def clear(): js.Any = js.native
  def create(numberOfAccounts: scala.Double, entropy: java.lang.String): js.Array[web3Lib.ethAccountsMod.Account] = js.native
  def load(password: java.lang.String, keyname: java.lang.String): js.Any = js.native
  def remove(account: java.lang.String): js.Any = js.native
  def remove(account: scala.Double): js.Any = js.native
  def save(password: java.lang.String): java.lang.String = js.native
  def save(password: java.lang.String, keyname: java.lang.String): java.lang.String = js.native
}

