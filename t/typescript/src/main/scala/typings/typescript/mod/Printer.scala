package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printer extends js.Object {
  /**
    * Prints a bundle of source files as-is, without any emit transformations.
    */
  def printBundle(bundle: Bundle): java.lang.String = js.native
  /**
    * Prints a source file as-is, without any emit transformations.
    */
  def printFile(sourceFile: SourceFile): java.lang.String = js.native
  /**
    * Prints a list of nodes using the given format flags
    */
  def printList[T /* <: Node */](format: ListFormat, list: NodeArray[T], sourceFile: SourceFile): java.lang.String = js.native
  /**
    * Print a node and its subtree as-is, without any emit transformations.
    * @param hint A value indicating the purpose of a node. This is primarily used to
    * distinguish between an `Identifier` used in an expression position, versus an
    * `Identifier` used as an `IdentifierName` as part of a declaration. For most nodes you
    * should just pass `Unspecified`.
    * @param node The node to print. The node and its subtree are printed as-is, without any
    * emit transformations.
    * @param sourceFile A source file that provides context for the node. The source text of
    * the file is used to emit the original source content for literals and identifiers, while
    * the identifiers of the source file are used when generating unique names to avoid
    * collisions.
    */
  def printNode(hint: EmitHint, node: Node, sourceFile: SourceFile): java.lang.String = js.native
}

object Printer {
  @scala.inline
  def apply(
    printBundle: Bundle => java.lang.String,
    printFile: SourceFile => java.lang.String,
    printList: (ListFormat, NodeArray[js.Any], SourceFile) => java.lang.String,
    printNode: (EmitHint, Node, SourceFile) => java.lang.String
  ): Printer = {
    val __obj = js.Dynamic.literal(printBundle = js.Any.fromFunction1(printBundle), printFile = js.Any.fromFunction1(printFile), printList = js.Any.fromFunction3(printList), printNode = js.Any.fromFunction3(printNode))
    __obj.asInstanceOf[Printer]
  }
  @scala.inline
  implicit class PrinterOps[Self <: Printer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrintBundle(value: Bundle => java.lang.String): Self = this.set("printBundle", js.Any.fromFunction1(value))
    @scala.inline
    def setPrintFile(value: SourceFile => java.lang.String): Self = this.set("printFile", js.Any.fromFunction1(value))
    @scala.inline
    def setPrintList(value: (ListFormat, NodeArray[js.Any], SourceFile) => java.lang.String): Self = this.set("printList", js.Any.fromFunction3(value))
    @scala.inline
    def setPrintNode(value: (EmitHint, Node, SourceFile) => java.lang.String): Self = this.set("printNode", js.Any.fromFunction3(value))
  }
  
}

