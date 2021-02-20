package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ChangedValues = js.Array[String]
  
  @js.native
  trait Config extends StObject {
    
    var aliasMap: js.UndefOr[StringDictionary[String]] = js.native
    
    def onRead(key: String, props: Props): js.Any = js.native
    
    def onRender(state: State, props: Props, changedValues: ChangedValues): Unit = js.native
    
    var uncachedValues: js.UndefOr[Set[String]] = js.native
    
    var useCache: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(onRead: (String, Props) => js.Any, onRender: (State, Props, ChangedValues) => Unit): Config = {
      val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasMap(value: StringDictionary[String]): Self = StObject.set(x, "aliasMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasMapUndefined: Self = StObject.set(x, "aliasMap", js.undefined)
      
      @scala.inline
      def setOnRead(value: (String, Props) => js.Any): Self = StObject.set(x, "onRead", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRender(value: (State, Props, ChangedValues) => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUncachedValues(value: Set[String]): Self = StObject.set(x, "uncachedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncachedValuesUndefined: Self = StObject.set(x, "uncachedValues", js.undefined)
      
      @scala.inline
      def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
  
  type CustomTemplate = js.Function2[/* state */ ResolvedState, /* prebuilt */ String, String]
  
  type Props = StringDictionary[js.Any]
  
  type ResolvedState = StringDictionary[String | Double]
  
  type State = StringDictionary[js.UndefOr[String | Double | CustomTemplate]]
  
  @js.native
  trait Styler extends StObject {
    
    def get(key: String): js.Any = js.native
    def get(key: String, forceRead: Boolean): js.Any = js.native
    
    def render(): Styler = js.native
    def render(forceRender: Boolean): Styler = js.native
    
    def set(key: String): Styler = js.native
    def set(key: String, value: js.Any): Styler = js.native
    def set(key: State): Styler = js.native
    def set(key: State, value: js.Any): Styler = js.native
  }
}
