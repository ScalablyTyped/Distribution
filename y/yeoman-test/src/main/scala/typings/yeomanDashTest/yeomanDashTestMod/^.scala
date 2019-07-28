package typings.yeomanDashTest.yeomanDashTestMod

import typings.yeomanDashGenerator.yeomanDashGeneratorMod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-test", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDummyGenerator(): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency]): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: String): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: String, options: Dictionary[_]): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String]): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def createGenerator(name: String, dependencies: js.Array[Dependency], args: js.Array[String], options: Dictionary[_]): typings.yeomanDashGenerator.yeomanDashGeneratorMod.^ = js.native
  def gruntfile(options: Dictionary[_]): Unit = js.native
  def gruntfile(options: Dictionary[_], done: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def mockLocalConfig(generator: typings.yeomanDashGenerator.yeomanDashGeneratorMod.^, localConfig: Dictionary[_]): Unit = js.native
  def mockPrompt(generator: typings.yeomanDashGenerator.yeomanDashGeneratorMod.^, answers: Answers): Unit = js.native
  def registerDependencies(env: Env, dependencies: js.Array[Dependency]): Unit = js.native
  def restorePrompt(generator: typings.yeomanDashGenerator.yeomanDashGeneratorMod.^): Unit = js.native
  def run(GeneratorOrNamespace: String): RunContext = js.native
  def run(GeneratorOrNamespace: String, settings: RunContextSettings): RunContext = js.native
  def run(GeneratorOrNamespace: Constructor[typings.yeomanDashGenerator.yeomanDashGeneratorMod.^]): RunContext = js.native
  def run(
    GeneratorOrNamespace: Constructor[typings.yeomanDashGenerator.yeomanDashGeneratorMod.^],
    settings: RunContextSettings
  ): RunContext = js.native
  def setUpTestDirectory(dir: String): js.Function1[/* done */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def testDirectory(dir: String): Unit = js.native
  def testDirectory(dir: String, cb: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

