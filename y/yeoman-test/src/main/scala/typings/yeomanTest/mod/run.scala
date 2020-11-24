package typings.yeomanTest.mod

import typings.yeomanGenerator.mod.GeneratorOptions
import typings.yeomanGenerator.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yeoman-test", "run")
@js.native
object run extends js.Object {
  
  def apply(GeneratorOrNamespace: String): RunContext = js.native
  def apply(GeneratorOrNamespace: String, settings: RunContextSettings): RunContext = js.native
  def apply(GeneratorOrNamespace: Constructor[^[GeneratorOptions]]): RunContext = js.native
  def apply(GeneratorOrNamespace: Constructor[^[GeneratorOptions]], settings: RunContextSettings): RunContext = js.native
}
