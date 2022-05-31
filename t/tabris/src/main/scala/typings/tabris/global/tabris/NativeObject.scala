package typings.tabris.global.tabris

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.NativeObject")
@js.native
/* protected */ class NativeObject ()
  extends typings.tabris.mod.NativeObject {
  /* protected */ def this(properties: StringDictionary[js.Any]) = this()
}
/* static members */
object NativeObject {
  
  @JSGlobal("tabris.NativeObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineChangeEvent(target: js.Object, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineChangeEvent")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineEvent(target: js.Object, eventType: String, definition: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEvent")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineEvents(target: js.Object, definitions: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineEvents")(target.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineProperties(target: js.Object, definitions: js.Array[js.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineProperty(target: js.Object, propertyName: String, definition: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extend(nativeType: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(nativeType.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def extend(nativeType: String, superType: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(nativeType.asInstanceOf[js.Any], superType.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
