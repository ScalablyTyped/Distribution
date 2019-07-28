package typings.wallabyjs.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallabyBuiltInCompilers extends js.Object {
  def babel(): IWallabyCompilerResult = js.native
  def babel(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
  def coffeeScript(): IWallabyCompilerResult = js.native
  def coffeeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
  def typeScript(): IWallabyCompilerResult = js.native
  def typeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
}

