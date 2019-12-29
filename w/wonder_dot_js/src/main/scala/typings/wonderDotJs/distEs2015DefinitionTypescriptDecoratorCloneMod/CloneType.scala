package typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloneType with Double] = js.native
  /* 1 */ @js.native
  object BASIC extends TopLevel[BASIC with Double]
  
  /* 0 */ @js.native
  object CLONEABLE extends TopLevel[CLONEABLE with Double]
  
  /* 2 */ @js.native
  object CUSTOM extends TopLevel[CUSTOM with Double]
  
}

