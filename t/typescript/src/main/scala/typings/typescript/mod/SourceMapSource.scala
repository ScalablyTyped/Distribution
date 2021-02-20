package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapSource extends StObject {
  
  var fileName: java.lang.String = js.native
  
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
  
  var skipTrivia: js.UndefOr[js.Function1[/* pos */ Double, Double]] = js.native
  
  var text: java.lang.String = js.native
}
object SourceMapSource {
  
  @scala.inline
  def apply(
    fileName: java.lang.String,
    getLineAndCharacterOfPosition: Double => LineAndCharacter,
    text: java.lang.String
  ): SourceMapSource = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], getLineAndCharacterOfPosition = js.Any.fromFunction1(getLineAndCharacterOfPosition), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSource]
  }
  
  @scala.inline
  implicit class SourceMapSourceMutableBuilder[Self <: SourceMapSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineAndCharacterOfPosition(value: Double => LineAndCharacter): Self = StObject.set(x, "getLineAndCharacterOfPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipTrivia(value: /* pos */ Double => Double): Self = StObject.set(x, "skipTrivia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipTriviaUndefined: Self = StObject.set(x, "skipTrivia", js.undefined)
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
