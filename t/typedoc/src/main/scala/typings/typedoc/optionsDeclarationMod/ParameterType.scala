package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterType extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType & Double] = js.native
  
  @js.native
  sealed trait Array
    extends StObject
       with ParameterType
  /* 5 */ val Array: typings.typedoc.optionsDeclarationMod.ParameterType.Array & Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with ParameterType
  /* 2 */ val Boolean: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean & Double = js.native
  
  @js.native
  sealed trait Map
    extends StObject
       with ParameterType
  /* 3 */ val Map: typings.typedoc.optionsDeclarationMod.ParameterType.Map & Double = js.native
  
  @js.native
  sealed trait Mixed
    extends StObject
       with ParameterType
  /* 4 */ val Mixed: typings.typedoc.optionsDeclarationMod.ParameterType.Mixed & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with ParameterType
  /* 1 */ val Number: typings.typedoc.optionsDeclarationMod.ParameterType.Number & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with ParameterType
  /* 0 */ val String: typings.typedoc.optionsDeclarationMod.ParameterType.String & Double = js.native
}
