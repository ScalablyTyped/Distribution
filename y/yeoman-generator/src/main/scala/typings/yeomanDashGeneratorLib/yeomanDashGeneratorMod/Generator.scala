package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generator
  extends nodeLib.eventsMod.EventEmitter {
  var appname: java.lang.String = js.native
  var config: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.Storage = js.native
  var description: java.lang.String = js.native
  var env: yeomanDashGeneratorLib.Anon_E = js.native
  var fs: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.MemFsEditor = js.native
  var options: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var resolved: java.lang.String = js.native
  // actions/user mixin
  val user: yeomanDashGeneratorLib.Anon_Git = js.native
  def argument(
    name: java.lang.String,
    config: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.ArgumentConfig
  ): this.type = js.native
  // actions/help mixin
  def argumentsHelp(): java.lang.String = js.native
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
  def bowerInstall(): scala.Unit = js.native
  def bowerInstall(component: java.lang.String): scala.Unit = js.native
  def bowerInstall(component: java.lang.String, options: js.Object): scala.Unit = js.native
  def bowerInstall(component: java.lang.String, options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def bowerInstall(component: js.Array[java.lang.String]): scala.Unit = js.native
  def bowerInstall(component: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  def bowerInstall(component: js.Array[java.lang.String], options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def composeWith(namespace: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def composeWith(
    namespace: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any],
    settings: yeomanDashGeneratorLib.Anon_Link
  ): this.type = js.native
  def desc(description: java.lang.String): this.type = js.native
  def destinationPath(path: java.lang.String*): java.lang.String = js.native
  def destinationRoot(): java.lang.String = js.native
  def destinationRoot(rootPath: java.lang.String): java.lang.String = js.native
  def determineAppname(): java.lang.String = js.native
  def help(): java.lang.String = js.native
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
  def installDependencies(): scala.Unit = js.native
  def installDependencies(options: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.InstallOptions): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(message: java.lang.String): scala.Unit = js.native
  def log(message: java.lang.String, context: js.Any): scala.Unit = js.native
  /**
    * Receives a list of `packages` and an `options` object to install through npm.
    *
    * The installation will automatically run during the run loop `install` phase.
    *
    * @param pkgs Packages to install
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`.
    */
  def npmInstall(): scala.Unit = js.native
  def npmInstall(pkgs: java.lang.String): scala.Unit = js.native
  def npmInstall(pkgs: java.lang.String, options: js.Object): scala.Unit = js.native
  def npmInstall(pkgs: java.lang.String, options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def npmInstall(pkgs: js.Array[java.lang.String]): scala.Unit = js.native
  def npmInstall(pkgs: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  def npmInstall(pkgs: js.Array[java.lang.String], options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def option(
    name: java.lang.String,
    config: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.OptionConfig
  ): this.type = js.native
  def optionsHelp(): java.lang.String = js.native
  def prompt(questions: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.Questions): js.Promise[yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.Answers] = js.native
  def registerTransformStream(stream: js.Array[js.Object]): this.type = js.native
  def registerTransformStream(stream: js.Object): this.type = js.native
  def rootGeneratorName(): java.lang.String = js.native
  def rootGeneratorVersion(): java.lang.String = js.native
  def run(): this.type = js.native
  def run(cb: yeomanDashGeneratorLib.Callback): this.type = js.native
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
  def scheduleInstallTask(installer: java.lang.String): scala.Unit = js.native
  def scheduleInstallTask(installer: java.lang.String, paths: java.lang.String): scala.Unit = js.native
  def scheduleInstallTask(installer: java.lang.String, paths: java.lang.String, options: js.Object): scala.Unit = js.native
  def scheduleInstallTask(installer: java.lang.String, paths: java.lang.String, options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def scheduleInstallTask(installer: java.lang.String, paths: js.Array[java.lang.String]): scala.Unit = js.native
  def scheduleInstallTask(installer: java.lang.String, paths: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  def scheduleInstallTask(
    installer: java.lang.String,
    paths: js.Array[java.lang.String],
    options: js.Object,
    spawnOptions: js.Object
  ): scala.Unit = js.native
  def sourceRoot(): java.lang.String = js.native
  def sourceRoot(rootPath: java.lang.String): java.lang.String = js.native
  // actions/spawn_command mixin
  def spawnCommand(command: java.lang.String, args: js.Array[java.lang.String]): js.Any = js.native
  def spawnCommand(command: java.lang.String, args: js.Array[java.lang.String], opt: js.Object): js.Any = js.native
  def spawnCommandSync(command: java.lang.String, args: js.Array[java.lang.String]): js.Any = js.native
  def spawnCommandSync(command: java.lang.String, args: js.Array[java.lang.String], opt: js.Object): js.Any = js.native
  def templatePath(path: java.lang.String*): java.lang.String = js.native
  def usage(): java.lang.String = js.native
  /**
    * Receives a list of `packages` and an `options` object to install through npm.
    *
    * The installation will automatically run during the run loop `install` phase.
    *
    * @param pkgs Packages to install
    * @param options Options to pass to `dargs` as arguments
    * @param spawnOptions Options to pass `child_process.spawn`.
    */
  def yarnInstall(): scala.Unit = js.native
  def yarnInstall(pkgs: java.lang.String): scala.Unit = js.native
  def yarnInstall(pkgs: java.lang.String, options: js.Object): scala.Unit = js.native
  def yarnInstall(pkgs: java.lang.String, options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
  def yarnInstall(pkgs: js.Array[java.lang.String]): scala.Unit = js.native
  def yarnInstall(pkgs: js.Array[java.lang.String], options: js.Object): scala.Unit = js.native
  def yarnInstall(pkgs: js.Array[java.lang.String], options: js.Object, spawnOptions: js.Object): scala.Unit = js.native
}

