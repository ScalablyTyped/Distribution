package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordStyle. */
trait WordStyle extends StObject {
  
  /** HTML head level that content matching this style is tagged with. */
  var level: js.UndefOr[Double] = js.undefined
  
  /** Array of word style names to convert. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object WordStyle {
  
  @scala.inline
  def apply(): WordStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordStyle]
  }
  
  @scala.inline
  implicit class WordStyleMutableBuilder[Self <: WordStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
