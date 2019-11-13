package typings.vueDashTemplateDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vueDashTemplateDashCompilerMod {
  import org.scalablytyped.runtime.StringDictionary

  type ASTElementHandlers = StringDictionary[ASTElementHandler | js.Array[ASTElementHandler]]
  type ASTModifiers = StringDictionary[Boolean]
  type DirectiveFunction = js.Function2[/* node */ ASTElement, /* directiveMeta */ ASTDirective, Unit]
}
