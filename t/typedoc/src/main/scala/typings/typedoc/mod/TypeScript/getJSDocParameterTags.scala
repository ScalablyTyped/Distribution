package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocParameterTag
import typings.typescript.mod.ParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getJSDocParameterTags")
@js.native
object getJSDocParameterTags extends js.Object {
  
  /**
    * Gets the JSDoc parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc param tag whose name matches the provided
    * parameter, whether a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the param
    * tag on the containing function expression would be first.
    *
    * For binding patterns, parameter tags are matched by position.
    */
  def apply(param: ParameterDeclaration): js.Array[JSDocParameterTag] = js.native
}
