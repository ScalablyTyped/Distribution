package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ChangedValues = js.Array[String]
  
  trait Config extends StObject {
    
    var aliasMap: js.UndefOr[StringDictionary[String]] = js.undefined
    
    def onRead(key: String, props: Props): js.Any
    
    def onRender(state: State, props: Props, changedValues: ChangedValues): Unit
    
    var uncachedValues: js.UndefOr[Set[String]] = js.undefined
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(onRead: (String, Props) => js.Any, onRender: (State, Props, ChangedValues) => Unit): Config = {
      val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAliasMap(value: StringDictionary[String]): Self = StObject.set(x, "aliasMap", value.asInstanceOf[js.Any])
      
      inline def setAliasMapUndefined: Self = StObject.set(x, "aliasMap", js.undefined)
      
      inline def setOnRead(value: (String, Props) => js.Any): Self = StObject.set(x, "onRead", js.Any.fromFunction2(value))
      
      inline def setOnRender(value: (State, Props, ChangedValues) => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction3(value))
      
      inline def setUncachedValues(value: Set[String]): Self = StObject.set(x, "uncachedValues", value.asInstanceOf[js.Any])
      
      inline def setUncachedValuesUndefined: Self = StObject.set(x, "uncachedValues", js.undefined)
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
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
