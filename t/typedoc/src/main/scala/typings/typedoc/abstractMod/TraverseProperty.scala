package typings.typedoc.abstractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraverseProperty extends StObject
@JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
@js.native
object TraverseProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraverseProperty & Double] = js.native
  
  @js.native
  sealed trait Children
    extends StObject
       with TraverseProperty
  /* 0 */ val Children: typings.typedoc.abstractMod.TraverseProperty.Children & Double = js.native
  
  @js.native
  sealed trait GetSignature
    extends StObject
       with TraverseProperty
  /* 6 */ val GetSignature: typings.typedoc.abstractMod.TraverseProperty.GetSignature & Double = js.native
  
  @js.native
  sealed trait IndexSignature
    extends StObject
       with TraverseProperty
  /* 5 */ val IndexSignature: typings.typedoc.abstractMod.TraverseProperty.IndexSignature & Double = js.native
  
  @js.native
  sealed trait Parameters
    extends StObject
       with TraverseProperty
  /* 1 */ val Parameters: typings.typedoc.abstractMod.TraverseProperty.Parameters & Double = js.native
  
  @js.native
  sealed trait SetSignature
    extends StObject
       with TraverseProperty
  /* 7 */ val SetSignature: typings.typedoc.abstractMod.TraverseProperty.SetSignature & Double = js.native
  
  @js.native
  sealed trait Signatures
    extends StObject
       with TraverseProperty
  /* 4 */ val Signatures: typings.typedoc.abstractMod.TraverseProperty.Signatures & Double = js.native
  
  @js.native
  sealed trait TypeLiteral
    extends StObject
       with TraverseProperty
  /* 2 */ val TypeLiteral: typings.typedoc.abstractMod.TraverseProperty.TypeLiteral & Double = js.native
  
  @js.native
  sealed trait TypeParameter
    extends StObject
       with TraverseProperty
  /* 3 */ val TypeParameter: typings.typedoc.abstractMod.TraverseProperty.TypeParameter & Double = js.native
}
