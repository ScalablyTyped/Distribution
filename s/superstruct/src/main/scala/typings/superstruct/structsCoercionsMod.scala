package typings.superstruct

import typings.superstruct.structMod.Struct
import typings.superstruct.superstructBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsCoercionsMod {
  
  @JSImport("superstruct/lib/structs/coercions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def coercion[T, S](struct: Struct[T, S], coercer: js.Function1[/* value */ js.Any, js.Any]): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("coercion")(struct.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  @scala.inline
  def defaulted[T, S](S: Struct[T, S], fallback: js.Any): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  @scala.inline
  def defaulted_true[T, S](S: Struct[T, S], fallback: js.Any, strict: `true`): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  @scala.inline
  def masked[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](
    struct: Struct[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
      S
    ]
  ): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("masked")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ]]
}
