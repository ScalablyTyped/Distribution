package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "getEffectiveTypeParameterDeclarations")
@js.native
object getEffectiveTypeParameterDeclarations extends js.Object {
  /**
    * Gets the effective type parameters. If the node was parsed in a
    * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
    */
  def apply(node: DeclarationWithTypeParameters): js.Array[TypeParameterDeclaration] = js.native
}

