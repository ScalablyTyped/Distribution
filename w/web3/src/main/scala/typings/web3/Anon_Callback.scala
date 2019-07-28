package typings.web3

import typings.web3.ethTypesMod.CompileResult
import typings.web3.typesMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def lll(source: String): js.Promise[CompileResult] = js.native
  def lll(source: String, callback: Callback[CompileResult]): js.Promise[CompileResult] = js.native
  def serpent(source: String): js.Promise[CompileResult] = js.native
  def serpent(source: String, callback: Callback[CompileResult]): js.Promise[CompileResult] = js.native
  def solidity(source: String): js.Promise[CompileResult] = js.native
  def solidity(source: String, callback: Callback[CompileResult]): js.Promise[CompileResult] = js.native
}

