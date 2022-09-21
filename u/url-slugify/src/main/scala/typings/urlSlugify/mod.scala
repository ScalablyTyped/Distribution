package typings.urlSlugify

import typings.urlSlugify.urlSlugifyStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-slugify", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with URLSlugify
  
  /* Rewritten from type alias, can be one of: 
    - typings.urlSlugify.urlSlugifyStrings.`-_`
    - typings.urlSlugify.urlSlugifyStrings._underscore
    - typings.urlSlugify.urlSlugifyStrings.Tilde
    - typings.urlSlugify.urlSlugifyStrings.ApostropheApostrophe
  */
  trait Separator extends StObject
  object Separator {
    
    inline def ApostropheApostrophe: typings.urlSlugify.urlSlugifyStrings.ApostropheApostrophe = "''".asInstanceOf[typings.urlSlugify.urlSlugifyStrings.ApostropheApostrophe]
    
    inline def Tilde: typings.urlSlugify.urlSlugifyStrings.Tilde = "~".asInstanceOf[typings.urlSlugify.urlSlugifyStrings.Tilde]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
    
    inline def _underscore: typings.urlSlugify.urlSlugifyStrings._underscore = "_".asInstanceOf[typings.urlSlugify.urlSlugifyStrings._underscore]
  }
  
  @js.native
  trait URLSlugify extends StObject {
    
    def slugify(title: String): String = js.native
    def slugify(title: String, separator: Separator): String = js.native
  }
}
