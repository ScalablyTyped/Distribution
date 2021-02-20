package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsCoercionsMod {
  
  @JSImport("superstruct/lib/structs/coercions", "coercion")
  @js.native
  def coercion[T, S](struct: Struct[T, S], coercer: js.Function1[/* value */ js.Any, _]): Struct[T, S] = js.native
  
  @JSImport("superstruct/lib/structs/coercions", "defaulted")
  @js.native
  def defaulted[T, S](S: Struct[T, S], fallback: js.Any): Struct[T, S] = js.native
  @JSImport("superstruct/lib/structs/coercions", "defaulted")
  @js.native
  def defaulted_true[T, S](S: Struct[T, S], fallback: js.Any, strict: `true`): Struct[T, S] = js.native
  
  @JSImport("superstruct/lib/structs/coercions", "masked")
  @js.native
  def masked[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    struct: Struct[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
      S
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ _, 
    S
  ] = js.native
}
