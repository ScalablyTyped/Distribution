package typings.tslint.mod

import typings.node.Buffer
import typings.std.TemplateStringsArray
import typings.tslint.libUtilsMod.Encoding
import typings.tslint.libUtilsMod.Equal
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  @JSImport("tslint", "Utils.arrayify")
  @js.native
  def arrayify[T](): js.Array[T] = js.native
  @JSImport("tslint", "Utils.arrayify")
  @js.native
  def arrayify[T](arg: T): js.Array[T] = js.native
  @JSImport("tslint", "Utils.arrayify")
  @js.native
  def arrayify[T](arg: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("tslint", "Utils.arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint", "Utils.arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint", "Utils.arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint", "Utils.arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  
  @JSImport("tslint", "Utils.camelize")
  @js.native
  def camelize(stringWithHyphens: String): String = js.native
  
  @JSImport("tslint", "Utils.dedent")
  @js.native
  def dedent(strings: TemplateStringsArray, values: js.Any*): String = js.native
  
  @JSImport("tslint", "Utils.denormalizeWinPath")
  @js.native
  def denormalizeWinPath(path: String): String = js.native
  
  @JSImport("tslint", "Utils.detectBufferEncoding")
  @js.native
  def detectBufferEncoding(buffer: Buffer): Encoding = js.native
  @JSImport("tslint", "Utils.detectBufferEncoding")
  @js.native
  def detectBufferEncoding(buffer: Buffer, length: Double): Encoding = js.native
  
  @JSImport("tslint", "Utils.escapeRegExp")
  @js.native
  def escapeRegExp(re: String): String = js.native
  
  @JSImport("tslint", "Utils.find")
  @js.native
  def find[T, U](inputs: js.Array[T], getResult: js.Function1[/* t */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  
  @JSImport("tslint", "Utils.flatMap")
  @js.native
  def flatMap[T, U](inputs: js.Array[T], getOutputs: js.Function2[/* input */ T, /* index */ Double, js.Array[U]]): js.Array[U] = js.native
  
  @JSImport("tslint", "Utils.getIndentation")
  @js.native
  def getIndentation(node: Node, sourceFile: SourceFile): String = js.native
  
  @JSImport("tslint", "Utils.hasOwnProperty")
  @js.native
  def hasOwnProperty_(arg: js.Object, key: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isCamelCased")
  @js.native
  def isCamelCased(name: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isFunctionScopeBoundary")
  @js.native
  def isFunctionScopeBoundary(node: Node): Boolean = js.native
  
  @JSImport("tslint", "Utils.isKebabCased")
  @js.native
  def isKebabCased(name: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isLowerCase")
  @js.native
  def isLowerCase(str: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isPascalCased")
  @js.native
  def isPascalCased(name: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isSnakeCased")
  @js.native
  def isSnakeCased(name: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.isUpperCase")
  @js.native
  def isUpperCase(str: String): Boolean = js.native
  
  @JSImport("tslint", "Utils.mapDefined")
  @js.native
  def mapDefined[T, U](inputs: js.Array[T], getOutput: js.Function1[/* input */ T, js.UndefOr[U]]): js.Array[U] = js.native
  
  @JSImport("tslint", "Utils.newLineWithIndentation")
  @js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile): String = js.native
  @JSImport("tslint", "Utils.newLineWithIndentation")
  @js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile, linesCount: Double): String = js.native
  
  @JSImport("tslint", "Utils.objectify")
  @js.native
  def objectify(arg: js.Any): js.Any = js.native
  
  @JSImport("tslint", "Utils.readBufferWithDetectedEncoding")
  @js.native
  def readBufferWithDetectedEncoding(buffer: Buffer): String = js.native
  
  @JSImport("tslint", "Utils.stripComments")
  @js.native
  def stripComments(content: String): String = js.native
  
  @JSImport("tslint", "Utils.trimSingleQuotes")
  @js.native
  def trimSingleQuotes(str: String): String = js.native
  
  @JSImport("tslint", "Utils.tryResolvePackage")
  @js.native
  def tryResolvePackage(packageName: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Utils.tryResolvePackage")
  @js.native
  def tryResolvePackage(packageName: String, relativeTo: String): js.UndefOr[String] = js.native
}
