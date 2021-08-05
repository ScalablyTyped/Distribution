package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.superstruct.structMod.Struct
import typings.superstruct.superstructBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coercionsMod {
  
  @JSImport("superstruct/lib/coercions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coercion[T](struct: Struct[T, js.Any], coercer: js.Function1[/* value */ js.Any, js.Any]): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coercion")(struct.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  inline def defaulted[T](S: Struct[T, js.Any], fallback: js.Any): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  inline def defaulted_true[T](S: Struct[T, js.Any], fallback: js.Any, strict: `true`): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  inline def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct[js.Any, js.Any]] */](S: Struct[T, V]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("masked")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
}
