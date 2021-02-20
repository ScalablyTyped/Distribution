package typings.tslint

import typings.node.Buffer
import typings.std.TemplateStringsArray
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("tslint/lib/utils", "arrayify")
  @js.native
  def arrayify[T](): js.Array[T] = js.native
  @JSImport("tslint/lib/utils", "arrayify")
  @js.native
  def arrayify[T](arg: T): js.Array[T] = js.native
  @JSImport("tslint/lib/utils", "arrayify")
  @js.native
  def arrayify[T](arg: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("tslint/lib/utils", "arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint/lib/utils", "arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.UndefOr[scala.Nothing], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint/lib/utils", "arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  @JSImport("tslint/lib/utils", "arraysAreEqual")
  @js.native
  def arraysAreEqual[T](a: js.Array[T], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "camelize")
  @js.native
  def camelize(stringWithHyphens: String): String = js.native
  
  @JSImport("tslint/lib/utils", "dedent")
  @js.native
  def dedent(strings: TemplateStringsArray, values: js.Any*): String = js.native
  
  @JSImport("tslint/lib/utils", "denormalizeWinPath")
  @js.native
  def denormalizeWinPath(path: String): String = js.native
  
  @JSImport("tslint/lib/utils", "detectBufferEncoding")
  @js.native
  def detectBufferEncoding(buffer: Buffer): Encoding = js.native
  @JSImport("tslint/lib/utils", "detectBufferEncoding")
  @js.native
  def detectBufferEncoding(buffer: Buffer, length: Double): Encoding = js.native
  
  @JSImport("tslint/lib/utils", "escapeRegExp")
  @js.native
  def escapeRegExp(re: String): String = js.native
  
  @JSImport("tslint/lib/utils", "find")
  @js.native
  def find[T, U](inputs: js.Array[T], getResult: js.Function1[/* t */ T, js.UndefOr[U]]): js.UndefOr[U] = js.native
  
  @JSImport("tslint/lib/utils", "flatMap")
  @js.native
  def flatMap[T, U](inputs: js.Array[T], getOutputs: js.Function2[/* input */ T, /* index */ Double, js.Array[U]]): js.Array[U] = js.native
  
  @JSImport("tslint/lib/utils", "getIndentation")
  @js.native
  def getIndentation(node: Node, sourceFile: SourceFile): String = js.native
  
  @JSImport("tslint/lib/utils", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(arg: js.Object, key: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isCamelCased")
  @js.native
  def isCamelCased(name: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isFunctionScopeBoundary")
  @js.native
  def isFunctionScopeBoundary(node: Node): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isKebabCased")
  @js.native
  def isKebabCased(name: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isLowerCase")
  @js.native
  def isLowerCase(str: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isPascalCased")
  @js.native
  def isPascalCased(name: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isSnakeCased")
  @js.native
  def isSnakeCased(name: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "isUpperCase")
  @js.native
  def isUpperCase(str: String): Boolean = js.native
  
  @JSImport("tslint/lib/utils", "mapDefined")
  @js.native
  def mapDefined[T, U](inputs: js.Array[T], getOutput: js.Function1[/* input */ T, js.UndefOr[U]]): js.Array[U] = js.native
  
  @JSImport("tslint/lib/utils", "newLineWithIndentation")
  @js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile): String = js.native
  @JSImport("tslint/lib/utils", "newLineWithIndentation")
  @js.native
  def newLineWithIndentation(node: Node, sourceFile: SourceFile, linesCount: Double): String = js.native
  
  @JSImport("tslint/lib/utils", "objectify")
  @js.native
  def objectify(arg: js.Any): js.Any = js.native
  
  @JSImport("tslint/lib/utils", "readBufferWithDetectedEncoding")
  @js.native
  def readBufferWithDetectedEncoding(buffer: Buffer): String = js.native
  
  @JSImport("tslint/lib/utils", "stripComments")
  @js.native
  def stripComments(content: String): String = js.native
  
  @JSImport("tslint/lib/utils", "trimSingleQuotes")
  @js.native
  def trimSingleQuotes(str: String): String = js.native
  
  @JSImport("tslint/lib/utils", "tryResolvePackage")
  @js.native
  def tryResolvePackage(packageName: String): js.UndefOr[String] = js.native
  @JSImport("tslint/lib/utils", "tryResolvePackage")
  @js.native
  def tryResolvePackage(packageName: String, relativeTo: String): js.UndefOr[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintStrings.utf8
    - typings.tslint.tslintStrings.`utf8-bom`
    - typings.tslint.tslintStrings.utf16le
    - typings.tslint.tslintStrings.utf16be
  */
  trait Encoding extends StObject
  object Encoding {
    
    @scala.inline
    def utf16be: typings.tslint.tslintStrings.utf16be = "utf16be".asInstanceOf[typings.tslint.tslintStrings.utf16be]
    
    @scala.inline
    def utf16le: typings.tslint.tslintStrings.utf16le = "utf16le".asInstanceOf[typings.tslint.tslintStrings.utf16le]
    
    @scala.inline
    def utf8: typings.tslint.tslintStrings.utf8 = "utf8".asInstanceOf[typings.tslint.tslintStrings.utf8]
    
    @scala.inline
    def `utf8-bom`: typings.tslint.tslintStrings.`utf8-bom` = "utf8-bom".asInstanceOf[typings.tslint.tslintStrings.`utf8-bom`]
  }
  
  type Equal[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
