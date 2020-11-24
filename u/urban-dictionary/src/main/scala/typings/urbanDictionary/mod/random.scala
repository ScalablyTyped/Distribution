package typings.urbanDictionary.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urban-dictionary", "random")
@js.native
object random extends js.Object {
  
  def apply(): js.Promise[WordDefinition] = js.native
  def apply(callback: js.Function2[/* error */ Error, /* object */ WordDefinition, _]): js.Promise[WordDefinition] = js.native
}
