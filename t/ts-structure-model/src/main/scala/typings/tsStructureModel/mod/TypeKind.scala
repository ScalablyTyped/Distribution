package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeKind extends StObject
@JSImport("ts-structure-model", "TypeKind")
@js.native
object TypeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeKind & Double] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with TypeKind
  /* 1 */ val ARRAY: typings.tsStructureModel.mod.TypeKind.ARRAY & Double = js.native
  
  @js.native
  sealed trait BASIC
    extends StObject
       with TypeKind
  /* 0 */ val BASIC: typings.tsStructureModel.mod.TypeKind.BASIC & Double = js.native
  
  @js.native
  sealed trait UNION
    extends StObject
       with TypeKind
  /* 2 */ val UNION: typings.tsStructureModel.mod.TypeKind.UNION & Double = js.native
}
