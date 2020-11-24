package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWallabyBuiltInCompilers extends js.Object {
  
  def babel(): IWallabyCompilerResult = js.native
  def babel(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
  
  def coffeeScript(): IWallabyCompilerResult = js.native
  def coffeeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
  
  def typeScript(): IWallabyCompilerResult = js.native
  def typeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
}
