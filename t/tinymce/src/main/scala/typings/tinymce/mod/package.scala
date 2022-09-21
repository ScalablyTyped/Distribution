package typings.tinymce.mod

import typings.tinymce.mod.^
import typings.tinymce.mod.dom.DOMUtils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DOM_ : DOMUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("DOM").asInstanceOf[DOMUtils]

inline def PluginManager: AddOnManager = ^.asInstanceOf[js.Dynamic].selectDynamic("PluginManager").asInstanceOf[AddOnManager]

inline def ScriptLoader: typings.tinymce.mod.dom.ScriptLoader = ^.asInstanceOf[js.Dynamic].selectDynamic("ScriptLoader").asInstanceOf[typings.tinymce.mod.dom.ScriptLoader]

inline def ThemeManager: AddOnManager = ^.asInstanceOf[js.Dynamic].selectDynamic("ThemeManager").asInstanceOf[AddOnManager]

inline def activeEditor: Editor = ^.asInstanceOf[js.Dynamic].selectDynamic("activeEditor").asInstanceOf[Editor]

inline def baseURL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("baseURL").asInstanceOf[String]

inline def create(s: String, p: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(s.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def create(s: String, p: js.Object, root: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(s.asInstanceOf[js.Any], p.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createNS(n: String, o: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("createNS")(n.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def each(o: js.Object, cb: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(o.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def each(o: js.Object, cb: js.Function0[Unit], s: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(o.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def explode(s: String, d: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("explode")(s.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def get(id: String): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Editor]
inline def get(id: Double): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Editor]

inline def grep(a: js.Array[Any], f: js.Function0[Unit]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("grep")(a.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def inArray(item: Any, arr: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(item.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def init(settings: Settings_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def is(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def is(obj: js.Object, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(obj.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isArray(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def makeMap(items: js.Array[Any]): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(items.asInstanceOf[js.Any]).asInstanceOf[js.Object]
inline def makeMap(items: js.Array[Any], delim: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(items.asInstanceOf[js.Any], delim.asInstanceOf[js.Any])).asInstanceOf[js.Object]
inline def makeMap(items: js.Array[Any], delim: String, map: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(items.asInstanceOf[js.Any], delim.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Object]
inline def makeMap(items: js.Array[Any], delim: Unit, map: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(items.asInstanceOf[js.Any], delim.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def map(array: js.Array[Any], callback: js.Function0[Unit]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def resolve(n: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(n.asInstanceOf[js.Any]).asInstanceOf[js.Object]
inline def resolve(n: String, o: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(n.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def toArray(obj: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def triggerSave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerSave")().asInstanceOf[Unit]

inline def trim(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(s.asInstanceOf[js.Any]).asInstanceOf[String]

inline def walk(o: js.Object, f: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(o.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walk(o: js.Object, f: js.Function0[Unit], n: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(o.asInstanceOf[js.Any], f.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walk(o: js.Object, f: js.Function0[Unit], n: String, s: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(o.asInstanceOf[js.Any], f.asInstanceOf[js.Any], n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walk(o: js.Object, f: js.Function0[Unit], n: Unit, s: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(o.asInstanceOf[js.Any], f.asInstanceOf[js.Any], n.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Unit]
