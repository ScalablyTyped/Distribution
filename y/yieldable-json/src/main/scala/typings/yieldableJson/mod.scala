package typings.yieldableJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yieldable-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAsync(text: String, callback: Callback[js.Object]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseAsync(text: String, reviver_intensity: Double, callback: Callback[js.Object]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(text.asInstanceOf[js.Any], reviver_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseAsync(text: String, reviver_intensity: Reviver, callback: Callback[js.Object]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(text.asInstanceOf[js.Any], reviver_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseAsync(text: String, reviver: Reviver, intensity: Double, callback: Callback[js.Object]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringifyAsync(data: js.Object, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_intensity_space: String, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_intensity_space.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_intensity_space: js.Array[Any], callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_intensity_space.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_intensity_space: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_intensity_space.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_intensity_space: Null, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_intensity_space.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_intensity_space: Replacer, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_intensity_space.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: String, space_intensity: String, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: String, space_intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(
    data: js.Object,
    replacer_space: js.Array[Any],
    space_intensity: String,
    callback: Callback[String]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(
    data: js.Object,
    replacer_space: js.Array[Any],
    space_intensity: Double,
    callback: Callback[String]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Double, space_intensity: String, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Double, space_intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Null, space_intensity: String, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Null, space_intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Replacer, space_intensity: String, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer_space: Replacer, space_intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer_space.asInstanceOf[js.Any], space_intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(
    data: js.Object,
    replacer: js.Array[Any],
    space: String,
    intensity: Double,
    callback: Callback[String]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(
    data: js.Object,
    replacer: js.Array[Any],
    space: Double,
    intensity: Double,
    callback: Callback[String]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer: Null, space: String, intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer: Null, space: Double, intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer: Replacer, space: String, intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def stringifyAsync(data: js.Object, replacer: Replacer, space: Double, intensity: Double, callback: Callback[String]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyAsync")(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], intensity.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type Callback[T] = js.Function2[/* err */ js.Error, /* result */ T, Unit]
  
  type Replacer = js.Function2[/* key */ Double, /* value */ Any, Any]
  
  type Reviver = js.Function2[/* key */ Double, /* value */ Any, Any]
}
