package typings
package typedocLib.distLibModelsReflectionsAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraverseProperty extends js.Object

@JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
@js.native
object TraverseProperty extends js.Object {
  @js.native
  sealed trait Children
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait GetSignature
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait IndexSignature
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait Parameters
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait SetSignature
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait Signatures
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait TypeLiteral
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  @js.native
  sealed trait TypeParameter
    extends typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty
  
  /* 0 */ val Children: Children with scala.Double = js.native
  /* 6 */ val GetSignature: GetSignature with scala.Double = js.native
  /* 5 */ val IndexSignature: IndexSignature with scala.Double = js.native
  /* 1 */ val Parameters: Parameters with scala.Double = js.native
  /* 7 */ val SetSignature: SetSignature with scala.Double = js.native
  /* 4 */ val Signatures: Signatures with scala.Double = js.native
  /* 2 */ val TypeLiteral: TypeLiteral with scala.Double = js.native
  /* 3 */ val TypeParameter: TypeParameter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    typedocLib.distLibModelsReflectionsAbstractMod.TraverseProperty with scala.Double
  ] = js.native
}

