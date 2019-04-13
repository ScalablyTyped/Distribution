package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "Utils")
@js.native
object UtilsNs extends js.Object {
  def arrayify[T](): js.Array[T] = js.native
  def arrayify[T](arg: T): js.Array[T] = js.native
  def arrayify[T](arg: js.Array[T]): js.Array[T] = js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.Array[T], eq: tslintLib.libUtilsMod.Equal[T]): scala.Boolean = js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.UndefOr[scala.Nothing], eq: tslintLib.libUtilsMod.Equal[T]): scala.Boolean = js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.Array[T], eq: tslintLib.libUtilsMod.Equal[T]): scala.Boolean = js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], eq: tslintLib.libUtilsMod.Equal[T]): scala.Boolean = js.native
  def camelize(stringWithHyphens: java.lang.String): java.lang.String = js.native
  def dedent(strings: stdLib.TemplateStringsArray, values: js.Any*): java.lang.String = js.native
  def denormalizeWinPath(path: java.lang.String): java.lang.String = js.native
  def detectBufferEncoding(buffer: nodeLib.Buffer): tslintLib.libUtilsMod.Encoding = js.native
  def detectBufferEncoding(buffer: nodeLib.Buffer, length: scala.Double): tslintLib.libUtilsMod.Encoding = js.native
  def escapeRegExp(re: java.lang.String): java.lang.String = js.native
  def find[T, U](inputs: js.Array[T], getResult: js.Function1[/* t */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def flatMap[T, U](
    inputs: js.Array[T],
    getOutputs: js.Function2[/* input */ T, /* index */ scala.Double, js.Array[U]]
  ): js.Array[U] = js.native
  def getIndentation(node: typescriptLib.typescriptMod.Node, sourceFile: typescriptLib.typescriptMod.SourceFile): java.lang.String = js.native
  def hasOwnProperty(arg: js.Object, key: java.lang.String): scala.Boolean = js.native
  def isCamelCased(name: java.lang.String): scala.Boolean = js.native
  def isFunctionScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isKebabCased(name: java.lang.String): scala.Boolean = js.native
  def isLowerCase(str: java.lang.String): scala.Boolean = js.native
  def isPascalCased(name: java.lang.String): scala.Boolean = js.native
  def isSnakeCased(name: java.lang.String): scala.Boolean = js.native
  def isUpperCase(str: java.lang.String): scala.Boolean = js.native
  def mapDefined[T, U](inputs: js.Array[T], getOutput: js.Function1[/* input */ T, js.UndefOr[U]]): js.Array[U] = js.native
  def newLineWithIndentation(node: typescriptLib.typescriptMod.Node, sourceFile: typescriptLib.typescriptMod.SourceFile): java.lang.String = js.native
  def newLineWithIndentation(
    node: typescriptLib.typescriptMod.Node,
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    linesCount: scala.Double
  ): java.lang.String = js.native
  def objectify(arg: js.Any): js.Any = js.native
  def readBufferWithDetectedEncoding(buffer: nodeLib.Buffer): java.lang.String = js.native
  def stripComments(content: java.lang.String): java.lang.String = js.native
  def tryResolvePackage(packageName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def tryResolvePackage(packageName: java.lang.String, relativeTo: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

