package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getJSDocReturnType")
@js.native
object getJSDocReturnType extends js.Object {
  /**
    * Gets the return type node for the node if provided via JSDoc return tag or type tag.
    *
    * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
    * gets the type from inside the braces, after the fat arrow, etc.
    */
  def apply(node: Node): js.UndefOr[TypeNode] = js.native
}

