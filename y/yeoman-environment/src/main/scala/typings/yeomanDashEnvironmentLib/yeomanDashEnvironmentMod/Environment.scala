package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment[O /* <: Options */]
  extends nodeLib.eventsMod.EventEmitter {
  var aliases: js.Array[Alias] = js.native
  var arguments: js.Array[java.lang.String] = js.native
  var cwd: java.lang.String = js.native
  var lookups: js.Array[java.lang.String] = js.native
  var options: O = js.native
  var sharedFs: memDashFsLib.memDashFsMod.Store = js.native
  var store: yeomanDashGeneratorLib.yeomanDashGeneratorMod.Storage = js.native
  /* private */ def _tryRegistering(generatorReference: java.lang.String): scala.Unit = js.native
  def alias(`match`: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def alias(`match`: stdLib.RegExp, value: java.lang.String): scala.Unit = js.native
  def create(name: java.lang.String, options: js.Object): scala.Unit = js.native
  def error(err: js.Object): stdLib.Error = js.native
  def error(err: stdLib.Error): stdLib.Error = js.native
  def findGeneratorsIn(list: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def get(namespace: java.lang.String): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^  | scala.Null = js.native
  def getByPath(path: java.lang.String): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^  | scala.Null = js.native
  def getGeneratorNames(): js.Array[java.lang.String] = js.native
  def getGeneratorsMeta(): org.scalablytyped.runtime.StringDictionary[GeneratorMeta] = js.native
  def getNpmPaths(): js.Array[java.lang.String] = js.native
  def help(name: java.lang.String): java.lang.String = js.native
  def instantiate(name: java.lang.String, options: InstantiateOptions): yeomanDashGeneratorLib.yeomanDashGeneratorMod.^ = js.native
  def lookup(): scala.Unit = js.native
  def lookup(cb: js.Function1[/* err */ scala.Null | stdLib.Error, scala.Unit]): scala.Unit = js.native
  def namespace(filepath: java.lang.String): java.lang.String = js.native
  def namespaces(): js.Array[java.lang.String] = js.native
  def register(name: java.lang.String): java.lang.String = js.native
  def register(name: java.lang.String, namespace: java.lang.String): java.lang.String = js.native
  def registerStub(Generator: yeomanDashGeneratorLib.yeomanDashGeneratorMod.^, namespace: java.lang.String): this.type = js.native
  def resolveModulePath(moduleId: java.lang.String): java.lang.String = js.native
  def run(args: java.lang.String, done: RunDone): scala.Unit = js.native
  def run(args: java.lang.String, options: js.Object, done: RunDone): scala.Unit = js.native
  def run(args: js.Array[java.lang.String], done: RunDone): scala.Unit = js.native
  def run(args: js.Array[java.lang.String], options: js.Object, done: RunDone): scala.Unit = js.native
  def run(done: RunDone): scala.Unit = js.native
}

