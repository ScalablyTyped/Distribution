package typings.vueI18n.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslationProps
  extends StObject
     with BaseFormatProps {
  
  /**
    * @remarks
    * The locale message key can be specified prop
    */
  var keypath: String
  
  /**
    * @remarks
    * The Plural Choosing the message number prop
    */
  var plural: js.UndefOr[Double | String] = js.undefined
}
object TranslationProps {
  
  inline def apply(keypath: String): TranslationProps = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslationProps] (val x: Self) extends AnyVal {
    
    inline def setKeypath(value: String): Self = StObject.set(x, "keypath", value.asInstanceOf[js.Any])
    
    inline def setPlural(value: Double | String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
  }
}
