package typings.typoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typo-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Typo {
    def this(dictionary: String) = this()
    def this(dictionary: String, affData: String) = this()
    def this(dictionary: Unit, affData: String) = this()
    def this(dictionary: String, affData: String, wordsData: String) = this()
    def this(dictionary: String, affData: Null, wordsData: String) = this()
    def this(dictionary: String, affData: Unit, wordsData: String) = this()
    def this(dictionary: Unit, affData: String, wordsData: String) = this()
    def this(dictionary: Unit, affData: Null, wordsData: String) = this()
    def this(dictionary: Unit, affData: Unit, wordsData: String) = this()
    def this(dictionary: String, affData: String, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: String, affData: String, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: String, affData: String, wordsData: Unit, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Null, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Null, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Null, wordsData: Unit, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Unit, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Unit, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: String, affData: Unit, wordsData: Unit, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: String, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: String, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: String, wordsData: Unit, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Null, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Null, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Null, wordsData: Unit, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Unit, wordsData: String, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Unit, wordsData: Null, settings: TypoSettings) = this()
    def this(dictionary: Unit, affData: Unit, wordsData: Unit, settings: TypoSettings) = this()
  }
  
  @js.native
  trait Typo extends StObject {
    
    def check(word: String): Boolean = js.native
    
    var loaded: Boolean = js.native
    
    def suggest(word: String): js.Array[String] = js.native
    def suggest(word: String, limit: Double): js.Array[String] = js.native
  }
  
  trait TypoSettings extends StObject {
    
    var asyncLoad: js.UndefOr[Boolean] = js.undefined
    
    var dictionaryPath: js.UndefOr[String] = js.undefined
    
    var loadedCallback: js.UndefOr[js.Function1[/* dict */ Typo, Unit]] = js.undefined
  }
  object TypoSettings {
    
    inline def apply(): TypoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypoSettings] (val x: Self) extends AnyVal {
      
      inline def setAsyncLoad(value: Boolean): Self = StObject.set(x, "asyncLoad", value.asInstanceOf[js.Any])
      
      inline def setAsyncLoadUndefined: Self = StObject.set(x, "asyncLoad", js.undefined)
      
      inline def setDictionaryPath(value: String): Self = StObject.set(x, "dictionaryPath", value.asInstanceOf[js.Any])
      
      inline def setDictionaryPathUndefined: Self = StObject.set(x, "dictionaryPath", js.undefined)
      
      inline def setLoadedCallback(value: /* dict */ Typo => Unit): Self = StObject.set(x, "loadedCallback", js.Any.fromFunction1(value))
      
      inline def setLoadedCallbackUndefined: Self = StObject.set(x, "loadedCallback", js.undefined)
    }
  }
}
