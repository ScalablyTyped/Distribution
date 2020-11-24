package typings.yeomanTest.mod

import typings.yeomanGenerator.mod.GeneratorOptions
import typings.yeomanGenerator.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yeoman-test", "createGenerator")
@js.native
object createGenerator extends js.Object {
  
  def apply(name: String, dependencies: js.Array[Dependency]): ^[GeneratorOptions] = js.native
  def apply(
    name: String,
    dependencies: js.Array[Dependency],
    args: js.UndefOr[scala.Nothing],
    options: Dictionary[_]
  ): ^[GeneratorOptions] = js.native
  def apply(name: String, dependencies: js.Array[Dependency], args: String): ^[GeneratorOptions] = js.native
  def apply(name: String, dependencies: js.Array[Dependency], args: String, options: Dictionary[_]): ^[GeneratorOptions] = js.native
  def apply(name: String, dependencies: js.Array[Dependency], args: js.Array[String]): ^[GeneratorOptions] = js.native
  def apply(name: String, dependencies: js.Array[Dependency], args: js.Array[String], options: Dictionary[_]): ^[GeneratorOptions] = js.native
}
