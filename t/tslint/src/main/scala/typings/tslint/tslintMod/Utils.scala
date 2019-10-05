package typings.tslint.tslintMod

import typings.node.Buffer
import typings.std.TemplateStringsArray
import typings.tslint.libUtilsMod.Encoding
import typings.tslint.libUtilsMod.Equal
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Utils")
@js.native
object Utils extends js.Object {
  def arrayify[T](): js.Array[T] = js.native
  def arrayify[T](arg: T): js.Array[T] = js.native
  def arrayify[T](arg: js.Array[T]): js.Array[T] = js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  def camelize(stringWithHyphens: String): String = js.native
  def dedent(strings: TemplateStringsArray, values: js.Any*): String = js.native
  def denormalizeWinPath(path: String): String = js.native
  def detectBufferEncoding(buffer: Buffer): Encoding = js.native
  def detectBufferEncoding(buffer: Buffer, length: Double): Encoding = js.native
  def escapeRegExp(re: String): String = js.native
  def find[T, U](inputs: js.Array[T], getResult: js.Function1[/* t */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  def flatMap[T, U](inputs: js.Array[T], getOutputs: js.Function2[/* input */ T, /* index */ Double, js.Array[U]]): js.Array[U] = js.native
  def getIndentation(node: Node, sourceFile: SourceFile): String = js.native
  def hasOwnProperty(arg: js.Object, key: String): Boolean = js.native
  def isCamelCased(name: String): Boolean = js.native
  def isFunctionScopeBoundary(node: Node): Boolean = js.native
  def isKebabCased(name: String): Boolean = js.native
  def isLowerCase(str: String): Boolean = js.native
  def isPascalCased(name: String): Boolean = js.native
  def isSnakeCased(name: String): Boolean = js.native
  def isUpperCase(str: String): Boolean = js.native
  def mapDefined[T, U](inputs: js.Array[T], getOutput: js.Function1[/* input */ T, js.UndefOr[U]]): js.Array[U] = js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile): String = js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile, linesCount: Double): String = js.native
  def objectify(arg: js.Any): js.Any = js.native
  def readBufferWithDetectedEncoding(buffer: Buffer): String = js.native
  def stripComments(content: String): String = js.native
  def trimSingleQuotes(str: String): String = js.native
  def tryResolvePackage(packageName: String): js.UndefOr[String] = js.native
  def tryResolvePackage(packageName: String, relativeTo: String): js.UndefOr[String] = js.native
}

