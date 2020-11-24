package typings.stylableCore.customValuesMod

import typings.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/custom-values", "CustomValueStrategy")
@js.native
object CustomValueStrategy extends js.Object {
  
  def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, _])] = js.native
  
  def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = js.native
}
