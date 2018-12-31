package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "util")
@js.native
object utilNs extends js.Object {
  @js.native
  class Color protected () extends js.Object {
    def this(value: java.lang.String) = this()
    def this(value: js.Object) = this()
    def parse(value: js.Object): Color = js.native
    def toHex(): java.lang.String = js.native
    def toHsv(): js.Object = js.native
    def toRgb(): js.Object = js.native
  }
  
  @js.native
  trait Delay extends js.Object {
    def clearInterval(interval: scala.Double): scala.Unit = js.native
    def clearTimeout(timeout: scala.Double): scala.Unit = js.native
    def debounce(callback: js.Function0[scala.Unit], time: scala.Double): js.Function0[scala.Unit] = js.native
    def requestAnimationFrame(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def requestAnimationFrame(callback: js.Function0[scala.Unit], element: stdLib.HTMLElement): scala.Unit = js.native
    def setEditorInterval(callback: js.Function0[scala.Unit], time: scala.Double): scala.Double = js.native
    def setEditorTimeout(editor: tinymceLib.tinymceMod.Editor, callback: js.Function0[scala.Unit], time: scala.Double): scala.Double = js.native
    def setInterval(callback: js.Function0[scala.Unit], time: scala.Double): scala.Double = js.native
    def setTimeout(callback: js.Function0[scala.Unit], time: scala.Double): scala.Double = js.native
  }
  
  @js.native
  trait EventDispatcher extends js.Object {
    def fire(name: java.lang.String): js.Object = js.native
    def fire(name: java.lang.String, args: js.Object): js.Object = js.native
    def has(name: java.lang.String): scala.Boolean = js.native
    def isNative(name: java.lang.String): scala.Boolean = js.native
    def off(name: java.lang.String): js.Object = js.native
    def off(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def on(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def on(name: java.lang.String, callback: js.Function0[scala.Unit], first: scala.Boolean): js.Object = js.native
    def once(name: java.lang.String, callback: js.Function0[scala.Unit], first: scala.Boolean): js.Object = js.native
  }
  
  @js.native
  trait JSON extends js.Object {
    def parse(s: java.lang.String): js.Object = js.native
    def serialize(obj: js.Object): java.lang.String = js.native
    def serialize(obj: js.Object, quote: java.lang.String): java.lang.String = js.native
  }
  
  trait JSONRequest extends js.Object {
    def send(args: js.Object): scala.Unit
    def sendRPC(o: js.Object): scala.Unit
  }
  
  trait LocalStorage extends js.Object {
    var length: scala.Double
    def clear(): scala.Unit
    def getItem(key: java.lang.String): java.lang.String
    def key(index: scala.Double): java.lang.String
    def removeItem(key: java.lang.String): scala.Unit
    def setItem(key: java.lang.String, value: java.lang.String): scala.Unit
  }
  
  @js.native
  class Observable () extends js.Object {
    def fire(name: java.lang.String): js.Object = js.native
    def fire(name: java.lang.String, args: js.Object): js.Object = js.native
    def fire(name: java.lang.String, args: js.Object, bubble: scala.Boolean): js.Object = js.native
    def hasEventListeners(name: java.lang.String): scala.Boolean = js.native
    def off(): js.Object = js.native
    def off(name: java.lang.String): js.Object = js.native
    def off(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def on(name: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): js.Object = js.native
    def on(
      name: java.lang.String,
      callback: js.Function1[/* event */ js.Any, scala.Unit],
      first: scala.Boolean
    ): js.Object = js.native
    def once(name: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): js.Object = js.native
  }
  
  @js.native
  trait Tools extends js.Object {
    def create(s: java.lang.String, p: js.Object): scala.Unit = js.native
    def create(s: java.lang.String, p: js.Object, root: js.Object): scala.Unit = js.native
    def createNS(n: java.lang.String): js.Object = js.native
    def createNS(n: java.lang.String, o: js.Object): js.Object = js.native
    def each(o: js.Object, cb: js.Function0[scala.Unit]): scala.Unit = js.native
    def each(o: js.Object, cb: js.Function0[scala.Unit], s: js.Object): scala.Unit = js.native
    def explode(s: java.lang.String, d: java.lang.String): scala.Unit = js.native
    def grep[T](a: js.Array[T], f: js.Function0[scala.Unit]): js.Array[T] = js.native
    def inArray[T](item: T, arr: js.Array[T]): scala.Double = js.native
    def is(obj: js.Object, `type`: java.lang.String): scala.Boolean = js.native
    def isArray(obj: js.Object): scala.Boolean = js.native
    def makeMap[T](items: js.Array[T]): js.Object = js.native
    def makeMap[T](items: js.Array[T], delim: java.lang.String): js.Object = js.native
    def makeMap[T](items: js.Array[T], delim: java.lang.String, map: js.Object): js.Object = js.native
    def map[T, S](array: js.Array[T], callback: js.Function1[/* c */ T, S]): js.Array[S] = js.native
    def resolve(n: java.lang.String): js.Object = js.native
    def resolve(n: java.lang.String, o: js.Object): js.Object = js.native
    def toArray[T](obj: js.Object): js.Array[T] = js.native
    def trim(s: java.lang.String): java.lang.String = js.native
    def walk(o: js.Object, f: js.Function0[scala.Unit]): scala.Unit = js.native
    def walk(o: js.Object, f: js.Function0[scala.Unit], n: java.lang.String): scala.Unit = js.native
    def walk(o: js.Object, f: js.Function0[scala.Unit], n: java.lang.String, s: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class URI protected () extends js.Object {
    def this(url: java.lang.String) = this()
    def this(url: java.lang.String, settings: js.Object) = this()
    def getURI(noProtoHost: scala.Boolean): URI = js.native
    def isSameOrigin(uri: URI): scala.Boolean = js.native
    def setPath(path: java.lang.String): scala.Unit = js.native
    def toAbsPath(base: java.lang.String, path: java.lang.String): scala.Unit = js.native
    def toAbsolute(uri: java.lang.String, noHost: scala.Boolean): java.lang.String = js.native
    def toRelPath(base: java.lang.String, path: java.lang.String): scala.Unit = js.native
    def toRelative(uri: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  trait XHR extends js.Object {
    def fire(name: java.lang.String): js.Object = js.native
    def fire(name: java.lang.String, args: js.Object): js.Object = js.native
    def fire(name: java.lang.String, args: js.Object, bubble: scala.Boolean): js.Object = js.native
    def hasEventListeners(name: java.lang.String): scala.Boolean = js.native
    def off(): js.Object = js.native
    def off(name: java.lang.String): js.Object = js.native
    def off(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def on(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def on(name: java.lang.String, callback: js.Function0[scala.Unit], first: scala.Boolean): js.Object = js.native
    def once(name: java.lang.String, callback: js.Function0[scala.Unit]): js.Object = js.native
    def send(settings: js.Object): scala.Unit = js.native
  }
  
  trait i18n extends js.Object {
    var rtl: scala.Boolean
    def add(code: java.lang.String, items: js.Array[js.Object]): scala.Unit
    def getCode(): java.lang.String
    def setCode(newCode: java.lang.String): scala.Unit
    def translate(text: java.lang.String): java.lang.String
  }
  
}

