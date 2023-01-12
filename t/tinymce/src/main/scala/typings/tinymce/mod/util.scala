package typings.tinymce.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("tinymce", "util.Color")
  @js.native
  open class Color protected () extends StObject {
    def this(value: String) = this()
    def this(value: js.Object) = this()
    
    def parse(value: js.Object): Color = js.native
    
    def toHex(): String = js.native
    
    def toHsv(): js.Object = js.native
    
    def toRgb(): js.Object = js.native
  }
  
  @JSImport("tinymce", "util.Observable")
  @js.native
  open class Observable () extends StObject {
    
    def fire(name: String): js.Object = js.native
    def fire(name: String, args: js.Object): js.Object = js.native
    def fire(name: String, args: js.Object, bubble: Boolean): js.Object = js.native
    def fire(name: String, args: Unit, bubble: Boolean): js.Object = js.native
    
    def hasEventListeners(name: String): Boolean = js.native
    
    def off(): js.Object = js.native
    def off(name: String): js.Object = js.native
    def off(name: String, callback: js.Function0[Unit]): js.Object = js.native
    def off(name: Unit, callback: js.Function0[Unit]): js.Object = js.native
    
    def on(name: String, callback: js.Function1[/* event */ Any, Unit]): js.Object = js.native
    def on(name: String, callback: js.Function1[/* event */ Any, Unit], first: Boolean): js.Object = js.native
    
    def once(name: String, callback: js.Function1[/* event */ Any, Unit]): js.Object = js.native
  }
  
  @JSImport("tinymce", "util.URI")
  @js.native
  open class URI protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, settings: js.Object) = this()
    
    def getURI(noProtoHost: Boolean): URI = js.native
    
    def isSameOrigin(uri: URI): Boolean = js.native
    
    def setPath(path: String): Unit = js.native
    
    def toAbsPath(base: String, path: String): Unit = js.native
    
    def toAbsolute(uri: String, noHost: Boolean): String = js.native
    
    def toRelPath(base: String, path: String): Unit = js.native
    
    def toRelative(uri: String): String = js.native
  }
  
  @js.native
  trait Delay extends StObject {
    
    def clearInterval(interval: Double): Unit = js.native
    
    def clearTimeout(timeout: Double): Unit = js.native
    
    def debounce(callback: js.Function0[Unit], time: Double): js.Function0[Unit] = js.native
    
    def requestAnimationFrame(callback: js.Function0[Unit]): Unit = js.native
    def requestAnimationFrame(callback: js.Function0[Unit], element: HTMLElement): Unit = js.native
    
    def setEditorInterval(callback: js.Function0[Unit], time: Double): Double = js.native
    
    def setEditorTimeout(editor: Editor, callback: js.Function0[Unit], time: Double): Double = js.native
    
    def setInterval(callback: js.Function0[Unit], time: Double): Double = js.native
    
    def setTimeout(callback: js.Function0[Unit], time: Double): Double = js.native
  }
  
  @js.native
  trait EventDispatcher extends StObject {
    
    def fire(name: String): js.Object = js.native
    def fire(name: String, args: js.Object): js.Object = js.native
    
    def has(name: String): Boolean = js.native
    
    def isNative(name: String): Boolean = js.native
    
    def off(name: String): js.Object = js.native
    def off(name: String, callback: js.Function0[Unit]): js.Object = js.native
    
    def on(name: String, callback: js.Function0[Unit]): js.Object = js.native
    def on(name: String, callback: js.Function0[Unit], first: Boolean): js.Object = js.native
    
    def once(name: String, callback: js.Function0[Unit], first: Boolean): js.Object = js.native
  }
  
  @js.native
  trait JSON extends StObject {
    
    def parse(s: String): js.Object = js.native
    
    def serialize(obj: js.Object): String = js.native
    def serialize(obj: js.Object, quote: String): String = js.native
  }
  
  trait JSONRequest extends StObject {
    
    def send(args: js.Object): Unit
    
    def sendRPC(o: js.Object): Unit
  }
  object JSONRequest {
    
    inline def apply(send: js.Object => Unit, sendRPC: js.Object => Unit): JSONRequest = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendRPC = js.Any.fromFunction1(sendRPC))
      __obj.asInstanceOf[JSONRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONRequest] (val x: Self) extends AnyVal {
      
      inline def setSend(value: js.Object => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendRPC(value: js.Object => Unit): Self = StObject.set(x, "sendRPC", js.Any.fromFunction1(value))
    }
  }
  
  trait LocalStorage extends StObject {
    
    def clear(): Unit
    
    def getItem(key: String): String
    
    def key(index: Double): String
    
    var length: Double
    
    def removeItem(key: String): Unit
    
    def setItem(key: String, value: String): Unit
  }
  object LocalStorage {
    
    inline def apply(
      clear: () => Unit,
      getItem: String => String,
      key: Double => String,
      length: Double,
      removeItem: String => Unit,
      setItem: (String, String) => Unit
    ): LocalStorage = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[LocalStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalStorage] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setKey(value: Double => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Tools extends StObject {
    
    def create(s: String, p: js.Object): Unit = js.native
    def create(s: String, p: js.Object, root: js.Object): Unit = js.native
    
    def createNS(n: String): js.Object = js.native
    def createNS(n: String, o: js.Object): js.Object = js.native
    
    def each(o: js.Object, cb: js.Function0[Unit]): Unit = js.native
    def each(o: js.Object, cb: js.Function0[Unit], s: js.Object): Unit = js.native
    
    def explode(s: String, d: String): Unit = js.native
    
    def grep[T](a: js.Array[T], f: js.Function0[Unit]): js.Array[T] = js.native
    
    def inArray[T](item: T, arr: js.Array[T]): Double = js.native
    
    def is(obj: js.Object, `type`: String): Boolean = js.native
    
    def isArray(obj: js.Object): Boolean = js.native
    
    def makeMap[T](items: js.Array[T]): js.Object = js.native
    def makeMap[T](items: js.Array[T], delim: String): js.Object = js.native
    def makeMap[T](items: js.Array[T], delim: String, map: js.Object): js.Object = js.native
    def makeMap[T](items: js.Array[T], delim: Unit, map: js.Object): js.Object = js.native
    
    def map[T, S](array: js.Array[T], callback: js.Function1[/* c */ T, S]): js.Array[S] = js.native
    
    def resolve(n: String): js.Object = js.native
    def resolve(n: String, o: js.Object): js.Object = js.native
    
    def toArray[T](obj: js.Object): js.Array[T] = js.native
    
    def trim(s: String): String = js.native
    
    def walk(o: js.Object, f: js.Function0[Unit]): Unit = js.native
    def walk(o: js.Object, f: js.Function0[Unit], n: String): Unit = js.native
    def walk(o: js.Object, f: js.Function0[Unit], n: String, s: String): Unit = js.native
    def walk(o: js.Object, f: js.Function0[Unit], n: Unit, s: String): Unit = js.native
  }
  
  @js.native
  trait XHR extends StObject {
    
    def fire(name: String): js.Object = js.native
    def fire(name: String, args: js.Object): js.Object = js.native
    def fire(name: String, args: js.Object, bubble: Boolean): js.Object = js.native
    def fire(name: String, args: Unit, bubble: Boolean): js.Object = js.native
    
    def hasEventListeners(name: String): Boolean = js.native
    
    def off(): js.Object = js.native
    def off(name: String): js.Object = js.native
    def off(name: String, callback: js.Function0[Unit]): js.Object = js.native
    def off(name: Unit, callback: js.Function0[Unit]): js.Object = js.native
    
    def on(name: String, callback: js.Function0[Unit]): js.Object = js.native
    def on(name: String, callback: js.Function0[Unit], first: Boolean): js.Object = js.native
    
    def once(name: String, callback: js.Function0[Unit]): js.Object = js.native
    
    def send(settings: js.Object): Unit = js.native
  }
  
  trait i18n extends StObject {
    
    def add(code: String, items: js.Array[js.Object]): Unit
    
    def getCode(): String
    
    var rtl: Boolean
    
    def setCode(newCode: String): Unit
    
    def translate(text: String): String
  }
  object i18n {
    
    inline def apply(
      add: (String, js.Array[js.Object]) => Unit,
      getCode: () => String,
      rtl: Boolean,
      setCode: String => Unit,
      translate: String => String
    ): i18n = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getCode = js.Any.fromFunction0(getCode), rtl = rtl.asInstanceOf[js.Any], setCode = js.Any.fromFunction1(setCode), translate = js.Any.fromFunction1(translate))
      __obj.asInstanceOf[i18n]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: i18n] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (String, js.Array[js.Object]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setGetCode(value: () => String): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setSetCode(value: String => Unit): Self = StObject.set(x, "setCode", js.Any.fromFunction1(value))
      
      inline def setTranslate(value: String => String): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
    }
  }
}
