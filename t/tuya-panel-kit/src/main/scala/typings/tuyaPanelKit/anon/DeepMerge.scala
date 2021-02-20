package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.tuyaPanelKit.mod.ThemeConsumerProps
import typings.tuyaPanelKit.mod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepMerge extends StObject {
  
  var ThemeConsumer: ElementType[ThemeConsumerProps] = js.native
  
  var ThemeProvider: ElementType[ThemeProviderProps] = js.native
  
  def deepMerge(target: js.Object, args: js.Object*): js.Object = js.native
  
  def getTheme(props: js.Object, `type`: String, defaultValue: js.Any): js.Any = js.native
  
  def parseToCss(values: js.Array[Double], key: String): StringDictionary[Double] = js.native
  
  def parseToStyle(values: js.Array[Double], key: String): StringDictionary[Double] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def withTheme[P /* <: Theme[T] */, T](component: ComponentType[P]): ComponentType[P] = js.native
}
object DeepMerge {
  
  @scala.inline
  def apply(
    ThemeConsumer: ElementType[ThemeConsumerProps],
    ThemeProvider: ElementType[ThemeProviderProps],
    deepMerge: (js.Object, /* repeated */ js.Object) => js.Object,
    getTheme: (js.Object, String, js.Any) => js.Any,
    parseToCss: (js.Array[Double], String) => StringDictionary[Double],
    parseToStyle: (js.Array[Double], String) => StringDictionary[Double],
    withTheme: ComponentType[js.Any] => ComponentType[js.Any]
  ): DeepMerge = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), getTheme = js.Any.fromFunction3(getTheme), parseToCss = js.Any.fromFunction2(parseToCss), parseToStyle = js.Any.fromFunction2(parseToStyle), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[DeepMerge]
  }
  
  @scala.inline
  implicit class DeepMergeMutableBuilder[Self <: DeepMerge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeepMerge(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = StObject.set(x, "deepMerge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTheme(value: (js.Object, String, js.Any) => js.Any): Self = StObject.set(x, "getTheme", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParseToCss(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseToStyle(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThemeConsumer(value: ElementType[ThemeConsumerProps]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeProvider(value: ElementType[ThemeProviderProps]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithTheme(value: ComponentType[js.Any] => ComponentType[js.Any]): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
  }
}
