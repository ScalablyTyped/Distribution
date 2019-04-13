package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-test", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDummyGenerator(): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: java.lang.String, dependencies: js.Array[Dependency]): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: java.lang.String, dependencies: js.Array[Dependency], args: java.lang.String): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(
    name: java.lang.String,
    dependencies: js.Array[Dependency],
    args: java.lang.String,
    options: Dictionary[_]
  ): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: java.lang.String, dependencies: js.Array[Dependency], args: js.Array[java.lang.String]): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(
    name: java.lang.String,
    dependencies: js.Array[Dependency],
    args: js.Array[java.lang.String],
    options: Dictionary[_]
  ): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def gruntfile(options: Dictionary[_]): scala.Unit = js.native
  def gruntfile(options: Dictionary[_], done: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def mockLocalConfig(generator: yeomanDashGeneratorLib.yeomanDashGeneratorMod.^, localConfig: Dictionary[_]): scala.Unit = js.native
  def mockPrompt(
    generator: yeomanDashGeneratorLib.yeomanDashGeneratorMod.^,
    answers: yeomanDashGeneratorLib.yeomanDashGeneratorMod.Answers
  ): scala.Unit = js.native
  def registerDependencies(env: Env, dependencies: js.Array[Dependency]): scala.Unit = js.native
  def restorePrompt(generator: yeomanDashGeneratorLib.yeomanDashGeneratorMod.^): scala.Unit = js.native
  def run(GeneratorOrNamespace: java.lang.String): RunContext = js.native
  def run(GeneratorOrNamespace: java.lang.String, settings: RunContextSettings): RunContext = js.native
  def run(GeneratorOrNamespace: Constructor[yeomanDashGeneratorLib.yeomanDashGeneratorMod.^]): RunContext = js.native
  def run(
    GeneratorOrNamespace: Constructor[yeomanDashGeneratorLib.yeomanDashGeneratorMod.^],
    settings: RunContextSettings
  ): RunContext = js.native
  def setUpTestDirectory(dir: java.lang.String): js.Function1[/* done */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit] = js.native
  def testDirectory(dir: java.lang.String): scala.Unit = js.native
  def testDirectory(dir: java.lang.String, cb: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
}

