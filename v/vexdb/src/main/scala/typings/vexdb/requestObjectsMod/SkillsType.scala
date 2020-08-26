package typings.vexdb.requestObjectsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SkillsType extends js.Object

@JSImport("vexdb/out/constants/RequestObjects", "SkillsType")
@js.native
object SkillsType extends js.Object {
  @js.native
  sealed trait Driver extends SkillsType
  
  @js.native
  sealed trait Programming extends SkillsType
  
  @js.native
  sealed trait Robot extends SkillsType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SkillsType with Double] = js.native
  /* 0 */ @js.native
  object Driver extends TopLevel[Driver with Double]
  
  /* 1 */ @js.native
  object Programming extends TopLevel[Programming with Double]
  
  /* 2 */ @js.native
  object Robot extends TopLevel[Robot with Double]
  
}

