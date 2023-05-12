package typings.tufjsModels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGuardMod {
  
  @JSImport("@tufjs/models/dist/utils/guard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](`val`: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isObject(value: Any): /* is @tufjs/models.@tufjs/models/dist/utils/types.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @tufjs/models.@tufjs/models/dist/utils/types.JSONObject */ Boolean]
  
  inline def isObjectArray(value: Any): /* is std.Array<@tufjs/models.@tufjs/models/dist/utils/types.JSONObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<@tufjs/models.@tufjs/models/dist/utils/types.JSONObject> */ Boolean]
  
  inline def isObjectRecord(value: Any): /* is std.Record<string, @tufjs/models.@tufjs/models/dist/utils/types.JSONObject> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectRecord")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, @tufjs/models.@tufjs/models/dist/utils/types.JSONObject> */ Boolean]
  
  inline def isStringArray(value: Any): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  inline def isStringRecord(value: Any): /* is std.Record<string, string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringRecord")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, string> */ Boolean]
}
