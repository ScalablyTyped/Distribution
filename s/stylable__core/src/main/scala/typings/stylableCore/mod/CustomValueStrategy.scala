package typings.stylableCore.mod

import typings.stylableCore.customValuesMod.Box_
import typings.stylableCore.customValuesMod.BoxedValueMap
import typings.stylableCore.customValuesMod.CustomTypes
import typings.stylableCore.typesMod.ParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "CustomValueStrategy")
@js.native
object CustomValueStrategy extends js.Object {
  
  def args(fnNode: ParsedValue, customTypes: CustomTypes): js.Array[String | (Box_[String, _])] = js.native
  
  def named(fnNode: ParsedValue, customTypes: CustomTypes): BoxedValueMap = js.native
}
