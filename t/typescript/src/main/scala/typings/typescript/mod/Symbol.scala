package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol extends js.Object {
  var declarations: js.Array[Declaration] = js.native
  var escapedName: String = js.native
  var exports: js.UndefOr[SymbolTable] = js.native
  var flags: SymbolFlags = js.native
  var globalExports: js.UndefOr[SymbolTable] = js.native
  var members: js.UndefOr[SymbolTable] = js.native
  val name: java.lang.String = js.native
  var valueDeclaration: Declaration = js.native
  def getDeclarations(): js.UndefOr[js.Array[Declaration]] = js.native
  def getDocumentationComment(): js.Array[SymbolDisplayPart] = js.native
  def getDocumentationComment(typeChecker: TypeChecker): js.Array[SymbolDisplayPart] = js.native
  def getEscapedName(): String = js.native
  def getFlags(): SymbolFlags = js.native
  def getJsDocTags(): js.Array[JSDocTagInfo] = js.native
  def getName(): java.lang.String = js.native
}

