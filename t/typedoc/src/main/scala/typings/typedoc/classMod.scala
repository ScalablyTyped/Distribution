package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  
  @js.native
  class ClassConverter () extends ConverterNodeComponent[ClassDeclaration]
}
