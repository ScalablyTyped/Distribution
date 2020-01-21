package typings.yeomanGenerator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.yeomanGenerator.AnonAdapter
import typings.yeomanGenerator.AnonGit
import typings.yeomanGenerator.AnonLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generator extends EventEmitter {
  var appname: String = js.native
  var config: Storage = js.native
  var description: String = js.native
  var env: AnonAdapter = js.native
  var fs: MemFsEditor = js.native
  var options: StringDictionary[js.Any] = js.native
  var resolved: String = js.native
  // actions/user mixin
  val user: AnonGit = js.native
  def argument(name: String, config: ArgumentConfig): this.type = js.native
  // actions/help mixin
  def argumentsHelp(): String = js.native
  def async(): js.Function0[js.Object] = js.native
  // actions/install mixin
  /**
    * Receives a list of `components` and an `options` object to install through bower.
    *
    * The installation will automatically run during the run loop `install` phase.
    *
    * @param component Components to install
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`.
    */
  def bowerInstall(): Unit = js.native
  def bowerInstall(component: String): Unit = js.native
  def bowerInstall(component: String, options: js.Object): Unit = js.native
  def bowerInstall(component: String, options: js.Object, spawnOptions: js.Object): Unit = js.native
  def bowerInstall(component: js.Array[String]): Unit = js.native
  def bowerInstall(component: js.Array[String], options: js.Object): Unit = js.native
  def bowerInstall(component: js.Array[String], options: js.Object, spawnOptions: js.Object): Unit = js.native
  def composeWith(namespace: String, options: StringDictionary[js.Any]): this.type = js.native
  def composeWith(namespace: String, options: StringDictionary[js.Any], settings: AnonLink): this.type = js.native
  def desc(description: String): this.type = js.native
  def destinationPath(path: String*): String = js.native
  def destinationRoot(): String = js.native
  def destinationRoot(rootPath: String): String = js.native
  def determineAppname(): String = js.native
  def help(): String = js.native
  /**
    * Runs `npm` and `bower`, in sequence, in the generated directory and prints a
    * message to let the user know.
    *
    * @example
    * this.installDependencies({
    *   bower: true,
    *   npm: true
    * }).then(() => console.log('Everything is ready!'));
    *
    * @example
    * this.installDependencies({
    *   yarn: {force: true},
    *   npm: false
    * }).then(() => console.log('Everything is ready!'));
    *
    */
  def installDependencies(): Unit = js.native
  def installDependencies(options: InstallOptions): Unit = js.native
  def log(): Unit = js.native
  def log(message: String): Unit = js.native
  def log(message: String, context: js.Any): Unit = js.native
  /**
    * Receives a list of `packages` and an `options` object to install through npm.
    *
    * The installation will automatically run during the run loop `install` phase.
    *
    * @param pkgs Packages to install
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`.
    */
  def npmInstall(): Unit = js.native
  def npmInstall(pkgs: String): Unit = js.native
  def npmInstall(pkgs: String, options: js.Object): Unit = js.native
  def npmInstall(pkgs: String, options: js.Object, spawnOptions: js.Object): Unit = js.native
  def npmInstall(pkgs: js.Array[String]): Unit = js.native
  def npmInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
  def npmInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: js.Object): Unit = js.native
  def option(name: String, config: OptionConfig): this.type = js.native
  def optionsHelp(): String = js.native
  def prompt[A /* <: Answers */](questions: Questions[A]): js.Promise[A] = js.native
  def registerTransformStream(stream: js.Array[js.Object]): this.type = js.native
  def registerTransformStream(stream: js.Object): this.type = js.native
  def rootGeneratorName(): String = js.native
  def rootGeneratorVersion(): String = js.native
  def run(): this.type = js.native
  def run(cb: Callback): this.type = js.native
  /**
    * Combine package manager cmd line arguments and run the `install` command.
    *
    * During the `install` step, every command will be scheduled to run once, on the
    * run loop.
    *
    * @param installer Which package manager to use
    * @param paths Packages to install. Use an empty string for `npm install`
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`. ref
    *                     https://nodejs.org/api/child_process.html#child_process_child_process_spawn_command_args_options
    */
  def scheduleInstallTask(installer: String): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String, options: js.Object): Unit = js.native
  def scheduleInstallTask(installer: String, paths: String, options: js.Object, spawnOptions: js.Object): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String]): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object): Unit = js.native
  def scheduleInstallTask(installer: String, paths: js.Array[String], options: js.Object, spawnOptions: js.Object): Unit = js.native
  def sourceRoot(): String = js.native
  def sourceRoot(rootPath: String): String = js.native
  // actions/spawn_command mixin
  def spawnCommand(command: String, args: js.Array[String]): js.Any = js.native
  def spawnCommand(command: String, args: js.Array[String], opt: js.Object): js.Any = js.native
  def spawnCommandSync(command: String, args: js.Array[String]): js.Any = js.native
  def spawnCommandSync(command: String, args: js.Array[String], opt: js.Object): js.Any = js.native
  def templatePath(path: String*): String = js.native
  def usage(): String = js.native
  /**
    * Receives a list of `packages` and an `options` object to install through npm.
    *
    * The installation will automatically run during the run loop `install` phase.
    *
    * @param pkgs Packages to install
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`.
    */
  def yarnInstall(): Unit = js.native
  def yarnInstall(pkgs: String): Unit = js.native
  def yarnInstall(pkgs: String, options: js.Object): Unit = js.native
  def yarnInstall(pkgs: String, options: js.Object, spawnOptions: js.Object): Unit = js.native
  def yarnInstall(pkgs: js.Array[String]): Unit = js.native
  def yarnInstall(pkgs: js.Array[String], options: js.Object): Unit = js.native
  def yarnInstall(pkgs: js.Array[String], options: js.Object, spawnOptions: js.Object): Unit = js.native
}

