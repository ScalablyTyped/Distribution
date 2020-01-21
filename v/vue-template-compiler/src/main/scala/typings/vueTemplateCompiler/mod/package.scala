package typings.vueTemplateCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASTElementHandlers = org.scalablytyped.runtime.StringDictionary[
    typings.vueTemplateCompiler.mod.ASTElementHandler | js.Array[typings.vueTemplateCompiler.mod.ASTElementHandler]
  ]
  type ASTModifiers = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type DirectiveFunction = js.Function2[
    /* node */ typings.vueTemplateCompiler.mod.ASTElement, 
    /* directiveMeta */ typings.vueTemplateCompiler.mod.ASTDirective, 
    scala.Unit
  ]
}
