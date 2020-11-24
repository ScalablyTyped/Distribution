package typings.typedoc.abstractMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraverseProperty extends js.Object
@JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
@js.native
object TraverseProperty extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraverseProperty with Double] = js.native
  
  @js.native
  sealed trait Children extends TraverseProperty
  /* 0 */ @js.native
  object Children extends TopLevel[Children with Double]
  
  @js.native
  sealed trait GetSignature extends TraverseProperty
  /* 6 */ @js.native
  object GetSignature extends TopLevel[GetSignature with Double]
  
  @js.native
  sealed trait IndexSignature extends TraverseProperty
  /* 5 */ @js.native
  object IndexSignature extends TopLevel[IndexSignature with Double]
  
  @js.native
  sealed trait Parameters extends TraverseProperty
  /* 1 */ @js.native
  object Parameters extends TopLevel[Parameters with Double]
  
  @js.native
  sealed trait SetSignature extends TraverseProperty
  /* 7 */ @js.native
  object SetSignature extends TopLevel[SetSignature with Double]
  
  @js.native
  sealed trait Signatures extends TraverseProperty
  /* 4 */ @js.native
  object Signatures extends TopLevel[Signatures with Double]
  
  @js.native
  sealed trait TypeLiteral extends TraverseProperty
  /* 2 */ @js.native
  object TypeLiteral extends TopLevel[TypeLiteral with Double]
  
  @js.native
  sealed trait TypeParameter extends TraverseProperty
  /* 3 */ @js.native
  object TypeParameter extends TopLevel[TypeParameter with Double]
}
