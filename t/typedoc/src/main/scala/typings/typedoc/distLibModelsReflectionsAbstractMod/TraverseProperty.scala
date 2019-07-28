package typings.typedoc.distLibModelsReflectionsAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraverseProperty extends js.Object

@JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
@js.native
object TraverseProperty extends js.Object {
  @js.native
  sealed trait Children extends TraverseProperty
  
  @js.native
  sealed trait GetSignature extends TraverseProperty
  
  @js.native
  sealed trait IndexSignature extends TraverseProperty
  
  @js.native
  sealed trait Parameters extends TraverseProperty
  
  @js.native
  sealed trait SetSignature extends TraverseProperty
  
  @js.native
  sealed trait Signatures extends TraverseProperty
  
  @js.native
  sealed trait TypeLiteral extends TraverseProperty
  
  @js.native
  sealed trait TypeParameter extends TraverseProperty
  
  /* 0 */ val Children: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children with Double = js.native
  /* 6 */ val GetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature with Double = js.native
  /* 5 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature with Double = js.native
  /* 1 */ val Parameters: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters with Double = js.native
  /* 7 */ val SetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature with Double = js.native
  /* 4 */ val Signatures: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures with Double = js.native
  /* 2 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral with Double = js.native
  /* 3 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraverseProperty with Double] = js.native
}

