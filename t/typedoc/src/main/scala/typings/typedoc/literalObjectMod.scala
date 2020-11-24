package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/literal-object", JSImport.Namespace)
@js.native
object literalObjectMod extends js.Object {
  
  @js.native
  class ObjectLiteralConverter () extends ConverterNodeComponent[ObjectLiteralExpression]
}
