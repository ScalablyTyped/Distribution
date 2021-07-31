package typings.vue

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
  
  trait PluginObject[T]
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    def install(Vue: VueConstructor[Vue]): Unit
    def install(Vue: VueConstructor[Vue], options: T): Unit
    @JSName("install")
    var install_Original: PluginFunction[T]
  }
  object PluginObject {
    
    @scala.inline
    def apply[T](install: (/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T]) => Unit): PluginObject[T] = {
      val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
      __obj.asInstanceOf[PluginObject[T]]
    }
    
    @scala.inline
    implicit class PluginObjectMutableBuilder[Self <: PluginObject[?], T] (val x: Self & PluginObject[T]) extends AnyVal {
      
      @scala.inline
      def setInstall(value: (/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T]) => Unit): Self = StObject.set(x, "install", js.Any.fromFunction2(value))
    }
  }
}
