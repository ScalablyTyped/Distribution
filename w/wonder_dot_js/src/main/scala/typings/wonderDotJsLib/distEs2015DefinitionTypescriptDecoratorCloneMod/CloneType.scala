package typings
package wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloneType extends js.Object

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneType")
@js.native
object CloneType extends js.Object {
  @js.native
  sealed trait BASIC
    extends wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType
  
  @js.native
  sealed trait CLONEABLE
    extends wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType
  
  @js.native
  sealed trait CUSTOM
    extends wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType
  
  /* 1 */ val BASIC: BASIC with scala.Double = js.native
  /* 0 */ val CLONEABLE: CLONEABLE with scala.Double = js.native
  /* 2 */ val CUSTOM: CUSTOM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType with scala.Double
  ] = js.native
}

