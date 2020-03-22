package typings.typedoc.mod.TypeScript

import typings.typescript.mod.JSDocTemplateTag
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getJSDocTypeParameterTags")
@js.native
object getJSDocTypeParameterTags extends js.Object {
  /**
    * Gets the JSDoc type parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc template tag whose names match the provided
    * parameter, whether a template tag on a containing function
    * expression, or a template tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the template
    * tag on the containing function expression would be first.
    */
  def apply(param: TypeParameterDeclaration): js.Array[JSDocTemplateTag] = js.native
}

