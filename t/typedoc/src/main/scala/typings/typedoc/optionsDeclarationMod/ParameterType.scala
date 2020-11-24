package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterType extends js.Object
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType with Double] = js.native
  
  @js.native
  sealed trait Array extends ParameterType
  /* 5 */ @js.native
  object Array extends TopLevel[Array with Double]
  
  @js.native
  sealed trait Boolean extends ParameterType
  /* 2 */ @js.native
  object Boolean extends TopLevel[Boolean with Double]
  
  @js.native
  sealed trait Map extends ParameterType
  /* 3 */ @js.native
  object Map extends TopLevel[Map with Double]
  
  @js.native
  sealed trait Mixed extends ParameterType
  /* 4 */ @js.native
  object Mixed extends TopLevel[Mixed with Double]
  
  @js.native
  sealed trait Number extends ParameterType
  /* 1 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait String extends ParameterType
  /* 0 */ @js.native
  object String extends TopLevel[String with Double]
}
