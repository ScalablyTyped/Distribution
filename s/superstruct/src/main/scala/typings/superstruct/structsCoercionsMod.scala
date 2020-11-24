package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/structs/coercions", JSImport.Namespace)
@js.native
object structsCoercionsMod extends js.Object {
  
  def coercion[T, S](struct: Struct[T, S], coercer: js.Function1[/* value */ js.Any, _]): Struct[T, S] = js.native
  
  def defaulted[T, S](S: Struct[T, S], fallback: js.Any): Struct[T, S] = js.native
  @JSName("defaulted")
  def defaulted_true[T, S](S: Struct[T, S], fallback: js.Any, strict: `true`): Struct[T, S] = js.native
  
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
