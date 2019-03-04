package typings
package atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var attrs: js.Array[Attr]
  var tag: java.lang.String
}

object ASTNode {
  @scala.inline
  def apply(attrs: js.Array[Attr], tag: java.lang.String): ASTNode = {
    val __obj = js.Dynamic.literal(attrs = attrs, tag = tag)
  
    __obj.asInstanceOf[ASTNode]
  }
}

