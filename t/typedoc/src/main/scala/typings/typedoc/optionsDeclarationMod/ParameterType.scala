package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterType extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType with Double] = js.native
  
  @js.native
  sealed trait Array extends ParameterType
  /* 5 */ val Array: typings.typedoc.optionsDeclarationMod.ParameterType.Array with Double = js.native
  
  @js.native
  sealed trait Boolean extends ParameterType
  /* 2 */ val Boolean: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean with Double = js.native
  
  @js.native
  sealed trait Map extends ParameterType
  /* 3 */ val Map: typings.typedoc.optionsDeclarationMod.ParameterType.Map with Double = js.native
  
  @js.native
  sealed trait Mixed extends ParameterType
  /* 4 */ val Mixed: typings.typedoc.optionsDeclarationMod.ParameterType.Mixed with Double = js.native
  
  @js.native
  sealed trait Number extends ParameterType
  /* 1 */ val Number: typings.typedoc.optionsDeclarationMod.ParameterType.Number with Double = js.native
  
  @js.native
  sealed trait String extends ParameterType
  /* 0 */ val String: typings.typedoc.optionsDeclarationMod.ParameterType.String with Double = js.native
}
