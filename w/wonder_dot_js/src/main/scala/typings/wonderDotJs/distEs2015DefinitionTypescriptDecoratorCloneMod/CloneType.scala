package typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloneType extends js.Object

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneType")
@js.native
object CloneType extends js.Object {
  @js.native
  sealed trait BASIC extends CloneType
  
  @js.native
  sealed trait CLONEABLE extends CloneType
  
  @js.native
  sealed trait CUSTOM extends CloneType
  
  /* 1 */ val BASIC: typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.BASIC with Double = js.native
  /* 0 */ val CLONEABLE: typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.CLONEABLE with Double = js.native
  /* 2 */ val CUSTOM: typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneType.CUSTOM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneType with Double] = js.native
}

