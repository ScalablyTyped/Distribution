package typings.vexdb.requestObjectsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SkillsType extends js.Object
@JSImport("vexdb/out/constants/RequestObjects", "SkillsType")
@js.native
object SkillsType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SkillsType with Double] = js.native
  
  @js.native
  sealed trait Driver extends SkillsType
  /* 0 */ @js.native
  object Driver extends TopLevel[Driver with Double]
  
  @js.native
  sealed trait Programming extends SkillsType
  /* 1 */ @js.native
  object Programming extends TopLevel[Programming with Double]
  
  @js.native
  sealed trait Robot extends SkillsType
  /* 2 */ @js.native
  object Robot extends TopLevel[Robot with Double]
}
