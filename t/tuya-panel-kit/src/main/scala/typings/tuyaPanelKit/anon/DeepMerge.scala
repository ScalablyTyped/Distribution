package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.tuyaPanelKit.mod.ThemeConsumerProps
import typings.tuyaPanelKit.mod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepMerge extends StObject {
  
  var ThemeConsumer: ElementType[ThemeConsumerProps]
  
  var ThemeProvider: ElementType[ThemeProviderProps]
  
  def deepMerge(target: js.Object, args: js.Object*): js.Object
  
  def getTheme(props: js.Object, `type`: String, defaultValue: Any): Any
  
  def parseToCss(values: js.Array[Double], key: String): StringDictionary[Double]
  
  def parseToStyle(values: js.Array[Double], key: String): StringDictionary[Double]
  
  // tslint:disable-next-line no-unnecessary-generics
  def withTheme[P /* <: Theme[T] */, T](component: ComponentType[P]): ComponentType[P]
}
object DeepMerge {
  
  inline def apply(
    ThemeConsumer: ElementType[ThemeConsumerProps],
    ThemeProvider: ElementType[ThemeProviderProps],
    deepMerge: (js.Object, /* repeated */ js.Object) => js.Object,
    getTheme: (js.Object, String, Any) => Any,
    parseToCss: (js.Array[Double], String) => StringDictionary[Double],
    parseToStyle: (js.Array[Double], String) => StringDictionary[Double],
    withTheme: ComponentType[Any] => ComponentType[Any]
  ): DeepMerge = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), getTheme = js.Any.fromFunction3(getTheme), parseToCss = js.Any.fromFunction2(parseToCss), parseToStyle = js.Any.fromFunction2(parseToStyle), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[DeepMerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepMerge] (val x: Self) extends AnyVal {
    
    inline def setDeepMerge(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = StObject.set(x, "deepMerge", js.Any.fromFunction2(value))
    
    inline def setGetTheme(value: (js.Object, String, Any) => Any): Self = StObject.set(x, "getTheme", js.Any.fromFunction3(value))
    
    inline def setParseToCss(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToCss", js.Any.fromFunction2(value))
    
    inline def setParseToStyle(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToStyle", js.Any.fromFunction2(value))
    
    inline def setThemeConsumer(value: ElementType[ThemeConsumerProps]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
    
    inline def setThemeProvider(value: ElementType[ThemeProviderProps]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
    
    inline def setWithTheme(value: ComponentType[Any] => ComponentType[Any]): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
  }
}
